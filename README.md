# meta-ivanz
YOCTO Project meta layer for testing purpose. It create a webserver on RaspberryPI 4

To let it works this is the bblayer.conf that nust be used:
```
# POKY_BBLAYERS_CONF_VERSION is increased each time build/conf/bblayers.conf
# changes incompatibly
POKY_BBLAYERS_CONF_VERSION = "2"

BBPATH = "${TOPDIR}"
BBFILES ?= ""

BBLAYERS ?= " \
  /opt/yocto/workspace_zeus/sources/poky/meta \
  /opt/yocto/workspace_zeus/sources/poky/meta-poky \
  /opt/yocto/workspace_zeus/sources/poky/meta-yocto-bsp \
  /opt/yocto/workspace_zeus/sources/meta-raspberrypi \
  /opt/yocto/workspace_zeus/sources/meta-openembedded/meta-oe \
  /opt/yocto/workspace_zeus/sources/meta-openembedded/meta-pythonl \
  /opt/yocto/workspace_zeus/sources/meta-openembedded/meta-networking \
  /opt/yocto/workspace_zeus/sources/meta-openembedded/meta-webserver \
  /opt/yocto/workspace_zeus/sources/meta-ivanz \
  "
```
