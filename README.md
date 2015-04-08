# meta-wilc

-Poky Build Error Fix-

1. Network Fail when bitbake core-image-minimal is entered
~~~
ERROR:  OE-core's config sanity checker detected a potential misconfiguration.
    Either fix the cause of this error or at your own risk disable the checker (see sanity.conf).
    Following is the list of potential problems / advisories:

    Failed to fetch test data from the network. Please ensure your network is configured correctly.
~~~
  - edit /meta-yocto/conf/distro/poky.conf
  - CONNECTIVITY_CHECK_URIS = ""
2. Library
  - build-essential
  - device-tree-compiler
  - lzma
  - lzop
  - u-boot-tools
  - libncurses5-dev:amd64 
  - diffstat
  - gawk
  - chrpath
  - libsdl1.2-dev
  - pandoc
  - texinfo
3. local.conf
  - IMAGE_INSTALL_append += " \
  - hostapd \
  - linux-firmware-atmel-wilc1000 \ 
  - wilc1000 \
  - wilc1000-demo-init"
