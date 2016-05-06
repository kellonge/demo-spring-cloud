package com.kellonge.demo.spring.cloud.usercenter.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.context.ApplicationContext;

@StartUpTask
public class PrintConfigValue implements Runnable {
    public static final Logger LOG = LoggerFactory.getLogger(PrintConfigValue.class);

    @Value("${sys.version.local}")
    private String             localVersion;

    @Value("${sys.version}")
    private String             remoteVersion;

    @Override
    public void run() {

        LOG.info("localVersion:" + localVersion);
        LOG.info("remoteVersion:" + remoteVersion);
    }

}
