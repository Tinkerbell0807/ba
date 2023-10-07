#!/bin/bash

ROOT_DIR=~/Dokumente/Bachelorarbeit/Beispielprojekt_Cloud/
cd $ROOT_DIR || { echo "Failed to change directory to $ROOT_DIR"; exit 1; }

echo Adding Wrapper to backoffice-service
cd $ROOT_DIR/backoffice-service
gradle wrapper
echo Adding Wrapper to order-service
cd $ROOT_DIR/order-service
gradle wrapper
echo Adding Wrapper to checkout-service
cd $ROOT_DIR/checkout-service
gradle wrapper
echo Adding Wrapper to customer-service
cd $ROOT_DIR/customer-service
gradle wrapper

echo "Script completed."

