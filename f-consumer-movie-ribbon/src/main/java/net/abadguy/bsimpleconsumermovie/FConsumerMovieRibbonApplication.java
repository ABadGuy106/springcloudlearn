package net.abadguy.bsimpleconsumermovie;

import net.abadguy.config.TestConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="c-provider-user",configuration= TestConfiguration.class)
public class FConsumerMovieRibbonApplication {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @LoadBalanced

    public static void main(String[] args) {
        SpringApplication.run(FConsumerMovieRibbonApplication.class, args);
    }
}
