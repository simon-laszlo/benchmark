# REST-mongo benchmark

Simple REST server implementations to test the programming languages and runtimes in a "life" scenario. The projects have same architecture: model, db, handler, route.

Functions:
- GET -> return the customer list (1000 items) from the mongo DB
- POST -> store new customer in the mongo DB

Implementations:
- node js, express, mongo
- rust, warp, mongo
- java, spring, mongo
- kotlin, spring, mongo
- go, gin
- quarkus / reactive

The project have used the most recent libraries.

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

### GET http://localhost:8080/customers

Returns list of the customers in JSON format.

### POST http://localhost:8080/customers

Creates a new customer in the mongo db.

## Testing

### Docker

The most simple way to execute the tests:

```
docker build -t benchmark .
docker run --privileged -p 8080:8080 -d -v $(pwd):/opt/benchmark benchmark
```

### Localhost

#### Mongo db

If you don't have yet any mongo on your localhost, then the simplest way to start with docker. Check the [docker readme](docker/README.md).

#### Execute the tests

```
cd wrk
./exec.sh
```

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

You can find [here](TABLE_GET.md) the GET benchmark results.