# WRK details

## rust
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    20.73ms    1.24ms  29.94ms   72.50%
    Req/Sec     1.45k    49.31     1.76k    74.89%
  130253 requests in 30.03s, 15.30GB read
Requests/sec:   4338.02
Transfer/sec:    521.74MB
```

## go1.24.4
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    28.59ms   15.25ms 142.16ms   64.64%
    Req/Sec     1.07k    61.84     1.25k    70.33%
  95787 requests in 30.05s, 11.25GB read
Requests/sec:   3187.18
Transfer/sec:    383.42MB
```

## node v24.2.0 (express)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   245.42ms  100.25ms   1.91s    96.16%
    Req/Sec   123.00     22.24   191.00     72.00%
  11035 requests in 30.02s, 1.30GB read
  Socket errors: connect 0, read 0, write 0, timeout 20
Requests/sec:    367.57
Transfer/sec:     44.21MB
```

## node v24.2.0 (express) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    75.68ms   17.53ms 390.29ms   72.92%
    Req/Sec   398.55     37.41   494.00     78.67%
  35771 requests in 30.05s, 4.20GB read
Requests/sec:   1190.20
Transfer/sec:    143.16MB
```

## node v24.2.0 (fastify)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   245.98ms  101.74ms   1.91s    96.06%
    Req/Sec   122.77     23.43   181.00     71.08%
  11004 requests in 30.02s, 1.29GB read
  Socket errors: connect 0, read 0, write 0, timeout 21
Requests/sec:    366.56
Transfer/sec:     44.11MB
```

## node v24.2.0 (fastify) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    74.59ms   18.06ms 398.12ms   73.79%
    Req/Sec   404.55     39.75   500.00     79.11%
  36290 requests in 30.04s, 4.26GB read
Requests/sec:   1207.92
Transfer/sec:    145.35MB
```

## node v24.2.0 (restana)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   244.88ms   96.30ms   1.98s    95.00%
    Req/Sec   121.95     26.36   220.00     65.67%
  10943 requests in 30.02s, 1.29GB read
  Socket errors: connect 0, read 0, write 0, timeout 26
Requests/sec:    364.50
Transfer/sec:     43.86MB
```

## node v24.2.0 (restana) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    74.56ms   18.11ms 376.25ms   74.49%
    Req/Sec   404.64     40.21   510.00     76.11%
  36309 requests in 30.06s, 4.27GB read
Requests/sec:   1208.06
Transfer/sec:    145.37MB
```

## kotlin - java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    47.27ms   71.39ms 961.82ms   97.33%
    Req/Sec   806.57    131.65     1.07k    79.20%
  70714 requests in 30.05s, 8.31GB read
Requests/sec:   2353.41
Transfer/sec:    283.37MB
```

## kotlin - native image java -21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   289.89ms  226.36ms   1.61s    59.61%
    Req/Sec   115.71     75.50   414.00     70.04%
  9978 requests in 30.09s, 1.17GB read
Requests/sec:    331.65
Transfer/sec:     39.94MB
```

## spring VirtualThread java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    42.81ms   60.22ms 799.76ms   97.33%
    Req/Sec     0.86k   154.91     1.15k    82.29%
  76023 requests in 30.11s, 8.94GB read
Requests/sec:   2525.20
Transfer/sec:    304.05MB
```

## spring VirtualThread native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   200.39ms  166.90ms   1.44s    65.80%
    Req/Sec   172.74    106.24   575.00     69.21%
  14929 requests in 30.09s, 1.76GB read
Requests/sec:    496.13
Transfer/sec:     59.73MB
```

## spring java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    44.64ms   62.08ms 859.18ms   97.33%
    Req/Sec   826.59    138.67     1.36k    80.28%
  72726 requests in 30.08s, 8.55GB read
Requests/sec:   2418.00
Transfer/sec:    291.14MB
```

## spring native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   195.23ms  165.98ms   1.37s    68.50%
    Req/Sec   178.13    115.66   660.00     68.52%
  15490 requests in 30.08s, 1.82GB read
Requests/sec:    514.99
Transfer/sec:     62.01MB
```

## quarkus java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    23.86ms   32.23ms 556.81ms   97.17%
    Req/Sec     1.49k   253.84     1.86k    84.68%
  132017 requests in 30.05s, 15.52GB read
Requests/sec:   4392.56
Transfer/sec:    528.78MB
```

## quarkus native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    94.48ms   70.40ms 507.87ms   53.72%
    Req/Sec   333.98     89.85   626.00     68.56%
  29978 requests in 30.05s, 3.52GB read
Requests/sec:    997.60
Transfer/sec:    120.11MB
```

## quarkus-reactive java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   132.04ms   66.54ms 796.58ms   95.87%
    Req/Sec   246.41     42.22   303.00     84.73%
  21377 requests in 30.03s, 2.51GB read
Requests/sec:    711.81
Transfer/sec:     85.69MB
```

## quarkus-reactive native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   285.01ms   18.14ms 351.40ms   71.23%
    Req/Sec   106.52     67.82   292.00     65.02%
  9436 requests in 30.02s, 1.11GB read
Requests/sec:    314.30
Transfer/sec:     37.84MB
```

## webflux java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   124.32ms   97.49ms   1.06s    93.94%
    Req/Sec   274.59     78.95   430.00     72.58%
  23992 requests in 30.10s, 2.82GB read
Requests/sec:    797.12
Transfer/sec:     95.99MB
```

## webflux native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   459.35ms  145.04ms   1.14s    69.18%
    Req/Sec    67.37     33.39   240.00     66.06%
  5851 requests in 30.08s, 707.80MB read
Requests/sec:    194.53
Transfer/sec:     23.53MB
```

