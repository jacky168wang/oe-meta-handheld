require linux.inc

PR = "${INC_PR}.5"

COMPATIBLE_MACHINE = "(akita|c7x0|collie|poodle|tosa|spitz|h1940)"

SRC_URI += "${KERNELORG_MIRROR}/linux/kernel/v3.x/linux-${PV}.tar.bz2;name=kernel \
           ${KERNELORG_MIRROR}/linux/kernel/v3.x/patch-${PV}.7.bz2;apply=yes;name=stablepatch \
           file://defconfig \
           file://${LOGO_SIZE}/logo_linux_clut224.ppm.bz2 \
           "

SRC_URI_append_collie = " \
                         file://0001-pcmcia-pxa2xx_sharpsl-retain-ops-structure-on-collie.patch \
                         file://locomo_kbd_tweak-r2.patch \
                         "

SRC_URI_append_poodle = " \
                         file://locomo_kbd_tweak-r2.patch \
                         "

SRC_URI[kernel.md5sum] = "8d43453f8159b2332ad410b19d86a931"
SRC_URI[kernel.sha256sum] = "2573d2378c754b0c602b57586e9311e5b38c5d1e6c137f02873833633a4b9359"
SRC_URI[stablepatch.md5sum] = "13ea1e611a0a580138b8203e6f1353ed"
SRC_URI[stablepatch.sha256sum] = "44f2611ce923db17254eeb618ed06703acf4dd6dcc8357b360e11a1111b0bc9d"
