# WRK details

## rust
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    16.34ms    1.55ms  34.82ms   88.64%
    Req/Sec     1.84k   122.59     2.07k    90.22%
  165207 requests in 30.03s, 19.40GB read
Requests/sec:   5501.77
Transfer/sec:    661.70MB
```

## go1.24.4
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    22.94ms   12.88ms 117.23ms   63.79%
    Req/Sec     1.34k    79.71     1.58k    72.44%
  119962 requests in 30.05s, 14.09GB read
Requests/sec:   3991.80
Transfer/sec:    480.22MB
```

## node v24.2.0 (express)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   238.53ms  104.41ms   1.98s    96.13%
    Req/Sec   127.40     22.03   190.00     65.22%
  11427 requests in 30.02s, 1.34GB read
  Socket errors: connect 0, read 0, write 0, timeout 17
Requests/sec:    380.62
Transfer/sec:     45.78MB
```

## node v24.2.0 (express) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    57.20ms   13.33ms 339.54ms   73.38%
    Req/Sec   527.84     43.38   606.00     82.00%
  47311 requests in 30.02s, 5.56GB read
Requests/sec:   1575.77
Transfer/sec:    189.54MB
```

## node v24.2.0 (fastify)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   235.12ms   99.64ms   1.87s    96.29%
    Req/Sec   129.08     29.30   252.00     72.94%
  11558 requests in 30.02s, 1.36GB read
  Socket errors: connect 0, read 0, write 0, timeout 19
Requests/sec:    384.95
Transfer/sec:     46.32MB
```

## node v24.2.0 (fastify) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    59.99ms   14.62ms 322.52ms   72.85%
    Req/Sec   503.02     42.25   595.00     82.22%
  45097 requests in 30.03s, 5.30GB read
Requests/sec:   1501.71
Transfer/sec:    180.70MB
```

## node v24.2.0 (restana)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   232.83ms   94.96ms   1.96s    95.48%
    Req/Sec   129.35     28.52   212.00     65.00%
  11607 requests in 30.02s, 1.36GB read
  Socket errors: connect 0, read 0, write 0, timeout 22
Requests/sec:    386.61
Transfer/sec:     46.52MB
```

## node v24.2.0 (restana) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    59.85ms   13.42ms 307.27ms   75.18%
    Req/Sec   504.00     40.63   595.00     79.89%
  45203 requests in 30.04s, 5.31GB read
Requests/sec:   1504.86
Transfer/sec:    181.08MB
```

## kotlin - java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    33.66ms   57.60ms 778.41ms   97.85%
    Req/Sec     1.15k   170.99     1.36k    84.13%
  100870 requests in 30.05s, 11.86GB read
Requests/sec:   3357.27
Transfer/sec:    404.23MB
```

## kotlin - native image java -21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   232.05ms  184.75ms   1.56s    57.90%
    Req/Sec   144.77     86.79   480.00     74.03%
  12524 requests in 30.07s, 1.47GB read
Requests/sec:    416.51
Transfer/sec:     50.17MB
```

## spring VirtualThread java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    32.85ms   55.61ms 692.26ms   97.72%
    Req/Sec     1.17k   184.07     1.48k    86.76%
  103373 requests in 30.07s, 12.15GB read
Requests/sec:   3438.06
Transfer/sec:    413.94MB
```

## spring VirtualThread native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   178.30ms  151.55ms   1.45s    68.34%
    Req/Sec   193.12    111.79   595.00     65.95%
  16910 requests in 30.08s, 1.99GB read
Requests/sec:    562.24
Transfer/sec:     67.70MB
```

## spring java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    31.52ms   46.44ms 656.57ms   97.76%
    Req/Sec     1.16k   180.95     2.00k    87.27%
  102682 requests in 30.09s, 12.07GB read
Requests/sec:   3412.06
Transfer/sec:    410.82MB
```

## spring native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   151.65ms  135.31ms   1.21s    83.50%
    Req/Sec   232.50    150.63   686.00     69.68%
  20092 requests in 30.08s, 2.36GB read
Requests/sec:    667.99
Transfer/sec:     80.45MB
```

## quarkus java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    16.64ms   25.49ms 447.98ms   98.28%
    Req/Sec     2.14k   287.79     2.48k    88.66%
  190111 requests in 30.07s, 22.35GB read
Requests/sec:   6322.69
Transfer/sec:    761.12MB
```

## quarkus native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    76.35ms   58.83ms 364.23ms   54.99%
    Req/Sec   422.81    105.73   828.00     69.78%
  37950 requests in 30.06s, 4.46GB read
Requests/sec:   1262.65
Transfer/sec:    152.02MB
```

## quarkus-reactive java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   100.06ms   47.67ms 638.14ms   96.70%
    Req/Sec   320.87     39.47   393.00     88.85%
  28063 requests in 30.02s, 3.30GB read
Requests/sec:    934.77
Transfer/sec:    112.53MB
```

## quarkus-reactive native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   250.24ms   18.98ms 316.77ms   69.03%
    Req/Sec   119.93     59.15   292.00     63.26%
  10749 requests in 30.02s, 1.26GB read
Requests/sec:    358.02
Transfer/sec:     43.10MB
```

## webflux java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   136.61ms   99.75ms   1.20s    95.55%
    Req/Sec   245.78     51.48   343.00     79.08%
  21487 requests in 30.05s, 2.85GB read
Requests/sec:    715.06
Transfer/sec:     97.07MB
```

## webflux native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   582.19ms  138.36ms   1.13s    68.05%
    Req/Sec    51.71     24.46   131.00     69.00%
  4595 requests in 30.07s, 627.91MB read
Requests/sec:    152.83
Transfer/sec:     20.88MB
```

