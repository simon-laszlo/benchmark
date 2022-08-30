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
If you don't have yet any mongo on your localhost, then the simplest way to start with docker. Check the [docker readme](/docker/README).


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
PORT=3000 wrk2 -c10 -d1m -t2 -R100 -s customers.lua http://localhost:$PORT/customers
```

#### Load test of GET customers list
10 connection, 1 minute, 2 thread
```
PORT=3000 wrk -c10 -d1m -t2 http://localhost:$PORT/customers
```

## Results
The GET test has been executed always with the initialized db with 1.000 items.

### Environment
Lenovo X1 Carbon 7th gen

- Intel(R) Core(TM) i7-8665U CPU
- 15GB RAM
- SAMSUNG MZVLB2T0HALB-000L7

[wrk details](/WRK)

## Summary

Language/runtime | GET (req/sec) | POST (req/sec)
--- | --- | --- |
Rust | 1510.35 | 20030.25 |
Node js | 105.68 | 1653.49 |
Node js PM2 6thread | 258.72 | 2492.65 |
Go gin | 1200.50 | 24617.32 |
Quarkus native | 732.39 | 4485.90 |
Quarkus native reactive | 232.40 | 4658.91 |