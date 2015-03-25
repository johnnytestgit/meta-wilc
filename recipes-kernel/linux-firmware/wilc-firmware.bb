SECTION = "kernel"
LICENSE = "CLOSED"

SRCREV = "92166881429d0296be9b9bcf61954553bcc01090"
SRC_URI = "git://github.com/linux4sc/wireless-firmware.git"

PACKAGES =+ "linux-firmware-atmel"

S = "${WORKDIR}/git"

do_install() {
  install -d  ${D}/lib/firmware/atmel/
	cp -r wilc* ${D}/lib/firmware/atmel/
}

FILES_linux-firmware-atmel += " \
  /lib/firmware/atmel/wilc1000_ap_fw.bin \
  /lib/firmware/atmel/wilc1000_fw.bin \
  /lib/firmware/atmel/wilc1000_p2p_fw.bin "