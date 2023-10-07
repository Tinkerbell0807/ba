#!/bin/bash

SCRIPT_DIR=~/Dokumente/Bachelorarbeit/Beispielprojekt_Cloud/
cd $SCRIPT_DIR || { echo "Failed to change directory to $SCRIPT_DIR"; exit 1; }

chmod +x ./customer-service/build_and_push.sh
./customer-service/build_and_push.sh
echo "Executed build and push for Customer Service."

chmod +x ./backoffice-service/build_and_push.sh
./backoffice-service/build_and_push.sh
echo "Executed build and push for Backoffice Service."

chmod +x ./order-service/build_and_push.sh
./order-service/build_and_push.sh
echo "Executed build and push for Order Service."

chmod +x ./checkout-service/build_and_push.sh
./checkout-service/build_and_push.sh
echo "Executed build and push for Checkout Service."

echo "Script execution completed."
