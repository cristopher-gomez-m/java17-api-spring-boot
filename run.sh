#!/bin/bash

set -a
source .env
set +a

./gradlew bootRun --args='--server.port=8000'