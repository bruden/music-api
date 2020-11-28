#!/bin/bash

initDB() {
    if [ ! -d /music/data/sqlite ]; then
        mkdir -p /music/data/sqlite
    fi
    if [ "`ls -A /music/data/sqlite`" = "" ]; then
        cp /music/sqlite/sqlite.db /music/data/sqlite/
    fi
}

initDB
java -jar music-api.jar