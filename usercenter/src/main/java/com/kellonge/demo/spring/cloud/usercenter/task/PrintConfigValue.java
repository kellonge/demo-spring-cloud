package com.kellonge.demo.spring.cloud.usercenter.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

@StartUpTask
public class PrintConfigValue implements Runnable {
    public static final Logger LOG = LoggerFactory.getLogger(PrintConfigValue.class);

    //读取本地配置，在src目录下的文件
    @Value("${sys.version.local}")
    private String             localVersion;

    //读取configserver的配置
    @Value("${sys.version}")
    private String             remoteVersion;

    @Override
    public void run() {

        LOG.info("localVersion:" + localVersion);
        LOG.info("remoteVersion:" + remoteVersion);
    }

}
