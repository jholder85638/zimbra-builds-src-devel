#
# spec file for zimbra.rpm
#
Summary: Zimbra Spell
Name: zimbra-spell
Version: 8.7.0_GA_1659.RHEL6_64
Release: 20171207181704
License: Various
Group: Applications/Messaging
URL: http://www.zimbra.com
Vendor: Zimbra, Inc.
Packager: Zimbra, Inc.
BuildRoot: /opt/zimbra
AutoReqProv: no
requires: zimbra-core, zimbra-spell-components

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
%attr(-, root, root) /opt/zimbra/data/httpd/htdocs/aspell.php

%clean
