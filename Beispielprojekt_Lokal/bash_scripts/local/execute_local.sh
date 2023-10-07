#!/bin/bash

parentPath="~/path"

cd "$parentPath/customer-service" || exit
gradle bootRun > customer-service.log 2>&1 &
echo "customer-service executed"

cd "$parentPath/backoffice-service" || exit
gradle bootRun > backoffice-service.log 2>&1 &
echo "backoffice-service executed"

cd "$parentPath/order-service" || exit
gradle bootRun > order-service.log 2>&1 &
echo "order-service executed"

cd "$parentPath/marketing-service" || exit
gradle bootRun > marketing-service.log 2>&1 &
echo "marketing-service executed"

cd "$parentPath/checkout-service" || exit
gradle bootRun > checkout-service.log 2>&1 &
echo "checkout-service executed"
