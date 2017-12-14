#
# spec file for zimbra.rpm
#
Summary: Zimbra Mail
Name: zimbra-logger
Version: 8.7.0_GA_1659.RHEL7_64
Release: 20171214130240
License: ZPL and other
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

%define __spec_install_post /usr/lib/rpm/brp-compress /usr/lib/rpm/brp-strip-comment-note %{nil}

%prep

%build

%install

%pre

%post
#!/bin/bash
# 
# ***** BEGIN LICENSE BLOCK *****
# Zimbra Collaboration Suite Server
# Copyright (C) 2005, 2006, 2007, 2008, 2009, 2010, 2013, 2014, 2015, 2016 Synacor, Inc.
#
# This program is free software: you can redistribute it and/or modify it under
# the terms of the GNU General Public License as published by the Free Software Foundation,
# version 2 of the License.
#
# This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
# without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
# See the GNU General Public License for more details.
# You should have received a copy of the GNU General Public License along with this program.
# If not, see <https://www.gnu.org/licenses/>.
# ***** END LICENSE BLOCK *****
# 
if [ -x "/opt/zimbra/libexec/zmfixperms" ]; then
  /opt/zimbra/libexec/zmfixperms
fi

%preun

%postun

%files
%attr(755, zimbra, zimbra) /opt/zimbra/logger
%attr(755, zimbra, zimbra) /opt/zimbra/logger/db
%attr(755, zimbra, zimbra) /opt/zimbra/logger/db/data

%clean
