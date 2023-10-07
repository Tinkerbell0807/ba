#!/bin/bash

gcloud container clusters resize mein-cluster --zone europe-west1-b --num-nodes=0
