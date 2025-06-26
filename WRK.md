# WRK details

## rust warp
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    20.36ms    2.14ms  48.31ms   92.01%
    Req/Sec     1.48k   109.42     1.70k    90.44%
  132602 requests in 30.03s, 15.57GB read
Requests/sec:   4415.77
Transfer/sec:    531.09MB
```

## go1.24.4
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    28.30ms   15.34ms 128.37ms   64.90%
    Req/Sec     1.08k    69.19     1.30k    70.00%
  97024 requests in 30.06s, 11.40GB read
Requests/sec:   3227.34
Transfer/sec:    388.26MB
```

## node v24.2.0 (express)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   245.96ms  104.65ms   1.98s    96.27%
    Req/Sec   123.28     32.47   250.00     65.81%
  11042 requests in 30.03s, 1.30GB read
  Socket errors: connect 0, read 0, write 0, timeout 19
Requests/sec:    367.72
Transfer/sec:     44.23MB
```

## node v24.2.0 (express) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    71.11ms   19.45ms 395.71ms   70.88%
    Req/Sec   424.08     40.50   520.00     77.33%
  38035 requests in 30.05s, 4.47GB read
Requests/sec:   1265.91
Transfer/sec:    152.27MB
```

## node v24.2.0 (fastify)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   255.36ms  100.00ms   1.90s    95.89%
    Req/Sec   117.40     29.95   191.00     69.11%
  10536 requests in 30.03s, 1.24GB read
  Socket errors: connect 0, read 0, write 0, timeout 24
Requests/sec:    350.82
Transfer/sec:     42.21MB
```

## node v24.2.0 (fastify) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    69.90ms   16.76ms 379.69ms   74.27%
    Req/Sec   431.71     38.55   530.00     80.00%
  38720 requests in 30.04s, 4.55GB read
Requests/sec:   1288.93
Transfer/sec:    155.10MB
```

## node v24.2.0 (restana)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   233.69ms   94.75ms   1.98s    95.35%
    Req/Sec   128.39     36.28   240.00     68.33%
  11519 requests in 30.02s, 1.35GB read
  Socket errors: connect 0, read 0, write 0, timeout 25
Requests/sec:    383.68
Transfer/sec:     46.17MB
```

## node v24.2.0 (restana) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    70.01ms   15.29ms 298.95ms   74.89%
    Req/Sec   430.77     39.05   524.00     77.11%
  38644 requests in 30.04s, 4.54GB read
Requests/sec:   1286.25
Transfer/sec:    154.77MB
```

## kotlin - java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    40.67ms   62.46ms 823.44ms   97.44%
    Req/Sec     0.93k   171.76     1.60k    81.58%
  82052 requests in 30.10s, 9.65GB read
Requests/sec:   2725.83
Transfer/sec:    328.19MB
```

## kotlin - native image java -21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   268.75ms  217.72ms   1.81s    61.38%
    Req/Sec   124.20     73.25   464.00     68.63%
  10864 requests in 30.06s, 1.28GB read
  Socket errors: connect 0, read 0, write 0, timeout 2
Requests/sec:    361.44
Transfer/sec:     43.52MB
```

## spring VirtualThread java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    40.15ms   62.08ms 795.97ms   97.37%
    Req/Sec     0.95k   157.46     1.17k    85.22%
  83212 requests in 30.05s, 9.78GB read
Requests/sec:   2769.31
Transfer/sec:    333.43MB
```

## spring VirtualThread native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   174.85ms  153.20ms   1.29s    79.07%
    Req/Sec   206.31    143.46   676.00     66.62%
  17326 requests in 30.09s, 2.04GB read
Requests/sec:    575.88
Transfer/sec:     69.34MB
```

## spring java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    40.54ms   62.41ms 793.92ms   97.40%
    Req/Sec     0.94k   151.19     1.32k    83.87%
  82516 requests in 30.10s, 9.70GB read
Requests/sec:   2741.38
Transfer/sec:    330.07MB
```

## spring native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   178.11ms  157.45ms   1.22s    78.53%
    Req/Sec   203.51    130.72   620.00     67.80%
  17236 requests in 30.08s, 2.03GB read
Requests/sec:    572.95
Transfer/sec:     69.00MB
```

## quarkus java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    19.80ms   28.33ms 468.00ms   97.88%
    Req/Sec     1.78k   262.94     2.13k    86.60%
  158557 requests in 30.06s, 18.64GB read
Requests/sec:   5273.88
Transfer/sec:    634.87MB
```

## quarkus native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    87.14ms   64.80ms 410.89ms   52.34%
    Req/Sec   362.20     95.36   686.00     67.89%
  32511 requests in 30.05s, 3.82GB read
Requests/sec:   1081.82
Transfer/sec:    130.24MB
```

## quarkus-reactive java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   114.81ms   57.38ms 726.08ms   96.12%
    Req/Sec   280.07     43.36   333.00     92.35%
  24548 requests in 30.02s, 2.89GB read
Requests/sec:    817.61
Transfer/sec:     98.42MB
```

## quarkus-reactive native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   263.46ms   16.95ms 331.29ms   71.47%
    Req/Sec   114.36     73.90   292.00     57.74%
  10202 requests in 30.03s, 1.20GB read
Requests/sec:    339.77
Transfer/sec:     40.91MB
```

## webflux java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    90.77ms   74.86ms 908.14ms   95.81%
    Req/Sec   373.85     88.61   530.00     72.74%
  32805 requests in 30.06s, 3.86GB read
Requests/sec:   1091.38
Transfer/sec:    131.38MB
```

## webflux native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   375.76ms  114.80ms 900.33ms   68.75%
    Req/Sec    81.38     35.02   212.00     65.53%
  7168 requests in 30.08s, 865.64MB read
Requests/sec:    238.30
Transfer/sec:     28.78MB
```

