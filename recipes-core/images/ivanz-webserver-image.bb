# based on meta-webserver-image
require recipes-core/images/meta-webserver-image.bb

DISTRO_FEATURES += "wifi"

# Add vim
IMAGE_INSTALL += "vim"

# Add apache2
IMAGE_INSTALL += "apache2"

# Add network stuffs
IMAGE_INSTALL += "curl"
#IMAGE_INSTALL += "vsftpd"
IMAGE_INSTALL += "git"
IMAGE_INSTALL += "subversion"
IMAGE_INSTALL += "openssh"
IMAGE_INSTALL += "openssl"
IMAGE_INSTALL += "wpa-supplicant"

# Add Gstreamer
#IMAGE_INSTALL += "gstreamer1.0"


