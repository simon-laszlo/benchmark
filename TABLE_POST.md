Language/runtime | GET (req/sec) | max CPU usage % | max Memory usage (MB)
--- | --- | --- | --- |
kotlin - java 21.0.2 | 2563.54 | 1131.00 | 3052.8 |
kotlin - native image java -21.0.2 | 464.93 | 572.50 | 921.6 |
spring java 21.0.2 | 2499.15 | 1142.00 | 2841.6 |
spring java 21.0.2 | 2406.11 | 1179.50 | 3033.6 |
quarkus java 21.0.2 | 4620.66 | 893.03 | 2188.8 |
quarkus native | 1393.15 | 758.50 | 486.4 |
quarkus-reactive java 21.0.2 | 714.98 | 681.00 | 1177.6 |
quarkus-reactive native | 361.50 | 342.50 | 179.2 |
webflux java 21.0.2 | 77.97 | 873.50 | 851.2 |
webflux native | 75.97 | 872.00 | 851.2 |
rust | 3932.39 | 749.00 | 32 |
go1.22.0 | 2717.57 | 856.50 | 89.6 |
node v20.11.0 (express) | 263.64 | 130.00 | 217.6 |
node v20.11.0 (express) PM2 6 threads | 1052.81 | - | - |
node v20.11.0 (fastify) | 351.95 | 136.00 | 256 |
node v20.11.0 (fastify) PM2 6 threads | 1028.22 | - | - |
node v20.11.0 (restana) | 249.63 | 131.50 | 204.8 |
node v20.11.0 (restana) PM2 6 threads | 1096.39 | - | - |
