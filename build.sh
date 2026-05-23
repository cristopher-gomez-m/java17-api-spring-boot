#!/bin/sh

set -a
. .env
set +a

./gradlew build -x test