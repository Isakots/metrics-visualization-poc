# Metrics POC

## Requirements

- JDK17
- Maven
- PostgreSQL DB with created Database: metrics_poc
- Docker

## Run

### Spring Boot app
`mvn spring-boot:run`

App will be available on localhost:8080

### Prometheus
```
cd ./metrics/prometheus
docker-compose up
```
Prometheus will be available on localhost:9090

Check if Spring Boot metrics are available: `localhost:9090/targets`
