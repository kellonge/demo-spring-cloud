package com.kellonge.demo.spring.cloud.dao.mapper;

import com.kellonge.demo.spring.cloud.dao.entities.OrderEntity;
import com.kellonge.demo.spring.cloud.dao.examples.OrderEntityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户订单表
 * T_Order
 */
public interface OrderEntityMapper {
    /**
     * 获取符合条件的记录数
     * T_Order
     */
    int countByExample(@Param("example") OrderEntityExample example);

    /**
     * 删除符合条件的记录
     * T_Order
     */
    int deleteByExample(@Param("example") OrderEntityExample example);

    /**
     * 删除指定主键的记录
     * T_Order
     */
    int deleteByPrimaryKey(@Param("orderId") Long orderId);

    /**
     * 新增记录
     * T_Order
     */
    int insert(@Param("record") OrderEntity record);

    /**
     * 选择性字段新增记录
     * T_Order
     */
    int insertSelective(@Param("record") OrderEntity record);

    /**
     * 获取指定条件的记录
     * T_Order
     */
    List<OrderEntity> selectByExample(@Param("example") OrderEntityExample example);

    /**
     * 获取指定主键的记录
     * T_Order
     */
    OrderEntity selectByPrimaryKey(@Param("orderId") Long orderId);

    /**
     * 选择性字段更新指定条件的记录
     * T_Order
     */
    int updateByExampleSelective(@Param("record") OrderEntity record, @Param("example") OrderEntityExample example);

    /**
     * 更新指定条件的记录
     * T_Order
     */
    int updateByExample(@Param("record") OrderEntity record, @Param("example") OrderEntityExample example);

    /**
     * 选择性字段更新指定主键的记录
     * T_Order
     */
    int updateByPrimaryKeySelective(@Param("record") OrderEntity record);

    /**
     * 更新指定主键的记录
     * T_Order
     */
    int updateByPrimaryKey(@Param("record") OrderEntity record);
}