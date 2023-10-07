#!/bin/bash

SCRIPT_DIR=~/Dokumente/Bachelorarbeit/Beispielprojekt_Lokal/
cd $SCRIPT_DIR || { echo "Failed to change directory to $SCRIPT_DIR"; exit 1; }

echo "Deleting Kubernetes deployments..."

kubectl delete -f ./customer-service/deployment.yml
echo "Customer Service deployment deleted."

kubectl delete -f ./backoffice-service/deployment.yml
echo "Backoffice Service deployment deleted."

kubectl delete -f ./order-service/deployment.yml
echo "Order Service deployment deleted."

kubectl delete -f ./checkout-service/deployment.yml
echo "Checkout Service deployment deleted."

echo "Deleting GCP firewall rules..."

gcloud compute firewall-rules delete customer-service-nodeport -q
echo "Firewall rule for Customer Service deleted."

gcloud compute firewall-rules delete backoffice-service-nodeport -q
echo "Firewall rule for Backoffice Service deleted."

gcloud compute firewall-rules delete order-service-nodeport -q
echo "Firewall rule for Order Service deleted."

gcloud compute firewall-rules delete checkout-service-nodeport -q
echo "Firewall rule for Checkout Service deleted."

echo "Reversion script execution completed."