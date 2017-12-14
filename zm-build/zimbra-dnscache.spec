#
# spec file for zimbra.rpm
#
Summary: Zimbra DNS cache
Name: zimbra-dnscache
Version: 8.7.0_GA_1659.RHEL7_64
Release: 20171214130240
License: ZPL and other
Group: Applications/Messaging
URL: http://www.zimbra.com
Vendor: Zimbra, Inc.
Packager: Zimbra, Inc.
BuildRoot: /opt/zimbra
AutoReqProv: no
Requires: zimbra-core, zimbra-dnscache-components

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
# Copyright (C) 2013, 2014, 2015, 2016 Synacor, Inc.
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

#Symlinks

mkdir -p /opt/zimbra/data/dns/ca
mkdir -p /opt/zimbra/data/dns/trust
chown -R zimbra:zimbra /opt/zimbra/data/dns

chown zimbra:zimbra /opt/zimbra/data

egrep -q '^%zimbra[[:space:]]' /etc/sudoers
if [ $? = 0 ]; then
  sudotmp=`mktemp -t zsudoers.XXXXXX 2> /dev/null` || { echo "Failed to create tmpfile"; exit 1; }
  SUDOMODE=`perl -e 'my $mode=(stat("/etc/sudoers"))[2];printf("%04o\n",$mode & 07777);'`
  egrep -v '^%zimbra[[:space:]]' /etc/sudoers > $sudotmp
  mv -f $sudotmp /etc/sudoers
  chmod $SUDOMODE /etc/sudoers
fi
chmod 440 /etc/sudoers.d/02_zimbra-dnscache
chown root:root /etc/sudoers.d/02_zimbra-dnscache

%preun

%postun

%files
%attr(-, zimbra, zimbra) /opt/zimbra/data/dns
%attr(440, root, root) /etc/sudoers.d/02_zimbra-dnscache
