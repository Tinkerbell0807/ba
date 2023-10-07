#!/bin/bash

gcloud artifacts repositories create quickstart-docker-repo --repository-format=docker --location=europe-west1 --description="Docker repository"
gcloud auth configure-docker europe-west1-docker.pkg.dev
