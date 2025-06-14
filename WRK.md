# WRK details

## rust
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    16.69ms    1.79ms  36.84ms   88.99%
    Req/Sec     1.81k   112.36     2.07k    79.11%
  161802 requests in 30.03s, 19.00GB read
Requests/sec:   5388.59
Transfer/sec:    648.09MB
```

## go1.24.4
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    22.94ms   12.53ms 104.46ms   64.05%
    Req/Sec     1.33k    81.21     1.60k    71.44%
  119567 requests in 30.05s, 14.05GB read
Requests/sec:   3978.50
Transfer/sec:    478.62MB
```

## node v24.2.0 (express)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   235.76ms   97.83ms   1.95s    96.21%
    Req/Sec   128.28     23.59   191.00     72.11%
  11507 requests in 30.02s, 1.35GB read
  Socket errors: connect 0, read 0, write 0, timeout 19
Requests/sec:    383.32
Transfer/sec:     46.11MB
```

## node v24.2.0 (express) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    60.51ms   13.88ms 308.73ms   72.77%
    Req/Sec   498.68     39.89   585.00     80.67%
  44708 requests in 30.03s, 5.25GB read
Requests/sec:   1488.97
Transfer/sec:    179.10MB
```

## node v24.2.0 (fastify)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   237.58ms  106.70ms   2.00s    96.35%
    Req/Sec   128.38     26.08   212.00     70.04%
  11495 requests in 30.02s, 1.35GB read
  Socket errors: connect 0, read 0, write 0, timeout 16
Requests/sec:    382.90
Transfer/sec:     46.07MB
```

## node v24.2.0 (fastify) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    59.76ms   14.93ms 322.32ms   73.56%
    Req/Sec   505.12     41.69   600.00     83.22%
  45289 requests in 30.03s, 5.32GB read
Requests/sec:   1508.20
Transfer/sec:    181.48MB
```

## node v24.2.0 (restana)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   231.42ms   92.93ms   1.98s    95.42%
    Req/Sec   130.23     31.26   220.00     74.00%
  11689 requests in 30.03s, 1.37GB read
  Socket errors: connect 0, read 0, write 0, timeout 22
Requests/sec:    389.27
Transfer/sec:     46.84MB
```

## node v24.2.0 (restana) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    58.36ms   12.90ms 323.42ms   76.11%
    Req/Sec   517.06     41.19   600.00     80.67%
  46363 requests in 30.03s, 5.45GB read
Requests/sec:   1543.72
Transfer/sec:    185.76MB
```

## kotlin - java 24.0.1
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    30.38ms   37.70ms 579.69ms   97.80%
    Req/Sec     1.15k   155.17     1.35k    87.64%
  101588 requests in 30.02s, 11.94GB read
Requests/sec:   3383.46
Transfer/sec:    407.37MB
```

## kotlin - native image java -24.0.1
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
```

## spring VirtualThread java 24.0.1
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    30.54ms   41.34ms 634.53ms   97.83%
    Req/Sec     1.16k   166.90     1.37k    87.44%
  103120 requests in 30.08s, 12.12GB read
Requests/sec:   3428.30
Transfer/sec:    412.78MB
```

## spring VirtualThread native 24.0.1
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   154.67ms  138.66ms   1.28s    83.00%
    Req/Sec   234.40    158.87   747.00     68.91%
  19669 requests in 30.08s, 2.31GB read
Requests/sec:    653.81
Transfer/sec:     78.73MB
```

## spring java 24.0.1
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    30.71ms   41.56ms 656.44ms   97.65%
    Req/Sec     1.16k   190.98     1.42k    87.64%
  102816 requests in 30.05s, 12.09GB read
Requests/sec:   3421.95
Transfer/sec:    412.02MB
```

## spring native 24.0.1
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   153.32ms  136.39ms   1.16s    82.61%
    Req/Sec   233.24    153.93   762.00     69.30%
  19887 requests in 30.10s, 2.34GB read
Requests/sec:    660.80
Transfer/sec:     79.57MB
```

## quarkus java 24.0.1
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    17.22ms   25.45ms 466.95ms   98.06%
    Req/Sec     2.06k   287.65     2.39k    91.13%
  182932 requests in 30.08s, 21.51GB read
Requests/sec:   6081.10
Transfer/sec:    732.04MB
```

## quarkus native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    78.50ms   59.97ms 406.27ms   53.06%
    Req/Sec   406.67     99.59   717.00     69.89%
  36505 requests in 30.06s, 4.29GB read
Requests/sec:   1214.36
Transfer/sec:    146.20MB
```

## quarkus-reactive java 24.0.1
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   107.84ms   63.75ms 797.66ms   97.27%
    Req/Sec   303.33     37.60   390.00     88.70%
  26549 requests in 30.03s, 3.12GB read
Requests/sec:    884.19
Transfer/sec:    106.44MB
```

## quarkus-reactive native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   259.53ms   20.31ms 323.65ms   67.84%
    Req/Sec   115.47     54.05   292.00     66.07%
  10353 requests in 30.03s, 1.22GB read
Requests/sec:    344.77
Transfer/sec:     41.50MB
```

## webflux java 24.0.1
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
```

## webflux native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
```

