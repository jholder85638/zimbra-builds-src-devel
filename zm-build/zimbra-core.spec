#
# spec file for zimbra.rpm
#
Summary: Zimbra Core
Name: zimbra-core
Version: 8.7.0_GA_1659.RHEL7_64
Release: 20171214130240
License: Various
Group: Applications/Messaging
URL: http://www.zimbra.com
Vendor: Zimbra, Inc.
Packager: Zimbra, Inc.
BuildRoot: /opt/zimbra
AutoReqProv: no
Requires: zimbra-core-components, zimbra-timezone-data >= 1.0.1+1510156506-1.r7 

%description
Best email money can buy
Network edition

%define __spec_install_pre /bin/true

%define __spec_install_post /usr/lib/rpm/brp-compress /usr/lib/rpm/brp-strip-comment-note %{nil}

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

if [ "`echo /etc/security/limits.d/*-nproc.conf`" != "/etc/security/limits.d/*-nproc.conf" ]; then
    echo "zimbra soft nproc 278528" > /etc/security/limits.d/10-zimbra.conf
    echo "zimbra hard nproc 278528" >> /etc/security/limits.d/10-zimbra.conf
    echo "postfix soft nproc 278528" >> /etc/security/limits.d/10-zimbra.conf
    echo "postfix hard nproc 278528" >> /etc/security/limits.d/10-zimbra.conf
    echo "root soft nproc 278528" >> /etc/security/limits.d/10-zimbra.conf
    echo "root hard nproc 278528" >> /etc/security/limits.d/10-zimbra.conf
fi
if [ -f "/etc/security/limits.conf" ]; then
    limitstmp=`mktemp -t limitstmp.XXXXXX 2> /dev/null` || { echo "Failed to create tmpfile"; exit 1; }
    egrep -v -e '^zimbra.*nofile' /etc/security/limits.conf > $limitstmp
    echo "zimbra soft nofile 524288" >> $limitstmp
    echo "zimbra hard nofile 524288" >> $limitstmp
    mv -f $limitstmp /etc/security/limits.conf
    chmod 640 /etc/security/limits.conf
else
    echo "zimbra soft nofile 524288" > /etc/security/limits.conf
    echo "zimbra hard nofile 524288" >> /etc/security/limits.conf
    chmod 640 /etc/security/limits.conf
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
# Create group, user for zimbra and postfix.

H=`hostname --fqdn`
I=`hostname -i`

#Symlinks
rm -f /opt/zimbra/java
PLAT=`/opt/zimbra/libexec/get_plat_tag.sh`
BIT=`echo $PLAT | awk -F_ '{print $2}'`

if [ -d "/opt/zimbra/logger/db" ]; then
  chown zimbra:zimbra /opt/zimbra/logger/db
fi

if [ -f "/opt/zimbra/conf/ca/ca.pem" ]; then
  ln -f -s ca.pem /opt/zimbra/conf/ca/`openssl x509 -hash -noout -in /opt/zimbra/conf/ca/ca.pem`.0
fi

if [[ $PLAT == "DEBIAN"* || $PLAT == "UBUNTU"* ]]; then
  sed -i -e '/^::1     ip6-localhost ip6-loopback localhost$/!s/::1     ip6-localhost ip6-loopback/::1     ip6-localhost ip6-loopback localhost/' /etc/hosts
  sed -i -e 's/# session    required   pam_limits.so/session    required   pam_limits.so/' /etc/pam.d/su
  pamtmp=`mktemp -t zpamtmp.XXXXXX 2> /dev/null` || { echo "Failed to create tmpfile"; exit 1; }
  egrep -v -e '^session[[:space:]]+required[[:space:]]+pam_limits.so' /etc/pam.d/common-session >$pamtmp
  echo "session	required	pam_limits.so" >> $pamtmp
  mv -f $pamtmp /etc/pam.d/common-session
  chmod 640 /etc/pam.d/common-session
  limitstmp=`mktemp -t zlimtmp.XXXXXX 2> /dev/null` || { echo "Failed to create tmpfile"; exit 1; }
  egrep -v -e '^root.*nofile' /etc/security/limits.conf > $limitstmp
  echo "root soft nofile 524288" >> $limitstmp
  echo "root hard nofile 524288" >> $limitstmp
  mv -f $limitstmp /etc/security/limits.conf
  chmod 640 /etc/security/limits.conf
  chown -R root:root /opt/zimbra/common/lib/perl5/Zimbra
fi

if [ -d /etc/logrotate.d ]; then
	cp -f /opt/zimbra/conf/zmlogrotate /etc/logrotate.d/zimbra
fi

cp -f /opt/zimbra/libexec/zimbra /etc/init.d/zimbra
chmod 755 /etc/init.d/zimbra
if [ -x /sbin/chkconfig ]; then
	chkconfig --del zimbra
	chkconfig --add zimbra 
	chkconfig zimbra on
elif [ -x /usr/sbin/update-rc.d ]; then
        update-rc.d -f zimbra remove
        update-rc.d zimbra start 99 2 5 . stop 01 0 1 6 .
else
	rm -f /etc/rc*.d/S99zimbra
	rm -f /etc/rc*.d/S89zimbra
	rm -f /etc/rc*.d/K01zimbra

  if [ -d /etc/rc0.d ]; then
    ln -s /etc/init.d/zimbra /etc/rc0.d/S89zimbra
    ln -s /etc/init.d/zimbra /etc/rc0.d/K01zimbra
  fi
  if [ -d /etc/rc1.d ]; then
	ln -s /etc/init.d/zimbra /etc/rc1.d/K01zimbra
  fi
  if [ -d /etc/rc2.d ]; then
	  ln -s /etc/init.d/zimbra /etc/rc2.d/S99zimbra
	  ln -s /etc/init.d/zimbra /etc/rc2.d/K01zimbra
  fi
  if [ -d /etc/rc3.d ]; then
	  ln -s /etc/init.d/zimbra /etc/rc3.d/S99zimbra
	  ln -s /etc/init.d/zimbra /etc/rc3.d/K01zimbra
  fi
  if [ -d /etc/rc4.d ]; then
	  ln -s /etc/init.d/zimbra /etc/rc4.d/S99zimbra
	  ln -s /etc/init.d/zimbra /etc/rc4.d/K01zimbra
  fi
  if [ -d /etc/rc5.d ]; then
	  ln -s /etc/init.d/zimbra /etc/rc5.d/S99zimbra
	  ln -s /etc/init.d/zimbra /etc/rc5.d/K01zimbra
  fi
  if [ -d /etc/rc6.d ]; then
	  ln -s /etc/init.d/zimbra /etc/rc6.d/S89zimbra
	  ln -s /etc/init.d/zimbra /etc/rc6.d/K01zimbra
  fi
  
fi

mkdir -p /opt/zimbra/backup
chown zimbra:zimbra /opt/zimbra/backup
mkdir -p /opt/zimbra/log
chown zimbra:zimbra /opt/zimbra/log
mkdir -p /opt/zimbra/ssl
chown zimbra:zimbra /opt/zimbra/ssl
mkdir -p /opt/zimbra/.ssh
chown zimbra:zimbra /opt/zimbra/.ssh
mkdir -p /opt/zimbra/zmstat
chown zimbra:zimbra /opt/zimbra/zmstat

egrep -q '^%zimbra[[:space:]]' /etc/sudoers
if [ $? = 0 ]; then
  sudotmp=`mktemp -t zsudoers.XXXXXX 2> /dev/null` || { echo "Failed to create tmpfile"; exit 1; }
  SUDOMODE=`perl -e 'my $mode=(stat("/etc/sudoers"))[2];if ($mode == "0000"){ $mode=33056 };printf("%04o\n",$mode & 07777);'`;
  egrep -v -e '^%zimbra[[:space:]]' /etc/sudoers > $sudotmp
  mv -f $sudotmp /etc/sudoers
  chmod $SUDOMODE /etc/sudoers
fi

chmod 440 /etc/sudoers.d/01_zimbra
chown root:root /etc/sudoers.d/01_zimbra

chmod 440 /etc/sudoers.d/02_zimbra-core
chown root:root /etc/sudoers.d/02_zimbra-core

if [ -x "/opt/zimbra/libexec/zmfixperms" ]; then
  /opt/zimbra/libexec/zmfixperms
fi

%preun

%postun

%files
%attr(-, zimbra, zimbra) /opt/zimbra/.platform
%attr(-, zimbra, zimbra) /opt/zimbra/.bashrc
%attr(-, zimbra, zimbra) /opt/zimbra/.bash_profile
%attr(-, zimbra, zimbra) /opt/zimbra/.ldaprc
%attr(-, zimbra, zimbra) /opt/zimbra/.viminfo
%attr(-, zimbra, zimbra) /opt/zimbra/.exrc
%attr(440, root, root) /etc/sudoers.d/01_zimbra
%attr(440, root, root) /etc/sudoers.d/02_zimbra-core
%attr(755, root, root) /opt/zimbra/bin
%attr(755, zimbra, zimbra) /opt/zimbra/docs
%attr(444, zimbra, zimbra) /opt/zimbra/docs/*
%attr(755, root, root) /opt/zimbra/contrib
%attr(755, root, root) /opt/zimbra/libexec
%attr(755, zimbra, zimbra) /opt/zimbra/logger
%attr(755, zimbra, zimbra) /opt/zimbra/conf
%attr(644, zimbra, zimbra) /opt/zimbra/conf/*
%attr(755, zimbra, zimbra) /opt/zimbra/conf/externaldirsync
%attr(644, zimbra, zimbra) /opt/zimbra/conf/externaldirsync/*
%attr(755, zimbra, zimbra) /opt/zimbra/conf/sasl2
%attr(644, zimbra, zimbra) /opt/zimbra/conf/sasl2/*
%attr(755, zimbra, zimbra) /opt/zimbra/conf/zmconfigd
%attr(644, zimbra, zimbra) /opt/zimbra/conf/zmconfigd/*
%attr(-, zimbra, zimbra) /opt/zimbra/db
%attr(-, root, root) /opt/zimbra/lib
%attr(-, zimbra, zimbra) /opt/zimbra/conf/crontabs
%attr(-, root, root) /opt/zimbra/common/lib/jylibs
%attr(-, root, root) /opt/zimbra/common/lib/perl5/Zimbra
%attr(755, zimbra, zimbra) /opt/zimbra/logger/db/work

%clean
