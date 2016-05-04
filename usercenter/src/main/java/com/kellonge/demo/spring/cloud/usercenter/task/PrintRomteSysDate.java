package com.kellonge.demo.spring.cloud.usercenter.task;
 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.kellonge.demo.spring.cloud.usercenter.intergration.SysCilent;

@StartUpTask
public class PrintRomteSysDate implements Runnable {

    public static final Logger LOG = LoggerFactory.getLogger(PrintRomteSysDate.class);

    @Autowired
    SysCilent                  sysCilent;
 
    public void run() {
        for (int i = 0; i < 10; i++) {
            LOG.info(sysCilent.getSysDateTime().toString());
        }
    }

}
