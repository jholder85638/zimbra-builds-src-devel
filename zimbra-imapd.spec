#
# spec file for zimbra-imapd.rpm
#
Summary: Zimbra IMAP
Name: zimbra-imapd
Version: 8.7.0_GA_1659.RHEL6_64
Release: 20171207181704
License: Various
Group: Applications/Messaging
URL: http://www.zimbra.com
Vendor: Zimbra, Inc.
Packager: Zimbra, Inc.
BuildRoot: /opt/zimbra
AutoReqProv: no
requires: zimbra-core

%description
Best email money can buy

%define __spec_install_pre /bin/true

%prep

%build

%install

%pre

%post

%preun

%postun

%files
%attr(-, root, root) /opt/zimbra/bin/zmimapdctl
%attr(-, root, root) /opt/zimbra/lib/jars/oauth-1.4.jar
%attr(755, zimbra, zimbra) /opt/zimbra/conf/imapd.log4j.properties

%clean
