#!/bin/bash
curl -k -s  --data "RequestType=Login&UE-Username=Your_Username&UE-Password=Your_Password" https://scg.ruckuswireless.com:9998/SubscriberPortal/login | grep 'Sign Out' &> /dev/null
if [ $? == 0 ]; then
  echo "WiFi logged in!"
else
  echo "Not connected to WiFi!"
fi
