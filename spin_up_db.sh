#!/bin/bash

docker pull postgres

docker run --name=quran_db \
    -e POSTGRES_PASSWORD=postgres \
    -e PGPORT=5434 -p 5433:5434 \
    -e POSTGRES_DB=quran_db \
    -v quran_db:/var/lib/postgresql/data \
    -d postgres:latest

docker exec quran_db psql -U postgres -c "CREATE DATABASE quran_db"

psql -h localhost -p 5433 -U postgres quran_db <quran.sql
