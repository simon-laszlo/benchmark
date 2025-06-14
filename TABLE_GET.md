Language/runtime | GET (req/sec) | max CPU usage % | max Memory usage (MB)
--- | --- | --- | --- |
rust | 5501.77 | 902.00 | 31.7727 |
go1.24.4 | 3991.80 | 1021.00 | 82.6091 |
node v24.2.0 (express) | 380.62 | 181.50 | 546.491 |
node v24.2.0 (express) PM2 6 threads | 1575.77 | - | - |
node v24.2.0 (fastify) | 384.95 | 180.50 | 584.618 |
node v24.2.0 (fastify) PM2 6 threads | 1501.71 | - | - |
node v24.2.0 (restana) | 386.61 | 179.00 | 565.554 |
node v24.2.0 (restana) PM2 6 threads | 1504.86 | - | - |
kotlin - java 21.0.2 | 3357.27 | 1250.50 | 2796 |
kotlin - native image java -21.0.2 | 416.51 | 651.50 | 1334.45 |
spring VirtualThread java 21.0.2 | 3438.06 | 1315.50 | 2815.06 |
spring VirtualThread native 21.0.2 | 562.24 | 611.50 | 1016.73 |
spring java 21.0.2 | 3412.06 | 1291.00 | 2827.77 |
spring native 21.0.2 | 667.99 | 675.00 | 800.673 |
quarkus java 21.0.2 | 6322.69 | 1120.50 | 2084.29 |
quarkus native | 1262.65 | 614.43 | 349.5 |
quarkus-reactive java 21.0.2 | 934.77 | 756.00 | 1105.69 |
quarkus-reactive native | 358.02 | 369.00 | 114.382 |
webflux java 21.0.2 | 715.06 | 1326.00 | 2135.13 |
webflux native | 152.83 | 654.00 | 355.854 |

