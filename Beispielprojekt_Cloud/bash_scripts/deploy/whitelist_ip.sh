#!/bin/bash

ipAddress=$(curl -4 ifconfig.co)
gcloud container clusters update mein-cluster \
  --zone europe-west1-b \
  --enable-master-authorized-networks \
  --master-authorized-networks "${ipAddress}/32"
