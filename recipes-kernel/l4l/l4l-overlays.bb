SUMMARY = "Kernel overlays for L4L support"
LICENSE = "CLOSED"

inherit devicetree

SRCREV = "${AUTOREV}"
SRCBRANCH = "main"
SRC_URI = "git://github.com/lora4linux/lora4linux.git;protocol=https;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"
UNPACKDIR = "${WORKDIR}/sources-unpack"

COMPATIBLE_MACHINE = "^raspberrypi4-64$"

DT_FILES_PATH = "${S}/overlays"
