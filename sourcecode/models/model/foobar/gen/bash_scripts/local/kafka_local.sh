#!/bin/bash
echo Starting Kafka Docker Container ...
docker run -d --name my_kafka \
-p 9092:9092 \
-e KAFKA_CFG_ADVERTISED_LISTENERS=PLAINTEXT://localhost:9092 \
-e KAFKA_CFG_NODE_ID=0 \
-e KAFKA_CFG_PROCESS_ROLES=controller,broker \
-e KAFKA_CFG_LISTENERS=PLAINTEXT://:9092,CONTROLLER://:9093 \
-e KAFKA_CFG_LISTENER_SECURITY_PROTOCOL_MAP=CONTROLLER:PLAINTEXT,PLAINTEXT:PLAINTEXT \
-e KAFKA_CFG_CONTROLLER_QUORUM_VOTERS=0@localhost:9093 \
-e KAFKA_CFG_CONTROLLER_LISTENER_NAMES=CONTROLLER \
bitnami/kafka:latest
sleep 5
echo Kafka started succesfully.
echo Creating Topics ...
docker exec -it my_kafka kafka-topics.sh --create --topic customer --partitions 1 --replication-factor 1 --bootstrap-server localhost:9092
docker exec -it my_kafka kafka-topics.sh --create --topic order --partitions 1 --replication-factor 1 --bootstrap-server localhost:9092
docker exec -it my_kafka kafka-topics.sh --create --topic checkout --partitions 1 --replication-factor 1 --bootstrap-server localhost:9092
