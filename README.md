# SoapFul
A Spring Boot Application that will respond to soap as well as rest calls

## Requirements
- Java 21
- Maven

## Setup

1. Create a Keystore to enable SSL

```bash
keytool -genkey -keystore src/main/resources/keystore.p12 -storetype PKCS12 -storepass changeit -alias ssl -keyalg RSA -sigalg SHA256withRSA -validity 365 -keysize 4096
```

2. Access the API from here
- [SOAP](https://localhost:443/restapi/v1/services)
- [REST](https://localhost/restapi/v1/swagger-ui/index.html) 
