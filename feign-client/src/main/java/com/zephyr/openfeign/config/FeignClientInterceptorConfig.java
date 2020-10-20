package com.zephyr.openfeign.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

/**
 * 实现feign的拦截器接口，当请求发出之前，会对请求进行预先的拦截
 */
@Slf4j
@Configuration
public class FeignClientInterceptorConfig implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        log.info("feign interceptor entered");
        requestTemplate.header("authKey", "myKeyInfo");
    }
}
