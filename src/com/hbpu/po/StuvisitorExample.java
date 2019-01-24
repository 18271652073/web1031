package com.hbpu.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StuvisitorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuvisitorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(Integer value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(Integer value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(Integer value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(Integer value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(Integer value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<Integer> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<Integer> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(Integer value1, Integer value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(Integer value1, Integer value2) {
            addCriterion("vid not between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVcdateIsNull() {
            addCriterion("vcdate is null");
            return (Criteria) this;
        }

        public Criteria andVcdateIsNotNull() {
            addCriterion("vcdate is not null");
            return (Criteria) this;
        }

        public Criteria andVcdateEqualTo(Date value) {
            addCriterionForJDBCDate("vcdate =", value, "vcdate");
            return (Criteria) this;
        }

        public Criteria andVcdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("vcdate <>", value, "vcdate");
            return (Criteria) this;
        }

        public Criteria andVcdateGreaterThan(Date value) {
            addCriterionForJDBCDate("vcdate >", value, "vcdate");
            return (Criteria) this;
        }

        public Criteria andVcdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vcdate >=", value, "vcdate");
            return (Criteria) this;
        }

        public Criteria andVcdateLessThan(Date value) {
            addCriterionForJDBCDate("vcdate <", value, "vcdate");
            return (Criteria) this;
        }

        public Criteria andVcdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vcdate <=", value, "vcdate");
            return (Criteria) this;
        }

        public Criteria andVcdateIn(List<Date> values) {
            addCriterionForJDBCDate("vcdate in", values, "vcdate");
            return (Criteria) this;
        }

        public Criteria andVcdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("vcdate not in", values, "vcdate");
            return (Criteria) this;
        }

        public Criteria andVcdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vcdate between", value1, value2, "vcdate");
            return (Criteria) this;
        }

        public Criteria andVcdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vcdate not between", value1, value2, "vcdate");
            return (Criteria) this;
        }

        public Criteria andVldateIsNull() {
            addCriterion("vldate is null");
            return (Criteria) this;
        }

        public Criteria andVldateIsNotNull() {
            addCriterion("vldate is not null");
            return (Criteria) this;
        }

        public Criteria andVldateEqualTo(Date value) {
            addCriterionForJDBCDate("vldate =", value, "vldate");
            return (Criteria) this;
        }

        public Criteria andVldateNotEqualTo(Date value) {
            addCriterionForJDBCDate("vldate <>", value, "vldate");
            return (Criteria) this;
        }

        public Criteria andVldateGreaterThan(Date value) {
            addCriterionForJDBCDate("vldate >", value, "vldate");
            return (Criteria) this;
        }

        public Criteria andVldateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vldate >=", value, "vldate");
            return (Criteria) this;
        }

        public Criteria andVldateLessThan(Date value) {
            addCriterionForJDBCDate("vldate <", value, "vldate");
            return (Criteria) this;
        }

        public Criteria andVldateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vldate <=", value, "vldate");
            return (Criteria) this;
        }

        public Criteria andVldateIn(List<Date> values) {
            addCriterionForJDBCDate("vldate in", values, "vldate");
            return (Criteria) this;
        }

        public Criteria andVldateNotIn(List<Date> values) {
            addCriterionForJDBCDate("vldate not in", values, "vldate");
            return (Criteria) this;
        }

        public Criteria andVldateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vldate between", value1, value2, "vldate");
            return (Criteria) this;
        }

        public Criteria andVldateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vldate not between", value1, value2, "vldate");
            return (Criteria) this;
        }

        public Criteria andVnameIsNull() {
            addCriterion("vname is null");
            return (Criteria) this;
        }

        public Criteria andVnameIsNotNull() {
            addCriterion("vname is not null");
            return (Criteria) this;
        }

        public Criteria andVnameEqualTo(String value) {
            addCriterion("vname =", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotEqualTo(String value) {
            addCriterion("vname <>", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThan(String value) {
            addCriterion("vname >", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThanOrEqualTo(String value) {
            addCriterion("vname >=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThan(String value) {
            addCriterion("vname <", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThanOrEqualTo(String value) {
            addCriterion("vname <=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLike(String value) {
            addCriterion("vname like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotLike(String value) {
            addCriterion("vname not like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameIn(List<String> values) {
            addCriterion("vname in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotIn(List<String> values) {
            addCriterion("vname not in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameBetween(String value1, String value2) {
            addCriterion("vname between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotBetween(String value1, String value2) {
            addCriterion("vname not between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andVdromIsNull() {
            addCriterion("vdrom is null");
            return (Criteria) this;
        }

        public Criteria andVdromIsNotNull() {
            addCriterion("vdrom is not null");
            return (Criteria) this;
        }

        public Criteria andVdromEqualTo(String value) {
            addCriterion("vdrom =", value, "vdrom");
            return (Criteria) this;
        }

        public Criteria andVdromNotEqualTo(String value) {
            addCriterion("vdrom <>", value, "vdrom");
            return (Criteria) this;
        }

        public Criteria andVdromGreaterThan(String value) {
            addCriterion("vdrom >", value, "vdrom");
            return (Criteria) this;
        }

        public Criteria andVdromGreaterThanOrEqualTo(String value) {
            addCriterion("vdrom >=", value, "vdrom");
            return (Criteria) this;
        }

        public Criteria andVdromLessThan(String value) {
            addCriterion("vdrom <", value, "vdrom");
            return (Criteria) this;
        }

        public Criteria andVdromLessThanOrEqualTo(String value) {
            addCriterion("vdrom <=", value, "vdrom");
            return (Criteria) this;
        }

        public Criteria andVdromLike(String value) {
            addCriterion("vdrom like", value, "vdrom");
            return (Criteria) this;
        }

        public Criteria andVdromNotLike(String value) {
            addCriterion("vdrom not like", value, "vdrom");
            return (Criteria) this;
        }

        public Criteria andVdromIn(List<String> values) {
            addCriterion("vdrom in", values, "vdrom");
            return (Criteria) this;
        }

        public Criteria andVdromNotIn(List<String> values) {
            addCriterion("vdrom not in", values, "vdrom");
            return (Criteria) this;
        }

        public Criteria andVdromBetween(String value1, String value2) {
            addCriterion("vdrom between", value1, value2, "vdrom");
            return (Criteria) this;
        }

        public Criteria andVdromNotBetween(String value1, String value2) {
            addCriterion("vdrom not between", value1, value2, "vdrom");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

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
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}