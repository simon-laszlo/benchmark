Language/runtime | GET (req/sec) | max CPU usage % | max Memory usage (MB)
--- | --- | --- | --- |
rust | 4415.77 | 807.50 | 31.7727 |
go1.24.4 | 3227.34 | 896.00 | 88.9636 |
node v24.2.0 (express) | 367.72 | 189.50 | 540.136 |
node v24.2.0 (express) PM2 6 threads | 1265.91 | - | - |
node v24.2.0 (fastify) | 350.82 | 183.50 | 533.782 |
node v24.2.0 (fastify) PM2 6 threads | 1288.93 | - | - |
node v24.2.0 (restana) | 383.68 | 182.00 | 565.554 |
node v24.2.0 (restana) PM2 6 threads | 1286.25 | - | - |
kotlin - java 21.0.2 | 2725.83 | 1163.18 | 3240.82 |
kotlin - native image java -21.0.2 | 361.44 | 604.00 | 1283.62 |
spring VirtualThread java 21.0.2 | 2769.31 | 1218.50 | 2859.54 |
spring VirtualThread native 21.0.2 | 575.88 | 600.50 | 876.927 |
spring java 21.0.2 | 2741.38 | 1197.00 | 3012.05 |
spring native 21.0.2 | 572.95 | 615.50 | 902.345 |
quarkus java 21.0.2 | 5273.88 | 1014.50 | 2363.89 |
quarkus native | 1081.82 | 543.00 | 260.536 |
quarkus-reactive java 21.0.2 | 817.61 | 702.50 | 1493.32 |
quarkus-reactive native | 339.77 | 342.00 | 120.736 |
webflux java 21.0.2 | 1091.38 | 1262.00 | 2630.78 |
webflux native | 238.30 | 640.50 | 521.072 |

