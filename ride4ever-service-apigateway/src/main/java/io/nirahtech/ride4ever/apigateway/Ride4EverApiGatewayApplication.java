package io.nirahtech.ride4ever.apigateway;

import com.netflix.discovery.EurekaClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class Ride4EverApiGatewayApplication {

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    public static void main(String[] args) {
        SpringApplication.run(Ride4EverApiGatewayApplication.class, args);
    }

}
