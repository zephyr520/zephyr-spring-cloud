package com.zephyr.ribbon.controller;

import com.zephyr.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/info")
    public String info() {
        return ribbonService.info();
    }

    @GetMapping("/serviceInfo")
    public String serviceInfo() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        StringBuilder sb = new StringBuilder();
        sb.append("host : ").append(serviceInstance.getHost()).append(',')
                .append("port : ").append(serviceInstance.getPort());
        return sb.toString();
    }
}
