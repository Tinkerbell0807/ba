#!/bin/bash

ROOT_DIR=~/Dokumente/Bachelorarbeit/Beispielprojekt_Lokal/
cd $ROOT_DIR || { echo "Failed to change directory to $ROOT_DIR"; exit 1; }

echo "Deleting Kubernetes deployments..."

kubectl delete -f ./backoffice-service/deployment.yml
echo "backoffice-service deployment deleted."
kubectl delete -f ./order-service/deployment.yml
echo "order-service deployment deleted."
kubectl delete -f ./checkout-service/deployment.yml
echo "checkout-service deployment deleted."
kubectl delete -f ./customer-service/deployment.yml
echo "customer-service deployment deleted."

echo "Deleting GCP firewall rules..."

gcloud compute firewall-rules delete backoffice-service-nodeport -q
echo "Firewall rule for backoffice-service deleted."
gcloud compute firewall-rules delete order-service-nodeport -q
echo "Firewall rule for order-service deleted."
gcloud compute firewall-rules delete checkout-service-nodeport -q
echo "Firewall rule for checkout-service deleted."
gcloud compute firewall-rules delete customer-service-nodeport -q
echo "Firewall rule for customer-service deleted."

echo "Undeploy script executed."

