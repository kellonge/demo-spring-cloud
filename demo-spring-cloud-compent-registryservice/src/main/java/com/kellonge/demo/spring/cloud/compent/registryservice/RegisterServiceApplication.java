package com.kellonge.demo.spring.cloud.compent.registryservice;

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
