# WRK details

## rust
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    20.68ms    2.95ms  47.37ms   81.21%
    Req/Sec     1.46k   156.31     1.94k    75.89%
  130592 requests in 30.03s, 15.34GB read
Requests/sec:   4348.74
Transfer/sec:    523.03MB
```

## go1.22.0
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    29.44ms   16.54ms 147.38ms   63.75%
    Req/Sec     1.04k    91.79     1.40k    72.22%
  93503 requests in 30.09s, 10.98GB read
Requests/sec:   3107.51
Transfer/sec:    373.84MB
```

## node v20.11.0 (express)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   255.96ms  100.22ms   1.96s    94.72%
    Req/Sec   117.53     23.02   180.00     70.11%
  10544 requests in 30.03s, 1.24GB read
  Socket errors: connect 0, read 0, write 0, timeout 20
Requests/sec:    351.17
Transfer/sec:     42.24MB
```

## node v20.11.0 (express) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    72.54ms   19.27ms 376.08ms   72.91%
    Req/Sec   416.26     40.95   510.00     76.33%
  37329 requests in 30.03s, 4.38GB read
Requests/sec:   1242.87
Transfer/sec:    149.50MB
```

## node v20.11.0 (fastify)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   211.76ms  104.54ms   1.99s    97.48%
    Req/Sec   144.05     30.41   222.00     70.19%
  12914 requests in 30.02s, 1.52GB read
  Socket errors: connect 0, read 0, write 0, timeout 20
Requests/sec:    430.18
Transfer/sec:     51.76MB
```

## node v20.11.0 (fastify) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    59.73ms   15.77ms 386.98ms   71.38%
    Req/Sec   505.20     43.50   606.00     76.56%
  45288 requests in 30.03s, 5.32GB read
Requests/sec:   1508.19
Transfer/sec:    181.48MB
```

## node v20.11.0 (restana)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   202.01ms   96.66ms   1.98s    96.33%
    Req/Sec   150.98     33.98   232.00     70.00%
  13548 requests in 30.02s, 1.59GB read
  Socket errors: connect 0, read 0, write 0, timeout 19
Requests/sec:    451.23
Transfer/sec:     54.30MB
```

## node v20.11.0 (restana) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    73.17ms   17.73ms 345.86ms   71.79%
    Req/Sec   412.14     42.86   510.00     74.11%
  36973 requests in 30.05s, 4.34GB read
Requests/sec:   1230.27
Transfer/sec:    148.04MB
```

## kotlin - java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    44.21ms   76.03ms 978.41ms   96.81%
    Req/Sec     0.92k   191.77     1.23k    81.26%
  81006 requests in 30.09s, 9.52GB read
Requests/sec:   2691.75
Transfer/sec:    324.09MB
```

## kotlin - native image java -21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   236.72ms  166.29ms   1.57s    69.16%
    Req/Sec   136.22     71.06   363.00     68.19%
  12046 requests in 30.10s, 1.42GB read
Requests/sec:    400.24
Transfer/sec:     48.20MB
```

## spring VirtualThread java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    37.88ms   48.62ms 726.16ms   95.93%
    Req/Sec     0.96k   169.10     1.24k    82.86%
  85162 requests in 30.10s, 10.01GB read
Requests/sec:   2829.73
Transfer/sec:    340.73MB
```

## spring VirtualThread native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    37.09ms   47.75ms 772.11ms   96.10%
    Req/Sec     0.98k   165.76     1.25k    82.03%
  86601 requests in 30.09s, 10.18GB read
Requests/sec:   2877.79
Transfer/sec:    346.50MB
```

## spring java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    39.89ms   49.04ms 662.18ms   95.43%
    Req/Sec     0.91k   172.61     1.20k    81.09%
  80420 requests in 30.09s, 9.46GB read
Requests/sec:   2672.65
Transfer/sec:    321.79MB
```

## spring native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    39.16ms   51.59ms 800.82ms   96.27%
    Req/Sec     0.93k   164.46     1.31k    78.54%
  82477 requests in 30.06s, 9.70GB read
Requests/sec:   2743.68
Transfer/sec:    330.34MB
```

## quarkus java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    21.38ms   33.73ms 591.99ms   97.10%
    Req/Sec     1.72k   279.23     2.27k    79.55%
  152581 requests in 30.07s, 17.94GB read
Requests/sec:   5073.35
Transfer/sec:    610.73MB
```

## quarkus native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    81.19ms   63.93ms 527.94ms   53.68%
    Req/Sec   397.02     97.21   710.00     70.89%
  35660 requests in 30.08s, 4.19GB read
Requests/sec:   1185.41
Transfer/sec:    142.72MB
```

## quarkus-reactive java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   119.27ms   58.68ms 734.27ms   96.47%
    Req/Sec   269.00     48.05   323.00     89.38%
  23589 requests in 30.04s, 2.77GB read
Requests/sec:    785.33
Transfer/sec:     94.54MB
```

## quarkus-reactive native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   247.66ms   22.94ms 364.31ms   71.35%
    Req/Sec   121.21     64.38   290.00     65.61%
  10871 requests in 30.03s, 1.28GB read
Requests/sec:    361.99
Transfer/sec:     43.58MB
```

## webflux java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   182.20ms  132.08ms   1.32s    93.95%
    Req/Sec   185.92     49.69   303.00     73.87%
  16156 requests in 30.09s, 2.14GB read
Requests/sec:    536.95
Transfer/sec:     72.93MB
```

## webflux native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   178.21ms  121.80ms   1.39s    94.17%
    Req/Sec   187.14     48.33   287.00     73.07%
  16331 requests in 30.03s, 2.17GB read
Requests/sec:    543.89
Transfer/sec:     73.88MB
```

