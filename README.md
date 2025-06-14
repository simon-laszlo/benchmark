# REST-Mongo Benchmark

This project benchmarks simple REST API implementations using different programming languages and runtimes in a real-world ("life") scenario. Each implementation follows the same architecture structure:

- **Model**
- **Database**
- **Handler**
- **Routing**

## Features

- `GET /customers` → Returns a list of 1,000 customer documents from MongoDB.
- `POST /customers` → Inserts a new customer into MongoDB.

## Implementations

The following language/runtime stacks are included:

- **Node.js** with Express + MongoDB
- **Rust** with Warp + MongoDB
- **Java** with Spring Boot + MongoDB
- **Kotlin** with Spring Boot + MongoDB
- **Go** with Gin + MongoDB
- **Java** with Quarkus (Reactive) + MongoDB

All implementations use up-to-date libraries as of the latest commit.

---

## API Endpoints

### Data Format

Example document structure used in MongoDB:

```json
{
  "guid": "1234567890",
  "first_name": "Test",
  "last_name": "User",
  "email": "testuser@gmail.com",
  "address": "Blabla 88888 Bla, Bla 8"
}
```

### GET /customers

Returns a JSON array of customers (1,000 entries).

### POST http://localhost:8080/customers

Accepts a JSON object and inserts it into the MongoDB customers collection.

## Testing

### Option 1: Docker

To build and run the benchmark environment using Docker:

```
docker build -t benchmark .
docker run --privileged -p 8080:8080 -d -v $(pwd):/opt/benchmark benchmark
```

### Option 2: Run Locally

#### Mongo db

If you don’t have MongoDB installed, the easiest way to get started is using Docker. See the [docker readme](docker/README.md) for setup instructions.

#### Running Tests

```
cd wrk
./exec.sh
```

#### Cleaning the Collection

To drop the customers collection:

```
./docker/clean.sh
```

### Load Testing (WRK / WRK2)

[WRK](https://github.com/wg/wrk) and [WRK2](https://github.com/giltene/wrk2) were used for benchmarking.
To ensure consistent results, it's recommended to set the CPU governor to performance:

```
sudo cpupower frequency-set -g performance
```

This helps avoid frequency scaling variability between implementations.


#### Create customers (POST)

10 connection, 1 minute, 2 thread, throughput 100

```
wrk2 -c10 -d1m -t2 -R100 -s customers.lua http://localhost:3000/customers
```

#### Load Test Customer List (GET)

10 connection, 1 minute, 2 thread

```
wrk -c10 -d1m -t2 http://localhost:3000/customers
```

## Results

All GET tests were executed against a preloaded database containing 1,000 customer records.

### Test Environment

HP Elitebook G10 845

- AMD Ryzen 9 PRO 7940HS
- 64GB RAM
- SAMSUNG SSD 990 PRO

[wrk details](WRK.md)

## Summary

See [result](TABLE_GET.md) for the summarized GET benchmark results across all implementations.
