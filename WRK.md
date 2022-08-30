# WRK details

## RUST
### POST
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

### GET
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

## Node js
### POST
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

### GET
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

## Node js - pm2
### POST
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

### GET
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

## GO - Gin
### POST
PORT=3001 wrk -c60 -d30s -t2 -s customers.lua http://localhost:$PORT/customers

```
Running 30s test @ http://localhost:3002/customers
  2 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.57ms    1.99ms  51.84ms   89.63%
    Req/Sec    12.37k     1.08k   15.11k    73.50%
  739064 requests in 30.02s, 83.17MB read
Requests/sec:  24617.32
Transfer/sec:      2.77MB
```

### GET
wrk -c60 -d30s -t2 http://localhost:3002/customers

```
Running 30s test @ http://localhost:3002/customers
  2 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    55.91ms   46.62ms 526.46ms   80.52%
    Req/Sec   603.31     81.01   810.00     66.17%
  36099 requests in 30.07s, 4.24GB read
Requests/sec:   1200.50
Transfer/sec:    144.42MB
```

## quarkus native
### POST
PORT=8080 wrk -c60 -d30s -t2 -s customers.lua http://localhost:$PORT/customers

```
Running 30s test @ http://localhost:8080/customers
  2 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    13.36ms    1.43ms  29.31ms   89.51%
    Req/Sec     2.25k   139.61     2.58k    79.83%
  134728 requests in 30.03s, 10.28MB read
Requests/sec:   4485.90
Transfer/sec:    350.46KB
```

### GET
wrk -c60 -d30s -t2 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  2 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    85.63ms   57.94ms 443.23ms   65.19%
    Req/Sec   368.18     95.37   606.00     65.00%
  22022 requests in 30.07s, 2.59GB read
Requests/sec:    732.39
Transfer/sec:     88.19MB
```

## quarkus native reactive
### POST
PORT=8080 wrk -c60 -d30s -t2 -s customers.lua http://localhost:$PORT/customers

```
Running 30s test @ http://localhost:8080/customers
  2 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    12.85ms    1.37ms  28.86ms   90.91%
    Req/Sec     2.34k   146.09     2.68k    84.00%
  139869 requests in 30.02s, 10.67MB read
Requests/sec:   4658.91
Transfer/sec:    363.98KB
```

### GET
wrk -c60 -d30s -t2 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  2 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   256.80ms   23.76ms 327.30ms   68.40%
    Req/Sec   116.25     63.45   280.00     60.17%
  6980 requests in 30.03s, 840.24MB read
Requests/sec:    232.40
Transfer/sec:     27.98MB
```

## graalvm spring webflux
### POST
PORT=8080 wrk -c60 -d30s -t2 -s customers.lua http://localhost:$PORT/customers

```
Running 30s test @ http://localhost:8080/customers
  2 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    10.43ms    7.06ms 174.54ms   93.95%
    Req/Sec     3.02k   660.56     4.38k    68.39%
  180002 requests in 30.01s, 13.73MB read
Requests/sec:   5997.62
Transfer/sec:    468.56KB
```

### GET
wrk -c60 -d30s -t2 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  2 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   563.90ms  120.13ms   1.23s    72.16%
    Req/Sec    53.47     25.44   140.00     68.88%
  3166 requests in 30.05s, 432.36MB read
Requests/sec:    105.37
Transfer/sec:     14.39MB
```

## graalvm native spring webflux
### POST
PORT=8080 wrk -c60 -d30s -t2 -s customers.lua http://localhost:$PORT/customers

```
Running 30s test @ http://localhost:8080/customers
  2 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     7.06ms    6.48ms 147.90ms   93.73%
    Req/Sec     4.66k     1.71k    6.91k    56.69%
  277685 requests in 30.02s, 21.19MB read
Requests/sec:   9251.40
Transfer/sec:    722.77KB
```

### GET
wrk -c60 -d30s -t2 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  2 threads and 60 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   555.10ms  142.20ms   1.21s    70.13%
    Req/Sec    54.27     27.11   250.00     76.32%
  3219 requests in 30.06s, 439.39MB read
Requests/sec:    107.07
Transfer/sec:     14.61MB
```