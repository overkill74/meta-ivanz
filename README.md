# meta-ivanz
YOCTO Project meta layer for testing purpose. It create a webserver on RaspberryPI 4. It it based on "zeus" branch.

This the script to get all the necessary components:
```
#!/usr/bin/env bash

set -e

usage() {
  echo "Usage: $0 <target-directory>"
}

if [ $# -ne 1 ]; then
  usage
  exit 1
fi

directory=$1

if [ -e "${directory}" ]; then
  echo "Error: \"${directory}\" already exists."
  usage
fi

# create the directory
mkdir -p "${directory}/sources" && cd "${directory}"

# clone poky and other layers
git clone -b zeus git://git.yoctoproject.org/poky.git sources/poky
git clone -b zeus https://github.com/agherzan/meta-raspberrypi.git sources/meta-raspberrypi
git clone -b zeus https://github.com/openembedded/meta-openembedded.git sources/meta-openembedded

# clone meta-ivanz layer
git clone https://github.com/overkill74/meta-ivanz.git sources/meta-ivanz

echo "Done, type \"cd ${directory} && . ./sources/poky/oe-init-build-env\" to create the build environment"
```

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
