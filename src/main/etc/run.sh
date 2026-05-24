#!/usr/bin/env bash

# Run this file from Docker Image or distribution directory

set -euo pipefail

cd `dirname ${0}`

cd opt/app/soapful

java \
  @jvm.config \
  --module-path "demo.jar:libs" \
  --module com.example.demo/com.example.demo.DemoApplication \
  --spring.config.additional-location=file:resources/