#!/bin/bash

docker exec benchmark-mongo mongosh --eval "use mydb" --eval "db.customers.drop()"