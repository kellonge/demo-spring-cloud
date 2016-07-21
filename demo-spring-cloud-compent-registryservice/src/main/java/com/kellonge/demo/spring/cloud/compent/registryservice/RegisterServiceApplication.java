package com.kellonge.demo.spring.cloud.compent.registryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册与发现
 *
 * @author kellonge
 * @version $Id: Application.java, v 0.1 2016年5月3日 下午4:38:53 kellonge Exp $
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class RegisterServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegisterServiceApplication.class, args);
    }
}
