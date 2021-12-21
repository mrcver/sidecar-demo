package com.example.javaservice.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "sidecar-service")
public interface SidecarFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    String test();
}
