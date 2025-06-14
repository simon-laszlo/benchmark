Language/runtime | GET (req/sec) | max CPU usage % | max Memory usage (MB)
--- | --- | --- | --- |
rust | 5388.59 | 915.00 | 31.7727 |
go1.24.4 | 3978.50 | 1021.50 | 82.6091 |
node v24.2.0 (express) | 383.32 | 184.00 | 578.264 |
node v24.2.0 (express) PM2 6 threads | 1488.97 | - | - |
node v24.2.0 (fastify) | 382.90 | 183.00 | 584.618 |
node v24.2.0 (fastify) PM2 6 threads | 1508.20 | - | - |
node v24.2.0 (restana) | 389.27 | 181.00 | 533.782 |
node v24.2.0 (restana) PM2 6 threads | 1543.72 | - | - |
kotlin - java 24.0.1 | 3383.46 | 1271.50 | 2560.88 |
kotlin - native image java -24.0.1 |  |  | 0 |
spring VirtualThread java 24.0.1 | 3428.30 | 1260.00 | 2541.82 |
spring VirtualThread native 24.0.1 | 653.81 | 653.50 | 787.963 |
spring java 24.0.1 | 3421.95 | 1249.75 | 2834.13 |
spring native 24.0.1 | 660.80 | 643.00 | 959.536 |
quarkus java 24.0.1 | 6081.10 | 1152.00 | 1874.59 |
quarkus native | 1214.36 | 567.50 | 330.436 |
quarkus-reactive java 24.0.1 | 884.19 | 829.00 | 1239.14 |
quarkus-reactive native | 344.77 | 359.50 | 127.091 |
webflux java 24.0.1 |  |  | 0 |
webflux native |  |  | 0 |

