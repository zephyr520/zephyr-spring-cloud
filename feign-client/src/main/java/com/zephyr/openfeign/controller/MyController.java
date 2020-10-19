package com.zephyr.openfeign.controller;

import com.zephyr.openfeign.domain.Parent;
import com.zephyr.openfeign.domain.Student;
import com.zephyr.openfeign.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/infoByFeign")
    public String infoByFeign() {
        return myService.infoByFeign();
    }

    @GetMapping(value = "/getStudentByFeign", produces = "application/json;charset=utf-8")
    public Student getStudentByFeign() {
        return myService.getStudentByFeign("zhangsan", "shenzhen");
    }

    @PostMapping(value = "/postStudentByFeign", produces = "application/json;charset=utf-8")
    public Student postStudentByFeign() {
        return myService.postStudentByFeign(new Parent(30, "myParentName", "myParentAddress"));
    }
}
