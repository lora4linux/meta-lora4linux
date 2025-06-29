SUMMARY = "L4L developement image"
LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES += " \
    allow-empty-password \
    allow-root-login \
    empty-root-password \
    serial-autologin-root \
    ssh-server-openssh \
"
