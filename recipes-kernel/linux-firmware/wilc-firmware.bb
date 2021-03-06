SECTION = "kernel"
LICENSE = "CLOSED"

SRCREV = "92166881429d0296be9b9bcf61954553bcc01090"
SRC_URI = "git://github.com/linux4sc/wireless-firmware.git"

PACKAGES =+ "linux-firmware-atmel-wilc1000"

S = "${WORKDIR}/git"

do_install() {
  install -d ${D}/lib/firmware/atmel/
  install -m 0755 wilc* ${D}/lib/firmware/atmel/
}

FILES_linux-firmware-atmel-wilc1000 += " \
  /lib/firmware/atmel/wilc1000_ap_fw.bin \
  /lib/firmware/atmel/wilc1000_fw.bin \
  /lib/firmware/atmel/wilc1000_p2p_fw.bin "