#!/bin/sh

set -a
. .env
set +a

java -jar build/libs/api-java-test-0.0.1-SNAPSHOT.jar