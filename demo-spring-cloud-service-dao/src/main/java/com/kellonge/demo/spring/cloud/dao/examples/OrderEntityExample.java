package com.kellonge.demo.spring.cloud.dao.examples;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * 用户订单表
 * T_Order
 */
public class OrderEntityExample {
    /**
     * 顺序排序
     */
    public static final String ORDERBYDIRECTION_ASC = "asc";

    /**
     * 倒序排序
     */
    public static final String ORDERBYDIRECTION_DESC = "desc";

    /**
     * 订单标识，T_User_Order与T_Merchants_Order主键一至SequenceId全局唯一标识
     */
    public static final String FIELD_ORDERID = "OrderId";

    /**
     * 商户标识
     */
    public static final String FIELD_MERCHANTSID = "MerchantsId";

    /**
     * 用户标识
     */
    public static final String FIELD_USERID = "UserId";

    /**
     * 用户真实姓名
     */
    public static final String FIELD_USERNAME = "UserName";

    /**
     * 用户身份证号
     */
    public static final String FIELD_USERIDENTIFYNO = "UserIdentifyNo";

    /**
     * 订单号系统唯一
     */
    public static final String FIELD_ORDERNO = "OrderNo";

    /**
     * 订单金额
     */
    public static final String FIELD_ORDERAMOUNT = "OrderAmount";

    /**
     * 免息期
     */
    public static final String FIELD_INTERESTFREEPERIOD = "InterestFreePeriod";

    /**
     * 红包支付（包含首单、商户红包等）金额
     */
    public static final String FIELD_BONUSPAYAMOUNT = "BonusPayAmount";

    /**
     * 信用付（人品付）金额
     */
    public static final String FIELD_CREDITPAYAMOUNT = "CreditPayAmount";

    /**
     * 订单状态@see OrderStatusEnum
     */
    public static final String FIELD_ORDERSTATUS = "OrderStatus";

    /**
     * 订单创建时的商户的基站定位
     */
    public static final String FIELD_MERCHANTSLOACTIONINFO = "MerchantsLoactionInfo";

    /**
     * 订单创建时的基站定位
     */
    public static final String FIELD_USERLOCATIONINFO = "UserLocationInfo";

    /**
     * 用户账单是否已经查看过
     */
    public static final String FIELD_ISREADED = "IsReaded";

    /**
     * 创建时间
     */
    public static final String FIELD_CREATETIME = "CreateTime";

    /**
     * 最后修改时间
     */
    public static final String FIELD_LASTMODIFYTIME = "LastModifyTime";

    /**
     * T_Order
     */
    protected Integer offset;

    /**
     * T_Order
     */
    protected Integer size;

    /**
     * T_Order
     */
    protected String orderByClause;

    /**
     * T_Order
     */
    protected boolean distinct;

    /**
     * T_Order
     */
    protected List<Criteria> oredCriteria;

    /**
     * T_Order
     */
    public OrderEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * T_Order
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * T_Order
     */
    public void setOrderByClause(OrderBy orderBy) {
        this.orderByClause = orderBy.toString();
    }

    /**
     * T_Order
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * T_Order
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * T_Order
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * T_Order
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * T_Order
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * T_Order
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * T_Order
     */
    public Integer getSize() {
        return size;
    }

    /**
     * T_Order
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * T_Order
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * T_Order
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * T_Order
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * T_Order
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * T_Order
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 用户订单表
     * T_Order
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
         * 订单标识，T_User_Order与T_Merchants_Order主键一至SequenceId全局唯一标识
         */
        public Criteria andOrderIdIsNull() {
            addCriterion("OrderId is null");
            return (Criteria) this;
        }

        /**
         * 订单标识，T_User_Order与T_Merchants_Order主键一至SequenceId全局唯一标识
         */
        public Criteria andOrderIdIsNotNull() {
            addCriterion("OrderId is not null");
            return (Criteria) this;
        }

        /**
         * 订单标识，T_User_Order与T_Merchants_Order主键一至SequenceId全局唯一标识
         */
        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("OrderId =", value, "orderId", false);
            return (Criteria) this;
        }

        /**
         * 订单标识，T_User_Order与T_Merchants_Order主键一至SequenceId全局唯一标识
         */
        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("OrderId <>", value, "orderId", false);
            return (Criteria) this;
        }

        /**
         * 订单标识，T_User_Order与T_Merchants_Order主键一至SequenceId全局唯一标识
         */
        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("OrderId >", value, "orderId", false);
            return (Criteria) this;
        }

        /**
         * 订单标识，T_User_Order与T_Merchants_Order主键一至SequenceId全局唯一标识
         */
        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OrderId >=", value, "orderId", false);
            return (Criteria) this;
        }

        /**
         * 订单标识，T_User_Order与T_Merchants_Order主键一至SequenceId全局唯一标识
         */
        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("OrderId <", value, "orderId", false);
            return (Criteria) this;
        }

        /**
         * 订单标识，T_User_Order与T_Merchants_Order主键一至SequenceId全局唯一标识
         */
        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("OrderId <=", value, "orderId", false);
            return (Criteria) this;
        }

        /**
         * 订单标识，T_User_Order与T_Merchants_Order主键一至SequenceId全局唯一标识
         */
        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("OrderId in", values, "orderId", false);
            return (Criteria) this;
        }

        /**
         * 订单标识，T_User_Order与T_Merchants_Order主键一至SequenceId全局唯一标识
         */
        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("OrderId not in", values, "orderId", false);
            return (Criteria) this;
        }

        /**
         * 订单标识，T_User_Order与T_Merchants_Order主键一至SequenceId全局唯一标识
         */
        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("OrderId between", value1, value2, "orderId");
            return (Criteria) this;
        }

        /**
         * 订单标识，T_User_Order与T_Merchants_Order主键一至SequenceId全局唯一标识
         */
        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("OrderId not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        /**
         * 商户标识
         */
        public Criteria andMerchantsIdIsNull() {
            addCriterion("MerchantsId is null");
            return (Criteria) this;
        }

        /**
         * 商户标识
         */
        public Criteria andMerchantsIdIsNotNull() {
            addCriterion("MerchantsId is not null");
            return (Criteria) this;
        }

        /**
         * 商户标识
         */
        public Criteria andMerchantsIdEqualTo(Long value) {
            addCriterion("MerchantsId =", value, "merchantsId", false);
            return (Criteria) this;
        }

        /**
         * 商户标识
         */
        public Criteria andMerchantsIdNotEqualTo(Long value) {
            addCriterion("MerchantsId <>", value, "merchantsId", false);
            return (Criteria) this;
        }

        /**
         * 商户标识
         */
        public Criteria andMerchantsIdGreaterThan(Long value) {
            addCriterion("MerchantsId >", value, "merchantsId", false);
            return (Criteria) this;
        }

        /**
         * 商户标识
         */
        public Criteria andMerchantsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MerchantsId >=", value, "merchantsId", false);
            return (Criteria) this;
        }

        /**
         * 商户标识
         */
        public Criteria andMerchantsIdLessThan(Long value) {
            addCriterion("MerchantsId <", value, "merchantsId", false);
            return (Criteria) this;
        }

        /**
         * 商户标识
         */
        public Criteria andMerchantsIdLessThanOrEqualTo(Long value) {
            addCriterion("MerchantsId <=", value, "merchantsId", false);
            return (Criteria) this;
        }

        /**
         * 商户标识
         */
        public Criteria andMerchantsIdIn(List<Long> values) {
            addCriterion("MerchantsId in", values, "merchantsId", false);
            return (Criteria) this;
        }

        /**
         * 商户标识
         */
        public Criteria andMerchantsIdNotIn(List<Long> values) {
            addCriterion("MerchantsId not in", values, "merchantsId", false);
            return (Criteria) this;
        }

        /**
         * 商户标识
         */
        public Criteria andMerchantsIdBetween(Long value1, Long value2) {
            addCriterion("MerchantsId between", value1, value2, "merchantsId");
            return (Criteria) this;
        }

        /**
         * 商户标识
         */
        public Criteria andMerchantsIdNotBetween(Long value1, Long value2) {
            addCriterion("MerchantsId not between", value1, value2, "merchantsId");
            return (Criteria) this;
        }

        /**
         * 用户标识
         */
        public Criteria andUserIdIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        /**
         * 用户标识
         */
        public Criteria andUserIdIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        /**
         * 用户标识
         */
        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("UserId =", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 用户标识
         */
        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("UserId <>", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 用户标识
         */
        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("UserId >", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 用户标识
         */
        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("UserId >=", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 用户标识
         */
        public Criteria andUserIdLessThan(Long value) {
            addCriterion("UserId <", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 用户标识
         */
        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("UserId <=", value, "userId", false);
            return (Criteria) this;
        }

        /**
         * 用户标识
         */
        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("UserId in", values, "userId", false);
            return (Criteria) this;
        }

        /**
         * 用户标识
         */
        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("UserId not in", values, "userId", false);
            return (Criteria) this;
        }

        /**
         * 用户标识
         */
        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("UserId between", value1, value2, "userId");
            return (Criteria) this;
        }

        /**
         * 用户标识
         */
        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("UserId not between", value1, value2, "userId");
            return (Criteria) this;
        }

        /**
         * 用户真实姓名
         */
        public Criteria andUserNameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        /**
         * 用户真实姓名
         */
        public Criteria andUserNameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        /**
         * 用户真实姓名
         */
        public Criteria andUserNameEqualTo(String value) {
            addCriterion("UserName =", value, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户真实姓名
         */
        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户真实姓名
         */
        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("UserName >", value, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户真实姓名
         */
        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户真实姓名
         */
        public Criteria andUserNameLessThan(String value) {
            addCriterion("UserName <", value, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户真实姓名
         */
        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户真实姓名
         */
        public Criteria andUserNameLike(String value) {
            addCriterion("UserName like", value, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户真实姓名
         */
        public Criteria andUserNameNotLike(String value) {
            addCriterion("UserName not like", value, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户真实姓名
         */
        public Criteria andUserNameIn(List<String> values) {
            addCriterion("UserName in", values, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户真实姓名
         */
        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "userName", false);
            return (Criteria) this;
        }

        /**
         * 用户真实姓名
         */
        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "userName");
            return (Criteria) this;
        }

        /**
         * 用户真实姓名
         */
        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        /**
         * 用户身份证号
         */
        public Criteria andUserIdentifyNoIsNull() {
            addCriterion("UserIdentifyNo is null");
            return (Criteria) this;
        }

        /**
         * 用户身份证号
         */
        public Criteria andUserIdentifyNoIsNotNull() {
            addCriterion("UserIdentifyNo is not null");
            return (Criteria) this;
        }

        /**
         * 用户身份证号
         */
        public Criteria andUserIdentifyNoEqualTo(String value) {
            addCriterion("UserIdentifyNo =", value, "userIdentifyNo", false);
            return (Criteria) this;
        }

        /**
         * 用户身份证号
         */
        public Criteria andUserIdentifyNoNotEqualTo(String value) {
            addCriterion("UserIdentifyNo <>", value, "userIdentifyNo", false);
            return (Criteria) this;
        }

        /**
         * 用户身份证号
         */
        public Criteria andUserIdentifyNoGreaterThan(String value) {
            addCriterion("UserIdentifyNo >", value, "userIdentifyNo", false);
            return (Criteria) this;
        }

        /**
         * 用户身份证号
         */
        public Criteria andUserIdentifyNoGreaterThanOrEqualTo(String value) {
            addCriterion("UserIdentifyNo >=", value, "userIdentifyNo", false);
            return (Criteria) this;
        }

        /**
         * 用户身份证号
         */
        public Criteria andUserIdentifyNoLessThan(String value) {
            addCriterion("UserIdentifyNo <", value, "userIdentifyNo", false);
            return (Criteria) this;
        }

        /**
         * 用户身份证号
         */
        public Criteria andUserIdentifyNoLessThanOrEqualTo(String value) {
            addCriterion("UserIdentifyNo <=", value, "userIdentifyNo", false);
            return (Criteria) this;
        }

        /**
         * 用户身份证号
         */
        public Criteria andUserIdentifyNoLike(String value) {
            addCriterion("UserIdentifyNo like", value, "userIdentifyNo", false);
            return (Criteria) this;
        }

        /**
         * 用户身份证号
         */
        public Criteria andUserIdentifyNoNotLike(String value) {
            addCriterion("UserIdentifyNo not like", value, "userIdentifyNo", false);
            return (Criteria) this;
        }

        /**
         * 用户身份证号
         */
        public Criteria andUserIdentifyNoIn(List<String> values) {
            addCriterion("UserIdentifyNo in", values, "userIdentifyNo", false);
            return (Criteria) this;
        }

        /**
         * 用户身份证号
         */
        public Criteria andUserIdentifyNoNotIn(List<String> values) {
            addCriterion("UserIdentifyNo not in", values, "userIdentifyNo", false);
            return (Criteria) this;
        }

        /**
         * 用户身份证号
         */
        public Criteria andUserIdentifyNoBetween(String value1, String value2) {
            addCriterion("UserIdentifyNo between", value1, value2, "userIdentifyNo");
            return (Criteria) this;
        }

        /**
         * 用户身份证号
         */
        public Criteria andUserIdentifyNoNotBetween(String value1, String value2) {
            addCriterion("UserIdentifyNo not between", value1, value2, "userIdentifyNo");
            return (Criteria) this;
        }

        /**
         * 订单号系统唯一
         */
        public Criteria andOrderNoIsNull() {
            addCriterion("OrderNo is null");
            return (Criteria) this;
        }

        /**
         * 订单号系统唯一
         */
        public Criteria andOrderNoIsNotNull() {
            addCriterion("OrderNo is not null");
            return (Criteria) this;
        }

        /**
         * 订单号系统唯一
         */
        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("OrderNo =", value, "orderNo", false);
            return (Criteria) this;
        }

        /**
         * 订单号系统唯一
         */
        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("OrderNo <>", value, "orderNo", false);
            return (Criteria) this;
        }

        /**
         * 订单号系统唯一
         */
        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("OrderNo >", value, "orderNo", false);
            return (Criteria) this;
        }

        /**
         * 订单号系统唯一
         */
        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("OrderNo >=", value, "orderNo", false);
            return (Criteria) this;
        }

        /**
         * 订单号系统唯一
         */
        public Criteria andOrderNoLessThan(String value) {
            addCriterion("OrderNo <", value, "orderNo", false);
            return (Criteria) this;
        }

        /**
         * 订单号系统唯一
         */
        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("OrderNo <=", value, "orderNo", false);
            return (Criteria) this;
        }

        /**
         * 订单号系统唯一
         */
        public Criteria andOrderNoLike(String value) {
            addCriterion("OrderNo like", value, "orderNo", false);
            return (Criteria) this;
        }

        /**
         * 订单号系统唯一
         */
        public Criteria andOrderNoNotLike(String value) {
            addCriterion("OrderNo not like", value, "orderNo", false);
            return (Criteria) this;
        }

        /**
         * 订单号系统唯一
         */
        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("OrderNo in", values, "orderNo", false);
            return (Criteria) this;
        }

        /**
         * 订单号系统唯一
         */
        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("OrderNo not in", values, "orderNo", false);
            return (Criteria) this;
        }

        /**
         * 订单号系统唯一
         */
        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("OrderNo between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        /**
         * 订单号系统唯一
         */
        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("OrderNo not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        /**
         * 订单金额
         */
        public Criteria andOrderAmountIsNull() {
            addCriterion("OrderAmount is null");
            return (Criteria) this;
        }

        /**
         * 订单金额
         */
        public Criteria andOrderAmountIsNotNull() {
            addCriterion("OrderAmount is not null");
            return (Criteria) this;
        }

        /**
         * 订单金额
         */
        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("OrderAmount =", value, "orderAmount", false);
            return (Criteria) this;
        }

        /**
         * 订单金额
         */
        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("OrderAmount <>", value, "orderAmount", false);
            return (Criteria) this;
        }

        /**
         * 订单金额
         */
        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("OrderAmount >", value, "orderAmount", false);
            return (Criteria) this;
        }

        /**
         * 订单金额
         */
        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OrderAmount >=", value, "orderAmount", false);
            return (Criteria) this;
        }

        /**
         * 订单金额
         */
        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("OrderAmount <", value, "orderAmount", false);
            return (Criteria) this;
        }

        /**
         * 订单金额
         */
        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OrderAmount <=", value, "orderAmount", false);
            return (Criteria) this;
        }

        /**
         * 订单金额
         */
        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("OrderAmount in", values, "orderAmount", false);
            return (Criteria) this;
        }

        /**
         * 订单金额
         */
        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("OrderAmount not in", values, "orderAmount", false);
            return (Criteria) this;
        }

        /**
         * 订单金额
         */
        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OrderAmount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        /**
         * 订单金额
         */
        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OrderAmount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        /**
         * 免息期
         */
        public Criteria andInterestFreePeriodIsNull() {
            addCriterion("InterestFreePeriod is null");
            return (Criteria) this;
        }

        /**
         * 免息期
         */
        public Criteria andInterestFreePeriodIsNotNull() {
            addCriterion("InterestFreePeriod is not null");
            return (Criteria) this;
        }

        /**
         * 免息期
         */
        public Criteria andInterestFreePeriodEqualTo(Integer value) {
            addCriterion("InterestFreePeriod =", value, "interestFreePeriod", false);
            return (Criteria) this;
        }

        /**
         * 免息期
         */
        public Criteria andInterestFreePeriodNotEqualTo(Integer value) {
            addCriterion("InterestFreePeriod <>", value, "interestFreePeriod", false);
            return (Criteria) this;
        }

        /**
         * 免息期
         */
        public Criteria andInterestFreePeriodGreaterThan(Integer value) {
            addCriterion("InterestFreePeriod >", value, "interestFreePeriod", false);
            return (Criteria) this;
        }

        /**
         * 免息期
         */
        public Criteria andInterestFreePeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("InterestFreePeriod >=", value, "interestFreePeriod", false);
            return (Criteria) this;
        }

        /**
         * 免息期
         */
        public Criteria andInterestFreePeriodLessThan(Integer value) {
            addCriterion("InterestFreePeriod <", value, "interestFreePeriod", false);
            return (Criteria) this;
        }

        /**
         * 免息期
         */
        public Criteria andInterestFreePeriodLessThanOrEqualTo(Integer value) {
            addCriterion("InterestFreePeriod <=", value, "interestFreePeriod", false);
            return (Criteria) this;
        }

        /**
         * 免息期
         */
        public Criteria andInterestFreePeriodIn(List<Integer> values) {
            addCriterion("InterestFreePeriod in", values, "interestFreePeriod", false);
            return (Criteria) this;
        }

        /**
         * 免息期
         */
        public Criteria andInterestFreePeriodNotIn(List<Integer> values) {
            addCriterion("InterestFreePeriod not in", values, "interestFreePeriod", false);
            return (Criteria) this;
        }

        /**
         * 免息期
         */
        public Criteria andInterestFreePeriodBetween(Integer value1, Integer value2) {
            addCriterion("InterestFreePeriod between", value1, value2, "interestFreePeriod");
            return (Criteria) this;
        }

        /**
         * 免息期
         */
        public Criteria andInterestFreePeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("InterestFreePeriod not between", value1, value2, "interestFreePeriod");
            return (Criteria) this;
        }

        /**
         * 红包支付（包含首单、商户红包等）金额
         */
        public Criteria andBonusPayAmountIsNull() {
            addCriterion("BonusPayAmount is null");
            return (Criteria) this;
        }

        /**
         * 红包支付（包含首单、商户红包等）金额
         */
        public Criteria andBonusPayAmountIsNotNull() {
            addCriterion("BonusPayAmount is not null");
            return (Criteria) this;
        }

        /**
         * 红包支付（包含首单、商户红包等）金额
         */
        public Criteria andBonusPayAmountEqualTo(BigDecimal value) {
            addCriterion("BonusPayAmount =", value, "bonusPayAmount", false);
            return (Criteria) this;
        }

        /**
         * 红包支付（包含首单、商户红包等）金额
         */
        public Criteria andBonusPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("BonusPayAmount <>", value, "bonusPayAmount", false);
            return (Criteria) this;
        }

        /**
         * 红包支付（包含首单、商户红包等）金额
         */
        public Criteria andBonusPayAmountGreaterThan(BigDecimal value) {
            addCriterion("BonusPayAmount >", value, "bonusPayAmount", false);
            return (Criteria) this;
        }

        /**
         * 红包支付（包含首单、商户红包等）金额
         */
        public Criteria andBonusPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BonusPayAmount >=", value, "bonusPayAmount", false);
            return (Criteria) this;
        }

        /**
         * 红包支付（包含首单、商户红包等）金额
         */
        public Criteria andBonusPayAmountLessThan(BigDecimal value) {
            addCriterion("BonusPayAmount <", value, "bonusPayAmount", false);
            return (Criteria) this;
        }

        /**
         * 红包支付（包含首单、商户红包等）金额
         */
        public Criteria andBonusPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BonusPayAmount <=", value, "bonusPayAmount", false);
            return (Criteria) this;
        }

        /**
         * 红包支付（包含首单、商户红包等）金额
         */
        public Criteria andBonusPayAmountIn(List<BigDecimal> values) {
            addCriterion("BonusPayAmount in", values, "bonusPayAmount", false);
            return (Criteria) this;
        }

        /**
         * 红包支付（包含首单、商户红包等）金额
         */
        public Criteria andBonusPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("BonusPayAmount not in", values, "bonusPayAmount", false);
            return (Criteria) this;
        }

        /**
         * 红包支付（包含首单、商户红包等）金额
         */
        public Criteria andBonusPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BonusPayAmount between", value1, value2, "bonusPayAmount");
            return (Criteria) this;
        }

        /**
         * 红包支付（包含首单、商户红包等）金额
         */
        public Criteria andBonusPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BonusPayAmount not between", value1, value2, "bonusPayAmount");
            return (Criteria) this;
        }

        /**
         * 信用付（人品付）金额
         */
        public Criteria andCreditPayAmountIsNull() {
            addCriterion("CreditPayAmount is null");
            return (Criteria) this;
        }

        /**
         * 信用付（人品付）金额
         */
        public Criteria andCreditPayAmountIsNotNull() {
            addCriterion("CreditPayAmount is not null");
            return (Criteria) this;
        }

        /**
         * 信用付（人品付）金额
         */
        public Criteria andCreditPayAmountEqualTo(BigDecimal value) {
            addCriterion("CreditPayAmount =", value, "creditPayAmount", false);
            return (Criteria) this;
        }

        /**
         * 信用付（人品付）金额
         */
        public Criteria andCreditPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("CreditPayAmount <>", value, "creditPayAmount", false);
            return (Criteria) this;
        }

        /**
         * 信用付（人品付）金额
         */
        public Criteria andCreditPayAmountGreaterThan(BigDecimal value) {
            addCriterion("CreditPayAmount >", value, "creditPayAmount", false);
            return (Criteria) this;
        }

        /**
         * 信用付（人品付）金额
         */
        public Criteria andCreditPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CreditPayAmount >=", value, "creditPayAmount", false);
            return (Criteria) this;
        }

        /**
         * 信用付（人品付）金额
         */
        public Criteria andCreditPayAmountLessThan(BigDecimal value) {
            addCriterion("CreditPayAmount <", value, "creditPayAmount", false);
            return (Criteria) this;
        }

        /**
         * 信用付（人品付）金额
         */
        public Criteria andCreditPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CreditPayAmount <=", value, "creditPayAmount", false);
            return (Criteria) this;
        }

        /**
         * 信用付（人品付）金额
         */
        public Criteria andCreditPayAmountIn(List<BigDecimal> values) {
            addCriterion("CreditPayAmount in", values, "creditPayAmount", false);
            return (Criteria) this;
        }

        /**
         * 信用付（人品付）金额
         */
        public Criteria andCreditPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("CreditPayAmount not in", values, "creditPayAmount", false);
            return (Criteria) this;
        }

        /**
         * 信用付（人品付）金额
         */
        public Criteria andCreditPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CreditPayAmount between", value1, value2, "creditPayAmount");
            return (Criteria) this;
        }

        /**
         * 信用付（人品付）金额
         */
        public Criteria andCreditPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CreditPayAmount not between", value1, value2, "creditPayAmount");
            return (Criteria) this;
        }

        /**
         * 订单状态@see OrderStatusEnum
         */
        public Criteria andOrderStatusIsNull() {
            addCriterion("OrderStatus is null");
            return (Criteria) this;
        }

        /**
         * 订单状态@see OrderStatusEnum
         */
        public Criteria andOrderStatusIsNotNull() {
            addCriterion("OrderStatus is not null");
            return (Criteria) this;
        }

        /**
         * 订单状态@see OrderStatusEnum
         */
        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("OrderStatus =", value, "orderStatus", false);
            return (Criteria) this;
        }

        /**
         * 订单状态@see OrderStatusEnum
         */
        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("OrderStatus <>", value, "orderStatus", false);
            return (Criteria) this;
        }

        /**
         * 订单状态@see OrderStatusEnum
         */
        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("OrderStatus >", value, "orderStatus", false);
            return (Criteria) this;
        }

        /**
         * 订单状态@see OrderStatusEnum
         */
        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderStatus >=", value, "orderStatus", false);
            return (Criteria) this;
        }

        /**
         * 订单状态@see OrderStatusEnum
         */
        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("OrderStatus <", value, "orderStatus", false);
            return (Criteria) this;
        }

        /**
         * 订单状态@see OrderStatusEnum
         */
        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("OrderStatus <=", value, "orderStatus", false);
            return (Criteria) this;
        }

        /**
         * 订单状态@see OrderStatusEnum
         */
        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("OrderStatus in", values, "orderStatus", false);
            return (Criteria) this;
        }

        /**
         * 订单状态@see OrderStatusEnum
         */
        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("OrderStatus not in", values, "orderStatus", false);
            return (Criteria) this;
        }

        /**
         * 订单状态@see OrderStatusEnum
         */
        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("OrderStatus between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        /**
         * 订单状态@see OrderStatusEnum
         */
        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderStatus not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        /**
         * 订单创建时的商户的基站定位
         */
        public Criteria andMerchantsLoactionInfoIsNull() {
            addCriterion("MerchantsLoactionInfo is null");
            return (Criteria) this;
        }

        /**
         * 订单创建时的商户的基站定位
         */
        public Criteria andMerchantsLoactionInfoIsNotNull() {
            addCriterion("MerchantsLoactionInfo is not null");
            return (Criteria) this;
        }

        /**
         * 订单创建时的商户的基站定位
         */
        public Criteria andMerchantsLoactionInfoEqualTo(String value) {
            addCriterion("MerchantsLoactionInfo =", value, "merchantsLoactionInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的商户的基站定位
         */
        public Criteria andMerchantsLoactionInfoNotEqualTo(String value) {
            addCriterion("MerchantsLoactionInfo <>", value, "merchantsLoactionInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的商户的基站定位
         */
        public Criteria andMerchantsLoactionInfoGreaterThan(String value) {
            addCriterion("MerchantsLoactionInfo >", value, "merchantsLoactionInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的商户的基站定位
         */
        public Criteria andMerchantsLoactionInfoGreaterThanOrEqualTo(String value) {
            addCriterion("MerchantsLoactionInfo >=", value, "merchantsLoactionInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的商户的基站定位
         */
        public Criteria andMerchantsLoactionInfoLessThan(String value) {
            addCriterion("MerchantsLoactionInfo <", value, "merchantsLoactionInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的商户的基站定位
         */
        public Criteria andMerchantsLoactionInfoLessThanOrEqualTo(String value) {
            addCriterion("MerchantsLoactionInfo <=", value, "merchantsLoactionInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的商户的基站定位
         */
        public Criteria andMerchantsLoactionInfoLike(String value) {
            addCriterion("MerchantsLoactionInfo like", value, "merchantsLoactionInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的商户的基站定位
         */
        public Criteria andMerchantsLoactionInfoNotLike(String value) {
            addCriterion("MerchantsLoactionInfo not like", value, "merchantsLoactionInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的商户的基站定位
         */
        public Criteria andMerchantsLoactionInfoIn(List<String> values) {
            addCriterion("MerchantsLoactionInfo in", values, "merchantsLoactionInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的商户的基站定位
         */
        public Criteria andMerchantsLoactionInfoNotIn(List<String> values) {
            addCriterion("MerchantsLoactionInfo not in", values, "merchantsLoactionInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的商户的基站定位
         */
        public Criteria andMerchantsLoactionInfoBetween(String value1, String value2) {
            addCriterion("MerchantsLoactionInfo between", value1, value2, "merchantsLoactionInfo");
            return (Criteria) this;
        }

        /**
         * 订单创建时的商户的基站定位
         */
        public Criteria andMerchantsLoactionInfoNotBetween(String value1, String value2) {
            addCriterion("MerchantsLoactionInfo not between", value1, value2, "merchantsLoactionInfo");
            return (Criteria) this;
        }

        /**
         * 订单创建时的基站定位
         */
        public Criteria andUserLocationInfoIsNull() {
            addCriterion("UserLocationInfo is null");
            return (Criteria) this;
        }

        /**
         * 订单创建时的基站定位
         */
        public Criteria andUserLocationInfoIsNotNull() {
            addCriterion("UserLocationInfo is not null");
            return (Criteria) this;
        }

        /**
         * 订单创建时的基站定位
         */
        public Criteria andUserLocationInfoEqualTo(String value) {
            addCriterion("UserLocationInfo =", value, "userLocationInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的基站定位
         */
        public Criteria andUserLocationInfoNotEqualTo(String value) {
            addCriterion("UserLocationInfo <>", value, "userLocationInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的基站定位
         */
        public Criteria andUserLocationInfoGreaterThan(String value) {
            addCriterion("UserLocationInfo >", value, "userLocationInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的基站定位
         */
        public Criteria andUserLocationInfoGreaterThanOrEqualTo(String value) {
            addCriterion("UserLocationInfo >=", value, "userLocationInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的基站定位
         */
        public Criteria andUserLocationInfoLessThan(String value) {
            addCriterion("UserLocationInfo <", value, "userLocationInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的基站定位
         */
        public Criteria andUserLocationInfoLessThanOrEqualTo(String value) {
            addCriterion("UserLocationInfo <=", value, "userLocationInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的基站定位
         */
        public Criteria andUserLocationInfoLike(String value) {
            addCriterion("UserLocationInfo like", value, "userLocationInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的基站定位
         */
        public Criteria andUserLocationInfoNotLike(String value) {
            addCriterion("UserLocationInfo not like", value, "userLocationInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的基站定位
         */
        public Criteria andUserLocationInfoIn(List<String> values) {
            addCriterion("UserLocationInfo in", values, "userLocationInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的基站定位
         */
        public Criteria andUserLocationInfoNotIn(List<String> values) {
            addCriterion("UserLocationInfo not in", values, "userLocationInfo", false);
            return (Criteria) this;
        }

        /**
         * 订单创建时的基站定位
         */
        public Criteria andUserLocationInfoBetween(String value1, String value2) {
            addCriterion("UserLocationInfo between", value1, value2, "userLocationInfo");
            return (Criteria) this;
        }

        /**
         * 订单创建时的基站定位
         */
        public Criteria andUserLocationInfoNotBetween(String value1, String value2) {
            addCriterion("UserLocationInfo not between", value1, value2, "userLocationInfo");
            return (Criteria) this;
        }

        /**
         * 用户账单是否已经查看过
         */
        public Criteria andIsReadedIsNull() {
            addCriterion("IsReaded is null");
            return (Criteria) this;
        }

        /**
         * 用户账单是否已经查看过
         */
        public Criteria andIsReadedIsNotNull() {
            addCriterion("IsReaded is not null");
            return (Criteria) this;
        }

        /**
         * 用户账单是否已经查看过
         */
        public Criteria andIsReadedEqualTo(Boolean value) {
            addCriterion("IsReaded =", value, "isReaded", false);
            return (Criteria) this;
        }

        /**
         * 用户账单是否已经查看过
         */
        public Criteria andIsReadedNotEqualTo(Boolean value) {
            addCriterion("IsReaded <>", value, "isReaded", false);
            return (Criteria) this;
        }

        /**
         * 用户账单是否已经查看过
         */
        public Criteria andIsReadedGreaterThan(Boolean value) {
            addCriterion("IsReaded >", value, "isReaded", false);
            return (Criteria) this;
        }

        /**
         * 用户账单是否已经查看过
         */
        public Criteria andIsReadedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsReaded >=", value, "isReaded", false);
            return (Criteria) this;
        }

        /**
         * 用户账单是否已经查看过
         */
        public Criteria andIsReadedLessThan(Boolean value) {
            addCriterion("IsReaded <", value, "isReaded", false);
            return (Criteria) this;
        }

        /**
         * 用户账单是否已经查看过
         */
        public Criteria andIsReadedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsReaded <=", value, "isReaded", false);
            return (Criteria) this;
        }

        /**
         * 用户账单是否已经查看过
         */
        public Criteria andIsReadedIn(List<Boolean> values) {
            addCriterion("IsReaded in", values, "isReaded", false);
            return (Criteria) this;
        }

        /**
         * 用户账单是否已经查看过
         */
        public Criteria andIsReadedNotIn(List<Boolean> values) {
            addCriterion("IsReaded not in", values, "isReaded", false);
            return (Criteria) this;
        }

        /**
         * 用户账单是否已经查看过
         */
        public Criteria andIsReadedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsReaded between", value1, value2, "isReaded");
            return (Criteria) this;
        }

        /**
         * 用户账单是否已经查看过
         */
        public Criteria andIsReadedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsReaded not between", value1, value2, "isReaded");
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
         * 最后修改时间
         */
        public Criteria andLastModifyTimeIsNull() {
            addCriterion("LastModifyTime is null");
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("LastModifyTime is not null");
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("LastModifyTime =", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("LastModifyTime <>", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("LastModifyTime >", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastModifyTime >=", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("LastModifyTime <", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("LastModifyTime <=", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("LastModifyTime in", values, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("LastModifyTime not in", values, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("LastModifyTime between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        /**
         * 最后修改时间
         */
        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("LastModifyTime not between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }
    }

    /**
     * 用户订单表
     *T_Order
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 用户订单表
     * T_Order
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
     * 用户订单表
     *T_Order
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
     * 用户订单表
     *T_Order
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