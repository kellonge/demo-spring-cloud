package com.kellonge.demo.spring.cloud.dao.examples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * 用户信息
 * T_User_Info
 */
public class UserInfoEntityExample {
    /**
     * 顺序排序
     */
    public static final String ORDERBYDIRECTION_ASC = "asc";

    /**
     * 倒序排序
     */
    public static final String ORDERBYDIRECTION_DESC = "desc";

    /**
     * 用户标识
     */
    public static final String FIELD_USERID = "UserId";

    /**
     * 显示名称
     */
    public static final String FIELD_DISPLAYNAME = "DisplayName";

    /**
     * 真实名称
     */
    public static final String FIELD_REALNAME = "RealName";

    /**
     * 身份证号
     */
    public static final String FIELD_IDENTIFYNO = "IdentifyNo";

    /**
     * 用户实名状态
     */
    public static final String FIELD_REALNAMESTATUS = "RealNameStatus";

    /**
     * 用户实名时间
     */
    public static final String FIELD_REALNAMETIME = "RealNameTime";

    /**
     * 手机号
     */
    public static final String FIELD_MOBILE = "Mobile";

    /**
     * 头像
     */
    public static final String FIELD_FACEIMG = "FaceImg";

    /**
     * 创建时间
     */
    public static final String FIELD_CREATETIME = "CreateTime";

    /**
     * 最后修改时间
     */
    public static final String FIELD_LASTMODIFYTIME = "LastModifyTime";

    /**
     * T_User_Info
     */
    protected Integer offset;

    /**
     * T_User_Info
     */
    protected Integer size;

    /**
     * T_User_Info
     */
    protected String orderByClause;

    /**
     * T_User_Info
     */
    protected boolean distinct;

    /**
     * T_User_Info
     */
    protected List<Criteria> oredCriteria;

    /**
     * T_User_Info
     */
    public UserInfoEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * T_User_Info
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * T_User_Info
     */
    public void setOrderByClause(OrderBy orderBy) {
        this.orderByClause = orderBy.toString();
    }

    /**
     * T_User_Info
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * T_User_Info
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * T_User_Info
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * T_User_Info
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * T_User_Info
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * T_User_Info
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * T_User_Info
     */
    public Integer getSize() {
        return size;
    }

    /**
     * T_User_Info
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * T_User_Info
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * T_User_Info
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * T_User_Info
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * T_User_Info
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * T_User_Info
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 用户信息
     * T_User_Info
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
         * 显示名称
         */
        public Criteria andDisplayNameIsNull() {
            addCriterion("DisplayName is null");
            return (Criteria) this;
        }

        /**
         * 显示名称
         */
        public Criteria andDisplayNameIsNotNull() {
            addCriterion("DisplayName is not null");
            return (Criteria) this;
        }

        /**
         * 显示名称
         */
        public Criteria andDisplayNameEqualTo(String value) {
            addCriterion("DisplayName =", value, "displayName", false);
            return (Criteria) this;
        }

        /**
         * 显示名称
         */
        public Criteria andDisplayNameNotEqualTo(String value) {
            addCriterion("DisplayName <>", value, "displayName", false);
            return (Criteria) this;
        }

        /**
         * 显示名称
         */
        public Criteria andDisplayNameGreaterThan(String value) {
            addCriterion("DisplayName >", value, "displayName", false);
            return (Criteria) this;
        }

        /**
         * 显示名称
         */
        public Criteria andDisplayNameGreaterThanOrEqualTo(String value) {
            addCriterion("DisplayName >=", value, "displayName", false);
            return (Criteria) this;
        }

        /**
         * 显示名称
         */
        public Criteria andDisplayNameLessThan(String value) {
            addCriterion("DisplayName <", value, "displayName", false);
            return (Criteria) this;
        }

        /**
         * 显示名称
         */
        public Criteria andDisplayNameLessThanOrEqualTo(String value) {
            addCriterion("DisplayName <=", value, "displayName", false);
            return (Criteria) this;
        }

        /**
         * 显示名称
         */
        public Criteria andDisplayNameLike(String value) {
            addCriterion("DisplayName like", value, "displayName", false);
            return (Criteria) this;
        }

        /**
         * 显示名称
         */
        public Criteria andDisplayNameNotLike(String value) {
            addCriterion("DisplayName not like", value, "displayName", false);
            return (Criteria) this;
        }

        /**
         * 显示名称
         */
        public Criteria andDisplayNameIn(List<String> values) {
            addCriterion("DisplayName in", values, "displayName", false);
            return (Criteria) this;
        }

        /**
         * 显示名称
         */
        public Criteria andDisplayNameNotIn(List<String> values) {
            addCriterion("DisplayName not in", values, "displayName", false);
            return (Criteria) this;
        }

        /**
         * 显示名称
         */
        public Criteria andDisplayNameBetween(String value1, String value2) {
            addCriterion("DisplayName between", value1, value2, "displayName");
            return (Criteria) this;
        }

        /**
         * 显示名称
         */
        public Criteria andDisplayNameNotBetween(String value1, String value2) {
            addCriterion("DisplayName not between", value1, value2, "displayName");
            return (Criteria) this;
        }

        /**
         * 真实名称
         */
        public Criteria andRealNameIsNull() {
            addCriterion("RealName is null");
            return (Criteria) this;
        }

        /**
         * 真实名称
         */
        public Criteria andRealNameIsNotNull() {
            addCriterion("RealName is not null");
            return (Criteria) this;
        }

        /**
         * 真实名称
         */
        public Criteria andRealNameEqualTo(String value) {
            addCriterion("RealName =", value, "realName", false);
            return (Criteria) this;
        }

        /**
         * 真实名称
         */
        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("RealName <>", value, "realName", false);
            return (Criteria) this;
        }

        /**
         * 真实名称
         */
        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("RealName >", value, "realName", false);
            return (Criteria) this;
        }

        /**
         * 真实名称
         */
        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("RealName >=", value, "realName", false);
            return (Criteria) this;
        }

        /**
         * 真实名称
         */
        public Criteria andRealNameLessThan(String value) {
            addCriterion("RealName <", value, "realName", false);
            return (Criteria) this;
        }

        /**
         * 真实名称
         */
        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("RealName <=", value, "realName", false);
            return (Criteria) this;
        }

        /**
         * 真实名称
         */
        public Criteria andRealNameLike(String value) {
            addCriterion("RealName like", value, "realName", false);
            return (Criteria) this;
        }

        /**
         * 真实名称
         */
        public Criteria andRealNameNotLike(String value) {
            addCriterion("RealName not like", value, "realName", false);
            return (Criteria) this;
        }

        /**
         * 真实名称
         */
        public Criteria andRealNameIn(List<String> values) {
            addCriterion("RealName in", values, "realName", false);
            return (Criteria) this;
        }

        /**
         * 真实名称
         */
        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("RealName not in", values, "realName", false);
            return (Criteria) this;
        }

        /**
         * 真实名称
         */
        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("RealName between", value1, value2, "realName");
            return (Criteria) this;
        }

        /**
         * 真实名称
         */
        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("RealName not between", value1, value2, "realName");
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdentifyNoIsNull() {
            addCriterion("IdentifyNo is null");
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdentifyNoIsNotNull() {
            addCriterion("IdentifyNo is not null");
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdentifyNoEqualTo(String value) {
            addCriterion("IdentifyNo =", value, "identifyNo", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdentifyNoNotEqualTo(String value) {
            addCriterion("IdentifyNo <>", value, "identifyNo", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdentifyNoGreaterThan(String value) {
            addCriterion("IdentifyNo >", value, "identifyNo", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdentifyNoGreaterThanOrEqualTo(String value) {
            addCriterion("IdentifyNo >=", value, "identifyNo", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdentifyNoLessThan(String value) {
            addCriterion("IdentifyNo <", value, "identifyNo", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdentifyNoLessThanOrEqualTo(String value) {
            addCriterion("IdentifyNo <=", value, "identifyNo", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdentifyNoLike(String value) {
            addCriterion("IdentifyNo like", value, "identifyNo", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdentifyNoNotLike(String value) {
            addCriterion("IdentifyNo not like", value, "identifyNo", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdentifyNoIn(List<String> values) {
            addCriterion("IdentifyNo in", values, "identifyNo", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdentifyNoNotIn(List<String> values) {
            addCriterion("IdentifyNo not in", values, "identifyNo", false);
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdentifyNoBetween(String value1, String value2) {
            addCriterion("IdentifyNo between", value1, value2, "identifyNo");
            return (Criteria) this;
        }

        /**
         * 身份证号
         */
        public Criteria andIdentifyNoNotBetween(String value1, String value2) {
            addCriterion("IdentifyNo not between", value1, value2, "identifyNo");
            return (Criteria) this;
        }

        /**
         * 用户实名状态
         */
        public Criteria andRealNameStatusIsNull() {
            addCriterion("RealNameStatus is null");
            return (Criteria) this;
        }

        /**
         * 用户实名状态
         */
        public Criteria andRealNameStatusIsNotNull() {
            addCriterion("RealNameStatus is not null");
            return (Criteria) this;
        }

        /**
         * 用户实名状态
         */
        public Criteria andRealNameStatusEqualTo(Integer value) {
            addCriterion("RealNameStatus =", value, "realNameStatus", false);
            return (Criteria) this;
        }

        /**
         * 用户实名状态
         */
        public Criteria andRealNameStatusNotEqualTo(Integer value) {
            addCriterion("RealNameStatus <>", value, "realNameStatus", false);
            return (Criteria) this;
        }

        /**
         * 用户实名状态
         */
        public Criteria andRealNameStatusGreaterThan(Integer value) {
            addCriterion("RealNameStatus >", value, "realNameStatus", false);
            return (Criteria) this;
        }

        /**
         * 用户实名状态
         */
        public Criteria andRealNameStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("RealNameStatus >=", value, "realNameStatus", false);
            return (Criteria) this;
        }

        /**
         * 用户实名状态
         */
        public Criteria andRealNameStatusLessThan(Integer value) {
            addCriterion("RealNameStatus <", value, "realNameStatus", false);
            return (Criteria) this;
        }

        /**
         * 用户实名状态
         */
        public Criteria andRealNameStatusLessThanOrEqualTo(Integer value) {
            addCriterion("RealNameStatus <=", value, "realNameStatus", false);
            return (Criteria) this;
        }

        /**
         * 用户实名状态
         */
        public Criteria andRealNameStatusIn(List<Integer> values) {
            addCriterion("RealNameStatus in", values, "realNameStatus", false);
            return (Criteria) this;
        }

        /**
         * 用户实名状态
         */
        public Criteria andRealNameStatusNotIn(List<Integer> values) {
            addCriterion("RealNameStatus not in", values, "realNameStatus", false);
            return (Criteria) this;
        }

        /**
         * 用户实名状态
         */
        public Criteria andRealNameStatusBetween(Integer value1, Integer value2) {
            addCriterion("RealNameStatus between", value1, value2, "realNameStatus");
            return (Criteria) this;
        }

        /**
         * 用户实名状态
         */
        public Criteria andRealNameStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("RealNameStatus not between", value1, value2, "realNameStatus");
            return (Criteria) this;
        }

        /**
         * 用户实名时间
         */
        public Criteria andRealNameTimeIsNull() {
            addCriterion("RealNameTime is null");
            return (Criteria) this;
        }

        /**
         * 用户实名时间
         */
        public Criteria andRealNameTimeIsNotNull() {
            addCriterion("RealNameTime is not null");
            return (Criteria) this;
        }

        /**
         * 用户实名时间
         */
        public Criteria andRealNameTimeEqualTo(Date value) {
            addCriterion("RealNameTime =", value, "realNameTime", false);
            return (Criteria) this;
        }

        /**
         * 用户实名时间
         */
        public Criteria andRealNameTimeNotEqualTo(Date value) {
            addCriterion("RealNameTime <>", value, "realNameTime", false);
            return (Criteria) this;
        }

        /**
         * 用户实名时间
         */
        public Criteria andRealNameTimeGreaterThan(Date value) {
            addCriterion("RealNameTime >", value, "realNameTime", false);
            return (Criteria) this;
        }

        /**
         * 用户实名时间
         */
        public Criteria andRealNameTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RealNameTime >=", value, "realNameTime", false);
            return (Criteria) this;
        }

        /**
         * 用户实名时间
         */
        public Criteria andRealNameTimeLessThan(Date value) {
            addCriterion("RealNameTime <", value, "realNameTime", false);
            return (Criteria) this;
        }

        /**
         * 用户实名时间
         */
        public Criteria andRealNameTimeLessThanOrEqualTo(Date value) {
            addCriterion("RealNameTime <=", value, "realNameTime", false);
            return (Criteria) this;
        }

        /**
         * 用户实名时间
         */
        public Criteria andRealNameTimeIn(List<Date> values) {
            addCriterion("RealNameTime in", values, "realNameTime", false);
            return (Criteria) this;
        }

        /**
         * 用户实名时间
         */
        public Criteria andRealNameTimeNotIn(List<Date> values) {
            addCriterion("RealNameTime not in", values, "realNameTime", false);
            return (Criteria) this;
        }

        /**
         * 用户实名时间
         */
        public Criteria andRealNameTimeBetween(Date value1, Date value2) {
            addCriterion("RealNameTime between", value1, value2, "realNameTime");
            return (Criteria) this;
        }

        /**
         * 用户实名时间
         */
        public Criteria andRealNameTimeNotBetween(Date value1, Date value2) {
            addCriterion("RealNameTime not between", value1, value2, "realNameTime");
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileIsNull() {
            addCriterion("Mobile is null");
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileIsNotNull() {
            addCriterion("Mobile is not null");
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileEqualTo(String value) {
            addCriterion("Mobile =", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("Mobile <>", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileGreaterThan(String value) {
            addCriterion("Mobile >", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("Mobile >=", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileLessThan(String value) {
            addCriterion("Mobile <", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("Mobile <=", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileLike(String value) {
            addCriterion("Mobile like", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileNotLike(String value) {
            addCriterion("Mobile not like", value, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileIn(List<String> values) {
            addCriterion("Mobile in", values, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("Mobile not in", values, "mobile", false);
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("Mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        /**
         * 手机号
         */
        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("Mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        /**
         * 头像
         */
        public Criteria andFaceImgIsNull() {
            addCriterion("FaceImg is null");
            return (Criteria) this;
        }

        /**
         * 头像
         */
        public Criteria andFaceImgIsNotNull() {
            addCriterion("FaceImg is not null");
            return (Criteria) this;
        }

        /**
         * 头像
         */
        public Criteria andFaceImgEqualTo(String value) {
            addCriterion("FaceImg =", value, "faceImg", false);
            return (Criteria) this;
        }

        /**
         * 头像
         */
        public Criteria andFaceImgNotEqualTo(String value) {
            addCriterion("FaceImg <>", value, "faceImg", false);
            return (Criteria) this;
        }

        /**
         * 头像
         */
        public Criteria andFaceImgGreaterThan(String value) {
            addCriterion("FaceImg >", value, "faceImg", false);
            return (Criteria) this;
        }

        /**
         * 头像
         */
        public Criteria andFaceImgGreaterThanOrEqualTo(String value) {
            addCriterion("FaceImg >=", value, "faceImg", false);
            return (Criteria) this;
        }

        /**
         * 头像
         */
        public Criteria andFaceImgLessThan(String value) {
            addCriterion("FaceImg <", value, "faceImg", false);
            return (Criteria) this;
        }

        /**
         * 头像
         */
        public Criteria andFaceImgLessThanOrEqualTo(String value) {
            addCriterion("FaceImg <=", value, "faceImg", false);
            return (Criteria) this;
        }

        /**
         * 头像
         */
        public Criteria andFaceImgLike(String value) {
            addCriterion("FaceImg like", value, "faceImg", false);
            return (Criteria) this;
        }

        /**
         * 头像
         */
        public Criteria andFaceImgNotLike(String value) {
            addCriterion("FaceImg not like", value, "faceImg", false);
            return (Criteria) this;
        }

        /**
         * 头像
         */
        public Criteria andFaceImgIn(List<String> values) {
            addCriterion("FaceImg in", values, "faceImg", false);
            return (Criteria) this;
        }

        /**
         * 头像
         */
        public Criteria andFaceImgNotIn(List<String> values) {
            addCriterion("FaceImg not in", values, "faceImg", false);
            return (Criteria) this;
        }

        /**
         * 头像
         */
        public Criteria andFaceImgBetween(String value1, String value2) {
            addCriterion("FaceImg between", value1, value2, "faceImg");
            return (Criteria) this;
        }

        /**
         * 头像
         */
        public Criteria andFaceImgNotBetween(String value1, String value2) {
            addCriterion("FaceImg not between", value1, value2, "faceImg");
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
     * 用户信息
     *T_User_Info
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 用户信息
     * T_User_Info
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
     * 用户信息
     *T_User_Info
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
     * 用户信息
     *T_User_Info
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