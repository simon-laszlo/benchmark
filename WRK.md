# WRK details

## rust
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    17.45ms    1.33ms  25.29ms   69.42%
    Req/Sec     1.73k    78.68     2.05k    81.22%
  154716 requests in 30.02s, 18.17GB read
Requests/sec:   5153.87
Transfer/sec:    619.86MB
```

## go1.22.1
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    27.12ms   15.15ms 121.54ms   63.26%
    Req/Sec     1.13k    92.60     1.44k    68.67%
  101364 requests in 30.08s, 11.91GB read
Requests/sec:   3370.03
Transfer/sec:    405.42MB
```

## node v20.11.0 (express)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   240.64ms  103.38ms   1.95s    94.52%
    Req/Sec   126.14     29.86   210.00     67.11%
  11319 requests in 30.02s, 1.33GB read
  Socket errors: connect 0, read 0, write 0, timeout 15
Requests/sec:    377.02
Transfer/sec:     45.35MB
```

## node v20.11.0 (express) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    66.04ms   17.16ms 315.70ms   71.33%
    Req/Sec   456.89     43.73   545.00     75.78%
  40959 requests in 30.03s, 4.81GB read
Requests/sec:   1364.03
Transfer/sec:    164.07MB
```

## node v20.11.0 (fastify)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   218.53ms  105.70ms   1.98s    96.60%
    Req/Sec   140.73     25.48   202.00     69.00%
  12626 requests in 30.02s, 1.48GB read
  Socket errors: connect 0, read 0, write 0, timeout 11
Requests/sec:    420.58
Transfer/sec:     50.61MB
```

## node v20.11.0 (fastify) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    66.75ms   17.27ms 359.50ms   71.48%
    Req/Sec   451.99     42.47   560.00     79.67%
  40529 requests in 30.03s, 4.76GB read
Requests/sec:   1349.51
Transfer/sec:    162.39MB
```

## node v20.11.0 (restana)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   214.29ms   98.27ms   1.97s    96.20%
    Req/Sec   141.20     46.65   252.00     61.29%
  12657 requests in 30.02s, 1.49GB read
  Socket errors: connect 0, read 0, write 0, timeout 23
Requests/sec:    421.58
Transfer/sec:     50.73MB
```

## node v20.11.0 (restana) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    67.89ms   16.58ms 336.41ms   72.57%
    Req/Sec   444.35     44.53   565.00     75.11%
  39837 requests in 30.02s, 4.68GB read
Requests/sec:   1326.90
Transfer/sec:    159.67MB
```

## kotlin - java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    47.56ms   64.04ms 884.30ms   96.36%
    Req/Sec   781.71    160.71     1.04k    80.11%
  68849 requests in 30.08s, 8.10GB read
Requests/sec:   2288.76
Transfer/sec:    275.58MB
```

## kotlin - native image java -21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   214.78ms  142.40ms   1.19s    68.99%
    Req/Sec   147.34     74.28   349.00     64.78%
  13080 requests in 30.08s, 1.54GB read
Requests/sec:    434.78
Transfer/sec:     52.35MB
```

## spring VirtualThread java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    40.11ms   42.98ms 621.10ms   95.22%
    Req/Sec     0.87k   160.92     1.74k    83.14%
  77138 requests in 30.09s, 9.07GB read
Requests/sec:   2563.52
Transfer/sec:    308.65MB
```

## spring VirtualThread native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    40.33ms   46.95ms 672.87ms   96.03%
    Req/Sec     0.88k   155.12     1.73k    82.90%
  77987 requests in 30.10s, 9.17GB read
Requests/sec:   2591.18
Transfer/sec:    311.99MB
```

## spring java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    39.82ms   41.75ms 583.76ms   95.84%
    Req/Sec     0.86k   149.82     1.21k    81.76%
  76542 requests in 30.06s, 9.00GB read
Requests/sec:   2546.44
Transfer/sec:    306.61MB
```

## spring native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    42.09ms   46.28ms 649.83ms   95.41%
    Req/Sec   835.80    162.51     1.08k    81.41%
  73927 requests in 30.10s, 8.69GB read
Requests/sec:   2455.66
Transfer/sec:    295.67MB
```

## quarkus java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    23.45ms   34.32ms 577.87ms   96.97%
    Req/Sec     1.53k   248.02     1.99k    80.84%
  136121 requests in 30.04s, 16.00GB read
Requests/sec:   4530.98
Transfer/sec:    545.45MB
```

## quarkus native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    90.58ms   71.22ms 456.69ms   53.44%
    Req/Sec   355.59     95.29   670.00     69.33%
  31932 requests in 30.06s, 3.75GB read
Requests/sec:   1062.12
Transfer/sec:    127.89MB
```

## quarkus-reactive java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   129.78ms   49.74ms 659.71ms   95.65%
    Req/Sec   243.26     45.09   320.00     79.22%
  21348 requests in 30.06s, 2.51GB read
Requests/sec:    710.10
Transfer/sec:     85.48MB
```

## quarkus-reactive native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   242.97ms   15.45ms 300.72ms   73.85%
    Req/Sec   123.10     38.56   292.00     76.51%
  11069 requests in 30.03s, 1.30GB read
Requests/sec:    368.62
Transfer/sec:     44.37MB
```

## webflux java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   165.07ms  100.43ms   1.09s    93.06%
    Req/Sec   198.10     48.84   290.00     74.26%
  17371 requests in 30.09s, 2.30GB read
Requests/sec:    577.34
Transfer/sec:     78.37MB
```

## webflux native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   176.12ms  119.40ms   1.36s    94.34%
    Req/Sec   189.85     46.78   292.00     73.96%
  16538 requests in 30.08s, 2.19GB read
Requests/sec:    549.86
Transfer/sec:     74.67MB
```

