package com.kellonge.demo.spring.cloud.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;

import com.kellonge.demo.spring.cloud.usercenter.task.StartUpTaskUtil;

/**
 * 程序入口
 * 
 * @author kellonge
 * @version $Id: UserCenterApplication.java, v 0.1 2016年5月3日 下午8:30:38 kellonge Exp $
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class UserCenterApplication {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(UserCenterApplication.class, args);
        StartUpTaskUtil.init(context);
        MutablePropertySources propertySources = context.getEnvironment().getPropertySources();

        for (PropertySource<?> propertySource : propertySources) {
            System.out.println(propertySource.getName());
        }

        System.out.println(context.getEnvironment().getActiveProfiles()[0]);

    }
}
