package de.adorsys.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.io.IOException;

@SpringCloudApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
