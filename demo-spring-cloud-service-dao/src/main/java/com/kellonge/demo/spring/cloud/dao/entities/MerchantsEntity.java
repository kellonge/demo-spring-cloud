package com.kellonge.demo.spring.cloud.dao.entities;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

/**
 * 商户记录
 * T_Merchants
 */
public class MerchantsEntity {
    /**
     * 商户标识 同步UserId
     * T_Merchants.MerchantsId
     */
    private Long merchantsId;

    /**
     * 商户名称
     * T_Merchants.MerchantsName
     */
    private String merchantsName;

    /**
     * 商户简称
     * T_Merchants.MerchantsAlias
     */
    private String merchantsAlias;

    /**
     * 商户电话
     * T_Merchants.MerchantsTel
     */
    private String merchantsTel;

    /**
     * 商户类型 @see MerchantsClassEntity
     * T_Merchants.MerchantsClassId
     */
    private Long merchantsClassId;

    /**
     * 所在省
     * T_Merchants.MerchantsProvince
     */
    private String merchantsProvince;

    /**
     * 所在市
     * T_Merchants.MerchantsCity
     */
    private String merchantsCity;

    /**
     * 商户地址
     * T_Merchants.MerchantsAddr
     */
    private String merchantsAddr;

    /**
     * 定位信息（基站或GPS的json格式）
     * T_Merchants.LocationInfo
     */
    private String locationInfo;

    /**
     * 法人姓名
     * T_Merchants.LegalPersonName
     */
    private String legalPersonName;

    /**
     * 法人手机号
     * T_Merchants.LegalPersonMobile
     */
    private String legalPersonMobile;

    /**
     * 联系人名称
     * T_Merchants.ContactName
     */
    private String contactName;

    /**
     * 联系人电话
     * T_Merchants.ContactMobile
     */
    private String contactMobile;

    /**
     * 是否是担保商户
     * T_Merchants.IsGuarantee
     */
    private Boolean isGuarantee;

    /**
     * 是否冻结
     * T_Merchants.IsFreezed
     */
    private Boolean isFreezed;

    /**
     * 冻结原因
     * T_Merchants.FreezedReason
     */
    private String freezedReason;

    /**
     * 客户经理
     * T_Merchants.CustomerManager
     */
    private Long customerManager;

    /**
     * 状态@see MerchantsStatusEnum 1未审核 2审核中 4审核通过 8审核未通过
     * T_Merchants.Status
     */
    private Integer status;

    /**
     * 创建时间
     * T_Merchants.CreateTime
     */
    private Date createTime;

    /**
     * 修改时间
     * T_Merchants.LastModifyTime
     */
    private Date lastModifyTime;

    /**
     * 初始化实体对象 主键列不初始化
     */
    public void initWithDefaultValue() {
        this.merchantsName = StringUtils.EMPTY;
        this.merchantsAlias = StringUtils.EMPTY;
        this.merchantsTel = StringUtils.EMPTY;
        this.merchantsClassId = 0L;
        this.merchantsProvince = StringUtils.EMPTY;
        this.merchantsCity = StringUtils.EMPTY;
        this.merchantsAddr = StringUtils.EMPTY;
        this.locationInfo = StringUtils.EMPTY;
        this.legalPersonName = StringUtils.EMPTY;
        this.legalPersonMobile = StringUtils.EMPTY;
        this.contactName = StringUtils.EMPTY;
        this.contactMobile = StringUtils.EMPTY;
        this.isGuarantee = Boolean.FALSE;
        this.isFreezed = Boolean.FALSE;
        this.freezedReason = StringUtils.EMPTY;
        this.customerManager = 0L;
        this.status = 0;
        this.createTime = new Date();
        this.lastModifyTime = new Date();
    }

    /**
     * 商户标识 同步UserId
     * T_Merchants.MerchantsId
     *
     * @return the value of T_Merchants.MerchantsId
     */
    public Long getMerchantsId() {
        return merchantsId;
    }

    /**
     * 商户标识 同步UserId
     * T_Merchants.MerchantsId
     *
     * @param merchantsId the value for T_Merchants.MerchantsId
     */
    public void setMerchantsId(Long merchantsId) {
        this.merchantsId = merchantsId;
    }

    /**
     * 商户名称
     * T_Merchants.MerchantsName
     *
     * @return the value of T_Merchants.MerchantsName
     */
    public String getMerchantsName() {
        return merchantsName;
    }

    /**
     * 商户名称
     * T_Merchants.MerchantsName
     *
     * @param merchantsName the value for T_Merchants.MerchantsName
     */
    public void setMerchantsName(String merchantsName) {
        this.merchantsName = merchantsName;
    }

    /**
     * 商户简称
     * T_Merchants.MerchantsAlias
     *
     * @return the value of T_Merchants.MerchantsAlias
     */
    public String getMerchantsAlias() {
        return merchantsAlias;
    }

    /**
     * 商户简称
     * T_Merchants.MerchantsAlias
     *
     * @param merchantsAlias the value for T_Merchants.MerchantsAlias
     */
    public void setMerchantsAlias(String merchantsAlias) {
        this.merchantsAlias = merchantsAlias;
    }

    /**
     * 商户电话
     * T_Merchants.MerchantsTel
     *
     * @return the value of T_Merchants.MerchantsTel
     */
    public String getMerchantsTel() {
        return merchantsTel;
    }

    /**
     * 商户电话
     * T_Merchants.MerchantsTel
     *
     * @param merchantsTel the value for T_Merchants.MerchantsTel
     */
    public void setMerchantsTel(String merchantsTel) {
        this.merchantsTel = merchantsTel;
    }

    /**
     * 商户类型 @see MerchantsClassEntity
     * T_Merchants.MerchantsClassId
     *
     * @return the value of T_Merchants.MerchantsClassId
     */
    public Long getMerchantsClassId() {
        return merchantsClassId;
    }

    /**
     * 商户类型 @see MerchantsClassEntity
     * T_Merchants.MerchantsClassId
     *
     * @param merchantsClassId the value for T_Merchants.MerchantsClassId
     */
    public void setMerchantsClassId(Long merchantsClassId) {
        this.merchantsClassId = merchantsClassId;
    }

    /**
     * 所在省
     * T_Merchants.MerchantsProvince
     *
     * @return the value of T_Merchants.MerchantsProvince
     */
    public String getMerchantsProvince() {
        return merchantsProvince;
    }

    /**
     * 所在省
     * T_Merchants.MerchantsProvince
     *
     * @param merchantsProvince the value for T_Merchants.MerchantsProvince
     */
    public void setMerchantsProvince(String merchantsProvince) {
        this.merchantsProvince = merchantsProvince;
    }

    /**
     * 所在市
     * T_Merchants.MerchantsCity
     *
     * @return the value of T_Merchants.MerchantsCity
     */
    public String getMerchantsCity() {
        return merchantsCity;
    }

    /**
     * 所在市
     * T_Merchants.MerchantsCity
     *
     * @param merchantsCity the value for T_Merchants.MerchantsCity
     */
    public void setMerchantsCity(String merchantsCity) {
        this.merchantsCity = merchantsCity;
    }

    /**
     * 商户地址
     * T_Merchants.MerchantsAddr
     *
     * @return the value of T_Merchants.MerchantsAddr
     */
    public String getMerchantsAddr() {
        return merchantsAddr;
    }

    /**
     * 商户地址
     * T_Merchants.MerchantsAddr
     *
     * @param merchantsAddr the value for T_Merchants.MerchantsAddr
     */
    public void setMerchantsAddr(String merchantsAddr) {
        this.merchantsAddr = merchantsAddr;
    }

    /**
     * 定位信息（基站或GPS的json格式）
     * T_Merchants.LocationInfo
     *
     * @return the value of T_Merchants.LocationInfo
     */
    public String getLocationInfo() {
        return locationInfo;
    }

    /**
     * 定位信息（基站或GPS的json格式）
     * T_Merchants.LocationInfo
     *
     * @param locationInfo the value for T_Merchants.LocationInfo
     */
    public void setLocationInfo(String locationInfo) {
        this.locationInfo = locationInfo;
    }

    /**
     * 法人姓名
     * T_Merchants.LegalPersonName
     *
     * @return the value of T_Merchants.LegalPersonName
     */
    public String getLegalPersonName() {
        return legalPersonName;
    }

    /**
     * 法人姓名
     * T_Merchants.LegalPersonName
     *
     * @param legalPersonName the value for T_Merchants.LegalPersonName
     */
    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
    }

    /**
     * 法人手机号
     * T_Merchants.LegalPersonMobile
     *
     * @return the value of T_Merchants.LegalPersonMobile
     */
    public String getLegalPersonMobile() {
        return legalPersonMobile;
    }

    /**
     * 法人手机号
     * T_Merchants.LegalPersonMobile
     *
     * @param legalPersonMobile the value for T_Merchants.LegalPersonMobile
     */
    public void setLegalPersonMobile(String legalPersonMobile) {
        this.legalPersonMobile = legalPersonMobile;
    }

    /**
     * 联系人名称
     * T_Merchants.ContactName
     *
     * @return the value of T_Merchants.ContactName
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 联系人名称
     * T_Merchants.ContactName
     *
     * @param contactName the value for T_Merchants.ContactName
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * 联系人电话
     * T_Merchants.ContactMobile
     *
     * @return the value of T_Merchants.ContactMobile
     */
    public String getContactMobile() {
        return contactMobile;
    }

    /**
     * 联系人电话
     * T_Merchants.ContactMobile
     *
     * @param contactMobile the value for T_Merchants.ContactMobile
     */
    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    /**
     * 是否是担保商户
     * T_Merchants.IsGuarantee
     *
     * @return the value of T_Merchants.IsGuarantee
     */
    public Boolean getIsGuarantee() {
        return isGuarantee;
    }

    /**
     * 是否是担保商户
     * T_Merchants.IsGuarantee
     *
     * @param isGuarantee the value for T_Merchants.IsGuarantee
     */
    public void setIsGuarantee(Boolean isGuarantee) {
        this.isGuarantee = isGuarantee;
    }

    /**
     * 是否冻结
     * T_Merchants.IsFreezed
     *
     * @return the value of T_Merchants.IsFreezed
     */
    public Boolean getIsFreezed() {
        return isFreezed;
    }

    /**
     * 是否冻结
     * T_Merchants.IsFreezed
     *
     * @param isFreezed the value for T_Merchants.IsFreezed
     */
    public void setIsFreezed(Boolean isFreezed) {
        this.isFreezed = isFreezed;
    }

    /**
     * 冻结原因
     * T_Merchants.FreezedReason
     *
     * @return the value of T_Merchants.FreezedReason
     */
    public String getFreezedReason() {
        return freezedReason;
    }

    /**
     * 冻结原因
     * T_Merchants.FreezedReason
     *
     * @param freezedReason the value for T_Merchants.FreezedReason
     */
    public void setFreezedReason(String freezedReason) {
        this.freezedReason = freezedReason;
    }

    /**
     * 客户经理
     * T_Merchants.CustomerManager
     *
     * @return the value of T_Merchants.CustomerManager
     */
    public Long getCustomerManager() {
        return customerManager;
    }

    /**
     * 客户经理
     * T_Merchants.CustomerManager
     *
     * @param customerManager the value for T_Merchants.CustomerManager
     */
    public void setCustomerManager(Long customerManager) {
        this.customerManager = customerManager;
    }

    /**
     * 状态@see MerchantsStatusEnum 1未审核 2审核中 4审核通过 8审核未通过
     * T_Merchants.Status
     *
     * @return the value of T_Merchants.Status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态@see MerchantsStatusEnum 1未审核 2审核中 4审核通过 8审核未通过
     * T_Merchants.Status
     *
     * @param status the value for T_Merchants.Status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     * T_Merchants.CreateTime
     *
     * @return the value of T_Merchants.CreateTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * T_Merchants.CreateTime
     *
     * @param createTime the value for T_Merchants.CreateTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * T_Merchants.LastModifyTime
     *
     * @return the value of T_Merchants.LastModifyTime
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 修改时间
     * T_Merchants.LastModifyTime
     *
     * @param lastModifyTime the value for T_Merchants.LastModifyTime
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}