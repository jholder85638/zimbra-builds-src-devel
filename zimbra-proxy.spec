#
# spec file for zimbra.rpm
#
Summary: Zimbra Proxy
Name: zimbra-proxy
Version: 8.7.0_GA_1659.RHEL6_64
Release: 20171207181704
License: ZPL and other
Group: Applications/Messaging
URL: http://www.zimbra.com
Vendor: Zimbra, Inc.
Packager: Zimbra, Inc.
BuildRoot: /opt/zimbra
AutoReqProv: no
requires: zimbra-core, zimbra-proxy-components, zimbra-memcached

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
# Copyright (C) 2007, 2008, 2009, 2010, 2012, 2013, 2014, 2015, 2016 Synacor, Inc.
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

egrep -q '^%zimbra[[:space:]]' /etc/sudoers
if [ $? = 0 ]; then
  sudotmp=`mktemp -t zsudoers.XXXXXX 2> /dev/null` || { echo "Failed to create tmpfile"; exit 1; }
  SUDOMODE=`perl -e 'my $mode=(stat("/etc/sudoers"))[2];printf("%04o\n",$mode & 07777);'`
  egrep -v '^%zimbra[[:space:]]' /etc/sudoers > $sudotmp
  mv -f $sudotmp /etc/sudoers
  chmod $SUDOMODE /etc/sudoers
fi
chmod 440 /etc/sudoers.d/02_zimbra-proxy
chown root:root /etc/sudoers.d/02_zimbra-proxy
chown -R zimbra:zimbra /opt/zimbra/conf/nginx

%preun

%postun

%files
%attr(440, root, root) /etc/sudoers.d/02_zimbra-proxy
%attr(755, zimbra, zimbra) /opt/zimbra/conf/nginx
%attr(644, zimbra, zimbra) /opt/zimbra/conf/nginx/*
%attr(755, zimbra, zimbra) /opt/zimbra/conf/nginx/includes
%attr(755, zimbra, zimbra) /opt/zimbra/conf/nginx/templates
%attr(644, zimbra, zimbra) /opt/zimbra/conf/nginx/templates/*

%clean
