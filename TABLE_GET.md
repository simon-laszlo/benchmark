Language/runtime | GET (req/sec) | max CPU usage % | max Memory usage (MB)
--- | --- | --- | --- |
rust | 4587.72 | 795.00 | 32 |
go1.22.0 | 3233.22 | 943.00 | 102.4 |
node v20.11.0 (express) | 301.93 | 128.50 | 236.8 |
node v20.11.0 (express) PM2 6 threads | 1077.21 | - | - |
node v20.11.0 (fastify) | 392.54 | 139.00 | 268.8 |
node v20.11.0 (fastify) PM2 6 threads | 1341.20 | - | - |
node v20.11.0 (restana) | 291.96 | 131.00 | 230.4 |
node v20.11.0 (restana) PM2 6 threads | 1064.09 | - | - |
kotlin - java 21.0.2 | 2664.16 | 1175.12 | 3148.8 |
kotlin - native image java -21.0.2 | 479.84 | 616.00 | 1049.6 |
spring java 21.0.2 | 2613.69 | 1233.00 | 3558.4 |
spring native 21.0.2 | 2560.94 | 1262.50 | 3462.4 |
quarkus java 21.0.2 | 4652.42 | 1046.50 | 2515.2 |
quarkus native | 1223.96 | 550.50 | 358.4 |
quarkus-reactive java 21.0.2 | 773.00 | 734.00 | 1292.8 |
quarkus-reactive native | 378.81 | 347.00 | 179.2 |
webflux java 21.0.2 | 83.99 | 924.50 | 1126.4 |
webflux native | 83.94 | 919.00 | 1158.4 |

