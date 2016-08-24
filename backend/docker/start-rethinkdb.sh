#!/usr/bin/env bash
# Create base storage container
# docker run --name storage -v "/data" busybox

# Create rethinkdb container
docker run --name selenium-grid-stats -d --net=host rethinkdb:2.3
