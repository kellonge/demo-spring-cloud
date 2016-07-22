package com.kellonge.demo.spring.cloud.dao.repository;

import com.kellonge.demo.spring.cloud.dao.entities.OrderEntity;
import com.kellonge.demo.spring.cloud.dao.examples.OrderEntityExample;

import java.util.List;

/**
 * Created by kellonge on 16/7/22.
 */
public interface OrderEntityRepository {


    /**
     * 获取符合条件的记录数
     */
    int countByExample(OrderEntityExample example);

    /**
     * 删除符合条件的记录
     */
    int deleteByExample(OrderEntityExample example);

    /**
     * 删除指定主键的记录
     */
    int deleteByPrimaryKey(Long recordId);

    /**
     * 新增记录
     */
    int insert(OrderEntity record);

    /**
     * 选择性字段新增记录
     */
    int insertSelective(OrderEntity record);

    /**
     * 获取指定条件的记录
     */
    List<OrderEntity> selectByExample(OrderEntityExample example);

    /**
     * 获取指定主键的记录
     */
    OrderEntity selectByPrimaryKey(Long recordId);

    /**
     * 选择性字段更新指定条件的记录
     */
    int updateByExampleSelective(OrderEntity record, OrderEntityExample example);

    /**
     * 更新指定条件的记录
     */
    int updateByExample(OrderEntity record, OrderEntityExample example);

    /**
     * 选择性字段更新指定主键的记录
     */
    int updateByPrimaryKeySelective(OrderEntity record);

    /**
     * 更新指定主键的记录
     */
    int updateByPrimaryKey(OrderEntity record);
}
