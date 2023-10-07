#!/bin/bash

parentPath="/path/to/your/parent/directory"  # Replace with your actual directory path
# Customer service
cd "$parentPath/backoffice-service" || exit
gradle bootRun > backoffice-service.log 2>&1 &
echo "backoffice-service executed"
# Customer service
cd "$parentPath/order-service" || exit
gradle bootRun > order-service.log 2>&1 &
echo "order-service executed"
# Customer service
cd "$parentPath/checkout-service" || exit
gradle bootRun > checkout-service.log 2>&1 &
echo "checkout-service executed"
# Customer service
cd "$parentPath/customer-service" || exit
gradle bootRun > customer-service.log 2>&1 &
echo "customer-service executed"
