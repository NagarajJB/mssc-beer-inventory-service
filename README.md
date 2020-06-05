# mssc-beer-inventory-service

[![CircleCI](https://circleci.com/gh/NagarajJB/mssc-beer-inventory-service.svg?style=svg)](https://circleci.com/gh/NagarajJB/mssc-beer-inventory-service)


# Notes
* local-discovery profile -> Enables service registering in Eureka as configured in LocalDiscoveryConfig.java using @EnableDiscoveryClient.


# Dependencies
* spring-boot-starter-artemis -> JMS support
* spring-cloud-starter-netflix-eureka-client -> Eureka service registration
* spring-cloud-starter-config -> For registering to discover config from Spring Cloud Config server