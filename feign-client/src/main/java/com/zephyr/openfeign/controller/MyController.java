package com.zephyr.openfeign.controller;

import com.zephyr.openfeign.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/infoByFeign")
    public String infoByFeign() {
        return myService.infoByFeign();
    }
}
