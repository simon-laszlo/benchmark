Language/runtime | GET (req/sec) | max CPU usage % | max Memory usage (MB)
--- | --- | --- | --- |
rust | 4845.52 | 827.00 | 32 |
go1.22.0 | 3705.24 | 985.50 | 102.4 |
node v20.11.0 (express) | 439.67 | 143.00 | 262.4 |
node v20.11.0 (express) PM2 6 threads | 1494.09 | - | - |
node v20.11.0 (fastify) | 458.35 | 143.50 | 300.8 |
node v20.11.0 (fastify) PM2 6 threads | 1470.77 | - | - |
node v20.11.0 (restana) | 431.72 | 146.00 | 294.4 |
node v20.11.0 (restana) PM2 6 threads | 1498.82 | - | - |
kotlin - java 21.0.2 | 2828.53 | 1322.89 | 3379.2 |
kotlin - native image java -21.0.2 | 430.53 | 653.50 | 921.6 |
spring VirtualThread java 21.0.2 | 2894.16 | 1273.50 | 3353.6 |
spring VirtualThread native 21.0.2 | 2577.95 | 1178.50 | 3328 |
spring java 21.0.2 | 2471.56 | 1156.72 | 3372.8 |
spring native 21.0.2 | 2391.68 | 1212.44 | 3129.6 |
quarkus java 21.0.2 | 4436.30 | 1003.48 | 2432 |
quarkus native | 956.12 | 507.50 | 326.4 |
quarkus-reactive java 21.0.2 | 679.16 | 709.50 | 1331.2 |
quarkus-reactive native | 316.39 | 337.00 | 166.4 |
webflux java 21.0.2 | 506.47 | 1215.00 | 2163.2 |
webflux native | 505.27 | 1162.50 | 2112 |

