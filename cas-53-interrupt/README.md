CAS Gradle Overlay
============================
CAS gradle war overlay with custom Groovy based interrupt facility

## Versions

* CAS `5.3.3`

## Requirements

* JDK 1.8+

## Configuration

The `etc` directory contains the configuration files that need to be copied to `/etc/cas/config`
After copying, modify `/etc/cas/config/interrupt/interrupts-by-service.conf` file with your own services and interrupt messages you wish to show

## Build

`./buildWar`

## Run

`./run`
