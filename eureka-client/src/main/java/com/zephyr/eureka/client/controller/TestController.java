package com.zephyr.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

@RestController
public class TestController {

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/info")
    public String info() {
        return String.format("spring application name is %s", applicationName);
    }
}
