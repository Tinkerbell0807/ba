#!/bin/bash

ROOT_DIR=~/Dokumente/Bachelorarbeit/Beispielprojekt_Cloud/
cd $ROOT_DIR || { echo "Failed to change directory to $ROOT_DIR"; exit 1; }

chmod +x ./backoffice-service/build_and_push.sh
./backoffice-service/build_and_push.sh
echo "Executed build and push for backoffice-service."
chmod +x ./order-service/build_and_push.sh
./order-service/build_and_push.sh
echo "Executed build and push for order-service."
chmod +x ./checkout-service/build_and_push.sh
./checkout-service/build_and_push.sh
echo "Executed build and push for checkout-service."
chmod +x ./customer-service/build_and_push.sh
./customer-service/build_and_push.sh
echo "Executed build and push for customer-service."

echo "Script completed."

