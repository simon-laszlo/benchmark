Language/runtime | GET (req/sec) | max CPU usage % | max Memory usage (MB)
--- | --- | --- | --- |
rust | 4348.74 | 773.50 | 32 |
go1.22.0 | 3107.51 | 942.00 | 96 |
node v20.11.0 (express) | 351.17 | 143.00 | 256 |
node v20.11.0 (express) PM2 6 threads | 1242.87 | - | - |
node v20.11.0 (fastify) | 430.18 | 143.50 | 300.8 |
node v20.11.0 (fastify) PM2 6 threads | 1508.19 | - | - |
node v20.11.0 (restana) | 451.23 | 143.00 | 288 |
node v20.11.0 (restana) PM2 6 threads | 1230.27 | - | - |
kotlin - java 21.0.2 | 2691.75 | 1237.50 | 3142.4 |
kotlin - native image java -21.0.2 | 400.24 | 584.00 | 1030.4 |
spring VirtualThread java 21.0.2 | 2829.73 | 1205.00 | 3212.8 |
spring VirtualThread native 21.0.2 | 2877.79 | 1215.50 | 3046.4 |
spring java 21.0.2 | 2672.65 | 1264.00 | 3404.8 |
spring native 21.0.2 | 2743.68 | 1185.50 | 3084.8 |
quarkus java 21.0.2 | 5073.35 | 1015.50 | 2425.6 |
quarkus native | 1185.41 | 518.50 | 320 |
quarkus-reactive java 21.0.2 | 785.33 | 691.50 | 1299.2 |
quarkus-reactive native | 361.99 | 346.00 | 172.8 |
webflux java 21.0.2 | 536.95 | 1175.12 | 2329.6 |
webflux native | 543.89 | 1208.96 | 2118.4 |

