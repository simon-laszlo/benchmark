# WRK details

## rust
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    16.39ms    1.09ms  36.12ms   76.22%
    Req/Sec     1.84k    65.46     2.10k    76.33%
  164659 requests in 30.02s, 19.34GB read
Requests/sec:   5485.65
Transfer/sec:    659.76MB
```

## go1.24.4
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    22.88ms   12.77ms 107.36ms   64.19%
    Req/Sec     1.34k    82.63     1.62k    72.89%
  120237 requests in 30.04s, 14.13GB read
Requests/sec:   4002.26
Transfer/sec:    481.48MB
```

## node v24.2.0 (express)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   214.79ms  100.95ms   1.96s    96.57%
    Req/Sec   142.43     21.62   200.00     72.67%
  12782 requests in 30.02s, 1.50GB read
  Socket errors: connect 0, read 0, write 0, timeout 14
Requests/sec:    425.76
Transfer/sec:     51.21MB
```

## node v24.2.0 (express) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    59.47ms   13.12ms 281.98ms   71.22%
    Req/Sec   507.01     40.45   610.00     80.44%
  45465 requests in 30.03s, 5.34GB read
Requests/sec:   1513.78
Transfer/sec:    182.08MB
```

## node v24.2.0 (fastify)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   248.25ms  227.15ms   1.95s    94.83%
    Req/Sec   146.99     29.46   222.00     74.72%
  13242 requests in 31.60s, 1.56GB read
  Socket errors: connect 0, read 0, write 0, timeout 12
Requests/sec:    419.01
Transfer/sec:     50.42MB
```

## node v24.2.0 (fastify) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    60.43ms   14.67ms 288.51ms   73.25%
    Req/Sec   499.35     44.24   600.00     78.56%
  44801 requests in 30.04s, 5.26GB read
Requests/sec:   1491.24
Transfer/sec:    179.44MB
```

## node v24.2.0 (restana)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   203.49ms   98.07ms   1.97s    96.43%
    Req/Sec   149.93     33.81   232.00     68.52%
  13438 requests in 30.02s, 1.58GB read
  Socket errors: connect 0, read 0, write 0, timeout 21
Requests/sec:    447.66
Transfer/sec:     53.87MB
```

## node v24.2.0 (restana) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    61.18ms   13.11ms 330.38ms   75.35%
    Req/Sec   493.00     40.51   595.00     80.00%
  44214 requests in 30.04s, 5.20GB read
Requests/sec:   1472.04
Transfer/sec:    177.13MB
```

## kotlin - java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    35.41ms   51.76ms 738.53ms   97.69%
    Req/Sec     1.04k   155.33     1.25k    84.19%
  91682 requests in 30.07s, 10.78GB read
Requests/sec:   3049.01
Transfer/sec:    367.10MB
```

## kotlin - native image java -21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   223.80ms  175.24ms   1.34s    59.13%
    Req/Sec   146.67     86.05   474.00     66.58%
  12990 requests in 30.07s, 1.53GB read
Requests/sec:    432.02
Transfer/sec:     52.03MB
```

## spring VirtualThread java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    32.55ms   42.02ms 661.52ms   97.44%
    Req/Sec     1.09k   182.18     1.34k    84.81%
  96474 requests in 30.09s, 11.34GB read
Requests/sec:   3206.60
Transfer/sec:    386.08MB
```

## spring VirtualThread native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   153.13ms  128.11ms   1.06s    70.84%
    Req/Sec   219.23    118.21   610.00     64.91%
  19585 requests in 30.09s, 2.30GB read
Requests/sec:    650.99
Transfer/sec:     78.38MB
```

## spring java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    32.91ms   52.41ms 695.20ms   97.74%
    Req/Sec     1.14k   184.63     1.40k    85.78%
  100886 requests in 30.03s, 11.86GB read
Requests/sec:   3359.96
Transfer/sec:    404.55MB
```

## spring native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   153.28ms  132.98ms   1.13s    76.86%
    Req/Sec   222.03    123.39   616.00     67.55%
  19896 requests in 30.08s, 2.34GB read
Requests/sec:    661.52
Transfer/sec:     79.66MB
```

## quarkus java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    16.28ms   22.14ms 398.78ms   97.93%
    Req/Sec     2.13k   275.24     2.52k    87.88%
  189824 requests in 30.08s, 22.32GB read
Requests/sec:   6311.33
Transfer/sec:    759.75MB
```

## quarkus native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    73.91ms   54.70ms 386.02ms   53.48%
    Req/Sec   427.39    109.95   800.00     67.11%
  38363 requests in 30.07s, 4.51GB read
Requests/sec:   1275.94
Transfer/sec:    153.61MB
```

## quarkus-reactive java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    98.00ms   19.88ms 328.80ms   95.67%
    Req/Sec   311.89     40.55   393.00     88.63%
  27693 requests in 30.03s, 3.26GB read
Requests/sec:    922.25
Transfer/sec:    111.02MB
```

## quarkus-reactive native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   232.18ms   13.90ms 287.98ms   68.78%
    Req/Sec   129.15     78.92   292.00     54.04%
  11602 requests in 30.02s, 1.36GB read
Requests/sec:    386.41
Transfer/sec:     46.52MB
```

## webflux java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    82.54ms   67.85ms 817.69ms   95.57%
    Req/Sec   410.01     93.71     0.97k    78.17%
  36006 requests in 30.10s, 4.23GB read
Requests/sec:   1196.25
Transfer/sec:    143.99MB
```

## webflux native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   325.41ms   94.55ms 790.27ms   70.91%
    Req/Sec    93.35     40.61   212.00     64.40%
  8275 requests in 30.07s, 0.98GB read
Requests/sec:    275.16
Transfer/sec:     33.24MB
```

