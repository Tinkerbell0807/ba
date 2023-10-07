#!/bin/bash

#!/bin/bash

NODE_EXTERNAL_IP=$(kubectl get nodes -o jsonpath='{.items[0].status.addresses[?(@.type=="ExternalIP")].address}')
TIMEOUT=3

if [ -z "$NODE_EXTERNAL_IP" ]; then
    echo "No external IP found for any node. Exiting."
    exit 1
fi

echo "Using Node External IP: $NODE_EXTERNAL_IP"

curl --max-time $TIMEOUT $NODE_EXTERNAL_IP:30001/health
echo
curl --max-time $TIMEOUT $NODE_EXTERNAL_IP:30003/health
echo
curl --max-time $TIMEOUT $NODE_EXTERNAL_IP:30002/health
echo
curl --max-time $TIMEOUT $NODE_EXTERNAL_IP:30000/health
echo

