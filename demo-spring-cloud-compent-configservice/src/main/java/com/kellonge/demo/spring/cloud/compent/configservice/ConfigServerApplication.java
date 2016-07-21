package com.kellonge.demo.spring.cloud.compent.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置服务
 *
 * @author kellonge
 * @version $Id: App.java, v 0.1 2016年5月3日 下午4:56:31 kellonge Exp $
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
