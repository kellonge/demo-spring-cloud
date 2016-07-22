package com.kellonge.demo.spring.cloud.dao.repository.impl;

import com.kellonge.demo.spring.cloud.dao.entities.OrderEntity;
import com.kellonge.demo.spring.cloud.dao.examples.OrderEntityExample;
import com.kellonge.demo.spring.cloud.dao.mapper.OrderEntityMapper;
import com.kellonge.demo.spring.cloud.dao.repository.OrderEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by kellonge on 16/7/22.
 */
public class OrderEntityRepositoryImpl implements OrderEntityRepository {

    @Autowired
    private OrderEntityMapper orderEntityMapper;

    @Override
    public int countByExample(OrderEntityExample example) {
        return orderEntityMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(OrderEntityExample example) {
        return orderEntityMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long recordId) {
        return orderEntityMapper.deleteByPrimaryKey(recordId);
    }

    @Override
    public int insert(OrderEntity record) {
        return orderEntityMapper.insert(record);
    }

    @Override
    public int insertSelective(OrderEntity record) {
        return orderEntityMapper.insertSelective(record);
    }

    @Override
    public List<OrderEntity> selectByExample(OrderEntityExample example) {
        return orderEntityMapper.selectByExample(example);
    }

    @Override
    public OrderEntity selectByPrimaryKey(Long recordId) {
        return orderEntityMapper.selectByPrimaryKey(recordId);
    }

    @Override
    public int updateByExampleSelective(OrderEntity record, OrderEntityExample example) {
        return orderEntityMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(OrderEntity record, OrderEntityExample example) {
        return orderEntityMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderEntity record) {
        return orderEntityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderEntity record) {
        return orderEntityMapper.updateByPrimaryKey(record);
    }
}
