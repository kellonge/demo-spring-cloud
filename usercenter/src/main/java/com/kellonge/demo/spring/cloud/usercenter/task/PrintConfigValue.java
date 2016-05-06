package com.kellonge.demo.spring.cloud.usercenter.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ApplicationContext;

import com.kellonge.demo.spring.cloud.usercenter.AppContext;

/**
 * 读取远程或者本地配置信息示例 
 * 1.curl -X POST 'http://localhost:9101/refresh' 可以对context进行刷新
 * 
 * @author kellonge
 * @version $Id: PrintConfigValue.java, v 0.1 2016年5月6日 下午5:16:05 kellonge Exp $
 */
@StartUpTask
@RefreshScope
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

        Thread thread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    PrintConfigValue printConfigValue = AppContext.getBean(PrintConfigValue.class);
                    LOG.info("localVersion:" + printConfigValue.getLocalVersion());
                    LOG.info("remoteVersion:" + printConfigValue.getRemoteVersion());
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

    public String getLocalVersion() {
        return localVersion;
    }

    public void setLocalVersion(String localVersion) {
        this.localVersion = localVersion;
    }

    public String getRemoteVersion() {
        return remoteVersion;
    }

    public void setRemoteVersion(String remoteVersion) {
        this.remoteVersion = remoteVersion;
    }
}
