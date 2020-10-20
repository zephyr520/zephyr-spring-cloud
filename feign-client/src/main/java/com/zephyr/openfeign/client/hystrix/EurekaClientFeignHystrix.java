package com.zephyr.openfeign.client.hystrix;

import com.zephyr.openfeign.client.EurekaClientFeign;
import com.zephyr.openfeign.domain.Parent;
import com.zephyr.openfeign.domain.Student;
import org.springframework.stereotype.Component;

@Component
public class EurekaClientFeignHystrix implements EurekaClientFeign {
    @Override
    public String infoByFeign() {
        return "This is Feign with Hystrix";
    }

    @Override
    public Student getStudentByFeign(String name, String address) {
        return new Student(-1, name, address, null);
    }

    @Override
    public Student postStudentByFeign(Parent parent) {
        return new Student(-1, "hystrixName", "hystrixAddress", parent);
    }
}
