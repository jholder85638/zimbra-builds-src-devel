# $OpenLDAP$
## This work is part of OpenLDAP Software <http://www.openldap.org/>.
##
## Copyright 1998-2016 The OpenLDAP Foundation.
## All rights reserved.
##
## Redistribution and use in source and binary forms, with or without
## modification, are permitted only as authorized by the OpenLDAP
## Public License.
##
## A copy of this license is available in the file LICENSE in the
## top-level directory of the distribution or, alternatively, at
##---------------------------------------------------------------------------
#
# Top-level Makefile template
#

PACKAGE= OpenLDAP
VERSION= 2.4.44
RELEASEDATE= 2016/02/05


SHELL = /bin/sh

top_builddir = ../../..

srcdir = .
top_srcdir = ../../..

prefix = /opt/zimbra/common
exec_prefix = ${prefix}
ldap_subdir = /openldap

bindir = ${exec_prefix}/bin
datarootdir = ${prefix}/share
datadir = ${datarootdir}$(ldap_subdir)
includedir = ${prefix}/include
infodir = ${datarootdir}/info
libdir = ${exec_prefix}/lib
libexecdir = ${exec_prefix}/libexec
localstatedir = /opt/zimbra/data/ldap/state
mandir = ${datarootdir}/man
moduledir = ${exec_prefix}/libexec$(ldap_subdir)
sbindir = ${exec_prefix}/sbin
sharedstatedir = ${prefix}/com
sysconfdir = ${prefix}/etc$(ldap_subdir)
schemadir = $(sysconfdir)/schema

PLAT = UNIX
EXEEXT = 
OBJEXT = o

BUILD_LIBS_DYNAMIC = shared

SHTOOL = $(top_srcdir)/build/shtool

INSTALL = $(SHTOOL) install -c
INSTALL_PROGRAM = $(INSTALL)
INSTALL_DATA = $(INSTALL) -m 644
INSTALL_SCRIPT = $(INSTALL)

STRIP = -s

LINT = lint
5LINT = 5lint

MKDEP = $(top_srcdir)/build/mkdep $(MKDEPFLAG) \
	-d "$(srcdir)" -c "$(MKDEP_CC)" -m "$(MKDEP_CFLAGS)"
MKDEP_CC	= cc
MKDEP_CFLAGS = -M

MKVERSION = $(top_srcdir)/build/mkversion -v "$(VERSION)"

LIBTOOL = $(SHELL) $(top_builddir)/libtool
LIBRELEASE = 2.4
LIBVERSION = 12:7:10
LTVERSION = -release $(LIBRELEASE) -version-info $(LIBVERSION)

# libtool --only flag for libraries: platform specific
NT_LTONLY_LIB = # --only-$(BUILD_LIBS_DYNAMIC)
LTONLY_LIB = $(UNIX_LTONLY_LIB)

# libtool --only flag for modules: depends on linkage of module
# The BUILD_MOD macro is defined in each backend Makefile.in file
LTONLY_yes = --tag=disable-shared
LTONLY_mod = --tag=disable-static
LTONLY_MOD = $(LTONLY_$(BUILD_MOD))

# platform-specific libtool flags
NT_LTFLAGS_LIB = -no-undefined -avoid-version -rpath $(libdir)
NT_LTFLAGS_MOD = -no-undefined -avoid-version -rpath $(moduledir)
UNIX_LTFLAGS_LIB = $(LTVERSION) -rpath $(libdir)
UNIX_LTFLAGS_MOD = $(LTVERSION) -rpath $(moduledir)

# libtool flags
LTFLAGS     = $(UNIX_LTFLAGS)
LTFLAGS_LIB = $(UNIX_LTFLAGS_LIB)
LTFLAGS_MOD = $(UNIX_LTFLAGS_MOD)

# LIB_DEFS defined in liblber and libldap Makefile.in files.
# MOD_DEFS defined in backend Makefile.in files.

# platform-specific LINK_LIBS defined in various Makefile.in files.
# LINK_LIBS referenced in library and module link commands.
LINK_LIBS = $(MOD_LIBS) $(UNIX_LINK_LIBS)

LTSTATIC = 

LTLINK   = $(LIBTOOL) --mode=link \
	$(CC) $(LTSTATIC) $(LT_CFLAGS) $(LDFLAGS) $(LTFLAGS)

LTCOMPILE_LIB = $(LIBTOOL) $(LTONLY_LIB) --mode=compile \
	$(CC) $(LT_CFLAGS) $(LT_CPPFLAGS) $(LIB_DEFS) -c

LTLINK_LIB = $(LIBTOOL) $(LTONLY_LIB) --mode=link \
	$(CC) $(LT_CFLAGS) $(LDFLAGS) $(LTFLAGS_LIB)

LTCOMPILE_MOD = $(LIBTOOL) $(LTONLY_MOD) --mode=compile \
	$(CC) $(LT_CFLAGS) $(LT_CPPFLAGS) $(MOD_DEFS) -c

LTLINK_MOD = $(LIBTOOL) $(LTONLY_MOD) --mode=link \
	$(CC) $(LT_CFLAGS) $(LDFLAGS) $(LTFLAGS_MOD)

LTINSTALL = $(LIBTOOL) --mode=install $(INSTALL) 
LTFINISH = $(LIBTOOL) --mode=finish

# Misc UNIX commands used in build environment
AR = ar
BASENAME = basename
CAT = cat
CHMOD = chmod
DATE = date
ECHO = $(SHTOOL) echo
HOSTNAME = $(SHTOOL) echo -e "%h%d"
LN = $(SHTOOL) mkln
LN_H = $(LN)
LN_S = $(LN) -s
MAKEINFO = ${SHELL} /opt/zimbra-builds-src-devel/AB_upstream-src/openldap-2.4.44/build/missing --run makeinfo
MKDIR = $(SHTOOL) mkdir -p
MV = $(SHTOOL) move
PWD = pwd
RANLIB = ranlib
RM = rm -f
SED = sed
SUBST = $(SHTOOL) subst

# For manual pages
# MANCOMPRESS=@MANCOMPRESS@
# MANCOMPRESSSUFFIX=@MANCOMPRESSSUFFIX@
MANCOMPRESS=$(CAT)
MANCOMPRESSSUFFIX=

SOELIM=soelim

INCLUDEDIR= $(top_srcdir)/include
LDAP_INCPATH= -I$(LDAP_INCDIR) -I$(INCLUDEDIR)
LDAP_LIBDIR= $(top_builddir)/libraries

LUTIL_LIBS =  -lcrypt
LTHREAD_LIBS =  -pthread

BDB_LIBS = 
SLAPD_NDB_LIBS = 

LDAP_LIBLBER_LA = $(LDAP_LIBDIR)/liblber/liblber.la
LDAP_LIBLDAP_LA = $(LDAP_LIBDIR)/libldap/libldap.la
LDAP_LIBLDAP_R_LA = $(LDAP_LIBDIR)/libldap_r/libldap_r.la

LDAP_LIBREWRITE_A = $(LDAP_LIBDIR)/librewrite/librewrite.a
LDAP_LIBLUNICODE_A = $(LDAP_LIBDIR)/liblunicode/liblunicode.a
LDAP_LIBLUTIL_A = $(LDAP_LIBDIR)/liblutil/liblutil.a

LDAP_L = $(LDAP_LIBLUTIL_A) \
	$(LDAP_LIBLDAP_LA) $(LDAP_LIBLBER_LA)
SLAPD_L = $(LDAP_LIBLUNICODE_A) $(LDAP_LIBREWRITE_A) \
	$(LDAP_LIBLUTIL_A) $(LDAP_LIBLDAP_R_LA) $(LDAP_LIBLBER_LA)

WRAP_LIBS = 
# AutoConfig generated 
AC_CC	= cc
AC_CFLAGS = -O0 -g -D_REENTRANT
AC_DEFS = -I/opt/zimbra/common/include # -DHAVE_CONFIG_H
AC_LDFLAGS = -L/opt/zimbra/common/lib -Wl,-rpath,/opt/zimbra/common/lib
AC_LIBS = -lresolv 

KRB4_LIBS = 
KRB5_LIBS = 
KRB_LIBS =  
SASL_LIBS = -lsasl2
TLS_LIBS = -lssl -lcrypto
AUTH_LIBS = 
SECURITY_LIBS = $(SASL_LIBS) $(KRB_LIBS) $(TLS_LIBS) $(AUTH_LIBS)
ICU_LIBS = 

MODULES_CPPFLAGS = 
MODULES_LDFLAGS = -dlopen self
MODULES_LIBS = -lltdl
SLAPD_PERL_LDFLAGS = 

SLAPD_SQL_LDFLAGS = 
SLAPD_SQL_INCLUDES = 
SLAPD_SQL_LIBS = 

SLAPD_LIBS =       $(ICU_LIBS)

# Our Defaults
CC = $(AC_CC)
DEFS = $(LDAP_INCPATH) $(XINCPATH) $(XDEFS) $(AC_DEFS) $(DEFINES)
CFLAGS = $(AC_CFLAGS) $(DEFS)
LDFLAGS = $(LDAP_LIBPATH) $(AC_LDFLAGS) $(XLDFLAGS)
LIBS = $(XLIBS) $(XXLIBS) $(AC_LIBS) $(XXXLIBS)

LT_CFLAGS = $(AC_CFLAGS)
LT_CPPFLAGS = $(DEFS)

all:		all-common all-local FORCE
install:	install-common install-local FORCE
clean:		clean-common clean-local FORCE
veryclean:	veryclean-common veryclean-local FORCE
depend:		depend-common depend-local FORCE

# empty common rules
all-common:
install-common:
clean-common:
veryclean-common:	clean-common FORCE
depend-common:
lint-common:
lint5-common:

# empty local rules
all-local:
install-local:
clean-local:
veryclean-local:	clean-local FORCE
depend-local:
lint-local:
lint5-local:

veryclean: FORCE
	$(RM) Makefile
	$(RM) -r .libs

Makefile: Makefile.in $(top_srcdir)/build/top.mk

pathtest:
	$(SHTOOL) --version

# empty rule for forcing rules
FORCE:

##---------------------------------------------------------------------------

# Makefile.in for back-null
# $OpenLDAP$
## This work is part of OpenLDAP Software <http://www.openldap.org/>.
##
## Copyright 1998-2016 The OpenLDAP Foundation.
## All rights reserved.
##
## Redistribution and use in source and binary forms, with or without
## modification, are permitted only as authorized by the OpenLDAP
## Public License.
##
## A copy of this license is available in the file LICENSE in the
## top-level directory of the distribution or, alternatively, at
## <http://www.OpenLDAP.org/license.html>.

SRCS = null.c
OBJS = null.lo

LDAP_INCDIR= ../../../include       
LDAP_LIBDIR= ../../../libraries

BUILD_OPT = "--enable-null"
BUILD_MOD = mod

mod_DEFS = -DSLAPD_IMPORT
MOD_DEFS = $(mod_DEFS)

shared_LDAP_LIBS = $(LDAP_LIBLDAP_R_LA) $(LDAP_LIBLBER_LA)
NT_LINK_LIBS = -L.. -lslapd $(shared_LDAP_LIBS)
UNIX_LINK_LIBS = $(shared_LDAP_LIBS)

LIBBASE = back_null

XINCPATH = -I.. -I$(srcdir)/..
XDEFS = $(MODULES_CPPFLAGS)

all-local-lib:	../.backend

../.backend: lib$(LIBBASE).a
	@touch $@

# $OpenLDAP$
## This work is part of OpenLDAP Software <http://www.openldap.org/>.
##
## Copyright 1998-2016 The OpenLDAP Foundation.
## All rights reserved.
##
## Redistribution and use in source and binary forms, with or without
## modification, are permitted only as authorized by the OpenLDAP
## Public License.
##
## A copy of this license is available in the file LICENSE in the
## top-level directory of the distribution or, alternatively, at
## <http://www.OpenLDAP.org/license.html>.
##---------------------------------------------------------------------------
#
# Makefile Template for Server Modules
#

LIBRARY = $(LIBBASE).la
LIBSTAT = lib$(LIBBASE).a

MKDEPFLAG = -l

.SUFFIXES: .c .o .lo

.c.lo:
	$(LTCOMPILE_MOD) $<

all-no lint-no 5lint-no depend-no install-no: FORCE
	@echo "run configure with $(BUILD_OPT) to make $(LIBBASE)"

all-common: all-$(BUILD_MOD)

version.c: Makefile
	$(RM) $@
	$(MKVERSION) $(LIBBASE) > $@

version.lo: version.c $(OBJS)

$(LIBRARY): version.lo
	$(LTLINK_MOD) -module -o $@ $(OBJS) version.lo $(LINK_LIBS)

$(LIBSTAT): version.lo
	$(AR) ruv $@ `echo $(OBJS) | sed 's/\.lo/.o/g'` version.o
	@$(RANLIB) $@

clean-common: clean-lib FORCE
veryclean-common: veryclean-lib FORCE


lint-common: lint-$(BUILD_MOD)

5lint-common: 5lint-$(BUILD_MOD)

depend-common: depend-$(BUILD_MOD)

install-common: install-$(BUILD_MOD)

all-local-mod:
all-mod: $(LIBRARY) all-local-mod FORCE

all-local-lib:
all-yes: $(LIBSTAT) all-local-lib FORCE

install-mod: $(LIBRARY)
	@-$(MKDIR) $(DESTDIR)$(moduledir)
	$(LTINSTALL) $(INSTALLFLAGS) -m 755 $(LIBRARY) $(DESTDIR)$(moduledir)

install-local-lib:
install-yes: install-local-lib FORCE

lint-local-lib:
lint-yes lint-mod: lint-local-lib FORCE
	$(LINT) $(DEFS) $(DEFINES) $(SRCS)

5lint-local-lib:
5lint-yes 5lint-mod: 5lint-local-lib FORCE
	$(5LINT) $(DEFS) $(DEFINES) $(SRCS)

clean-local-lib:
clean-lib: 	clean-local-lib FORCE
	$(RM) $(LIBRARY) $(LIBSTAT) version.c *.o *.lo a.out core .libs/*

depend-local-lib:
depend-yes depend-mod: depend-local-lib FORCE
	$(MKDEP) $(DEFS) $(DEFINES) $(SRCS)

veryclean-local-lib:
veryclean-lib: 	clean-lib veryclean-local-lib

Makefile: $(top_srcdir)/build/mod.mk

# DO NOT DELETE THIS LINE -- mkdep uses it.
# DO NOT PUT ANYTHING AFTER THIS LINE, IT WILL GO AWAY.


#
# files: -I../../../include -I../../../include -I.. -I./.. -I/opt/zimbra/common/include null.c
# command: cc -M -I.  -I../../../include -I../../../include -I.. -I./.. -I/opt/zimbra/common/include null.c
#

null.lo: null.c
null.lo: ../../../include/portable.h
null.lo: /usr/lib/gcc/x86_64-redhat-linux/4.4.7/include/stddef.h
null.lo: ../../../include/ac/fdset.h
null.lo: /usr/include/bits/types.h
null.lo: /usr/include/features.h
null.lo: /usr/include/sys/cdefs.h
null.lo: /usr/include/bits/wordsize.h
null.lo: /usr/include/gnu/stubs.h
null.lo: /usr/include/gnu/stubs-64.h
null.lo: /usr/include/bits/typesizes.h
null.lo: ../../../include/ldap_cdefs.h
null.lo: ../../../include/ldap_features.h
null.lo: ../../../include/ac/assert.h
null.lo: /usr/include/assert.h
null.lo: ../../../include/ac/localize.h
null.lo: /usr/include/stdio.h
null.lo: /usr/include/libio.h
null.lo: /usr/include/_G_config.h
null.lo: /usr/include/wchar.h
null.lo: /usr/lib/gcc/x86_64-redhat-linux/4.4.7/include/stdarg.h
null.lo: /usr/include/bits/stdio_lim.h
null.lo: /usr/include/bits/sys_errlist.h
null.lo: ../../../include/ac/string.h
null.lo: /usr/include/string.h
null.lo: /usr/include/xlocale.h
null.lo: ../slap.h
null.lo: ../../../include/ldap_defaults.h
null.lo: ../../../include/ldap_config.h
null.lo: ../../../include/ac/stdlib.h
null.lo: /usr/include/stdlib.h
null.lo: /usr/include/bits/waitflags.h
null.lo: /usr/include/bits/waitstatus.h
null.lo: /usr/include/endian.h
null.lo: /usr/include/bits/endian.h
null.lo: /usr/include/bits/byteswap.h
null.lo: /usr/include/sys/types.h
null.lo: /usr/include/time.h
null.lo: /usr/include/sys/select.h
null.lo: /usr/include/bits/select.h
null.lo: /usr/include/bits/sigset.h
null.lo: /usr/include/bits/time.h
null.lo: /usr/include/sys/sysmacros.h
null.lo: /usr/include/bits/pthreadtypes.h
null.lo: /usr/include/alloca.h
null.lo: /usr/lib/gcc/x86_64-redhat-linux/4.4.7/include/limits.h
null.lo: /usr/lib/gcc/x86_64-redhat-linux/4.4.7/include/syslimits.h
null.lo: /usr/include/limits.h
null.lo: /usr/include/bits/posix1_lim.h
null.lo: /usr/include/bits/local_lim.h
null.lo: /usr/include/linux/limits.h
null.lo: /usr/include/bits/posix2_lim.h
null.lo: ../../../include/ac/syslog.h
null.lo: /usr/include/syslog.h
null.lo: /usr/include/sys/syslog.h
null.lo: /usr/include/bits/syslog-path.h
null.lo: ../../../include/ac/regex.h
null.lo: /usr/include/regex.h
null.lo: ../../../include/ac/signal.h
null.lo: /usr/include/signal.h
null.lo: /usr/include/bits/signum.h
null.lo: /usr/include/bits/siginfo.h
null.lo: /usr/include/bits/sigaction.h
null.lo: /usr/include/bits/sigcontext.h
null.lo: /usr/include/bits/sigstack.h
null.lo: /usr/include/sys/ucontext.h
null.lo: /usr/include/bits/sigthread.h
null.lo: ../../../include/ac/socket.h
null.lo: /usr/include/poll.h
null.lo: /usr/include/sys/poll.h
null.lo: /usr/include/bits/poll.h
null.lo: /usr/include/sys/socket.h
null.lo: /usr/include/sys/uio.h
null.lo: /usr/include/bits/uio.h
null.lo: /usr/include/bits/socket.h
null.lo: /usr/include/bits/sockaddr.h
null.lo: /usr/include/asm/socket.h
null.lo: /usr/include/asm-generic/socket.h
null.lo: /usr/include/asm/sockios.h
null.lo: /usr/include/asm-generic/sockios.h
null.lo: /usr/include/sys/un.h
null.lo: /usr/include/netinet/in.h
null.lo: /usr/include/stdint.h
null.lo: /usr/include/bits/wchar.h
null.lo: /usr/include/bits/in.h
null.lo: /usr/include/netinet/tcp.h
null.lo: /usr/include/arpa/inet.h
null.lo: /usr/include/arpa/nameser.h
null.lo: /usr/include/sys/param.h
null.lo: /usr/include/linux/param.h
null.lo: /usr/include/asm/param.h
null.lo: /usr/include/asm-generic/param.h
null.lo: /usr/include/sys/bitypes.h
null.lo: /usr/include/arpa/nameser_compat.h
null.lo: /usr/include/netdb.h
null.lo: /usr/include/rpc/netdb.h
null.lo: /usr/include/bits/netdb.h
null.lo: /usr/include/resolv.h
null.lo: ../../../include/ac/time.h
null.lo: /usr/include/sys/time.h
null.lo: ../../../include/ac/param.h
null.lo: ../../../include/ac/unistd.h
null.lo: /usr/include/unistd.h
null.lo: /usr/include/bits/posix_opt.h
null.lo: /usr/include/bits/environments.h
null.lo: /usr/include/bits/confname.h
null.lo: /usr/include/getopt.h
null.lo: ../../../include/lutil_lockf.h
null.lo: ../../../include/avl.h
null.lo: ../../../include/ldap_cdefs.h
null.lo: ../../../include/ldap_log.h
null.lo: ../../../include/ldap.h
null.lo: ../../../include/lber.h
null.lo: ../../../include/lber_types.h
null.lo: ../../../include/ldap_features.h
null.lo: ../../../include/ldap_schema.h
null.lo: ../../../include/lber_pvt.h
null.lo: ../../../include/ldap_pvt.h
null.lo: ../../../include/ldap_pvt_uc.h
null.lo: ../../../include/ac/bytes.h
null.lo: ../../../include/../libraries/liblunicode/ucdata/ucdata.h
null.lo: ../../../include/ldap_pvt_thread.h
null.lo: ../../../include/ldap_int_thread.h
null.lo: /usr/include/pthread.h
null.lo: /usr/include/sched.h
null.lo: /usr/include/bits/sched.h
null.lo: /usr/include/bits/setjmp.h
null.lo: ../../../include/ldap_queue.h
null.lo: ../proto-slap.h
null.lo: ../config.h

# IF YOU PUT ANYTHING HERE IT WILL GO AWAY
