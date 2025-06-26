# WRK details

## rust warp
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    16.81ms    0.92ms  23.00ms   71.04%
    Req/Sec     1.79k    48.84     2.09k    74.56%
  160603 requests in 30.02s, 18.86GB read
Requests/sec:   5350.02
Transfer/sec:    643.45MB
```

## go1.24.4
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    23.92ms   13.57ms 149.64ms   63.87%
    Req/Sec     1.28k    76.89     1.60k    74.00%
  115241 requests in 30.05s, 13.54GB read
Requests/sec:   3835.32
Transfer/sec:    461.40MB
```

## node v24.2.0 (express)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   225.18ms  104.90ms   1.95s    96.59%
    Req/Sec   135.98     28.98   260.00     74.64%
  12187 requests in 30.02s, 1.43GB read
  Socket errors: connect 0, read 0, write 0, timeout 14
Requests/sec:    405.92
Transfer/sec:     48.83MB
```

## node v24.2.0 (express) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    62.01ms   14.09ms 284.78ms   72.51%
    Req/Sec   486.49     40.55   575.00     79.78%
  43622 requests in 30.03s, 5.12GB read
Requests/sec:   1452.67
Transfer/sec:    174.73MB
```

## node v24.2.0 (fastify)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   222.15ms  106.17ms   1.98s    96.69%
    Req/Sec   138.19     28.90   222.00     72.19%
  12387 requests in 30.02s, 1.46GB read
  Socket errors: connect 0, read 0, write 0, timeout 13
Requests/sec:    412.58
Transfer/sec:     49.65MB
```

## node v24.2.0 (fastify) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    62.65ms   14.34ms 283.40ms   72.41%
    Req/Sec   481.47     39.51   575.00     77.33%
  43170 requests in 30.03s, 5.07GB read
Requests/sec:   1437.52
Transfer/sec:    172.98MB
```

## node v24.2.0 (restana)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   214.30ms   96.10ms   1.99s    96.13%
    Req/Sec   142.15     32.00   282.00     71.05%
  12727 requests in 30.02s, 1.50GB read
  Socket errors: connect 0, read 0, write 0, timeout 20
Requests/sec:    423.98
Transfer/sec:     51.02MB
```

## node v24.2.0 (restana) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    63.00ms   13.70ms 343.34ms   75.00%
    Req/Sec   478.80     39.85   560.00     79.00%
  42934 requests in 30.03s, 5.05GB read
Requests/sec:   1429.47
Transfer/sec:    172.01MB
```

## kotlin - java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    35.94ms   57.57ms 762.08ms   97.67%
    Req/Sec     1.06k   159.99     1.45k    83.68%
  93135 requests in 30.10s, 10.95GB read
Requests/sec:   3094.39
Transfer/sec:    372.57MB
```

## kotlin - native image java -21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   241.83ms  183.49ms   1.40s    58.75%
    Req/Sec   134.22     74.81   424.00     69.28%
  11855 requests in 30.06s, 1.39GB read
Requests/sec:    394.38
Transfer/sec:     47.50MB
```

## spring VirtualThread java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    34.80ms   45.56ms 644.91ms   97.48%
    Req/Sec     1.03k   169.90     1.99k    84.19%
  90918 requests in 30.11s, 10.69GB read
Requests/sec:   3019.95
Transfer/sec:    363.60MB
```

## spring VirtualThread native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   147.37ms  128.57ms   1.35s    80.04%
    Req/Sec   233.36    140.42   717.00     67.48%
  20703 requests in 30.07s, 2.43GB read
Requests/sec:    688.38
Transfer/sec:     82.89MB
```

## spring java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    32.39ms   46.02ms 653.25ms   97.78%
    Req/Sec     1.12k   170.69     1.35k    84.53%
  98768 requests in 30.01s, 11.61GB read
Requests/sec:   3291.30
Transfer/sec:    396.27MB
```

## spring native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   148.52ms  130.45ms   1.06s    81.02%
    Req/Sec   234.64    137.18   670.00     68.01%
  20446 requests in 30.08s, 2.40GB read
Requests/sec:    679.66
Transfer/sec:     81.84MB
```

## quarkus java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    17.45ms   30.67ms 486.99ms   98.40%
    Req/Sec     2.13k   280.95     2.43k    86.94%
  188657 requests in 30.08s, 22.18GB read
Requests/sec:   6272.20
Transfer/sec:    755.05MB
```

## quarkus native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    62.45ms   47.20ms 339.69ms   53.39%
    Req/Sec   512.42    128.05     0.97k    66.56%
  46000 requests in 30.05s, 5.41GB read
Requests/sec:   1530.93
Transfer/sec:    184.29MB
```

## quarkus-reactive java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   101.58ms   46.16ms 628.62ms   96.84%
    Req/Sec   313.98     39.83   390.00     90.41%
  27543 requests in 30.02s, 3.24GB read
Requests/sec:    917.44
Transfer/sec:    110.44MB
```

## quarkus-reactive native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   237.27ms   14.00ms 285.50ms   68.11%
    Req/Sec   126.24     62.95   292.00     59.77%
  11333 requests in 30.03s, 1.33GB read
Requests/sec:    377.45
Transfer/sec:     45.44MB
```

## webflux java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    76.52ms   60.37ms 768.21ms   95.86%
    Req/Sec   438.84     99.32   600.00     76.62%
  38612 requests in 30.08s, 4.54GB read
Requests/sec:   1283.72
Transfer/sec:    154.52MB
```

## webflux native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   344.89ms  104.20ms 863.89ms   68.88%
    Req/Sec    87.92     37.38   219.00     65.45%
  7805 requests in 30.06s, 0.92GB read
Requests/sec:    259.63
Transfer/sec:     31.36MB
```

