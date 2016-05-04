package com.kellonge.demo.spring.cloud.usercenter.intergration;

import java.util.Date;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("sequenceservice")
public interface SysCilent {

    @RequestMapping(value = "/sys/getSysDateTime", method = RequestMethod.GET)
    public Date getSysDateTime();

}
