# WRK details

## rust
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    18.56ms    1.97ms  37.91ms   67.13%
    Req/Sec     1.62k   141.37     1.96k    65.00%
  145467 requests in 30.02s, 17.09GB read
Requests/sec:   4845.52
Transfer/sec:    582.77MB
```

## go1.22.0
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    24.70ms   13.86ms 120.06ms   63.39%
    Req/Sec     1.24k    87.17     1.45k    72.33%
  111425 requests in 30.07s, 13.09GB read
Requests/sec:   3705.24
Transfer/sec:    445.75MB
```

## node v20.11.0 (express)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   209.09ms  103.55ms   1.99s    97.16%
    Req/Sec   147.11     24.49   210.00     72.22%
  13201 requests in 30.02s, 1.55GB read
  Socket errors: connect 0, read 0, write 0, timeout 12
Requests/sec:    439.67
Transfer/sec:     52.89MB
```

## node v20.11.0 (express) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    60.33ms   16.03ms 296.40ms   72.06%
    Req/Sec   500.48     48.42   626.00     77.11%
  44866 requests in 30.03s, 5.27GB read
Requests/sec:   1494.09
Transfer/sec:    179.72MB
```

## node v20.11.0 (fastify)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   201.84ms  105.21ms   1.97s    97.24%
    Req/Sec   153.34     26.61   232.00     67.22%
  13760 requests in 30.02s, 1.62GB read
  Socket errors: connect 0, read 0, write 0, timeout 9
Requests/sec:    458.35
Transfer/sec:     55.15MB
```

## node v20.11.0 (fastify) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    61.21ms   16.00ms 316.07ms   70.76%
    Req/Sec   492.68     46.71   616.00     73.56%
  44181 requests in 30.04s, 5.19GB read
Requests/sec:   1470.77
Transfer/sec:    176.98MB
```

## node v20.11.0 (restana)
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   210.21ms   98.73ms   1.96s    95.68%
    Req/Sec   144.58     31.57   232.00     66.85%
  12961 requests in 30.02s, 1.52GB read
  Socket errors: connect 0, read 0, write 0, timeout 20
Requests/sec:    431.72
Transfer/sec:     51.95MB
```

## node v20.11.0 (restana) PM2 6 threads
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    60.16ms   15.96ms 316.89ms   73.70%
    Req/Sec   502.04     47.78   616.00     72.56%
  45002 requests in 30.02s, 5.29GB read
Requests/sec:   1498.82
Transfer/sec:    180.35MB
```

## kotlin - java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    42.41ms   74.78ms 994.51ms   96.96%
    Req/Sec     0.97k   172.15     1.31k    83.81%
  84984 requests in 30.05s, 9.99GB read
Requests/sec:   2828.53
Transfer/sec:    340.57MB
```

## kotlin - native image java -21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   217.64ms  142.98ms   1.09s    71.44%
    Req/Sec   145.80     74.45   350.00     66.39%
  12954 requests in 30.09s, 1.52GB read
Requests/sec:    430.53
Transfer/sec:     51.85MB
```

## spring VirtualThread java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    38.73ms   58.64ms 825.60ms   96.74%
    Req/Sec     0.99k   177.04     1.31k    82.21%
  86989 requests in 30.06s, 10.23GB read
Requests/sec:   2894.16
Transfer/sec:    348.46MB
```

## spring VirtualThread native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    42.90ms   59.16ms 894.73ms   95.82%
    Req/Sec     0.88k   188.17     1.22k    74.63%
  77482 requests in 30.06s, 9.11GB read
Requests/sec:   2577.95
Transfer/sec:    310.39MB
```

## spring java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    43.38ms   51.86ms 716.54ms   94.56%
    Req/Sec   839.51    174.11     1.17k    79.73%
  74281 requests in 30.05s, 8.73GB read
Requests/sec:   2471.56
Transfer/sec:    297.59MB
```

## spring native 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    46.68ms   65.63ms 947.60ms   95.84%
    Req/Sec   815.15    166.45     1.36k    79.93%
  71991 requests in 30.10s, 8.46GB read
Requests/sec:   2391.68
Transfer/sec:    287.97MB
```

## quarkus java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    23.02ms   26.49ms 433.66ms   95.45%
    Req/Sec     1.50k   287.88     1.94k    79.21%
  133554 requests in 30.10s, 15.70GB read
Requests/sec:   4436.30
Transfer/sec:    534.05MB
```

## quarkus native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   101.81ms   82.53ms 749.67ms   55.37%
    Req/Sec   320.15     98.40   646.00     67.11%
  28768 requests in 30.09s, 3.38GB read
Requests/sec:    956.12
Transfer/sec:    115.11MB
```

## quarkus-reactive java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   136.36ms   55.51ms 702.14ms   95.90%
    Req/Sec   232.48     46.33   303.00     78.97%
  20405 requests in 30.04s, 2.40GB read
Requests/sec:    679.16
Transfer/sec:     81.76MB
```

## quarkus-reactive native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   283.14ms   17.52ms 373.81ms   75.30%
    Req/Sec   108.49     75.61   292.00     58.13%
  9502 requests in 30.03s, 1.12GB read
Requests/sec:    316.39
Transfer/sec:     38.09MB
```

## webflux java 21.0.2
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   193.20ms  138.23ms   1.60s    94.34%
    Req/Sec   175.41     45.44   277.00     73.29%
  15243 requests in 30.10s, 2.02GB read
Requests/sec:    506.47
Transfer/sec:     68.80MB
```

## webflux native
### GET

wrk -c90 -d30s -t3 http://localhost:8080/customers

```
Running 30s test @ http://localhost:8080/customers
  3 threads and 90 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   195.94ms  146.24ms   1.54s    93.67%
    Req/Sec   175.53     48.99   280.00     74.13%
  15205 requests in 30.09s, 2.02GB read
Requests/sec:    505.27
Transfer/sec:     68.60MB
```

