package com.github.borisskert.springcloud.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaClient
public class HelloWorldServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldServiceApplication.class, args);
    }
}
