Language/runtime | GET (req/sec) | max CPU usage % | max Memory usage (MB)
--- | --- | --- | --- |
rust | 4338.02 | 805.00 | 31.7727 |
go1.24.4 | 3187.18 | 886.00 | 76.2545 |
node v24.2.0 (express) | 367.57 | 186.50 | 521.072 |
node v24.2.0 (express) PM2 6 threads | 1190.20 | - | - |
node v24.2.0 (fastify) | 366.56 | 187.00 | 495.654 |
node v24.2.0 (fastify) PM2 6 threads | 1207.92 | - | - |
node v24.2.0 (restana) | 364.50 | 184.50 | 559.2 |
node v24.2.0 (restana) PM2 6 threads | 1208.06 | - | - |
kotlin - java 21.0.2 | 2353.41 | 1074.00 | 3056.53 |
kotlin - native image java -21.0.2 | 331.65 | 534.00 | 864.218 |
spring VirtualThread java 21.0.2 | 2525.20 | 1092.50 | 2694.33 |
spring VirtualThread native 21.0.2 | 496.13 | 579.50 | 762.545 |
spring java 21.0.2 | 2418.00 | 1090.50 | 2802.35 |
spring native 21.0.2 | 514.99 | 560.00 | 673.581 |
quarkus java 21.0.2 | 4392.56 | 947.00 | 2268.57 |
quarkus native | 997.60 | 500.00 | 292.309 |
quarkus-reactive java 21.0.2 | 711.81 | 678.00 | 1474.25 |
quarkus-reactive native | 314.30 | 335.50 | 108.027 |
webflux java 21.0.2 | 797.12 | 1136.50 | 2236.8 |
webflux native | 194.53 | 656.00 | 463.882 |

