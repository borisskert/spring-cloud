# spring cloud

## Build

    $ mvn clean package
    
## Run

    $ docker-compose up --build

### Urls

| Url  | Application |
|------|-------------|
| http://localhost:8761 | Eureka service |
| http://localhost:8081/hello | Load-balanced `hello` from hello-services behind reverse-proxy |
