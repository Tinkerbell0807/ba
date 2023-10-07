#!/bin/bash

# Fetch the name of the first Kafka pod
PODNAME=$(kubectl get pods --no-headers -o custom-columns=":metadata.name" | grep 'my-kafka' | head -n 1)

# Check if a Kafka pod was found
if [ -z "$PODNAME" ]; then
    echo "No Kafka pod found. Exiting."
    exit 1
fi

echo "Using Kafka pod: $PODNAME"

# Create Kafka topics
kubectl exec $PODNAME -- kafka-topics.sh --create --topic customer --partitions 1 --replication-factor 1 --bootstrap-server kafka:9092
kubectl exec $PODNAME -- kafka-topics.sh --create --topic order --partitions 1 --replication-factor 1 --bootstrap-server kafka:9092
kubectl exec $PODNAME -- kafka-topics.sh --create --topic checkout --partitions 1 --replication-factor 1 --bootstrap-server kafka:9092
kubectl exec $PODNAME -- kafka-topics.sh --create --topic notification --partitions 1 --replication-factor 1 --bootstrap-server kafka:9092

# List all topics
echo "Listing all Topics:"
kubectl exec $PODNAME -- kafka-topics.sh --list --bootstrap-server kafka:9092
