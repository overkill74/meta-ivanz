# based on meta-webserver-image
#require recipes-core/images/meta-webserver-image.bb
require recipes-core/images/core-image-minimal.bb

# DISTRO_FEATURES += "wifi"

# Change root password
inherit extrausers
EXTRA_USERS_PARAMS = "usermod -P admin root;"

# Add user
inherit extrausers
EXTRA_USERS_PARAMS = "useradd -P zorbas ivanz;"

# Add vim
IMAGE_INSTALL += "vim"

# Add i2c-tools 
IMAGE_INSTALL += "i2c-tools"

# Add apache2
IMAGE_INSTALL += "apache2"

# Add network stuffs
IMAGE_INSTALL += "curl"
IMAGE_INSTALL += "vsftpd"
IMAGE_INSTALL += "git"
IMAGE_INSTALL += "subversion"
IMAGE_INSTALL += "openssh"
IMAGE_INSTALL += "openssl"
IMAGE_INSTALL += "wget"
IMAGE_INSTALL += "wpa-supplicant"

# Add tree
IMAGE_INSTALL += "tree"

# Add htop
IMAGE_INSTALL += "htop"

# Add Gstreamer
#IMAGE_INSTALL += "gstreamer1.0"

# Customize timezone
IMAGE_INSTALL += "tzdata tzdata-europe"

# Network manager
IMAGE_INSTALL += "\
networkmanager \
networkmanager-nmtui \
networkmanager-bash-completion\
"

# Extra fetures:
# Produce only rpi-sdimg
IMAGE_FSTYPE = "rpi-sdimg"

# Remove old images
RM_OLD_IMAGE = "1"

# Disable splash screen
IMAGE_FEATURES_remove = "splash"

# Print a message when compiation is done
#do_rootfs_append() {
#    bb.warn("The image is built")
#}

# Add support for WiFi and Bluetooth
IMAGE_INSTALL += "linux-firmware"
#linux-firmware-bcm43430"
IMAGE_INSTALL += "linux-firmware-rpidistro-bcm43455"

