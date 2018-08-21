package net.abadguy.asimpleprovideruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ASimpleProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ASimpleProviderUserApplication.class, args);
    }
}
