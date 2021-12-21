package com.example.javaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
class JavaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(JavaServiceApplication.class, args);
    }
}