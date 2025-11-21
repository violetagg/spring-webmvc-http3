# Example for configuring HTTP/3 in RestClient

## Prerequisites

### Configure SSL Bundle

In `application.properties` add the `SSL` configuration
```properties
spring.ssl.bundle.jks.server.key.alias...
spring.ssl.bundle.jks.server.keystore...
```
More information about [SSL Bundle](https://docs.spring.io/spring-boot/reference/features/ssl.html) settings:

## Available endpoints

### Remote Endpoint
This endpoint showcases `HTTP/3` support for `RestClient`

```shell
curl https://localhost:8443/remote -v 
```