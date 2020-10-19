package com.zephyr.openfeign.client;

import com.zephyr.openfeign.config.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client", configuration = FeignClientConfig.class)
public interface EurekaClientFeign {

    @GetMapping("/info")
    String infoByFeign();
}
