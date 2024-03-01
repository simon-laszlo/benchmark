# REST-mongo benchmark

Simple REST server implementations to test the programming languages and runtimes in a "life" scenario. The projects have same architecture: model, db, handler, route.

Functions:
- GET -> return the customer list from the mongo DB
- POST -> store new customer in the mongo DB

Implementations:
- node js, express, mongo
- rust, warp, mongo
- java, spring, mongo
- kotlin, spring, mongo
- go, gin
- quarkus / reactive

I have used the most recent libraries.

## Endpoints
### The JSON

Object structure of the mongo collection :

```
{    
  "guid": "1234567890",
  "first_name": "Test",
  "last_name": "User",
  "email": "testuser@gmail.com",
  "address": "Blabla 88888 Bla, Bla 8"
}
```

### GET http://localhost:{port}/customers

Returns list of the customers in JSON format.

### POST http://localhost:{port}/customers

Creates a new customer in the mongo db.

## Testing
### Mongo db

If you don't have yet any mongo on your localhost, then the simplest way to start with docker. Check the [docker readme](docker/README.md).


#### Drop the customers collection

```
./docker/clean.sh
```

### WRK and WRK2

I choosed wrk for the testing. It's necessary to change the CPU governor before the test to be more accurate :

```
sudo cpupower frequency-set -g performance
```

Inaccuracy can be avoided, because the operating system doesn't change the CPU frequency quick enough, and the system load can vary between implementations.


#### Create customers

10 connection, 1 minute, 2 thread, throughput 100

```
wrk2 -c10 -d1m -t2 -R100 -s customers.lua http://localhost:3000/customers
```

#### Load test of GET customers list

10 connection, 1 minute, 2 thread

```
wrk -c10 -d1m -t2 http://localhost:3000/customers
```

## Results

The GET test has been executed always with the initialized db with 1.000 items.

### Environment

HP Elitebook G10 845

- AMD Ryzen 9 PRO 7940HS
- 64GB RAM
- SAMSUNG SSD 990 PRO

[wrk details](WRK.md)

## Summary

Language/runtime | GET (req/sec) | POST (req/sec)
--- | --- | --- |
Rust | 1510.35 | 20030.25 |
Node js(express) | 105.68 | 1653.49 |
Node js(express) PM2 6thread | 258.72 | 2492.65 |
Node js(fasify) | 233.85 | 7790.63 |
Node js(fastify) PM2 6thread | 596.13 | 13554.32 |
Node js(restana) | 235.93 | 7548.98 |
Node js(restana) PM2 6thread | 616.04 | 12893.91 |
Go gin | 1200.50 | 24617.32 |
Quarkus native | 732.39 | 4485.90 |
Quarkus native reactive | 232.40 | 4658.91 |
graal vm spring webflux| 105.37 | 5997.62 |
graal vm native spring webflux | 107.07 | 9251.40 |
openjdk 18 spring webflux | 119.88 | 11073.71 |
graal vm 17 kotlin spring | 827.48 | 16752.50 |

Language/runtime | GET (req/sec) | max CPU usage % | max Memory usage (MB)
--- | --- | --- | --- |
kotlin - java 21.0.2 | 2563.54 | 1131.00 | 3052.8 |
kotlin - native image java -21.0.2 | 464.93 | 572.50 | 921.6 |
spring java 21.0.2 | 2499.15 | 1142.00 | 2841.6 |
spring java 21.0.2 | 2406.11 | 1179.50 | 3033.6 |
quarkus java 21.0.2 | 4620.66 | 893.03 | 2188.8 |
quarkus native | 1393.15 | 758.50 | 486.4 |
quarkus-reactive java 21.0.2 | 714.98 | 681.00 | 1177.6 |
quarkus-reactive native | 361.50 | 342.50 | 179.2 |
webflux java 21.0.2 | 77.97 | 873.50 | 851.2 |
webflux native | 75.97 | 872.00 | 851.2 |
rust | 3932.39 | 749.00 | 32 |
go1.22.0 | 2717.57 | 856.50 | 89.6 |
node v20.11.0 (express) | 263.64 | 130.00 | 217.6 |
node v20.11.0 (express) PM2 6 threads | 1052.81 | - | - |
node v20.11.0 (fastify) | 351.95 | 136.00 | 256 |
node v20.11.0 (fastify) PM2 6 threads | 1028.22 | - | - |
node v20.11.0 (restana) | 249.63 | 131.50 | 204.8 |
node v20.11.0 (restana) PM2 6 threads | 1096.39 | - | - |

You can find [here](TABLE_GET.md) the GET benchmark results.

You can find [here](TABLE_POST.md) the POST benchmark results