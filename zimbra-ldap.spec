#
# spec file for zimbra.rpm
#
Summary: Zimbra LDAP
Name: zimbra-ldap
Version: 8.7.0_GA_1659.RHEL6_64
Release: 20171207181704
License: OpenLDAP
Group: Applications/Messaging
URL: http://www.zimbra.com
Vendor: Zimbra, Inc.
Packager: Zimbra, Inc.
BuildRoot: /opt/zimbra
AutoReqProv: no
Requires: zimbra-core, zimbra-ldap-components

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
# Create group, user for zimbra and postfix.

shopt -s nullglob

mkdir -p /opt/zimbra/data/ldap/state/run
mkdir -p /opt/zimbra/data/ldap/config
mkdir -p /opt/zimbra/data/ldap/mdb/db
chown -R zimbra:zimbra /opt/zimbra/data/ldap

egrep -q '^%zimbra[[:space:]]' /etc/sudoers
if [ $? = 0 ]; then
	sudotmp=`mktemp -t zsudoers.XXXXXX 2> /dev/null` || { echo "Failed to create tmpfile"; exit 1; }
	SUDOMODE=`perl -e 'my $mode=(stat("/etc/sudoers"))[2];printf("%04o\n",$mode & 07777);'`
	egrep -v '^%zimbra[[:space:]]' /etc/sudoers > $sudotmp
	mv -f $sudotmp /etc/sudoers
	chmod $SUDOMODE /etc/sudoers
fi
chmod 440 /etc/sudoers.d/02_zimbra-ldap
chown root:root /etc/sudoers.d/02_zimbra-ldap
chown -R root:root /opt/zimbra/common/etc/openldap

%preun

%postun

%files
%attr(440, root, root) /etc/sudoers.d/02_zimbra-ldap
%attr(-, root, root) /opt/zimbra/common/etc/openldap/zimbra
%attr(-, root, root) /opt/zimbra/common/etc/openldap/zimbra/*
%attr(-, root, root) /opt/zimbra/common/etc/openldap/zimbra/config
%attr(-, root, root) /opt/zimbra/common/etc/openldap/zimbra/config/*
%attr(-, root, root) /opt/zimbra/common/etc/openldap/zimbra/config/cn=config
%attr(-, root, root) /opt/zimbra/common/etc/openldap/zimbra/config/cn=config/*
%attr(-, root, root) /opt/zimbra/common/etc/openldap/zimbra/config/cn=config/olcDatabase={2}mdb
%attr(-, root, root) /opt/zimbra/common/etc/openldap/zimbra/config/cn=config/olcDatabase={2}mdb/*
%attr(-, root, root) /opt/zimbra/common/etc/openldap/zimbra/schema
%attr(-, root, root) /opt/zimbra/common/etc/openldap/zimbra/schema/*

%clean
