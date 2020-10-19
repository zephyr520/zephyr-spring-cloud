package com.zephyr.openfeign.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

@Configuration
public class FeignClientConfig {

    /**
     * 配置Feign的重试器
     * @return Retryer
     */
    @Bean
    public Retryer feignClientRetryer() {
        //period:重试周期 50ms
        //maxPeriod:最大重试周期 2s
        //maxAttempts:最大重试次数 6
        return new Retryer.Default(50, SECONDS.toMillis(2), 6);
    }

    /**
     * 配置feign的自定义日志和级别，方便在开发中进行调试并打印出日志信息
     * @return Logger.Level
     */
    @Bean
    public Logger.Level feignClientLogLevel() {
        return Logger.Level.FULL;
    }
}
