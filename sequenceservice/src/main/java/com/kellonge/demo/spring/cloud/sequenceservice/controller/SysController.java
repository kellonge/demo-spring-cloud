package com.kellonge.demo.spring.cloud.sequenceservice.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 系统相关方法
 * 
 * @author kellonge
 * @version $Id: SysController.java, v 0.1 2016年5月3日 下午8:08:46 kellonge Exp $
 */
@RestController
@RequestMapping("/sys")
@Api(value = "/sys")
public class SysController {

    @ApiOperation(value = "获取服务器端时间")
    @RequestMapping(value = "/getSysDateTime", method = RequestMethod.GET)
    public Date getSysDateTime() {
        return new Date();
    }

}
