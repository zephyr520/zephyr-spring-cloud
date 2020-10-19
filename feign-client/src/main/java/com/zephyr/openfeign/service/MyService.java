package com.zephyr.openfeign.service;

import com.zephyr.openfeign.domain.Parent;
import com.zephyr.openfeign.domain.Student;

public interface MyService {
    String infoByFeign();

    Student getStudentByFeign(String name, String address);

    Student postStudentByFeign(Parent parent);
}
