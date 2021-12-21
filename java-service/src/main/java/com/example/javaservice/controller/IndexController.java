package com.example.javaservice.controller;

import com.example.javaservice.client.SidecarFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
class IndexController {
    @Autowired
    private SidecarFeignClient sidecarFeignClient;

    @GetMapping("/other")
    String other() {
        return sidecarFeignClient.test();
    }
}