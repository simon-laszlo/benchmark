# WRK details

## rust warp
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    16.16ms    1.80ms  42.31ms   86.68%
    Req/Sec     1.86k   144.44     2.11k    83.67%
  167072 requests in 30.02s, 19.62GB read
Requests/sec:   5566.23
Transfer/sec:    669.45MB
```

## go1.24.4
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    22.11ms   12.64ms 122.11ms   63.49%
    Req/Sec     1.39k    85.54     1.66k    72.22%
  124738 requests in 30.05s, 14.65GB read
Requests/sec:   4151.08
Transfer/sec:    499.38MB
```

## node v24.2.0 (express)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   207.35ms  106.72ms   1.99s    97.06%
    Req/Sec   148.77     24.35   212.00     71.11%
  13349 requests in 30.02s, 1.57GB read
  Socket errors: connect 0, read 0, write 0, timeout 12
Requests/sec:    444.70
Transfer/sec:     53.49MB
```

## node v24.2.0 (express) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    56.95ms   12.95ms 312.32ms   72.09%
    Req/Sec   529.86     44.28   626.00     78.22%
  47509 requests in 30.04s, 5.58GB read
Requests/sec:   1581.75
Transfer/sec:    190.26MB
```

## node v24.2.0 (fastify)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   210.47ms  102.57ms   1.96s    96.91%
    Req/Sec   145.93     23.75   212.00     59.89%
  13093 requests in 30.02s, 1.54GB read
  Socket errors: connect 0, read 0, write 0, timeout 13
Requests/sec:    436.08
Transfer/sec:     52.47MB
```

## node v24.2.0 (fastify) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    58.18ms   13.49ms 291.31ms   73.05%
    Req/Sec   518.55     42.18   616.00     80.00%
  46494 requests in 30.03s, 5.46GB read
Requests/sec:   1548.08
Transfer/sec:    186.28MB
```

## node v24.2.0 (restana)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   207.13ms   96.93ms   1.98s    96.25%
    Req/Sec   147.62     31.80   230.00     63.89%
  13246 requests in 30.02s, 1.56GB read
  Socket errors: connect 0, read 0, write 0, timeout 17
Requests/sec:    441.21
Transfer/sec:     53.09MB
```

## node v24.2.0 (restana) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    59.05ms   12.93ms 306.89ms   76.22%
    Req/Sec   511.14     42.08   610.00     79.89%
  45830 requests in 30.04s, 5.39GB read
Requests/sec:   1525.75
Transfer/sec:    183.59MB
```

## kotlin - java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    32.44ms   48.95ms 678.20ms   97.81%
    Req/Sec     1.14k   179.19     2.25k    87.73%
  100382 requests in 30.08s, 11.80GB read
Requests/sec:   3336.81
Transfer/sec:    401.76MB
```

## kotlin - native image java -21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   226.51ms  173.77ms   1.49s    59.46%
    Req/Sec   144.24     79.64   460.00     71.35%
  12794 requests in 30.08s, 1.50GB read
Requests/sec:    425.28
Transfer/sec:     51.22MB
```

## spring VirtualThread java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    30.85ms   41.83ms 624.53ms   97.81%
    Req/Sec     1.16k   169.39     2.22k    88.66%
  102294 requests in 30.09s, 12.03GB read
Requests/sec:   3399.35
Transfer/sec:    409.28MB
```

## spring VirtualThread native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   138.06ms  118.99ms 852.17ms   80.15%
    Req/Sec   247.86    144.39   700.00     69.46%
  21777 requests in 30.09s, 2.56GB read
Requests/sec:    723.64
Transfer/sec:     87.14MB
```

## spring java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    30.26ms   39.42ms 694.62ms   97.73%
    Req/Sec     1.16k   175.90     1.42k    88.49%
  103086 requests in 30.10s, 12.12GB read
Requests/sec:   3425.20
Transfer/sec:    412.39MB
```

## spring native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   133.66ms  115.90ms   1.10s    80.61%
    Req/Sec   260.69    154.86   720.00     70.22%
  22554 requests in 30.07s, 2.65GB read
Requests/sec:    750.15
Transfer/sec:     90.33MB
```

## quarkus java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    16.93ms   36.30ms 539.41ms   98.46%
    Req/Sec     2.34k   296.81     2.74k    87.50%
  207112 requests in 30.05s, 24.35GB read
Requests/sec:   6891.98
Transfer/sec:    829.66MB
```

## quarkus native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    61.17ms   44.64ms 308.65ms   52.13%
    Req/Sec   513.85    116.34     0.89k    68.00%
  46102 requests in 30.05s, 5.42GB read
Requests/sec:   1534.19
Transfer/sec:    184.69MB
```

## quarkus-reactive java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    25.36ms   48.88ms 641.26ms   98.18%
    Req/Sec     1.55k   219.98     1.77k    87.23%
  136673 requests in 30.05s, 16.07GB read
Requests/sec:   4547.44
Transfer/sec:    547.42MB
```

## quarkus-reactive native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   113.92ms   29.35ms 236.41ms   64.08%
    Req/Sec   264.08     64.21   420.00     64.88%
  23670 requests in 30.04s, 2.78GB read
Requests/sec:    787.94
Transfer/sec:     94.86MB
```

## webflux java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    74.39ms   54.21ms 715.20ms   95.50%
    Req/Sec   446.04     93.06   595.00     81.21%
  39262 requests in 30.07s, 4.61GB read
Requests/sec:   1305.48
Transfer/sec:    157.13MB
```

## webflux native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   328.40ms   94.39ms 899.41ms   70.97%
    Req/Sec    91.86     37.23   212.00     65.99%
  8191 requests in 30.06s, 0.97GB read
Requests/sec:    272.53
Transfer/sec:     32.93MB
```

