Language/runtime | GET (req/sec) | max CPU usage % | max Memory usage (MB)
--- | --- | --- | --- |
rust | 5485.65 | 898.00 | 31.7727 |
go1.24.4 | 4002.26 | 1005.00 | 82.6091 |
node v24.2.0 (express) | 425.76 | 184.00 | 603.682 |
node v24.2.0 (express) PM2 6 threads | 1513.78 | - | - |
node v24.2.0 (fastify) | 419.01 | 182.50 | 610.036 |
node v24.2.0 (fastify) PM2 6 threads | 1491.24 | - | - |
node v24.2.0 (restana) | 447.66 | 181.00 | 597.327 |
node v24.2.0 (restana) PM2 6 threads | 1472.04 | - | - |
kotlin - java 21.0.2 | 3049.01 | 1138.31 | 2986.64 |
kotlin - native image java -21.0.2 | 432.02 | 637.50 | 724.418 |
spring VirtualThread java 21.0.2 | 3206.60 | 1272.50 | 3113.73 |
spring VirtualThread native 21.0.2 | 650.99 | 649.50 | 807.027 |
spring java 21.0.2 | 3359.96 | 1270.15 | 2770.58 |
spring native 21.0.2 | 661.52 | 626.00 | 965.891 |
quarkus java 21.0.2 | 6311.33 | 1104.50 | 2154.19 |
quarkus native | 1275.94 | 561.00 | 311.373 |
quarkus-reactive java 21.0.2 | 922.25 | 715.50 | 1315.39 |
quarkus-reactive native | 386.41 | 358.50 | 108.027 |
webflux java 21.0.2 | 1196.25 | 1383.00 | 2618.07 |
webflux native | 275.16 | 717.50 | 546.491 |

