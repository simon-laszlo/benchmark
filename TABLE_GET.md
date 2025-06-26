Language/runtime | GET (req/sec) | max CPU usage % | max Memory usage (MB)
--- | --- | --- | --- |
rust warp | 5350.02 | 947.50 | 31.7727 |
go1.24.4 | 3835.32 | 1032.50 | 82.609 |
node v24.2.0 (express) | 405.92 | 187.00 | 584.618 |
node v24.2.0 (express) PM2 6 threads | 1452.67 | - | - |
node v24.2.0 (fastify) | 412.58 | 188.00 | 610.036 |
node v24.2.0 (fastify) PM2 6 threads | 1437.52 | - | - |
node v24.2.0 (restana) | 423.98 | 186.50 | 565.554 |
node v24.2.0 (restana) PM2 6 threads | 1429.47 | - | - |
kotlin - java 21.0.2 | 3094.39 | 1227.50 | 2948.51 |
kotlin - native image java -21.0.2 | 394.38 | 635.32 | 743.481 |
spring VirtualThread java 21.0.2 | 3019.95 | 1251.00 | 3018.41 |
spring VirtualThread native 21.0.2 | 688.38 | 683.58 | 946.827 |
spring java 21.0.2 | 3291.30 | 1281.50 | 3056.53 |
spring native 21.0.2 | 679.66 | 662.00 | 775.254 |
quarkus java 21.0.2 | 6272.20 | 1061.19 | 1798.34 |
quarkus native | 1530.93 | 582.50 | 285.954 |
quarkus-reactive java 21.0.2 | 917.44 | 729.00 | 1334.45 |
quarkus-reactive native | 377.45 | 355.50 | 114.382 |
webflux java 21.0.2 | 1283.72 | 1332.84 | 2433.79 |
webflux native | 259.63 | 643.00 | 470.236 |

