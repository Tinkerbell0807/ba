#!/bin/bash

TIMEOUT=3

curl --max-time $TIMEOUT http://localhost:8080/health
echo
curl --max-time $TIMEOUT http://localhost:8081/health
echo
curl --max-time $TIMEOUT http://localhost:8082/health
echo
curl --max-time $TIMEOUT http://localhost:8083/health
echo
curl --max-time $TIMEOUT http://localhost:8084/health