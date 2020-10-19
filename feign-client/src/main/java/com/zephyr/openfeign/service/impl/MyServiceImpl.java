package com.zephyr.openfeign.service.impl;

import com.zephyr.openfeign.client.EurekaClientFeign;
import com.zephyr.openfeign.domain.Parent;
import com.zephyr.openfeign.domain.Student;
import com.zephyr.openfeign.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
    @Autowired
    private EurekaClientFeign eurekaClientFeign;

    @Override
    public String infoByFeign() {
        return eurekaClientFeign.infoByFeign();
    }

    @Override
    public Student getStudentByFeign(String name, String address) {
        return eurekaClientFeign.getStudentByFeign(name, address);
    }

    @Override
    public Student postStudentByFeign(Parent parent) {
        return eurekaClientFeign.postStudentByFeign(parent);
    }
}
