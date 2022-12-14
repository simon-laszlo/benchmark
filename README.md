# REST-mongo benchmark
Simple REST server implementations to test the programming languages and runtimes in a "life" scenario. The projects have same architecture, and they receives an HTTP request, and according to the request they do a CRUD operation in the mongo db.

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
I choosed wrk for the testing. Before the test it's necessary to change the CPU governor:
```
sudo cpupower frequency-set -g performance
```
Inaccuracy can be avoided, because the operating system doesn't change the CPU frequency too quickly, and the system load can vary between implementations.


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
Lenovo X1 Carbon 7th gen

- Intel(R) Core(TM) i7-8665U CPU
- 15GB RAM
- SAMSUNG MZVLB2T0HALB-000L7

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