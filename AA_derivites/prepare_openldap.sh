#!/bin/sh

  RPM_SOURCE_DIR="/root/rpmbuild/SOURCES"
  RPM_BUILD_DIR="/root/rpmbuild/BUILD"
  RPM_OPT_FLAGS="-O2 -g -pipe -Wall -Wp,-D_FORTIFY_SOURCE=2 -fexceptions -fstack-protector --param=ssp-buffer-size=4 -m64 -mtune=generic"
  RPM_ARCH="x86_64"
  RPM_OS="linux"
  export RPM_SOURCE_DIR RPM_BUILD_DIR RPM_OPT_FLAGS RPM_ARCH RPM_OS
  RPM_DOC_DIR="/usr/share/doc"
  export RPM_DOC_DIR
  RPM_PACKAGE_NAME="zimbra-openldap"
  RPM_PACKAGE_VERSION="2.44"
  RPM_PACKAGE_RELEASE="1zimbra8.7b9ZAPPEND"
  export RPM_PACKAGE_NAME RPM_PACKAGE_VERSION RPM_PACKAGE_RELEASE
  LANG=C
  export LANG
  unset CDPATH DISPLAY ||:
  RPM_BUILD_ROOT="/root/rpmbuild/BUILDROOT/zimbra-openldap-2.44-1zimbra8.7b9ZAPPEND.x86_64"
  export RPM_BUILD_ROOT
  
  PKG_CONFIG_PATH="${PKG_CONFIG_PATH}:/usr/lib64/pkgconfig:/usr/share/pkgconfig"
  export PKG_CONFIG_PATH
  
  set -x
  umask 022
  cd "/root/rpmbuild/BUILD"
LANG=C
export LANG
unset DISPLAY

cd '/root/rpmbuild/BUILD'
rm -rf 'openldap-2.44'
/usr/bin/gzip -dc '/root/rpmbuild/SOURCES/zimbra-openldap-2.44.tgz' | /bin/tar -xvvf - 
STATUS=$?
if [ $STATUS -ne 0 ]; then
  exit $STATUS
fi
cd '/root/rpmbuild/BUILD/openldap-2.4.44'
/bin/chmod -Rf a+rX,u+w,g-w,o-w .
echo "Patch #0 (ITS5037.patch):"
/bin/cat /root/rpmbuild/SOURCES/ITS5037.patch | /usr/bin/patch  -p1  --fuzz=0

echo "Patch #1 (writers.patch):"
/bin/cat /root/rpmbuild/SOURCES/writers.patch | /usr/bin/patch  -p1  --fuzz=0

echo "Patch #2 (ITS7683.patch):"
/bin/cat /root/rpmbuild/SOURCES/ITS7683.patch | /usr/bin/patch  -p1  --fuzz=0

echo "Patch #3 (ITS8054.patch):"
/bin/cat /root/rpmbuild/SOURCES/ITS8054.patch | /usr/bin/patch  -p1  --fuzz=0

echo "Patch #4 (threadpool.patch):"
/bin/cat /root/rpmbuild/SOURCES/threadpool.patch | /usr/bin/patch  -p1  --fuzz=0

echo "Patch #5 (liblmdb-soname.patch):"
/bin/cat /root/rpmbuild/SOURCES/liblmdb-soname.patch | /usr/bin/patch  -p1  --fuzz=0

echo "Patch #6 (ITS7506.patch):"
/bin/cat /root/rpmbuild/SOURCES/ITS7506.patch | /usr/bin/patch  -p1  --fuzz=0

echo "Patch #7 (ITS8413.patch):"
/bin/cat /root/rpmbuild/SOURCES/ITS8413.patch | /usr/bin/patch  -p1  --fuzz=0

echo "Patch #8 (ITS8432.patch):"
/bin/cat /root/rpmbuild/SOURCES/ITS8432.patch | /usr/bin/patch  -p1  --fuzz=0


exit 0
