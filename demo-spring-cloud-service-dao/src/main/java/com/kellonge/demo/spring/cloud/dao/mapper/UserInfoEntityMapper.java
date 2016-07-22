package com.kellonge.demo.spring.cloud.dao.mapper;

import com.kellonge.demo.spring.cloud.bean.entities.UserInfoEntity;
import com.kellonge.demo.spring.cloud.dao.examples.UserInfoEntityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户信息
 * T_User_Info
 */
public interface UserInfoEntityMapper {
    /**
     * 获取符合条件的记录数
     * T_User_Info
     */
    int countByExample(@Param("example") UserInfoEntityExample example);

    /**
     * 删除符合条件的记录
     * T_User_Info
     */
    int deleteByExample(@Param("example") UserInfoEntityExample example);

    /**
     * 删除指定主键的记录
     * T_User_Info
     */
    int deleteByPrimaryKey(@Param("userId") Long userId);

    /**
     * 新增记录
     * T_User_Info
     */
    int insert(@Param("record") UserInfoEntity record);

    /**
     * 选择性字段新增记录
     * T_User_Info
     */
    int insertSelective(@Param("record") UserInfoEntity record);

    /**
     * 获取指定条件的记录
     * T_User_Info
     */
    List<UserInfoEntity> selectByExample(@Param("example") UserInfoEntityExample example);

    /**
     * 获取指定主键的记录
     * T_User_Info
     */
    UserInfoEntity selectByPrimaryKey(@Param("userId") Long userId);

    /**
     * 选择性字段更新指定条件的记录
     * T_User_Info
     */
    int updateByExampleSelective(@Param("record") UserInfoEntity record, @Param("example") UserInfoEntityExample example);

    /**
     * 更新指定条件的记录
     * T_User_Info
     */
    int updateByExample(@Param("record") UserInfoEntity record, @Param("example") UserInfoEntityExample example);

    /**
     * 选择性字段更新指定主键的记录
     * T_User_Info
     */
    int updateByPrimaryKeySelective(@Param("record") UserInfoEntity record);

    /**
     * 更新指定主键的记录
     * T_User_Info
     */
    int updateByPrimaryKey(@Param("record") UserInfoEntity record);
}