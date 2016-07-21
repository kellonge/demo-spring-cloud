package com.kellonge.demo.spring.cloud.sequenceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 程序入口
 * 
 * @author kellonge
 * @version $Id: SequenceServiceApplication.java, v 0.1 2016年5月3日 下午8:15:20 kellonge Exp $
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
@ComponentScan(value = { "com.kellonge.demo.spring.cloud.sequenceservice", "springfox.documentation" })
public class SequenceServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SequenceServiceApplication.class, args);
    }
}
