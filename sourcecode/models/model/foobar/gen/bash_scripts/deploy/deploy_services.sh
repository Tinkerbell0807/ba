#!/bin/bash

ROOT_DIR=~/Dokumente/Bachelorarbeit/Beispielprojekt_Cloud/
cd $ROOT_DIR || { echo "Failed to change directory to $ROOT_DIR"; exit 1; }
echo "Applying Kubernetes deployment configurations..."

kubectl apply -f ./backoffice-service/deployment.yml
echo "backoffice-service deployment applied."
kubectl apply -f ./order-service/deployment.yml
echo "order-service deployment applied."
kubectl apply -f ./checkout-service/deployment.yml
echo "checkout-service deployment applied."
kubectl apply -f ./customer-service/deployment.yml
echo "customer-service deployment applied."

echo "Configuring GCP firewall rules..."

gcloud compute firewall-rules create backoffice-service-nodeport --allow tcp:30001
echo "Firewall rule created for backoffice-service."
gcloud compute firewall-rules create order-service-nodeport --allow tcp:30003
echo "Firewall rule created for order-service."
gcloud compute firewall-rules create checkout-service-nodeport --allow tcp:30002
echo "Firewall rule created for checkout-service."
gcloud compute firewall-rules create customer-service-nodeport --allow tcp:30000
echo "Firewall rule created for customer-service."

echo "Deploy script executed."

