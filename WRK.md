# WRK details

## rust
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    17.15ms    1.28ms  34.00ms   75.75%
    Req/Sec     1.76k    85.37     2.01k    72.89%
  157426 requests in 30.02s, 18.49GB read
Requests/sec:   5243.23
Transfer/sec:    630.61MB
```

## go1.24.4
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    30.44ms   16.81ms 150.50ms   65.33%
    Req/Sec     1.01k    76.85     1.28k    70.11%
  90464 requests in 30.06s, 10.63GB read
Requests/sec:   3009.18
Transfer/sec:    362.01MB
```

## node v22.14.0 (express)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   279.95ms  102.27ms   1.94s    94.71%
    Req/Sec   106.49     25.35   171.00     65.56%
  9558 requests in 30.02s, 1.12GB read
  Socket errors: connect 0, read 0, write 0, timeout 24
Requests/sec:    318.36
Transfer/sec:     38.29MB
```

## node v22.14.0 (express) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    80.27ms   18.29ms 287.97ms   70.14%
    Req/Sec   375.42     38.36   480.00     74.67%
  33691 requests in 30.05s, 3.96GB read
Requests/sec:   1121.05
Transfer/sec:    134.85MB
```

## node v22.14.0 (fastify)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   270.45ms  101.47ms   1.98s    95.15%
    Req/Sec   110.59     21.96   171.00     75.33%
  9926 requests in 30.02s, 1.17GB read
  Socket errors: connect 0, read 0, write 0, timeout 23
Requests/sec:    330.62
Transfer/sec:     39.78MB
```

## node v22.14.0 (fastify) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    76.61ms   17.89ms 330.85ms   71.33%
    Req/Sec   393.40     38.81   490.00     73.33%
  35301 requests in 30.05s, 4.15GB read
Requests/sec:   1174.70
Transfer/sec:    141.35MB
```

## node v22.14.0 (restana)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   262.56ms   93.09ms   1.96s    93.84%
    Req/Sec   112.72     30.89   212.00     65.44%
  10117 requests in 30.03s, 1.19GB read
  Socket errors: connect 0, read 0, write 0, timeout 29
Requests/sec:    336.94
Transfer/sec:     40.54MB
```

## node v22.14.0 (restana) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    75.31ms   16.92ms 352.27ms   74.12%
    Req/Sec   400.25     38.71   490.00     74.67%
  35911 requests in 30.05s, 4.22GB read
Requests/sec:   1195.15
Transfer/sec:    143.81MB
```

## kotlin - java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    38.95ms   59.26ms 804.05ms   97.24%
    Req/Sec     0.97k   166.00     1.55k    81.83%
  85443 requests in 30.05s, 10.05GB read
Requests/sec:   2843.19
Transfer/sec:    342.33MB
```

## kotlin - native image java -21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   226.48ms  179.42ms   1.35s    62.57%
    Req/Sec   151.39     93.29   454.00     68.09%
  13099 requests in 30.08s, 1.54GB read
Requests/sec:    435.47
Transfer/sec:     52.44MB
```

## spring VirtualThread java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    35.84ms   55.11ms 805.28ms   96.94%
    Req/Sec     1.06k   199.76     1.34k    82.88%
  93562 requests in 30.07s, 11.00GB read
Requests/sec:   3111.91
Transfer/sec:    374.71MB
```

## spring VirtualThread native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   171.52ms  134.26ms   1.17s    64.28%
    Req/Sec   195.02    114.79   630.00     66.90%
  17169 requests in 30.08s, 2.02GB read
Requests/sec:    570.80
Transfer/sec:     68.75MB
```

## spring java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    35.31ms   50.84ms 743.07ms   96.96%
    Req/Sec     1.05k   195.09     1.52k    82.80%
  92989 requests in 30.09s, 10.93GB read
Requests/sec:   3089.95
Transfer/sec:    372.03MB
```

## spring native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   170.65ms  133.72ms   1.05s    63.65%
    Req/Sec   195.72    117.39   656.00     68.01%
  17286 requests in 30.08s, 2.03GB read
Requests/sec:    574.58
Transfer/sec:     69.19MB
```

## quarkus java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    17.80ms   22.33ms 383.64ms   96.68%
    Req/Sec     1.90k   308.54     2.58k    81.31%
  169487 requests in 30.06s, 19.92GB read
Requests/sec:   5637.49
Transfer/sec:    678.65MB
```

## quarkus native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   108.94ms  173.97ms   1.66s    96.08%
    Req/Sec   395.71    106.10   696.00     67.44%
  35604 requests in 31.39s, 4.19GB read
Requests/sec:   1134.20
Transfer/sec:    136.59MB
```

## quarkus-reactive java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   111.15ms   72.59ms 837.67ms   95.78%
    Req/Sec   300.90     51.47   383.00     90.80%
  26174 requests in 30.03s, 3.08GB read
Requests/sec:    871.50
Transfer/sec:    104.91MB
```

## quarkus-reactive native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   257.73ms   15.02ms 304.13ms   69.71%
    Req/Sec   117.31     60.53   292.00     63.92%
  10436 requests in 30.03s, 1.23GB read
Requests/sec:    347.51
Transfer/sec:     41.83MB
```

## webflux java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   149.21ms  107.47ms   1.23s    94.46%
    Req/Sec   224.45     54.03   343.00     75.26%
  19624 requests in 30.06s, 2.60GB read
Requests/sec:    652.81
Transfer/sec:     88.61MB
```

## webflux native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   555.81ms  145.02ms   1.21s    68.75%
    Req/Sec    54.30     25.03   140.00     67.50%
  4829 requests in 30.08s, 658.22MB read
Requests/sec:    160.55
Transfer/sec:     21.88MB
```

