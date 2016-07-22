package com.kellonge.demo.spring.cloud.dao.entities;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

/**
 * 用户信息
 * T_User_Info
 */
public class UserInfoEntity {
    /**
     * 用户标识
     * T_User_Info.UserId
     */
    private Long userId;

    /**
     * 显示名称
     * T_User_Info.DisplayName
     */
    private String displayName;

    /**
     * 真实名称
     * T_User_Info.RealName
     */
    private String realName;

    /**
     * 身份证号
     * T_User_Info.IdentifyNo
     */
    private String identifyNo;

    /**
     * 用户实名状态
     * T_User_Info.RealNameStatus
     */
    private Integer realNameStatus;

    /**
     * 用户实名时间
     * T_User_Info.RealNameTime
     */
    private Date realNameTime;

    /**
     * 手机号
     * T_User_Info.Mobile
     */
    private String mobile;

    /**
     * 头像
     * T_User_Info.FaceImg
     */
    private String faceImg;

    /**
     * 创建时间
     * T_User_Info.CreateTime
     */
    private Date createTime;

    /**
     * 最后修改时间
     * T_User_Info.LastModifyTime
     */
    private Date lastModifyTime;

    /**
     * 初始化实体对象 主键列不初始化
     */
    public void initWithDefaultValue() {
        this.displayName = StringUtils.EMPTY;
        this.realName = StringUtils.EMPTY;
        this.identifyNo = StringUtils.EMPTY;
        this.realNameStatus = 0;
        this.realNameTime = new Date();
        this.mobile = StringUtils.EMPTY;
        this.faceImg = StringUtils.EMPTY;
        this.createTime = new Date();
        this.lastModifyTime = new Date();
    }

    /**
     * 用户标识
     * T_User_Info.UserId
     *
     * @return the value of T_User_Info.UserId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户标识
     * T_User_Info.UserId
     *
     * @param userId the value for T_User_Info.UserId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 显示名称
     * T_User_Info.DisplayName
     *
     * @return the value of T_User_Info.DisplayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 显示名称
     * T_User_Info.DisplayName
     *
     * @param displayName the value for T_User_Info.DisplayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 真实名称
     * T_User_Info.RealName
     *
     * @return the value of T_User_Info.RealName
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 真实名称
     * T_User_Info.RealName
     *
     * @param realName the value for T_User_Info.RealName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 身份证号
     * T_User_Info.IdentifyNo
     *
     * @return the value of T_User_Info.IdentifyNo
     */
    public String getIdentifyNo() {
        return identifyNo;
    }

    /**
     * 身份证号
     * T_User_Info.IdentifyNo
     *
     * @param identifyNo the value for T_User_Info.IdentifyNo
     */
    public void setIdentifyNo(String identifyNo) {
        this.identifyNo = identifyNo;
    }

    /**
     * 用户实名状态
     * T_User_Info.RealNameStatus
     *
     * @return the value of T_User_Info.RealNameStatus
     */
    public Integer getRealNameStatus() {
        return realNameStatus;
    }

    /**
     * 用户实名状态
     * T_User_Info.RealNameStatus
     *
     * @param realNameStatus the value for T_User_Info.RealNameStatus
     */
    public void setRealNameStatus(Integer realNameStatus) {
        this.realNameStatus = realNameStatus;
    }

    /**
     * 用户实名时间
     * T_User_Info.RealNameTime
     *
     * @return the value of T_User_Info.RealNameTime
     */
    public Date getRealNameTime() {
        return realNameTime;
    }

    /**
     * 用户实名时间
     * T_User_Info.RealNameTime
     *
     * @param realNameTime the value for T_User_Info.RealNameTime
     */
    public void setRealNameTime(Date realNameTime) {
        this.realNameTime = realNameTime;
    }

    /**
     * 手机号
     * T_User_Info.Mobile
     *
     * @return the value of T_User_Info.Mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机号
     * T_User_Info.Mobile
     *
     * @param mobile the value for T_User_Info.Mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 头像
     * T_User_Info.FaceImg
     *
     * @return the value of T_User_Info.FaceImg
     */
    public String getFaceImg() {
        return faceImg;
    }

    /**
     * 头像
     * T_User_Info.FaceImg
     *
     * @param faceImg the value for T_User_Info.FaceImg
     */
    public void setFaceImg(String faceImg) {
        this.faceImg = faceImg;
    }

    /**
     * 创建时间
     * T_User_Info.CreateTime
     *
     * @return the value of T_User_Info.CreateTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * T_User_Info.CreateTime
     *
     * @param createTime the value for T_User_Info.CreateTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后修改时间
     * T_User_Info.LastModifyTime
     *
     * @return the value of T_User_Info.LastModifyTime
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 最后修改时间
     * T_User_Info.LastModifyTime
     *
     * @param lastModifyTime the value for T_User_Info.LastModifyTime
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}