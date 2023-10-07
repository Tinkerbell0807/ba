#!/bin/bash
echo -e "=============NODE=============="
kubectl get node --output=wide
echo -e "=============DEPLOYMENTS=============="
kubectl get deployments --output=wide
echo -e "=============PODS=============="
kubectl get pods --output=wide
echo -e "=============SERVICES=============="
kubectl get services --output=wide

