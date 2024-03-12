Language/runtime | GET (req/sec) | max CPU usage % | max Memory usage (MB)
--- | --- | --- | --- |
rust | 5153.87 | 868.50 | 32.5518 |
go1.22.1 | 3370.03 | 984.50 | 97.6553 |
node v20.11.0 (express) | 377.02 | 141.50 | 260.414 |
node v20.11.0 (express) PM2 6 threads | 1364.03 | - | - |
node v20.11.0 (fastify) | 420.58 | 143.50 | 273.435 |
node v20.11.0 (fastify) PM2 6 threads | 1349.51 | - | - |
node v20.11.0 (restana) | 421.58 | 146.27 | 273.435 |
node v20.11.0 (restana) PM2 6 threads | 1326.90 | - | - |
kotlin - java 21.0.2 | 2288.76 | 1193.03 | 3164.03 |
kotlin - native image java -21.0.2 | 434.78 | 665.00 | 1223.95 |
spring VirtualThread java 21.0.2 | 2563.52 | 1237.50 | 3229.14 |
spring VirtualThread native 21.0.2 | 2591.18 | 1262.00 | 3124.97 |
spring java 21.0.2 | 2546.44 | 1247.26 | 3235.65 |
spring native 21.0.2 | 2455.66 | 1293.00 | 3437.47 |
quarkus java 21.0.2 | 4530.98 | 1069.15 | 2298.15 |
quarkus native | 1062.12 | 530.00 | 273.435 |
quarkus-reactive java 21.0.2 | 710.10 | 744.50 | 1347.64 |
quarkus-reactive native | 368.62 | 361.00 | 130.207 |
webflux java 21.0.2 | 577.34 | 1288.50 | 2031.23 |
webflux native | 549.86 | 1326.50 | 2037.74 |

