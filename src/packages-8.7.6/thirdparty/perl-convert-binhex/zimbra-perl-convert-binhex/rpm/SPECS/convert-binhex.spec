Summary:            Convert::BinHex - extract data from Macintosh BinHex files
Name:               zimbra-perl-MODNORMNAME
Version:            VERSION
Release:            ITERATIONZAPPEND
License:            GPL+ or Artistic
Source:             %{name}-%{version}.tar.gz
Packager:           Zimbra Packaging Services <packaging-devel@zimbra.com>
Group:              Development/Languages
BuildRequires:      zimbra-perl-base
Requires:           zimbra-perl-base
AutoReqProv:        no
URL:                https://metacpan.org/release/MODNAME

%description
BinHex is a format used by Macintosh for transporting Mac files safely
through electronic mail, as short-lined, 7-bit, semi-compressed data
streams. Ths module provides a means of converting those data streams
back into into binary data.

%define debug_package %{nil}

%prep
%setup -n MODNAME-%{version}

%build
perl -I OZCL/perl5 Makefile.PL INSTALL_BASE=OZC \
 INSTALLSITEMAN1DIR=OZCS/man/man1 INSTALLSITEMAN3DIR=OZCS/man/man3 \
 INSTALLMAN3DIR=OZCS/man/man1 INSTALLVENDORMAN3DIR=OZCS/man/man1 \
 INSTALLMAN3DIR=OZCS/man/man3 INSTALLVENDORMAN3DIR=OZCS/man/man3 \
 LIB=OZCL/perl5
make

# remove .packlist and perllocal.pod
#  $(DESTINSTALLSITEARCH)/auto/$(FULLEXT)/.packlist
#  $(DESTINSTALLSITEARCH)/perllocal.pod
%define perl_archname %(perl -MConfig -e 'print $Config{archname}')
%install
make install DESTDIR=${RPM_BUILD_ROOT}
rm -rf %{buildroot}OZCL/perl5/%{perl_archname}
rm -rf %{buildroot}OZCB

%files
%defattr(-,root,root)
OZCL
OZCS/man
