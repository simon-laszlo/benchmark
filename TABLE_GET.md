Language/runtime | GET (req/sec) | max CPU usage % | max Memory usage (MB)
--- | --- | --- | --- |
rust | 5243.23 | 885.50 | 31.7727 |
go1.24.4 | 3009.18 | 809.00 | 76.2545 |
node v22.14.0 (express) | 318.36 | 182.00 | 292.309 |
node v22.14.0 (express) PM2 6 threads | 1121.05 | - | - |
node v22.14.0 (fastify) | 330.62 | 183.00 | 292.309 |
node v22.14.0 (fastify) PM2 6 threads | 1174.70 | - | - |
node v22.14.0 (restana) | 336.94 | 188.00 | 298.664 |
node v22.14.0 (restana) PM2 6 threads | 1195.15 | - | - |
kotlin - java 21.0.2 | 2843.19 | 1270.65 | 3132.79 |
kotlin - native image java -21.0.2 | 435.47 | 638.50 | 1315.39 |
spring VirtualThread java 21.0.2 | 3111.91 | 1292.04 | 3056.54 |
spring VirtualThread native 21.0.2 | 570.80 | 605.50 | 578.264 |
spring java 21.0.2 | 3089.95 | 1327.50 | 3215.4 |
spring native 21.0.2 | 574.58 | 597.50 | 616.391 |
quarkus java 21.0.2 | 5637.49 | 1158.00 | 2135.13 |
quarkus native | 1134.20 | 570.00 | 285.954 |
quarkus-reactive java 21.0.2 | 871.50 | 863.50 | 1328.1 |
quarkus-reactive native | 347.51 | 358.50 | 139.8 |
webflux java 21.0.2 | 652.81 | 1318.50 | 2065.23 |
webflux native | 160.55 | 695.50 | 330.436 |

