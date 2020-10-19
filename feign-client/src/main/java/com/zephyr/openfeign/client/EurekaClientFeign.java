package com.zephyr.openfeign.client;

import com.zephyr.openfeign.config.FeignClientConfig;
import com.zephyr.openfeign.domain.Parent;
import com.zephyr.openfeign.domain.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", configuration = FeignClientConfig.class)
public interface EurekaClientFeign {

    @GetMapping("/info")
    String infoByFeign();

    @GetMapping("/getStudent")
    Student getStudentByFeign(@RequestParam("name") String name, @RequestParam("address") String address);

    @PostMapping("/postStudent")
    Student postStudentByFeign(@RequestBody Parent parent);
}
