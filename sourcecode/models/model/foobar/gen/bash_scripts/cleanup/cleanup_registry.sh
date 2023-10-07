#!/bin/bash

REPO_LOCATION="europe-west1"
REPO_NAME="private-gcp-409308/quickstart-docker-repo"

IMAGES=$(gcloud artifacts docker images list ${REPO_LOCATION}-docker.pkg.dev/${REPO_NAME} --format="get(IMAGE)")

for IMAGE in $IMAGES; do
    gcloud artifacts docker images delete ${IMAGE} -q
    echo "Deleted ${IMAGE}"
done

echo "All images in the repository have been deleted."

