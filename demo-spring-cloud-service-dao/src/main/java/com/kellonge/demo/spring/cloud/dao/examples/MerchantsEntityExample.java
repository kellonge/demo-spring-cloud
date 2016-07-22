package com.kellonge.demo.spring.cloud.dao.examples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * 商户记录
 * T_Merchants
 */
public class MerchantsEntityExample {
    /**
     * 顺序排序
     */
    public static final String ORDERBYDIRECTION_ASC = "asc";

    /**
     * 倒序排序
     */
    public static final String ORDERBYDIRECTION_DESC = "desc";

    /**
     * 商户标识 同步UserId
     */
    public static final String FIELD_MERCHANTSID = "MerchantsId";

    /**
     * 商户名称
     */
    public static final String FIELD_MERCHANTSNAME = "MerchantsName";

    /**
     * 商户简称
     */
    public static final String FIELD_MERCHANTSALIAS = "MerchantsAlias";

    /**
     * 商户电话
     */
    public static final String FIELD_MERCHANTSTEL = "MerchantsTel";

    /**
     * 商户类型 @see MerchantsClassEntity
     */
    public static final String FIELD_MERCHANTSCLASSID = "MerchantsClassId";

    /**
     * 所在省
     */
    public static final String FIELD_MERCHANTSPROVINCE = "MerchantsProvince";

    /**
     * 所在市
     */
    public static final String FIELD_MERCHANTSCITY = "MerchantsCity";

    /**
     * 商户地址
     */
    public static final String FIELD_MERCHANTSADDR = "MerchantsAddr";

    /**
     * 定位信息（基站或GPS的json格式）
     */
    public static final String FIELD_LOCATIONINFO = "LocationInfo";

    /**
     * 法人姓名
     */
    public static final String FIELD_LEGALPERSONNAME = "LegalPersonName";

    /**
     * 法人手机号
     */
    public static final String FIELD_LEGALPERSONMOBILE = "LegalPersonMobile";

    /**
     * 联系人名称
     */
    public static final String FIELD_CONTACTNAME = "ContactName";

    /**
     * 联系人电话
     */
    public static final String FIELD_CONTACTMOBILE = "ContactMobile";

    /**
     * 是否是担保商户
     */
    public static final String FIELD_ISGUARANTEE = "IsGuarantee";

    /**
     * 是否冻结
     */
    public static final String FIELD_ISFREEZED = "IsFreezed";

    /**
     * 冻结原因
     */
    public static final String FIELD_FREEZEDREASON = "FreezedReason";

    /**
     * 客户经理
     */
    public static final String FIELD_CUSTOMERMANAGER = "CustomerManager";

    /**
     * 状态@see MerchantsStatusEnum 1未审核 2审核中 4审核通过 8审核未通过
     */
    public static final String FIELD_STATUS = "Status";

    /**
     * 创建时间
     */
    public static final String FIELD_CREATETIME = "CreateTime";

    /**
     * 修改时间
     */
    public static final String FIELD_LASTMODIFYTIME = "LastModifyTime";

    /**
     * T_Merchants
     */
    protected Integer offset;

    /**
     * T_Merchants
     */
    protected Integer size;

    /**
     * T_Merchants
     */
    protected String orderByClause;

    /**
     * T_Merchants
     */
    protected boolean distinct;

    /**
     * T_Merchants
     */
    protected List<Criteria> oredCriteria;

    /**
     * T_Merchants
     */
    public MerchantsEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * T_Merchants
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * T_Merchants
     */
    public void setOrderByClause(OrderBy orderBy) {
        this.orderByClause = orderBy.toString();
    }

    /**
     * T_Merchants
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * T_Merchants
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * T_Merchants
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * T_Merchants
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * T_Merchants
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * T_Merchants
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * T_Merchants
     */
    public Integer getSize() {
        return size;
    }

    /**
     * T_Merchants
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * T_Merchants
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * T_Merchants
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * T_Merchants
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * T_Merchants
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * T_Merchants
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 商户记录
     * T_Merchants
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property, boolean isBinary) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value, isBinary));
        }

        protected void addCriterion(String condition, Object value, String property) {
            addCriterion(condition, value, property, false);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property, boolean isBinary) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2, isBinary));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            addCriterion(condition, value1, value2, property, false);
        }

        /**
         * 商户标识 同步UserId
         */
        public Criteria andMerchantsIdIsNull() {
            addCriterion("MerchantsId is null");
            return (Criteria) this;
        }

        /**
         * 商户标识 同步UserId
         */
        public Criteria andMerchantsIdIsNotNull() {
            addCriterion("MerchantsId is not null");
            return (Criteria) this;
        }

        /**
         * 商户标识 同步UserId
         */
        public Criteria andMerchantsIdEqualTo(Long value) {
            addCriterion("MerchantsId =", value, "merchantsId", false);
            return (Criteria) this;
        }

        /**
         * 商户标识 同步UserId
         */
        public Criteria andMerchantsIdNotEqualTo(Long value) {
            addCriterion("MerchantsId <>", value, "merchantsId", false);
            return (Criteria) this;
        }

        /**
         * 商户标识 同步UserId
         */
        public Criteria andMerchantsIdGreaterThan(Long value) {
            addCriterion("MerchantsId >", value, "merchantsId", false);
            return (Criteria) this;
        }

        /**
         * 商户标识 同步UserId
         */
        public Criteria andMerchantsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MerchantsId >=", value, "merchantsId", false);
            return (Criteria) this;
        }

        /**
         * 商户标识 同步UserId
         */
        public Criteria andMerchantsIdLessThan(Long value) {
            addCriterion("MerchantsId <", value, "merchantsId", false);
            return (Criteria) this;
        }

        /**
         * 商户标识 同步UserId
         */
        public Criteria andMerchantsIdLessThanOrEqualTo(Long value) {
            addCriterion("MerchantsId <=", value, "merchantsId", false);
            return (Criteria) this;
        }

        /**
         * 商户标识 同步UserId
         */
        public Criteria andMerchantsIdIn(List<Long> values) {
            addCriterion("MerchantsId in", values, "merchantsId", false);
            return (Criteria) this;
        }

        /**
         * 商户标识 同步UserId
         */
        public Criteria andMerchantsIdNotIn(List<Long> values) {
            addCriterion("MerchantsId not in", values, "merchantsId", false);
            return (Criteria) this;
        }

        /**
         * 商户标识 同步UserId
         */
        public Criteria andMerchantsIdBetween(Long value1, Long value2) {
            addCriterion("MerchantsId between", value1, value2, "merchantsId");
            return (Criteria) this;
        }

        /**
         * 商户标识 同步UserId
         */
        public Criteria andMerchantsIdNotBetween(Long value1, Long value2) {
            addCriterion("MerchantsId not between", value1, value2, "merchantsId");
            return (Criteria) this;
        }

        /**
         * 商户名称
         */
        public Criteria andMerchantsNameIsNull() {
            addCriterion("MerchantsName is null");
            return (Criteria) this;
        }

        /**
         * 商户名称
         */
        public Criteria andMerchantsNameIsNotNull() {
            addCriterion("MerchantsName is not null");
            return (Criteria) this;
        }

        /**
         * 商户名称
         */
        public Criteria andMerchantsNameEqualTo(String value) {
            addCriterion("MerchantsName =", value, "merchantsName", false);
            return (Criteria) this;
        }

        /**
         * 商户名称
         */
        public Criteria andMerchantsNameNotEqualTo(String value) {
            addCriterion("MerchantsName <>", value, "merchantsName", false);
            return (Criteria) this;
        }

        /**
         * 商户名称
         */
        public Criteria andMerchantsNameGreaterThan(String value) {
            addCriterion("MerchantsName >", value, "merchantsName", false);
            return (Criteria) this;
        }

        /**
         * 商户名称
         */
        public Criteria andMerchantsNameGreaterThanOrEqualTo(String value) {
            addCriterion("MerchantsName >=", value, "merchantsName", false);
            return (Criteria) this;
        }

        /**
         * 商户名称
         */
        public Criteria andMerchantsNameLessThan(String value) {
            addCriterion("MerchantsName <", value, "merchantsName", false);
            return (Criteria) this;
        }

        /**
         * 商户名称
         */
        public Criteria andMerchantsNameLessThanOrEqualTo(String value) {
            addCriterion("MerchantsName <=", value, "merchantsName", false);
            return (Criteria) this;
        }

        /**
         * 商户名称
         */
        public Criteria andMerchantsNameLike(String value) {
            addCriterion("MerchantsName like", value, "merchantsName", false);
            return (Criteria) this;
        }

        /**
         * 商户名称
         */
        public Criteria andMerchantsNameNotLike(String value) {
            addCriterion("MerchantsName not like", value, "merchantsName", false);
            return (Criteria) this;
        }

        /**
         * 商户名称
         */
        public Criteria andMerchantsNameIn(List<String> values) {
            addCriterion("MerchantsName in", values, "merchantsName", false);
            return (Criteria) this;
        }

        /**
         * 商户名称
         */
        public Criteria andMerchantsNameNotIn(List<String> values) {
            addCriterion("MerchantsName not in", values, "merchantsName", false);
            return (Criteria) this;
        }

        /**
         * 商户名称
         */
        public Criteria andMerchantsNameBetween(String value1, String value2) {
            addCriterion("MerchantsName between", value1, value2, "merchantsName");
            return (Criteria) this;
        }

        /**
         * 商户名称
         */
        public Criteria andMerchantsNameNotBetween(String value1, String value2) {
            addCriterion("MerchantsName not between", value1, value2, "merchantsName");
            return (Criteria) this;
        }

        /**
         * 商户简称
         */
        public Criteria andMerchantsAliasIsNull() {
            addCriterion("MerchantsAlias is null");
            return (Criteria) this;
        }

        /**
         * 商户简称
         */
        public Criteria andMerchantsAliasIsNotNull() {
            addCriterion("MerchantsAlias is not null");
            return (Criteria) this;
        }

        /**
         * 商户简称
         */
        public Criteria andMerchantsAliasEqualTo(String value) {
            addCriterion("MerchantsAlias =", value, "merchantsAlias", false);
            return (Criteria) this;
        }

        /**
         * 商户简称
         */
        public Criteria andMerchantsAliasNotEqualTo(String value) {
            addCriterion("MerchantsAlias <>", value, "merchantsAlias", false);
            return (Criteria) this;
        }

        /**
         * 商户简称
         */
        public Criteria andMerchantsAliasGreaterThan(String value) {
            addCriterion("MerchantsAlias >", value, "merchantsAlias", false);
            return (Criteria) this;
        }

        /**
         * 商户简称
         */
        public Criteria andMerchantsAliasGreaterThanOrEqualTo(String value) {
            addCriterion("MerchantsAlias >=", value, "merchantsAlias", false);
            return (Criteria) this;
        }

        /**
         * 商户简称
         */
        public Criteria andMerchantsAliasLessThan(String value) {
            addCriterion("MerchantsAlias <", value, "merchantsAlias", false);
            return (Criteria) this;
        }

        /**
         * 商户简称
         */
        public Criteria andMerchantsAliasLessThanOrEqualTo(String value) {
            addCriterion("MerchantsAlias <=", value, "merchantsAlias", false);
            return (Criteria) this;
        }

        /**
         * 商户简称
         */
        public Criteria andMerchantsAliasLike(String value) {
            addCriterion("MerchantsAlias like", value, "merchantsAlias", false);
            return (Criteria) this;
        }

        /**
         * 商户简称
         */
        public Criteria andMerchantsAliasNotLike(String value) {
            addCriterion("MerchantsAlias not like", value, "merchantsAlias", false);
            return (Criteria) this;
        }

        /**
         * 商户简称
         */
        public Criteria andMerchantsAliasIn(List<String> values) {
            addCriterion("MerchantsAlias in", values, "merchantsAlias", false);
            return (Criteria) this;
        }

        /**
         * 商户简称
         */
        public Criteria andMerchantsAliasNotIn(List<String> values) {
            addCriterion("MerchantsAlias not in", values, "merchantsAlias", false);
            return (Criteria) this;
        }

        /**
         * 商户简称
         */
        public Criteria andMerchantsAliasBetween(String value1, String value2) {
            addCriterion("MerchantsAlias between", value1, value2, "merchantsAlias");
            return (Criteria) this;
        }

        /**
         * 商户简称
         */
        public Criteria andMerchantsAliasNotBetween(String value1, String value2) {
            addCriterion("MerchantsAlias not between", value1, value2, "merchantsAlias");
            return (Criteria) this;
        }

        /**
         * 商户电话
         */
        public Criteria andMerchantsTelIsNull() {
            addCriterion("MerchantsTel is null");
            return (Criteria) this;
        }

        /**
         * 商户电话
         */
        public Criteria andMerchantsTelIsNotNull() {
            addCriterion("MerchantsTel is not null");
            return (Criteria) this;
        }

        /**
         * 商户电话
         */
        public Criteria andMerchantsTelEqualTo(String value) {
            addCriterion("MerchantsTel =", value, "merchantsTel", false);
            return (Criteria) this;
        }

        /**
         * 商户电话
         */
        public Criteria andMerchantsTelNotEqualTo(String value) {
            addCriterion("MerchantsTel <>", value, "merchantsTel", false);
            return (Criteria) this;
        }

        /**
         * 商户电话
         */
        public Criteria andMerchantsTelGreaterThan(String value) {
            addCriterion("MerchantsTel >", value, "merchantsTel", false);
            return (Criteria) this;
        }

        /**
         * 商户电话
         */
        public Criteria andMerchantsTelGreaterThanOrEqualTo(String value) {
            addCriterion("MerchantsTel >=", value, "merchantsTel", false);
            return (Criteria) this;
        }

        /**
         * 商户电话
         */
        public Criteria andMerchantsTelLessThan(String value) {
            addCriterion("MerchantsTel <", value, "merchantsTel", false);
            return (Criteria) this;
        }

        /**
         * 商户电话
         */
        public Criteria andMerchantsTelLessThanOrEqualTo(String value) {
            addCriterion("MerchantsTel <=", value, "merchantsTel", false);
            return (Criteria) this;
        }

        /**
         * 商户电话
         */
        public Criteria andMerchantsTelLike(String value) {
            addCriterion("MerchantsTel like", value, "merchantsTel", false);
            return (Criteria) this;
        }

        /**
         * 商户电话
         */
        public Criteria andMerchantsTelNotLike(String value) {
            addCriterion("MerchantsTel not like", value, "merchantsTel", false);
            return (Criteria) this;
        }

        /**
         * 商户电话
         */
        public Criteria andMerchantsTelIn(List<String> values) {
            addCriterion("MerchantsTel in", values, "merchantsTel", false);
            return (Criteria) this;
        }

        /**
         * 商户电话
         */
        public Criteria andMerchantsTelNotIn(List<String> values) {
            addCriterion("MerchantsTel not in", values, "merchantsTel", false);
            return (Criteria) this;
        }

        /**
         * 商户电话
         */
        public Criteria andMerchantsTelBetween(String value1, String value2) {
            addCriterion("MerchantsTel between", value1, value2, "merchantsTel");
            return (Criteria) this;
        }

        /**
         * 商户电话
         */
        public Criteria andMerchantsTelNotBetween(String value1, String value2) {
            addCriterion("MerchantsTel not between", value1, value2, "merchantsTel");
            return (Criteria) this;
        }

        /**
         * 商户类型 @see MerchantsClassEntity
         */
        public Criteria andMerchantsClassIdIsNull() {
            addCriterion("MerchantsClassId is null");
            return (Criteria) this;
        }

        /**
         * 商户类型 @see MerchantsClassEntity
         */
        public Criteria andMerchantsClassIdIsNotNull() {
            addCriterion("MerchantsClassId is not null");
            return (Criteria) this;
        }

        /**
         * 商户类型 @see MerchantsClassEntity
         */
        public Criteria andMerchantsClassIdEqualTo(Long value) {
            addCriterion("MerchantsClassId =", value, "merchantsClassId", false);
            return (Criteria) this;
        }

        /**
         * 商户类型 @see MerchantsClassEntity
         */
        public Criteria andMerchantsClassIdNotEqualTo(Long value) {
            addCriterion("MerchantsClassId <>", value, "merchantsClassId", false);
            return (Criteria) this;
        }

        /**
         * 商户类型 @see MerchantsClassEntity
         */
        public Criteria andMerchantsClassIdGreaterThan(Long value) {
            addCriterion("MerchantsClassId >", value, "merchantsClassId", false);
            return (Criteria) this;
        }

        /**
         * 商户类型 @see MerchantsClassEntity
         */
        public Criteria andMerchantsClassIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MerchantsClassId >=", value, "merchantsClassId", false);
            return (Criteria) this;
        }

        /**
         * 商户类型 @see MerchantsClassEntity
         */
        public Criteria andMerchantsClassIdLessThan(Long value) {
            addCriterion("MerchantsClassId <", value, "merchantsClassId", false);
            return (Criteria) this;
        }

        /**
         * 商户类型 @see MerchantsClassEntity
         */
        public Criteria andMerchantsClassIdLessThanOrEqualTo(Long value) {
            addCriterion("MerchantsClassId <=", value, "merchantsClassId", false);
            return (Criteria) this;
        }

        /**
         * 商户类型 @see MerchantsClassEntity
         */
        public Criteria andMerchantsClassIdIn(List<Long> values) {
            addCriterion("MerchantsClassId in", values, "merchantsClassId", false);
            return (Criteria) this;
        }

        /**
         * 商户类型 @see MerchantsClassEntity
         */
        public Criteria andMerchantsClassIdNotIn(List<Long> values) {
            addCriterion("MerchantsClassId not in", values, "merchantsClassId", false);
            return (Criteria) this;
        }

        /**
         * 商户类型 @see MerchantsClassEntity
         */
        public Criteria andMerchantsClassIdBetween(Long value1, Long value2) {
            addCriterion("MerchantsClassId between", value1, value2, "merchantsClassId");
            return (Criteria) this;
        }

        /**
         * 商户类型 @see MerchantsClassEntity
         */
        public Criteria andMerchantsClassIdNotBetween(Long value1, Long value2) {
            addCriterion("MerchantsClassId not between", value1, value2, "merchantsClassId");
            return (Criteria) this;
        }

        /**
         * 所在省
         */
        public Criteria andMerchantsProvinceIsNull() {
            addCriterion("MerchantsProvince is null");
            return (Criteria) this;
        }

        /**
         * 所在省
         */
        public Criteria andMerchantsProvinceIsNotNull() {
            addCriterion("MerchantsProvince is not null");
            return (Criteria) this;
        }

        /**
         * 所在省
         */
        public Criteria andMerchantsProvinceEqualTo(String value) {
            addCriterion("MerchantsProvince =", value, "merchantsProvince", false);
            return (Criteria) this;
        }

        /**
         * 所在省
         */
        public Criteria andMerchantsProvinceNotEqualTo(String value) {
            addCriterion("MerchantsProvince <>", value, "merchantsProvince", false);
            return (Criteria) this;
        }

        /**
         * 所在省
         */
        public Criteria andMerchantsProvinceGreaterThan(String value) {
            addCriterion("MerchantsProvince >", value, "merchantsProvince", false);
            return (Criteria) this;
        }

        /**
         * 所在省
         */
        public Criteria andMerchantsProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("MerchantsProvince >=", value, "merchantsProvince", false);
            return (Criteria) this;
        }

        /**
         * 所在省
         */
        public Criteria andMerchantsProvinceLessThan(String value) {
            addCriterion("MerchantsProvince <", value, "merchantsProvince", false);
            return (Criteria) this;
        }

        /**
         * 所在省
         */
        public Criteria andMerchantsProvinceLessThanOrEqualTo(String value) {
            addCriterion("MerchantsProvince <=", value, "merchantsProvince", false);
            return (Criteria) this;
        }

        /**
         * 所在省
         */
        public Criteria andMerchantsProvinceLike(String value) {
            addCriterion("MerchantsProvince like", value, "merchantsProvince", false);
            return (Criteria) this;
        }

        /**
         * 所在省
         */
        public Criteria andMerchantsProvinceNotLike(String value) {
            addCriterion("MerchantsProvince not like", value, "merchantsProvince", false);
            return (Criteria) this;
        }

        /**
         * 所在省
         */
        public Criteria andMerchantsProvinceIn(List<String> values) {
            addCriterion("MerchantsProvince in", values, "merchantsProvince", false);
            return (Criteria) this;
        }

        /**
         * 所在省
         */
        public Criteria andMerchantsProvinceNotIn(List<String> values) {
            addCriterion("MerchantsProvince not in", values, "merchantsProvince", false);
            return (Criteria) this;
        }

        /**
         * 所在省
         */
        public Criteria andMerchantsProvinceBetween(String value1, String value2) {
            addCriterion("MerchantsProvince between", value1, value2, "merchantsProvince");
            return (Criteria) this;
        }

        /**
         * 所在省
         */
        public Criteria andMerchantsProvinceNotBetween(String value1, String value2) {
            addCriterion("MerchantsProvince not between", value1, value2, "merchantsProvince");
            return (Criteria) this;
        }

        /**
         * 所在市
         */
        public Criteria andMerchantsCityIsNull() {
            addCriterion("MerchantsCity is null");
            return (Criteria) this;
        }

        /**
         * 所在市
         */
        public Criteria andMerchantsCityIsNotNull() {
            addCriterion("MerchantsCity is not null");
            return (Criteria) this;
        }

        /**
         * 所在市
         */
        public Criteria andMerchantsCityEqualTo(String value) {
            addCriterion("MerchantsCity =", value, "merchantsCity", false);
            return (Criteria) this;
        }

        /**
         * 所在市
         */
        public Criteria andMerchantsCityNotEqualTo(String value) {
            addCriterion("MerchantsCity <>", value, "merchantsCity", false);
            return (Criteria) this;
        }

        /**
         * 所在市
         */
        public Criteria andMerchantsCityGreaterThan(String value) {
            addCriterion("MerchantsCity >", value, "merchantsCity", false);
            return (Criteria) this;
        }

        /**
         * 所在市
         */
        public Criteria andMerchantsCityGreaterThanOrEqualTo(String value) {
            addCriterion("MerchantsCity >=", value, "merchantsCity", false);
            return (Criteria) this;
        }

        /**
         * 所在市
         */
        public Criteria andMerchantsCityLessThan(String value) {
            addCriterion("MerchantsCity <", value, "merchantsCity", false);
            return (Criteria) this;
        }

        /**
         * 所在市
         */
        public Criteria andMerchantsCityLessThanOrEqualTo(String value) {
            addCriterion("MerchantsCity <=", value, "merchantsCity", false);
            return (Criteria) this;
        }

        /**
         * 所在市
         */
        public Criteria andMerchantsCityLike(String value) {
            addCriterion("MerchantsCity like", value, "merchantsCity", false);
            return (Criteria) this;
        }

        /**
         * 所在市
         */
        public Criteria andMerchantsCityNotLike(String value) {
            addCriterion("MerchantsCity not like", value, "merchantsCity", false);
            return (Criteria) this;
        }

        /**
         * 所在市
         */
        public Criteria andMerchantsCityIn(List<String> values) {
            addCriterion("MerchantsCity in", values, "merchantsCity", false);
            return (Criteria) this;
        }

        /**
         * 所在市
         */
        public Criteria andMerchantsCityNotIn(List<String> values) {
            addCriterion("MerchantsCity not in", values, "merchantsCity", false);
            return (Criteria) this;
        }

        /**
         * 所在市
         */
        public Criteria andMerchantsCityBetween(String value1, String value2) {
            addCriterion("MerchantsCity between", value1, value2, "merchantsCity");
            return (Criteria) this;
        }

        /**
         * 所在市
         */
        public Criteria andMerchantsCityNotBetween(String value1, String value2) {
            addCriterion("MerchantsCity not between", value1, value2, "merchantsCity");
            return (Criteria) this;
        }

        /**
         * 商户地址
         */
        public Criteria andMerchantsAddrIsNull() {
            addCriterion("MerchantsAddr is null");
            return (Criteria) this;
        }

        /**
         * 商户地址
         */
        public Criteria andMerchantsAddrIsNotNull() {
            addCriterion("MerchantsAddr is not null");
            return (Criteria) this;
        }

        /**
         * 商户地址
         */
        public Criteria andMerchantsAddrEqualTo(String value) {
            addCriterion("MerchantsAddr =", value, "merchantsAddr", false);
            return (Criteria) this;
        }

        /**
         * 商户地址
         */
        public Criteria andMerchantsAddrNotEqualTo(String value) {
            addCriterion("MerchantsAddr <>", value, "merchantsAddr", false);
            return (Criteria) this;
        }

        /**
         * 商户地址
         */
        public Criteria andMerchantsAddrGreaterThan(String value) {
            addCriterion("MerchantsAddr >", value, "merchantsAddr", false);
            return (Criteria) this;
        }

        /**
         * 商户地址
         */
        public Criteria andMerchantsAddrGreaterThanOrEqualTo(String value) {
            addCriterion("MerchantsAddr >=", value, "merchantsAddr", false);
            return (Criteria) this;
        }

        /**
         * 商户地址
         */
        public Criteria andMerchantsAddrLessThan(String value) {
            addCriterion("MerchantsAddr <", value, "merchantsAddr", false);
            return (Criteria) this;
        }

        /**
         * 商户地址
         */
        public Criteria andMerchantsAddrLessThanOrEqualTo(String value) {
            addCriterion("MerchantsAddr <=", value, "merchantsAddr", false);
            return (Criteria) this;
        }

        /**
         * 商户地址
         */
        public Criteria andMerchantsAddrLike(String value) {
            addCriterion("MerchantsAddr like", value, "merchantsAddr", false);
            return (Criteria) this;
        }

        /**
         * 商户地址
         */
        public Criteria andMerchantsAddrNotLike(String value) {
            addCriterion("MerchantsAddr not like", value, "merchantsAddr", false);
            return (Criteria) this;
        }

        /**
         * 商户地址
         */
        public Criteria andMerchantsAddrIn(List<String> values) {
            addCriterion("MerchantsAddr in", values, "merchantsAddr", false);
            return (Criteria) this;
        }

        /**
         * 商户地址
         */
        public Criteria andMerchantsAddrNotIn(List<String> values) {
            addCriterion("MerchantsAddr not in", values, "merchantsAddr", false);
            return (Criteria) this;
        }

        /**
         * 商户地址
         */
        public Criteria andMerchantsAddrBetween(String value1, String value2) {
            addCriterion("MerchantsAddr between", value1, value2, "merchantsAddr");
            return (Criteria) this;
        }

        /**
         * 商户地址
         */
        public Criteria andMerchantsAddrNotBetween(String value1, String value2) {
            addCriterion("MerchantsAddr not between", value1, value2, "merchantsAddr");
            return (Criteria) this;
        }

        /**
         * 定位信息（基站或GPS的json格式）
         */
        public Criteria andLocationInfoIsNull() {
            addCriterion("LocationInfo is null");
            return (Criteria) this;
        }

        /**
         * 定位信息（基站或GPS的json格式）
         */
        public Criteria andLocationInfoIsNotNull() {
            addCriterion("LocationInfo is not null");
            return (Criteria) this;
        }

        /**
         * 定位信息（基站或GPS的json格式）
         */
        public Criteria andLocationInfoEqualTo(String value) {
            addCriterion("LocationInfo =", value, "locationInfo", false);
            return (Criteria) this;
        }

        /**
         * 定位信息（基站或GPS的json格式）
         */
        public Criteria andLocationInfoNotEqualTo(String value) {
            addCriterion("LocationInfo <>", value, "locationInfo", false);
            return (Criteria) this;
        }

        /**
         * 定位信息（基站或GPS的json格式）
         */
        public Criteria andLocationInfoGreaterThan(String value) {
            addCriterion("LocationInfo >", value, "locationInfo", false);
            return (Criteria) this;
        }

        /**
         * 定位信息（基站或GPS的json格式）
         */
        public Criteria andLocationInfoGreaterThanOrEqualTo(String value) {
            addCriterion("LocationInfo >=", value, "locationInfo", false);
            return (Criteria) this;
        }

        /**
         * 定位信息（基站或GPS的json格式）
         */
        public Criteria andLocationInfoLessThan(String value) {
            addCriterion("LocationInfo <", value, "locationInfo", false);
            return (Criteria) this;
        }

        /**
         * 定位信息（基站或GPS的json格式）
         */
        public Criteria andLocationInfoLessThanOrEqualTo(String value) {
            addCriterion("LocationInfo <=", value, "locationInfo", false);
            return (Criteria) this;
        }

        /**
         * 定位信息（基站或GPS的json格式）
         */
        public Criteria andLocationInfoLike(String value) {
            addCriterion("LocationInfo like", value, "locationInfo", false);
            return (Criteria) this;
        }

        /**
         * 定位信息（基站或GPS的json格式）
         */
        public Criteria andLocationInfoNotLike(String value) {
            addCriterion("LocationInfo not like", value, "locationInfo", false);
            return (Criteria) this;
        }

        /**
         * 定位信息（基站或GPS的json格式）
         */
        public Criteria andLocationInfoIn(List<String> values) {
            addCriterion("LocationInfo in", values, "locationInfo", false);
            return (Criteria) this;
        }

        /**
         * 定位信息（基站或GPS的json格式）
         */
        public Criteria andLocationInfoNotIn(List<String> values) {
            addCriterion("LocationInfo not in", values, "locationInfo", false);
            return (Criteria) this;
        }

        /**
         * 定位信息（基站或GPS的json格式）
         */
        public Criteria andLocationInfoBetween(String value1, String value2) {
            addCriterion("LocationInfo between", value1, value2, "locationInfo");
            return (Criteria) this;
        }

        /**
         * 定位信息（基站或GPS的json格式）
         */
        public Criteria andLocationInfoNotBetween(String value1, String value2) {
            addCriterion("LocationInfo not between", value1, value2, "locationInfo");
            return (Criteria) this;
        }

        /**
         * 法人姓名
         */
        public Criteria andLegalPersonNameIsNull() {
            addCriterion("LegalPersonName is null");
            return (Criteria) this;
        }

        /**
         * 法人姓名
         */
        public Criteria andLegalPersonNameIsNotNull() {
            addCriterion("LegalPersonName is not null");
            return (Criteria) this;
        }

        /**
         * 法人姓名
         */
        public Criteria andLegalPersonNameEqualTo(String value) {
            addCriterion("LegalPersonName =", value, "legalPersonName", false);
            return (Criteria) this;
        }

        /**
         * 法人姓名
         */
        public Criteria andLegalPersonNameNotEqualTo(String value) {
            addCriterion("LegalPersonName <>", value, "legalPersonName", false);
            return (Criteria) this;
        }

        /**
         * 法人姓名
         */
        public Criteria andLegalPersonNameGreaterThan(String value) {
            addCriterion("LegalPersonName >", value, "legalPersonName", false);
            return (Criteria) this;
        }

        /**
         * 法人姓名
         */
        public Criteria andLegalPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("LegalPersonName >=", value, "legalPersonName", false);
            return (Criteria) this;
        }

        /**
         * 法人姓名
         */
        public Criteria andLegalPersonNameLessThan(String value) {
            addCriterion("LegalPersonName <", value, "legalPersonName", false);
            return (Criteria) this;
        }

        /**
         * 法人姓名
         */
        public Criteria andLegalPersonNameLessThanOrEqualTo(String value) {
            addCriterion("LegalPersonName <=", value, "legalPersonName", false);
            return (Criteria) this;
        }

        /**
         * 法人姓名
         */
        public Criteria andLegalPersonNameLike(String value) {
            addCriterion("LegalPersonName like", value, "legalPersonName", false);
            return (Criteria) this;
        }

        /**
         * 法人姓名
         */
        public Criteria andLegalPersonNameNotLike(String value) {
            addCriterion("LegalPersonName not like", value, "legalPersonName", false);
            return (Criteria) this;
        }

        /**
         * 法人姓名
         */
        public Criteria andLegalPersonNameIn(List<String> values) {
            addCriterion("LegalPersonName in", values, "legalPersonName", false);
            return (Criteria) this;
        }

        /**
         * 法人姓名
         */
        public Criteria andLegalPersonNameNotIn(List<String> values) {
            addCriterion("LegalPersonName not in", values, "legalPersonName", false);
            return (Criteria) this;
        }

        /**
         * 法人姓名
         */
        public Criteria andLegalPersonNameBetween(String value1, String value2) {
            addCriterion("LegalPersonName between", value1, value2, "legalPersonName");
            return (Criteria) this;
        }

        /**
         * 法人姓名
         */
        public Criteria andLegalPersonNameNotBetween(String value1, String value2) {
            addCriterion("LegalPersonName not between", value1, value2, "legalPersonName");
            return (Criteria) this;
        }

        /**
         * 法人手机号
         */
        public Criteria andLegalPersonMobileIsNull() {
            addCriterion("LegalPersonMobile is null");
            return (Criteria) this;
        }

        /**
         * 法人手机号
         */
        public Criteria andLegalPersonMobileIsNotNull() {
            addCriterion("LegalPersonMobile is not null");
            return (Criteria) this;
        }

        /**
         * 法人手机号
         */
        public Criteria andLegalPersonMobileEqualTo(String value) {
            addCriterion("LegalPersonMobile =", value, "legalPersonMobile", false);
            return (Criteria) this;
        }

        /**
         * 法人手机号
         */
        public Criteria andLegalPersonMobileNotEqualTo(String value) {
            addCriterion("LegalPersonMobile <>", value, "legalPersonMobile", false);
            return (Criteria) this;
        }

        /**
         * 法人手机号
         */
        public Criteria andLegalPersonMobileGreaterThan(String value) {
            addCriterion("LegalPersonMobile >", value, "legalPersonMobile", false);
            return (Criteria) this;
        }

        /**
         * 法人手机号
         */
        public Criteria andLegalPersonMobileGreaterThanOrEqualTo(String value) {
            addCriterion("LegalPersonMobile >=", value, "legalPersonMobile", false);
            return (Criteria) this;
        }

        /**
         * 法人手机号
         */
        public Criteria andLegalPersonMobileLessThan(String value) {
            addCriterion("LegalPersonMobile <", value, "legalPersonMobile", false);
            return (Criteria) this;
        }

        /**
         * 法人手机号
         */
        public Criteria andLegalPersonMobileLessThanOrEqualTo(String value) {
            addCriterion("LegalPersonMobile <=", value, "legalPersonMobile", false);
            return (Criteria) this;
        }

        /**
         * 法人手机号
         */
        public Criteria andLegalPersonMobileLike(String value) {
            addCriterion("LegalPersonMobile like", value, "legalPersonMobile", false);
            return (Criteria) this;
        }

        /**
         * 法人手机号
         */
        public Criteria andLegalPersonMobileNotLike(String value) {
            addCriterion("LegalPersonMobile not like", value, "legalPersonMobile", false);
            return (Criteria) this;
        }

        /**
         * 法人手机号
         */
        public Criteria andLegalPersonMobileIn(List<String> values) {
            addCriterion("LegalPersonMobile in", values, "legalPersonMobile", false);
            return (Criteria) this;
        }

        /**
         * 法人手机号
         */
        public Criteria andLegalPersonMobileNotIn(List<String> values) {
            addCriterion("LegalPersonMobile not in", values, "legalPersonMobile", false);
            return (Criteria) this;
        }

        /**
         * 法人手机号
         */
        public Criteria andLegalPersonMobileBetween(String value1, String value2) {
            addCriterion("LegalPersonMobile between", value1, value2, "legalPersonMobile");
            return (Criteria) this;
        }

        /**
         * 法人手机号
         */
        public Criteria andLegalPersonMobileNotBetween(String value1, String value2) {
            addCriterion("LegalPersonMobile not between", value1, value2, "legalPersonMobile");
            return (Criteria) this;
        }

        /**
         * 联系人名称
         */
        public Criteria andContactNameIsNull() {
            addCriterion("ContactName is null");
            return (Criteria) this;
        }

        /**
         * 联系人名称
         */
        public Criteria andContactNameIsNotNull() {
            addCriterion("ContactName is not null");
            return (Criteria) this;
        }

        /**
         * 联系人名称
         */
        public Criteria andContactNameEqualTo(String value) {
            addCriterion("ContactName =", value, "contactName", false);
            return (Criteria) this;
        }

        /**
         * 联系人名称
         */
        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("ContactName <>", value, "contactName", false);
            return (Criteria) this;
        }

        /**
         * 联系人名称
         */
        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("ContactName >", value, "contactName", false);
            return (Criteria) this;
        }

        /**
         * 联系人名称
         */
        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("ContactName >=", value, "contactName", false);
            return (Criteria) this;
        }

        /**
         * 联系人名称
         */
        public Criteria andContactNameLessThan(String value) {
            addCriterion("ContactName <", value, "contactName", false);
            return (Criteria) this;
        }

        /**
         * 联系人名称
         */
        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("ContactName <=", value, "contactName", false);
            return (Criteria) this;
        }

        /**
         * 联系人名称
         */
        public Criteria andContactNameLike(String value) {
            addCriterion("ContactName like", value, "contactName", false);
            return (Criteria) this;
        }

        /**
         * 联系人名称
         */
        public Criteria andContactNameNotLike(String value) {
            addCriterion("ContactName not like", value, "contactName", false);
            return (Criteria) this;
        }

        /**
         * 联系人名称
         */
        public Criteria andContactNameIn(List<String> values) {
            addCriterion("ContactName in", values, "contactName", false);
            return (Criteria) this;
        }

        /**
         * 联系人名称
         */
        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("ContactName not in", values, "contactName", false);
            return (Criteria) this;
        }

        /**
         * 联系人名称
         */
        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("ContactName between", value1, value2, "contactName");
            return (Criteria) this;
        }

        /**
         * 联系人名称
         */
        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("ContactName not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        /**
         * 联系人电话
         */
        public Criteria andContactMobileIsNull() {
            addCriterion("ContactMobile is null");
            return (Criteria) this;
        }

        /**
         * 联系人电话
         */
        public Criteria andContactMobileIsNotNull() {
            addCriterion("ContactMobile is not null");
            return (Criteria) this;
        }

        /**
         * 联系人电话
         */
        public Criteria andContactMobileEqualTo(String value) {
            addCriterion("ContactMobile =", value, "contactMobile", false);
            return (Criteria) this;
        }

        /**
         * 联系人电话
         */
        public Criteria andContactMobileNotEqualTo(String value) {
            addCriterion("ContactMobile <>", value, "contactMobile", false);
            return (Criteria) this;
        }

        /**
         * 联系人电话
         */
        public Criteria andContactMobileGreaterThan(String value) {
            addCriterion("ContactMobile >", value, "contactMobile", false);
            return (Criteria) this;
        }

        /**
         * 联系人电话
         */
        public Criteria andContactMobileGreaterThanOrEqualTo(String value) {
            addCriterion("ContactMobile >=", value, "contactMobile", false);
            return (Criteria) this;
        }

        /**
         * 联系人电话
         */
        public Criteria andContactMobileLessThan(String value) {
            addCriterion("ContactMobile <", value, "contactMobile", false);
            return (Criteria) this;
        }

        /**
         * 联系人电话
         */
        public Criteria andContactMobileLessThanOrEqualTo(String value) {
            addCriterion("ContactMobile <=", value, "contactMobile", false);
            return (Criteria) this;
        }

        /**
         * 联系人电话
         */
        public Criteria andContactMobileLike(String value) {
            addCriterion("ContactMobile like", value, "contactMobile", false);
            return (Criteria) this;
        }

        /**
         * 联系人电话
         */
        public Criteria andContactMobileNotLike(String value) {
            addCriterion("ContactMobile not like", value, "contactMobile", false);
            return (Criteria) this;
        }

        /**
         * 联系人电话
         */
        public Criteria andContactMobileIn(List<String> values) {
            addCriterion("ContactMobile in", values, "contactMobile", false);
            return (Criteria) this;
        }

        /**
         * 联系人电话
         */
        public Criteria andContactMobileNotIn(List<String> values) {
            addCriterion("ContactMobile not in", values, "contactMobile", false);
            return (Criteria) this;
        }

        /**
         * 联系人电话
         */
        public Criteria andContactMobileBetween(String value1, String value2) {
            addCriterion("ContactMobile between", value1, value2, "contactMobile");
            return (Criteria) this;
        }

        /**
         * 联系人电话
         */
        public Criteria andContactMobileNotBetween(String value1, String value2) {
            addCriterion("ContactMobile not between", value1, value2, "contactMobile");
            return (Criteria) this;
        }

        /**
         * 是否是担保商户
         */
        public Criteria andIsGuaranteeIsNull() {
            addCriterion("IsGuarantee is null");
            return (Criteria) this;
        }

        /**
         * 是否是担保商户
         */
        public Criteria andIsGuaranteeIsNotNull() {
            addCriterion("IsGuarantee is not null");
            return (Criteria) this;
        }

        /**
         * 是否是担保商户
         */
        public Criteria andIsGuaranteeEqualTo(Boolean value) {
            addCriterion("IsGuarantee =", value, "isGuarantee", false);
            return (Criteria) this;
        }

        /**
         * 是否是担保商户
         */
        public Criteria andIsGuaranteeNotEqualTo(Boolean value) {
            addCriterion("IsGuarantee <>", value, "isGuarantee", false);
            return (Criteria) this;
        }

        /**
         * 是否是担保商户
         */
        public Criteria andIsGuaranteeGreaterThan(Boolean value) {
            addCriterion("IsGuarantee >", value, "isGuarantee", false);
            return (Criteria) this;
        }

        /**
         * 是否是担保商户
         */
        public Criteria andIsGuaranteeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsGuarantee >=", value, "isGuarantee", false);
            return (Criteria) this;
        }

        /**
         * 是否是担保商户
         */
        public Criteria andIsGuaranteeLessThan(Boolean value) {
            addCriterion("IsGuarantee <", value, "isGuarantee", false);
            return (Criteria) this;
        }

        /**
         * 是否是担保商户
         */
        public Criteria andIsGuaranteeLessThanOrEqualTo(Boolean value) {
            addCriterion("IsGuarantee <=", value, "isGuarantee", false);
            return (Criteria) this;
        }

        /**
         * 是否是担保商户
         */
        public Criteria andIsGuaranteeIn(List<Boolean> values) {
            addCriterion("IsGuarantee in", values, "isGuarantee", false);
            return (Criteria) this;
        }

        /**
         * 是否是担保商户
         */
        public Criteria andIsGuaranteeNotIn(List<Boolean> values) {
            addCriterion("IsGuarantee not in", values, "isGuarantee", false);
            return (Criteria) this;
        }

        /**
         * 是否是担保商户
         */
        public Criteria andIsGuaranteeBetween(Boolean value1, Boolean value2) {
            addCriterion("IsGuarantee between", value1, value2, "isGuarantee");
            return (Criteria) this;
        }

        /**
         * 是否是担保商户
         */
        public Criteria andIsGuaranteeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsGuarantee not between", value1, value2, "isGuarantee");
            return (Criteria) this;
        }

        /**
         * 是否冻结
         */
        public Criteria andIsFreezedIsNull() {
            addCriterion("IsFreezed is null");
            return (Criteria) this;
        }

        /**
         * 是否冻结
         */
        public Criteria andIsFreezedIsNotNull() {
            addCriterion("IsFreezed is not null");
            return (Criteria) this;
        }

        /**
         * 是否冻结
         */
        public Criteria andIsFreezedEqualTo(Boolean value) {
            addCriterion("IsFreezed =", value, "isFreezed", false);
            return (Criteria) this;
        }

        /**
         * 是否冻结
         */
        public Criteria andIsFreezedNotEqualTo(Boolean value) {
            addCriterion("IsFreezed <>", value, "isFreezed", false);
            return (Criteria) this;
        }

        /**
         * 是否冻结
         */
        public Criteria andIsFreezedGreaterThan(Boolean value) {
            addCriterion("IsFreezed >", value, "isFreezed", false);
            return (Criteria) this;
        }

        /**
         * 是否冻结
         */
        public Criteria andIsFreezedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsFreezed >=", value, "isFreezed", false);
            return (Criteria) this;
        }

        /**
         * 是否冻结
         */
        public Criteria andIsFreezedLessThan(Boolean value) {
            addCriterion("IsFreezed <", value, "isFreezed", false);
            return (Criteria) this;
        }

        /**
         * 是否冻结
         */
        public Criteria andIsFreezedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsFreezed <=", value, "isFreezed", false);
            return (Criteria) this;
        }

        /**
         * 是否冻结
         */
        public Criteria andIsFreezedIn(List<Boolean> values) {
            addCriterion("IsFreezed in", values, "isFreezed", false);
            return (Criteria) this;
        }

        /**
         * 是否冻结
         */
        public Criteria andIsFreezedNotIn(List<Boolean> values) {
            addCriterion("IsFreezed not in", values, "isFreezed", false);
            return (Criteria) this;
        }

        /**
         * 是否冻结
         */
        public Criteria andIsFreezedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsFreezed between", value1, value2, "isFreezed");
            return (Criteria) this;
        }

        /**
         * 是否冻结
         */
        public Criteria andIsFreezedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsFreezed not between", value1, value2, "isFreezed");
            return (Criteria) this;
        }

        /**
         * 冻结原因
         */
        public Criteria andFreezedReasonIsNull() {
            addCriterion("FreezedReason is null");
            return (Criteria) this;
        }

        /**
         * 冻结原因
         */
        public Criteria andFreezedReasonIsNotNull() {
            addCriterion("FreezedReason is not null");
            return (Criteria) this;
        }

        /**
         * 冻结原因
         */
        public Criteria andFreezedReasonEqualTo(String value) {
            addCriterion("FreezedReason =", value, "freezedReason", false);
            return (Criteria) this;
        }

        /**
         * 冻结原因
         */
        public Criteria andFreezedReasonNotEqualTo(String value) {
            addCriterion("FreezedReason <>", value, "freezedReason", false);
            return (Criteria) this;
        }

        /**
         * 冻结原因
         */
        public Criteria andFreezedReasonGreaterThan(String value) {
            addCriterion("FreezedReason >", value, "freezedReason", false);
            return (Criteria) this;
        }

        /**
         * 冻结原因
         */
        public Criteria andFreezedReasonGreaterThanOrEqualTo(String value) {
            addCriterion("FreezedReason >=", value, "freezedReason", false);
            return (Criteria) this;
        }

        /**
         * 冻结原因
         */
        public Criteria andFreezedReasonLessThan(String value) {
            addCriterion("FreezedReason <", value, "freezedReason", false);
            return (Criteria) this;
        }

        /**
         * 冻结原因
         */
        public Criteria andFreezedReasonLessThanOrEqualTo(String value) {
            addCriterion("FreezedReason <=", value, "freezedReason", false);
            return (Criteria) this;
        }

        /**
         * 冻结原因
         */
        public Criteria andFreezedReasonLike(String value) {
            addCriterion("FreezedReason like", value, "freezedReason", false);
            return (Criteria) this;
        }

        /**
         * 冻结原因
         */
        public Criteria andFreezedReasonNotLike(String value) {
            addCriterion("FreezedReason not like", value, "freezedReason", false);
            return (Criteria) this;
        }

        /**
         * 冻结原因
         */
        public Criteria andFreezedReasonIn(List<String> values) {
            addCriterion("FreezedReason in", values, "freezedReason", false);
            return (Criteria) this;
        }

        /**
         * 冻结原因
         */
        public Criteria andFreezedReasonNotIn(List<String> values) {
            addCriterion("FreezedReason not in", values, "freezedReason", false);
            return (Criteria) this;
        }

        /**
         * 冻结原因
         */
        public Criteria andFreezedReasonBetween(String value1, String value2) {
            addCriterion("FreezedReason between", value1, value2, "freezedReason");
            return (Criteria) this;
        }

        /**
         * 冻结原因
         */
        public Criteria andFreezedReasonNotBetween(String value1, String value2) {
            addCriterion("FreezedReason not between", value1, value2, "freezedReason");
            return (Criteria) this;
        }

        /**
         * 客户经理
         */
        public Criteria andCustomerManagerIsNull() {
            addCriterion("CustomerManager is null");
            return (Criteria) this;
        }

        /**
         * 客户经理
         */
        public Criteria andCustomerManagerIsNotNull() {
            addCriterion("CustomerManager is not null");
            return (Criteria) this;
        }

        /**
         * 客户经理
         */
        public Criteria andCustomerManagerEqualTo(Long value) {
            addCriterion("CustomerManager =", value, "customerManager", false);
            return (Criteria) this;
        }

        /**
         * 客户经理
         */
        public Criteria andCustomerManagerNotEqualTo(Long value) {
            addCriterion("CustomerManager <>", value, "customerManager", false);
            return (Criteria) this;
        }

        /**
         * 客户经理
         */
        public Criteria andCustomerManagerGreaterThan(Long value) {
            addCriterion("CustomerManager >", value, "customerManager", false);
            return (Criteria) this;
        }

        /**
         * 客户经理
         */
        public Criteria andCustomerManagerGreaterThanOrEqualTo(Long value) {
            addCriterion("CustomerManager >=", value, "customerManager", false);
            return (Criteria) this;
        }

        /**
         * 客户经理
         */
        public Criteria andCustomerManagerLessThan(Long value) {
            addCriterion("CustomerManager <", value, "customerManager", false);
            return (Criteria) this;
        }

        /**
         * 客户经理
         */
        public Criteria andCustomerManagerLessThanOrEqualTo(Long value) {
            addCriterion("CustomerManager <=", value, "customerManager", false);
            return (Criteria) this;
        }

        /**
         * 客户经理
         */
        public Criteria andCustomerManagerIn(List<Long> values) {
            addCriterion("CustomerManager in", values, "customerManager", false);
            return (Criteria) this;
        }

        /**
         * 客户经理
         */
        public Criteria andCustomerManagerNotIn(List<Long> values) {
            addCriterion("CustomerManager not in", values, "customerManager", false);
            return (Criteria) this;
        }

        /**
         * 客户经理
         */
        public Criteria andCustomerManagerBetween(Long value1, Long value2) {
            addCriterion("CustomerManager between", value1, value2, "customerManager");
            return (Criteria) this;
        }

        /**
         * 客户经理
         */
        public Criteria andCustomerManagerNotBetween(Long value1, Long value2) {
            addCriterion("CustomerManager not between", value1, value2, "customerManager");
            return (Criteria) this;
        }

        /**
         * 状态@see MerchantsStatusEnum 1未审核 2审核中 4审核通过 8审核未通过
         */
        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        /**
         * 状态@see MerchantsStatusEnum 1未审核 2审核中 4审核通过 8审核未通过
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        /**
         * 状态@see MerchantsStatusEnum 1未审核 2审核中 4审核通过 8审核未通过
         */
        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态@see MerchantsStatusEnum 1未审核 2审核中 4审核通过 8审核未通过
         */
        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态@see MerchantsStatusEnum 1未审核 2审核中 4审核通过 8审核未通过
         */
        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态@see MerchantsStatusEnum 1未审核 2审核中 4审核通过 8审核未通过
         */
        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态@see MerchantsStatusEnum 1未审核 2审核中 4审核通过 8审核未通过
         */
        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态@see MerchantsStatusEnum 1未审核 2审核中 4审核通过 8审核未通过
         */
        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态@see MerchantsStatusEnum 1未审核 2审核中 4审核通过 8审核未通过
         */
        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态@see MerchantsStatusEnum 1未审核 2审核中 4审核通过 8审核未通过
         */
        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status", false);
            return (Criteria) this;
        }

        /**
         * 状态@see MerchantsStatusEnum 1未审核 2审核中 4审核通过 8审核未通过
         */
        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        /**
         * 状态@see MerchantsStatusEnum 1未审核 2审核中 4审核通过 8审核未通过
         */
        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeIsNull() {
            addCriterion("LastModifyTime is null");
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("LastModifyTime is not null");
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("LastModifyTime =", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("LastModifyTime <>", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("LastModifyTime >", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastModifyTime >=", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("LastModifyTime <", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("LastModifyTime <=", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("LastModifyTime in", values, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("LastModifyTime not in", values, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("LastModifyTime between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("LastModifyTime not between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }
    }

    /**
     * 商户记录
     *T_Merchants
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 商户记录
     * T_Merchants
     */
    public static class Criterion {
        private boolean isBinary;

        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public boolean isIsBinary() {
            return isBinary;
        }

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
            this.isBinary = false;
        }

        protected Criterion(String condition, Object value, String typeHandler, boolean isBinary) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
            this.isBinary = isBinary;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            this(condition, value, typeHandler, false);
        }

        protected Criterion(String condition, Object value, boolean isBinary) {
            this(condition, value, null, isBinary);
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null, false);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler, boolean isBinary) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
            this.isBinary = isBinary;
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            this(condition, value, secondValue, typeHandler, false);
        }

        protected Criterion(String condition, Object value, Object secondValue, boolean isBinary) {
            this(condition, value, secondValue, null, isBinary);
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null, false);
        }
    }

    /**
     * 商户记录
     *T_Merchants
     */
    public static class OrderBy {
        private List<OrderByPair> orderByPairs;

        public OrderBy() {
            super();
            this.orderByPairs = new ArrayList<OrderByPair>();
        }

        public boolean isValid() {
            return orderByPairs.size() > 0;
        }

        public OrderBy clear() {
            orderByPairs.clear();
            return this;
        }

        public OrderBy addOrderBy(String fieldName) {
            return this.addOrderBy(fieldName, ORDERBYDIRECTION_ASC);
        }

        public OrderBy addOrderBy(String fieldName, String direction) {
            this.removeByFieldName(fieldName);//不能重复添加排序条件
            OrderByPair orderByPair = new OrderByPair(fieldName, direction);
            this.orderByPairs.add(orderByPair);
            return this;
        }

        private void removeByFieldName(String fieldName) {
            for (OrderByPair item : orderByPairs) {
                    if (StringUtils.equalsIgnoreCase(item.getFieldName(), fieldName)) {
                            orderByPairs.remove(item);
                            break;
                         }
                }
            }

        /**
         * 当没有任何排序条件时，直接返回null
         * 否则返回排序条件，多个条件时以,号分割
         */
        @Override
        public String toString() {
            if (!this.isValid()) {
                    return null;
            }
            StringBuilder sb = new StringBuilder();
            for (OrderByPair item : orderByPairs) {
                    sb.append(item.toString());
                    sb.append(',');
            }
            sb.deleteCharAt(sb.length() - 1);//删除最后一个字符
            return sb.toString();
        }
    }

    /**
     * 商户记录
     *T_Merchants
     */
    static class OrderByPair {
        private String fieldName;

        private String direction;

        public OrderByPair(String fieldName, String direction) {
            super();
            this.fieldName = fieldName;
            this.direction = direction;
        }

        public String getFieldName() {
            return this.fieldName;
        }

        public String getDirection() {
            return this.direction;
        }

        /**
         * 返回单个排序条件字符串
         */
        @Override
        public String toString() {
            return fieldName + " " + direction;
        }
    }
}