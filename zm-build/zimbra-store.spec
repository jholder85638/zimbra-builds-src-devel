#
# spec file for zimbra.rpm
#
Summary: Zimbra Mail
Name: zimbra-store
Version: 8.7.0_GA_1659.RHEL7_64
Release: 20171214130240
License: ZPL and other
Group: Applications/Messaging
URL: http://www.zimbra.com
Vendor: Zimbra, Inc.
Packager: Zimbra, Inc.
BuildRoot: /opt/zimbra
AutoReqProv: no
requires: zimbra-core, zimbra-store-components, zimbra-jetty-distribution >= 9.3.5.v20151012-2.r7

%description
Best email money can buy

%define __spec_install_pre /bin/true

%prep

%build

%install

%pre
#!/bin/bash
#
# ***** BEGIN LICENSE BLOCK *****
# Zimbra Collaboration Suite Server
# Copyright (C) 2005, 2006, 2007, 2008, 2009, 2010, 2012, 2013, 2014, 2015, 2016 Synacor, Inc.
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

if [ -d "/opt/zimbra/mailboxd/work/zimbra" ]; then
  rm -rf /opt/zimbra/mailboxd/work/zimbra > /dev/null 2>&1
fi

if [ -d "/opt/zimbra/mailboxd/work/zimbraAdmin" ]; then
  rm -rf /opt/zimbra/mailboxd/work/zimbraAdmin > /dev/null 2>&1
fi

%post
#!/bin/bash
# 
# ***** BEGIN LICENSE BLOCK *****
# Zimbra Collaboration Suite Server
# Copyright (C) 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016 Synacor, Inc.
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

H=`hostname -s`
I=`hostname -i`

if [ -f /opt/zimbra/db/db.sql ]; then
  mv /opt/zimbra/db/db.sql /opt/zimbra/db/db.sql.in
  sed -e "/server.hostname/ s/local/$H/" /opt/zimbra/db/db.sql.in > /opt/zimbra/db/db.sql
  chown zimbra:zimbra /opt/zimbra/db/db.sql*
  chmod 440 /opt/zimbra/db/db.sql*
fi

( cd /opt/zimbra && rm -f jetty    && ln -s jetty_base jetty    )
( cd /opt/zimbra && rm -f mailboxd && ln -s jetty_base mailboxd )

mkdir -p /opt/zimbra/mailboxd/logs
chown zimbra:zimbra /opt/zimbra/mailboxd/logs

mkdir -p /opt/zimbra/redolog
mkdir -p /opt/zimbra/store
mkdir -p /opt/zimbra/index
mkdir -p /opt/zimbra/backup
chown zimbra:zimbra /opt/zimbra/redolog /opt/zimbra/store /opt/zimbra/index /opt/zimbra/backup 

egrep -q '^%zimbra[[:space:]]' /etc/sudoers
if [ $? = 0 ]; then
  sudotmp=`mktemp -t zsudoers.XXXXXX 2> /dev/null` || { echo "Failed to create tmpfile"; exit 1; }
  SUDOMODE=`perl -e 'my $mode=(stat("/etc/sudoers"))[2];printf("%04o\n",$mode & 07777);'`
  egrep -v -e '^%zimbra[[:space:]]'  /etc/sudoers > $sudotmp
  mv -f $sudotmp /etc/sudoers
  chmod $SUDOMODE /etc/sudoers
fi

chmod 440 /etc/sudoers.d/02_zimbra-store
chown root:root /etc/sudoers.d/02_zimbra-store

if [ -d "/opt/zimbra/mailboxd/work/zimbra" ]; then
  find /opt/zimbra/mailboxd/work/zimbra -exec touch {} \; 2> /dev/null
fi

if [ -x "/opt/zimbra/libexec/zmfixperms" ]; then
  /opt/zimbra/libexec/zmfixperms
fi

%preun

%postun

%files
%attr(-, root, root) /opt/zimbra/lib
%attr(440, root, root) /etc/sudoers.d/02_zimbra-store
%attr(755, zimbra, zimbra) /opt/zimbra/conf
%attr(644, zimbra, zimbra) /opt/zimbra/conf/*
%attr(755, zimbra, zimbra) /opt/zimbra/conf/templates
%attr(755, zimbra, zimbra) /opt/zimbra/conf/templates/templates
%attr(755, zimbra, zimbra) /opt/zimbra/conf/templates/templates/abook
%attr(644, zimbra, zimbra) /opt/zimbra/conf/templates/templates/abook/*
%attr(755, zimbra, zimbra) /opt/zimbra/conf/templates/templates/admin
%attr(644, zimbra, zimbra) /opt/zimbra/conf/templates/templates/admin/*
%attr(755, zimbra, zimbra) /opt/zimbra/conf/templates/templates/briefcase
%attr(644, zimbra, zimbra) /opt/zimbra/conf/templates/templates/briefcase/*
%attr(755, zimbra, zimbra) /opt/zimbra/conf/templates/templates/calendar
%attr(644, zimbra, zimbra) /opt/zimbra/conf/templates/templates/calendar/*
%attr(755, zimbra, zimbra) /opt/zimbra/conf/templates/templates/data
%attr(644, zimbra, zimbra) /opt/zimbra/conf/templates/templates/data/*
%attr(755, zimbra, zimbra) /opt/zimbra/conf/templates/templates/dwt
%attr(644, zimbra, zimbra) /opt/zimbra/conf/templates/templates/dwt/*
%attr(755, zimbra, zimbra) /opt/zimbra/conf/templates/templates/mail
%attr(644, zimbra, zimbra) /opt/zimbra/conf/templates/templates/mail/*
%attr(755, zimbra, zimbra) /opt/zimbra/conf/templates/templates/prefs
%attr(644, zimbra, zimbra) /opt/zimbra/conf/templates/templates/prefs/*
%attr(755, zimbra, zimbra) /opt/zimbra/conf/templates/templates/share
%attr(644, zimbra, zimbra) /opt/zimbra/conf/templates/templates/share/*
%attr(755, zimbra, zimbra) /opt/zimbra/conf/templates/templates/tasks
%attr(644, zimbra, zimbra) /opt/zimbra/conf/templates/templates/tasks/*
%attr(755, zimbra, zimbra) /opt/zimbra/conf/templates/templates/voicemail
%attr(644, zimbra, zimbra) /opt/zimbra/conf/templates/templates/voicemail/*
%attr(755, zimbra, zimbra) /opt/zimbra/conf/templates/templates/zimbra
%attr(644, zimbra, zimbra) /opt/zimbra/conf/templates/templates/zimbra/*
%attr(-, zimbra, zimbra) /opt/zimbra/log
%attr(-, zimbra, zimbra) /opt/zimbra/zimlets
%attr(-, zimbra, zimbra) /opt/zimbra/extensions-extra
%attr(755, root, root) /opt/zimbra/bin
%attr(755, root, root) /opt/zimbra/libexec
%attr(-, zimbra, zimbra) /opt/zimbra/jetty_base

%clean
