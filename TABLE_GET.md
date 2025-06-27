Language/runtime | GET (req/sec) | max CPU usage % | max Memory usage (MB)
--- | --- | --- | --- |
rust warp | 5566.23 | 912.00 | 31.7727 |
go1.24.4 | 4151.08 | 1019.50 | 76.2545 |
node v24.2.0 (express) | 444.70 | 189.50 | 590.972 |
node v24.2.0 (express) PM2 6 threads | 1581.75 | - | - |
node v24.2.0 (fastify) | 436.08 | 188.00 | 622.745 |
node v24.2.0 (fastify) PM2 6 threads | 1548.08 | - | - |
node v24.2.0 (restana) | 441.21 | 183.00 | 571.909 |
node v24.2.0 (restana) PM2 6 threads | 1525.75 | - | - |
kotlin - java 21.0.2 | 3336.81 | 1243.00 | 2846.83 |
kotlin - native image java -21.0.2 | 425.28 | 675.00 | 1188.3 |
spring VirtualThread java 21.0.2 | 3399.35 | 1277.11 | 3037.47 |
spring VirtualThread native 21.0.2 | 723.64 | 684.50 | 1048.5 |
spring java 21.0.2 | 3425.20 | 1276.12 | 3170.92 |
spring native 21.0.2 | 750.15 | 719.50 | 1042.14 |
quarkus java 21.0.2 | 6891.98 | 1079.00 | 1938.14 |
quarkus native | 1534.19 | 573.00 | 305.018 |
quarkus-reactive java 21.0.2 | 4547.44 | 1104.00 | 1741.14 |
quarkus-reactive native | 787.94 | 601.00 | 247.827 |
webflux java 21.0.2 | 1305.48 | 1360.50 | 2421.08 |
webflux native | 272.53 | 635.50 | 502.009 |

