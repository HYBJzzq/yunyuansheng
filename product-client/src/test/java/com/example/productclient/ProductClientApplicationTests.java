package com.example.productclient;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootTest
@EnableEurekaClient
@EnableFeignClients("com.example.productclient.Client")
class ProductClientApplicationTests {

    @Test
    void contextLoads() {
    }

}
