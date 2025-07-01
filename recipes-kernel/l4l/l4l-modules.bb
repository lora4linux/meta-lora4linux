SUMMARY = "Kernel modules for L4L support"
LICENSE = "CLOSED"

inherit module

SRCREV = "${AUTOREV}"
SRCBRANCH = "main"
SRC_URI = "git://github.com/lora4linux/lora4linux.git;protocol=https;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"
