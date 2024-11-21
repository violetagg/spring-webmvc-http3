# Example for configuring HTTP/3 in RestClient

## Prerequisites

### Configure Reactor Netty version

Bump `Reactor BOM` version in `build.gradle`
```properties
ext['reactor-bom.version'] = '2024.0.0'
```

### Add dependency to Netty Http3 Codec

In `build.gradle` add dependency to [netty-incubator-codec-http3](https://github.com/netty/netty-incubator-codec-http3)
```properties
dependencies {
    runtimeOnly 'io.netty.incubator:netty-incubator-codec-http3:0.0.28.Final'
}
```

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