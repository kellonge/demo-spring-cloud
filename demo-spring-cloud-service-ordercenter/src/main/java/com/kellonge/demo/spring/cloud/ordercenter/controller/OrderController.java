package com.kellonge.demo.spring.cloud.ordercenter.controller;

import com.kellonge.demo.spring.cloud.dao.entities.OrderEntity;
import com.kellonge.demo.spring.cloud.dao.repository.OrderEntityRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by kellonge on 16/7/25.
 */
@RestController
@RequestMapping("/order")
@Api(value = "/order")
public class OrderController {

//    @Autowired
//    private OrderEntityRepository orderEntityRepository;

    @ApiOperation(value = "获取指定订单信息", notes = "获取指定订单信息")
    @RequestMapping(value = "/{orderId}", method = RequestMethod.GET)
    public Date getOrderEntityById(@ApiParam("订单Id") @PathVariable(value = "orderId") Long orderId) throws InterruptedException {
        Thread.sleep(1000L);
        return new Date();
    }
}
