# WRK details

## rust
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    19.60ms    2.49ms  40.42ms   72.22%
    Req/Sec     1.54k   158.94     2.04k    71.33%
  137791 requests in 30.03s, 16.18GB read
Requests/sec:   4587.72
Transfer/sec:    551.77MB
```

## go1.22.0
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    28.41ms   16.56ms 144.56ms   63.55%
    Req/Sec     1.08k   114.70     1.68k    70.30%
  97308 requests in 30.10s, 11.43GB read
Requests/sec:   3233.22
Transfer/sec:    388.96MB
```

## node v20.11.0 (express)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   293.21ms  105.86ms   1.95s    92.59%
    Req/Sec   101.23     21.85   171.00     79.06%
  9066 requests in 30.03s, 1.06GB read
  Socket errors: connect 0, read 0, write 0, timeout 28
Requests/sec:    301.93
Transfer/sec:     36.32MB
```

## node v20.11.0 (express) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    83.53ms   23.60ms 365.68ms   70.71%
    Req/Sec   360.75     40.19   470.00     70.67%
  32343 requests in 30.02s, 3.80GB read
Requests/sec:   1077.21
Transfer/sec:    129.57MB
```

## node v20.11.0 (fastify)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   231.28ms  101.83ms   1.93s    96.23%
    Req/Sec   131.46     20.04   190.00     68.19%
  11783 requests in 30.02s, 1.38GB read
  Socket errors: connect 0, read 0, write 0, timeout 16
Requests/sec:    392.54
Transfer/sec:     47.23MB
```

## node v20.11.0 (fastify) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    67.14ms   18.60ms 299.12ms   71.25%
    Req/Sec   449.27     55.11   570.00     69.89%
  40280 requests in 30.03s, 4.73GB read
Requests/sec:   1341.20
Transfer/sec:    161.39MB
```

## node v20.11.0 (restana)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   299.61ms  101.12ms   1.99s    90.22%
    Req/Sec    97.83     29.93   190.00     67.82%
  8764 requests in 30.02s, 1.03GB read
  Socket errors: connect 0, read 0, write 0, timeout 32
Requests/sec:    291.96
Transfer/sec:     35.13MB
```

## node v20.11.0 (restana) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    84.58ms   21.07ms 362.21ms   71.39%
    Req/Sec   356.28     39.92   470.00     69.22%
  31949 requests in 30.02s, 3.75GB read
Requests/sec:   1064.09
Transfer/sec:    128.04MB
```

## kotlin - java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    43.46ms   70.13ms 981.44ms   96.63%
    Req/Sec     0.91k   186.87     1.66k    75.14%
  80156 requests in 30.09s, 9.42GB read
Requests/sec:   2664.16
Transfer/sec:    320.76MB
```

## kotlin - native image java -21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   198.19ms  143.35ms   1.60s    65.05%
    Req/Sec   163.35     85.96   444.00     65.17%
  14440 requests in 30.09s, 1.70GB read
Requests/sec:    479.84
Transfer/sec:     57.79MB
```

## spring java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    41.32ms   56.07ms 889.10ms   96.57%
    Req/Sec     0.89k   175.48     1.50k    81.28%
  78609 requests in 30.08s, 9.24GB read
Requests/sec:   2613.69
Transfer/sec:    314.70MB
```

## spring native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    41.09ms   48.82ms 629.62ms   95.80%
    Req/Sec     0.87k   180.48     1.16k    76.94%
  77024 requests in 30.08s, 9.06GB read
Requests/sec:   2560.94
Transfer/sec:    308.35MB
```

## quarkus java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    21.83ms   26.30ms 453.02ms   96.23%
    Req/Sec     1.57k   283.85     2.52k    72.59%
  139978 requests in 30.09s, 16.46GB read
Requests/sec:   4652.42
Transfer/sec:    560.07MB
```

## quarkus native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    79.12ms   63.65ms 458.44ms   55.01%
    Req/Sec   409.87    106.50   760.00     68.00%
  36801 requests in 30.07s, 4.33GB read
Requests/sec:   1223.96
Transfer/sec:    147.36MB
```

## quarkus-reactive java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   119.28ms   46.45ms 618.87ms   95.67%
    Req/Sec   263.88     49.68   360.00     83.47%
  23218 requests in 30.04s, 2.73GB read
Requests/sec:    773.00
Transfer/sec:     93.05MB
```

## quarkus-reactive native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   236.53ms   14.27ms 310.93ms   69.76%
    Req/Sec   127.11     61.13   292.00     64.46%
  11375 requests in 30.03s, 1.34GB read
Requests/sec:    378.81
Transfer/sec:     45.60MB
```

## webflux java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   982.04ms  149.84ms   1.73s    92.56%
    Req/Sec    57.87     53.04   247.00     70.05%
  2522 requests in 30.03s, 350.41MB read
  Socket errors: connect 0, read 0, write 0, timeout 90
Requests/sec:     83.99
Transfer/sec:     11.67MB
```

## webflux native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   996.45ms  136.39ms   1.69s    92.67%
    Req/Sec    61.42     57.98   270.00     74.43%
  2520 requests in 30.02s, 346.60MB read
  Socket errors: connect 0, read 0, write 0, timeout 90
Requests/sec:     83.94
Transfer/sec:     11.54MB
```

