# REST-mongo benchmark
Simple REST server implementations to test the programming languages and runtimes in a "life" scenario. The projects have same architecture, and they receives an HTTP request, and according to the request they do a CRUD operation in the mongo db.

Implementations:
- node js, express, mongo
- rust, warp, mongo
- java, spring, mongo
- kotlin, spring, mongo
- go

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
If you don't have yet any mongo on your localhost, then the simplest way to start with docker. Check the docker folder of the project.


#### Drop DB
```
docker exec benchmark-mongo
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

### RUST
#### POST
PORT=3000 wrk -c60 -d30s -t2 -s customers.lua http://localhost:$PORT/customers
```
Running 30s test @ http://localhost:3000/customers
  2 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.99ms  340.62us  17.96ms   75.53%
    Req/Sec    10.07k   564.06    11.98k    71.33%
  600953 requests in 30.00s, 45.85MB read
Requests/sec:  20030.25
Transfer/sec:      1.53MB
```

#### GET
wrk -c60 -d30s -t2 http://localhost:3000/customers

```
Running 30s test @ http://localhost:3000/customers
  2 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    39.65ms    4.50ms  65.89ms   74.60%
    Req/Sec   759.03     58.70     0.89k    68.17%
  45396 requests in 30.06s, 5.33GB read
  Socket errors: connect 0, read 60, write 0, timeout 0
Requests/sec:   1510.35
Transfer/sec:    181.65MB
```

### Node js
#### POST
PORT=3001 wrk -c60 -d30s -t2 -s customers.lua http://localhost:$PORT/customers

```
Running 30s test @ http://localhost:3001/customers
  2 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    27.13ms    4.44ms  80.87ms   83.84%
    Req/Sec   830.85    120.85     0.96k    80.83%
  49616 requests in 30.01s, 3.79MB read
  Socket errors: connect 0, read 49616, write 0, timeout 0
Requests/sec:   1653.49
Transfer/sec:    129.18KB
```

#### GET
wrk -c60 -d30s -t2 http://localhost:3001/customers

```
Running 30s test @ http://localhost:3001/customers
  2 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   422.74ms   70.16ms 850.03ms   72.46%
    Req/Sec    60.71     40.26   161.00     53.30%
  3173 requests in 30.02s, 381.55MB read
  Socket errors: connect 0, read 3171, write 0, timeout 0
Requests/sec:    105.68
Transfer/sec:     12.71MB
```

#### Node js - pm2
#### POST
PORT=3001 wrk -c60 -d30s -t2 -s customers.lua http://localhost:$PORT/customers

```
Running 30s test @ http://localhost:3001/customers
  2 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    20.95ms    5.09ms  87.15ms   83.68%
    Req/Sec     1.25k   187.89     1.50k    77.17%
  74838 requests in 30.02s, 5.71MB read
  Socket errors: connect 0, read 74831, write 0, timeout 0
Requests/sec:   2492.65
Transfer/sec:    194.74KB
```

#### GET
wrk -c60 -d30s -t2 http://localhost:3001/customers

```
Running 30s test @ http://localhost:3001/customers
  2 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   201.05ms   31.86ms 383.12ms   70.08%
    Req/Sec   129.95     25.11   191.00     69.01%
  7773 requests in 30.04s, 0.91GB read
  Socket errors: connect 0, read 7764, write 0, timeout 0
Requests/sec:    258.72
Transfer/sec:     31.11MB
```