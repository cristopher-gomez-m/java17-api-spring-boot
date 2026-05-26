#!/bin/sh

set -a
. .env
set +a

./gradlew classes --continuous &
./gradlew bootRun