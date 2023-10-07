#!/bin/bash

cd "$(dirname "$0")"

IMAGE_NAME="order-service-image"
GCP_PROJECT_ID="private-gcp-409308"
GCP_ARTIFACT_REPO="europe-west1-docker.pkg.dev/$GCP_PROJECT_ID/quickstart-docker-repo/$IMAGE_NAME"

docker build -t $IMAGE_NAME .
docker tag $IMAGE_NAME $GCP_ARTIFACT_REPO
docker push $GCP_ARTIFACT_REPO

echo "Build und Push für das Image $IMAGE_NAME abgeschlossen."
