package com.kellonge.demo.spring.cloud.dao.mapper;

import java.util.List;

import com.kellonge.demo.spring.cloud.dao.entities.MerchantsEntity;
import com.kellonge.demo.spring.cloud.dao.examples.MerchantsEntityExample;
import org.apache.ibatis.annotations.Param;


/**
 * 商户记录
 * T_Merchants
 */
public interface MerchantsEntityMapper {
    /**
     * 获取符合条件的记录数
     * T_Merchants
     */
    int countByExample(@Param("example") MerchantsEntityExample example);

    /**
     * 删除符合条件的记录
     * T_Merchants
     */
    int deleteByExample(@Param("example") MerchantsEntityExample example);

    /**
     * 删除指定主键的记录
     * T_Merchants
     */
    int deleteByPrimaryKey(@Param("merchantsId") Long merchantsId);

    /**
     * 新增记录
     * T_Merchants
     */
    int insert(@Param("record") MerchantsEntity record);

    /**
     * 选择性字段新增记录
     * T_Merchants
     */
    int insertSelective(@Param("record") MerchantsEntity record);

    /**
     * 获取指定条件的记录
     * T_Merchants
     */
    List<MerchantsEntity> selectByExample(@Param("example") MerchantsEntityExample example);

    /**
     * 获取指定主键的记录
     * T_Merchants
     */
    MerchantsEntity selectByPrimaryKey(@Param("merchantsId") Long merchantsId);

    /**
     * 选择性字段更新指定条件的记录
     * T_Merchants
     */
    int updateByExampleSelective(@Param("record") MerchantsEntity record, @Param("example") MerchantsEntityExample example);

    /**
     * 更新指定条件的记录
     * T_Merchants
     */
    int updateByExample(@Param("record") MerchantsEntity record, @Param("example") MerchantsEntityExample example);

    /**
     * 选择性字段更新指定主键的记录
     * T_Merchants
     */
    int updateByPrimaryKeySelective(@Param("record") MerchantsEntity record);

    /**
     * 更新指定主键的记录
     * T_Merchants
     */
    int updateByPrimaryKey(@Param("record") MerchantsEntity record);
}