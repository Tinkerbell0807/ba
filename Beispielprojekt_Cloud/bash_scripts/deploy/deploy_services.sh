#!/bin/bash

SCRIPT_DIR=~/Dokumente/Bachelorarbeit/Beispielprojekt_Cloud/
cd $SCRIPT_DIR || { echo "Failed to change directory to $SCRIPT_DIR"; exit 1; }

echo "Applying Kubernetes deployment configurations..."

kubectl apply -f ./customer-service/deployment.yml
echo "Customer Service deployment applied."

kubectl apply -f ./backoffice-service/deployment.yml
echo "Backoffice Service deployment applied."

kubectl apply -f ./order-service/deployment.yml
echo "Order Service deployment applied."

kubectl apply -f ./checkout-service/deployment.yml
echo "Checkout Service deployment applied."

echo "Configuring GCP firewall rules..."

gcloud compute firewall-rules create customer-service-nodeport --allow tcp:30000
echo "Firewall rule created for Customer Service."

gcloud compute firewall-rules create backoffice-service-nodeport --allow tcp:30001
echo "Firewall rule created for Backoffice Service."

gcloud compute firewall-rules create order-service-nodeport --allow tcp:30004
echo "Firewall rule created for Order Service."

gcloud compute firewall-rules create checkout-service-nodeport --allow tcp:30002
echo "Firewall rule created for Checkout Service."

echo "Script execution completed."