package com.zephyr.ribbon.service.impl;

import com.zephyr.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonServiceImpl implements RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String info() {
        return restTemplate.getForObject("http://eureka-client/info", String.class);
    }
}
