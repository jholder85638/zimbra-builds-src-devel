#
# spec file for zimbra.rpm
#
Summary: Zimbra SNMP
Name: zimbra-snmp
Version: 8.7.0_GA_1659.RHEL7_64
Release: 20171214130240
License: Various
Group: Applications/Messaging
URL: http://www.zimbra.com
Vendor: Zimbra, Inc.
Packager: Zimbra, Inc.
BuildRoot: /opt/zimbra
AutoReqProv: no
requires: zimbra-core, zimbra-snmp-components

%description
Best email money can buy

%define __spec_install_pre /bin/true

%define __spec_install_post /usr/lib/rpm/brp-compress /usr/lib/rpm/brp-strip-comment-note %{nil}

%prep

%build

%install

%pre

%post

%preun

%postun

%files
%attr(755, zimbra, zimbra) /opt/zimbra/data/snmp
%attr(755, zimbra, zimbra) /opt/zimbra/conf
%attr(644, zimbra, zimbra) /opt/zimbra/conf/*
%attr(775, root, zimbra) /opt/zimbra/common/conf
%attr(644, root, root) /opt/zimbra/common/conf/snmp.conf
%attr(755, root, root) /opt/zimbra/common/share/snmp
%attr(644, root, root) /opt/zimbra/common/share/snmp/snmp.conf
%attr(755, root, root) /opt/zimbra/common/share/snmp/mibs
%attr(644, root, root) /opt/zimbra/common/share/snmp/mibs/zimbra.mib
%attr(644, root, root) /opt/zimbra/common/share/snmp/mibs/zimbra_traps.mib

%clean
