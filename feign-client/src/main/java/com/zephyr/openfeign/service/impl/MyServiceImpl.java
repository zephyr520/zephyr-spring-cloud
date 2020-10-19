package com.zephyr.openfeign.service.impl;

import com.zephyr.openfeign.client.EurekaClientFeign;
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
}
