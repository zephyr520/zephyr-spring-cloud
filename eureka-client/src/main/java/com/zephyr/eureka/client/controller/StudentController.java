package com.zephyr.eureka.client.controller;

import com.zephyr.eureka.client.domain.Parent;
import com.zephyr.eureka.client.domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
public class StudentController {

    @GetMapping("/getStudent")
    public Student getStudentByGetReq(@RequestParam("name") String name,
                                      @RequestParam("address") String address,
                                      HttpServletRequest request) {
        log.info("name : {}, address: {}", name, address);
        log.info("authKey: {}", request.getHeader("authKey"));
        Parent parent = new Parent(10, "parentName", "parentAddress");
        Student student = new Student(20, name, address,parent);
        return student;
    }

    @PostMapping("/postStudent")
    public Student getStudentByPostReq(@RequestBody Parent parent, HttpServletRequest request) {
        log.info("parent: {}", parent);
        log.info("authKey: {}", request.getHeader("authKey"));
        Student student = new Student(30, "theStudent", "theAddress", parent);
        return student;
    }
}
