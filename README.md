# mssc-beer-inventory-service

[![CircleCI](https://circleci.com/gh/NagarajJB/mssc-beer-inventory-service.svg?style=svg)](https://circleci.com/gh/NagarajJB/mssc-beer-inventory-service)


# Notes
* local-discovery profile -> Enables service registering in Eureka as configured in LocalDiscoveryConfig.java using @EnableDiscoveryClient.

* localmysql profile disables registration with Eureka and spring cloud config client

* if running with localmysql and local-discovery use them as localmysql,local-discovery (latter takes precedence)

* zipkin is disabled in application.properties, spring.zipkin.enabled=false, use 'local' profile(from spring cloud config/repo) to enable zipkin.

# Dependencies
* spring-boot-starter-artemis -> JMS support
* spring-cloud-starter-netflix-eureka-client -> Eureka service registration
* spring-cloud-starter-config -> For registering to discover config from Spring Cloud Config server