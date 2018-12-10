package com.humor.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

/**
 * @author zsz
 */
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }


    public RouteLocator routeLocator(RouteLocatorBuilder builder){

        return builder.routes().route(p -> p.path("")
                .filters(f -> f.addRequestHeader("",""))
                .uri("")
                .order(0)
                .id("test")).build();

    }




}
