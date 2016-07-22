package com.kellonge.demo.spring.cloud.dao.entities;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

/**
 * 用户订单表
 * T_Order
 */
public class OrderEntity {
    /**
     * 订单标识，T_User_Order与T_Merchants_Order主键一至SequenceId全局唯一标识
     * T_Order.OrderId
     */
    private Long orderId;

    /**
     * 商户标识
     * T_Order.MerchantsId
     */
    private Long merchantsId;

    /**
     * 用户标识
     * T_Order.UserId
     */
    private Long userId;

    /**
     * 用户真实姓名
     * T_Order.UserName
     */
    private String userName;

    /**
     * 用户身份证号
     * T_Order.UserIdentifyNo
     */
    private String userIdentifyNo;

    /**
     * 订单号系统唯一
     * T_Order.OrderNo
     */
    private String orderNo;

    /**
     * 订单金额
     * T_Order.OrderAmount
     */
    private BigDecimal orderAmount;

    /**
     * 免息期
     * T_Order.InterestFreePeriod
     */
    private Integer interestFreePeriod;

    /**
     * 红包支付（包含首单、商户红包等）金额
     * T_Order.BonusPayAmount
     */
    private BigDecimal bonusPayAmount;

    /**
     * 信用付（人品付）金额
     * T_Order.CreditPayAmount
     */
    private BigDecimal creditPayAmount;

    /**
     * 订单状态@see OrderStatusEnum
     * T_Order.OrderStatus
     */
    private Integer orderStatus;

    /**
     * 订单创建时的商户的基站定位
     * T_Order.MerchantsLoactionInfo
     */
    private String merchantsLoactionInfo;

    /**
     * 订单创建时的基站定位
     * T_Order.UserLocationInfo
     */
    private String userLocationInfo;

    /**
     * 用户账单是否已经查看过
     * T_Order.IsReaded
     */
    private Boolean isReaded;

    /**
     * 创建时间
     * T_Order.CreateTime
     */
    private Date createTime;

    /**
     * 最后修改时间
     * T_Order.LastModifyTime
     */
    private Date lastModifyTime;

    /**
     * 初始化实体对象 主键列不初始化
     */
    public void initWithDefaultValue() {
        this.merchantsId = 0L;
        this.userId = 0L;
        this.userName = StringUtils.EMPTY;
        this.userIdentifyNo = StringUtils.EMPTY;
        this.orderNo = StringUtils.EMPTY;
        this.orderAmount = BigDecimal.ZERO;
        this.interestFreePeriod = 0;
        this.bonusPayAmount = BigDecimal.ZERO;
        this.creditPayAmount = BigDecimal.ZERO;
        this.orderStatus = 0;
        this.merchantsLoactionInfo = StringUtils.EMPTY;
        this.userLocationInfo = StringUtils.EMPTY;
        this.isReaded = Boolean.FALSE;
        this.createTime = new Date();
        this.lastModifyTime = new Date();
    }

    /**
     * 订单标识，T_User_Order与T_Merchants_Order主键一至SequenceId全局唯一标识
     * T_Order.OrderId
     *
     * @return the value of T_Order.OrderId
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 订单标识，T_User_Order与T_Merchants_Order主键一至SequenceId全局唯一标识
     * T_Order.OrderId
     *
     * @param orderId the value for T_Order.OrderId
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 商户标识
     * T_Order.MerchantsId
     *
     * @return the value of T_Order.MerchantsId
     */
    public Long getMerchantsId() {
        return merchantsId;
    }

    /**
     * 商户标识
     * T_Order.MerchantsId
     *
     * @param merchantsId the value for T_Order.MerchantsId
     */
    public void setMerchantsId(Long merchantsId) {
        this.merchantsId = merchantsId;
    }

    /**
     * 用户标识
     * T_Order.UserId
     *
     * @return the value of T_Order.UserId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户标识
     * T_Order.UserId
     *
     * @param userId the value for T_Order.UserId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 用户真实姓名
     * T_Order.UserName
     *
     * @return the value of T_Order.UserName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户真实姓名
     * T_Order.UserName
     *
     * @param userName the value for T_Order.UserName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 用户身份证号
     * T_Order.UserIdentifyNo
     *
     * @return the value of T_Order.UserIdentifyNo
     */
    public String getUserIdentifyNo() {
        return userIdentifyNo;
    }

    /**
     * 用户身份证号
     * T_Order.UserIdentifyNo
     *
     * @param userIdentifyNo the value for T_Order.UserIdentifyNo
     */
    public void setUserIdentifyNo(String userIdentifyNo) {
        this.userIdentifyNo = userIdentifyNo;
    }

    /**
     * 订单号系统唯一
     * T_Order.OrderNo
     *
     * @return the value of T_Order.OrderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 订单号系统唯一
     * T_Order.OrderNo
     *
     * @param orderNo the value for T_Order.OrderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 订单金额
     * T_Order.OrderAmount
     *
     * @return the value of T_Order.OrderAmount
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * 订单金额
     * T_Order.OrderAmount
     *
     * @param orderAmount the value for T_Order.OrderAmount
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 免息期
     * T_Order.InterestFreePeriod
     *
     * @return the value of T_Order.InterestFreePeriod
     */
    public Integer getInterestFreePeriod() {
        return interestFreePeriod;
    }

    /**
     * 免息期
     * T_Order.InterestFreePeriod
     *
     * @param interestFreePeriod the value for T_Order.InterestFreePeriod
     */
    public void setInterestFreePeriod(Integer interestFreePeriod) {
        this.interestFreePeriod = interestFreePeriod;
    }

    /**
     * 红包支付（包含首单、商户红包等）金额
     * T_Order.BonusPayAmount
     *
     * @return the value of T_Order.BonusPayAmount
     */
    public BigDecimal getBonusPayAmount() {
        return bonusPayAmount;
    }

    /**
     * 红包支付（包含首单、商户红包等）金额
     * T_Order.BonusPayAmount
     *
     * @param bonusPayAmount the value for T_Order.BonusPayAmount
     */
    public void setBonusPayAmount(BigDecimal bonusPayAmount) {
        this.bonusPayAmount = bonusPayAmount;
    }

    /**
     * 信用付（人品付）金额
     * T_Order.CreditPayAmount
     *
     * @return the value of T_Order.CreditPayAmount
     */
    public BigDecimal getCreditPayAmount() {
        return creditPayAmount;
    }

    /**
     * 信用付（人品付）金额
     * T_Order.CreditPayAmount
     *
     * @param creditPayAmount the value for T_Order.CreditPayAmount
     */
    public void setCreditPayAmount(BigDecimal creditPayAmount) {
        this.creditPayAmount = creditPayAmount;
    }

    /**
     * 订单状态@see OrderStatusEnum
     * T_Order.OrderStatus
     *
     * @return the value of T_Order.OrderStatus
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 订单状态@see OrderStatusEnum
     * T_Order.OrderStatus
     *
     * @param orderStatus the value for T_Order.OrderStatus
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 订单创建时的商户的基站定位
     * T_Order.MerchantsLoactionInfo
     *
     * @return the value of T_Order.MerchantsLoactionInfo
     */
    public String getMerchantsLoactionInfo() {
        return merchantsLoactionInfo;
    }

    /**
     * 订单创建时的商户的基站定位
     * T_Order.MerchantsLoactionInfo
     *
     * @param merchantsLoactionInfo the value for T_Order.MerchantsLoactionInfo
     */
    public void setMerchantsLoactionInfo(String merchantsLoactionInfo) {
        this.merchantsLoactionInfo = merchantsLoactionInfo;
    }

    /**
     * 订单创建时的基站定位
     * T_Order.UserLocationInfo
     *
     * @return the value of T_Order.UserLocationInfo
     */
    public String getUserLocationInfo() {
        return userLocationInfo;
    }

    /**
     * 订单创建时的基站定位
     * T_Order.UserLocationInfo
     *
     * @param userLocationInfo the value for T_Order.UserLocationInfo
     */
    public void setUserLocationInfo(String userLocationInfo) {
        this.userLocationInfo = userLocationInfo;
    }

    /**
     * 用户账单是否已经查看过
     * T_Order.IsReaded
     *
     * @return the value of T_Order.IsReaded
     */
    public Boolean getIsReaded() {
        return isReaded;
    }

    /**
     * 用户账单是否已经查看过
     * T_Order.IsReaded
     *
     * @param isReaded the value for T_Order.IsReaded
     */
    public void setIsReaded(Boolean isReaded) {
        this.isReaded = isReaded;
    }

    /**
     * 创建时间
     * T_Order.CreateTime
     *
     * @return the value of T_Order.CreateTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * T_Order.CreateTime
     *
     * @param createTime the value for T_Order.CreateTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后修改时间
     * T_Order.LastModifyTime
     *
     * @return the value of T_Order.LastModifyTime
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 最后修改时间
     * T_Order.LastModifyTime
     *
     * @param lastModifyTime the value for T_Order.LastModifyTime
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}