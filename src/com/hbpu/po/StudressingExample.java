package com.hbpu.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudressingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudressingExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDstuidIsNull() {
            addCriterion("dstuid is null");
            return (Criteria) this;
        }

        public Criteria andDstuidIsNotNull() {
            addCriterion("dstuid is not null");
            return (Criteria) this;
        }

        public Criteria andDstuidEqualTo(String value) {
            addCriterion("dstuid =", value, "dstuid");
            return (Criteria) this;
        }

        public Criteria andDstuidNotEqualTo(String value) {
            addCriterion("dstuid <>", value, "dstuid");
            return (Criteria) this;
        }

        public Criteria andDstuidGreaterThan(String value) {
            addCriterion("dstuid >", value, "dstuid");
            return (Criteria) this;
        }

        public Criteria andDstuidGreaterThanOrEqualTo(String value) {
            addCriterion("dstuid >=", value, "dstuid");
            return (Criteria) this;
        }

        public Criteria andDstuidLessThan(String value) {
            addCriterion("dstuid <", value, "dstuid");
            return (Criteria) this;
        }

        public Criteria andDstuidLessThanOrEqualTo(String value) {
            addCriterion("dstuid <=", value, "dstuid");
            return (Criteria) this;
        }

        public Criteria andDstuidLike(String value) {
            addCriterion("dstuid like", value, "dstuid");
            return (Criteria) this;
        }

        public Criteria andDstuidNotLike(String value) {
            addCriterion("dstuid not like", value, "dstuid");
            return (Criteria) this;
        }

        public Criteria andDstuidIn(List<String> values) {
            addCriterion("dstuid in", values, "dstuid");
            return (Criteria) this;
        }

        public Criteria andDstuidNotIn(List<String> values) {
            addCriterion("dstuid not in", values, "dstuid");
            return (Criteria) this;
        }

        public Criteria andDstuidBetween(String value1, String value2) {
            addCriterion("dstuid between", value1, value2, "dstuid");
            return (Criteria) this;
        }

        public Criteria andDstuidNotBetween(String value1, String value2) {
            addCriterion("dstuid not between", value1, value2, "dstuid");
            return (Criteria) this;
        }

        public Criteria andDnameIsNull() {
            addCriterion("dname is null");
            return (Criteria) this;
        }

        public Criteria andDnameIsNotNull() {
            addCriterion("dname is not null");
            return (Criteria) this;
        }

        public Criteria andDnameEqualTo(String value) {
            addCriterion("dname =", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotEqualTo(String value) {
            addCriterion("dname <>", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThan(String value) {
            addCriterion("dname >", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThanOrEqualTo(String value) {
            addCriterion("dname >=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThan(String value) {
            addCriterion("dname <", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThanOrEqualTo(String value) {
            addCriterion("dname <=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLike(String value) {
            addCriterion("dname like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotLike(String value) {
            addCriterion("dname not like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameIn(List<String> values) {
            addCriterion("dname in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotIn(List<String> values) {
            addCriterion("dname not in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameBetween(String value1, String value2) {
            addCriterion("dname between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotBetween(String value1, String value2) {
            addCriterion("dname not between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDsexIsNull() {
            addCriterion("dsex is null");
            return (Criteria) this;
        }

        public Criteria andDsexIsNotNull() {
            addCriterion("dsex is not null");
            return (Criteria) this;
        }

        public Criteria andDsexEqualTo(String value) {
            addCriterion("dsex =", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotEqualTo(String value) {
            addCriterion("dsex <>", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexGreaterThan(String value) {
            addCriterion("dsex >", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexGreaterThanOrEqualTo(String value) {
            addCriterion("dsex >=", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexLessThan(String value) {
            addCriterion("dsex <", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexLessThanOrEqualTo(String value) {
            addCriterion("dsex <=", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexLike(String value) {
            addCriterion("dsex like", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotLike(String value) {
            addCriterion("dsex not like", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexIn(List<String> values) {
            addCriterion("dsex in", values, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotIn(List<String> values) {
            addCriterion("dsex not in", values, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexBetween(String value1, String value2) {
            addCriterion("dsex between", value1, value2, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotBetween(String value1, String value2) {
            addCriterion("dsex not between", value1, value2, "dsex");
            return (Criteria) this;
        }

        public Criteria andDdromnumIsNull() {
            addCriterion("ddromnum is null");
            return (Criteria) this;
        }

        public Criteria andDdromnumIsNotNull() {
            addCriterion("ddromnum is not null");
            return (Criteria) this;
        }

        public Criteria andDdromnumEqualTo(String value) {
            addCriterion("ddromnum =", value, "ddromnum");
            return (Criteria) this;
        }

        public Criteria andDdromnumNotEqualTo(String value) {
            addCriterion("ddromnum <>", value, "ddromnum");
            return (Criteria) this;
        }

        public Criteria andDdromnumGreaterThan(String value) {
            addCriterion("ddromnum >", value, "ddromnum");
            return (Criteria) this;
        }

        public Criteria andDdromnumGreaterThanOrEqualTo(String value) {
            addCriterion("ddromnum >=", value, "ddromnum");
            return (Criteria) this;
        }

        public Criteria andDdromnumLessThan(String value) {
            addCriterion("ddromnum <", value, "ddromnum");
            return (Criteria) this;
        }

        public Criteria andDdromnumLessThanOrEqualTo(String value) {
            addCriterion("ddromnum <=", value, "ddromnum");
            return (Criteria) this;
        }

        public Criteria andDdromnumLike(String value) {
            addCriterion("ddromnum like", value, "ddromnum");
            return (Criteria) this;
        }

        public Criteria andDdromnumNotLike(String value) {
            addCriterion("ddromnum not like", value, "ddromnum");
            return (Criteria) this;
        }

        public Criteria andDdromnumIn(List<String> values) {
            addCriterion("ddromnum in", values, "ddromnum");
            return (Criteria) this;
        }

        public Criteria andDdromnumNotIn(List<String> values) {
            addCriterion("ddromnum not in", values, "ddromnum");
            return (Criteria) this;
        }

        public Criteria andDdromnumBetween(String value1, String value2) {
            addCriterion("ddromnum between", value1, value2, "ddromnum");
            return (Criteria) this;
        }

        public Criteria andDdromnumNotBetween(String value1, String value2) {
            addCriterion("ddromnum not between", value1, value2, "ddromnum");
            return (Criteria) this;
        }

        public Criteria andDcollegeIsNull() {
            addCriterion("dcollege is null");
            return (Criteria) this;
        }

        public Criteria andDcollegeIsNotNull() {
            addCriterion("dcollege is not null");
            return (Criteria) this;
        }

        public Criteria andDcollegeEqualTo(String value) {
            addCriterion("dcollege =", value, "dcollege");
            return (Criteria) this;
        }

        public Criteria andDcollegeNotEqualTo(String value) {
            addCriterion("dcollege <>", value, "dcollege");
            return (Criteria) this;
        }

        public Criteria andDcollegeGreaterThan(String value) {
            addCriterion("dcollege >", value, "dcollege");
            return (Criteria) this;
        }

        public Criteria andDcollegeGreaterThanOrEqualTo(String value) {
            addCriterion("dcollege >=", value, "dcollege");
            return (Criteria) this;
        }

        public Criteria andDcollegeLessThan(String value) {
            addCriterion("dcollege <", value, "dcollege");
            return (Criteria) this;
        }

        public Criteria andDcollegeLessThanOrEqualTo(String value) {
            addCriterion("dcollege <=", value, "dcollege");
            return (Criteria) this;
        }

        public Criteria andDcollegeLike(String value) {
            addCriterion("dcollege like", value, "dcollege");
            return (Criteria) this;
        }

        public Criteria andDcollegeNotLike(String value) {
            addCriterion("dcollege not like", value, "dcollege");
            return (Criteria) this;
        }

        public Criteria andDcollegeIn(List<String> values) {
            addCriterion("dcollege in", values, "dcollege");
            return (Criteria) this;
        }

        public Criteria andDcollegeNotIn(List<String> values) {
            addCriterion("dcollege not in", values, "dcollege");
            return (Criteria) this;
        }

        public Criteria andDcollegeBetween(String value1, String value2) {
            addCriterion("dcollege between", value1, value2, "dcollege");
            return (Criteria) this;
        }

        public Criteria andDcollegeNotBetween(String value1, String value2) {
            addCriterion("dcollege not between", value1, value2, "dcollege");
            return (Criteria) this;
        }

        public Criteria andDmajorIsNull() {
            addCriterion("dmajor is null");
            return (Criteria) this;
        }

        public Criteria andDmajorIsNotNull() {
            addCriterion("dmajor is not null");
            return (Criteria) this;
        }

        public Criteria andDmajorEqualTo(String value) {
            addCriterion("dmajor =", value, "dmajor");
            return (Criteria) this;
        }

        public Criteria andDmajorNotEqualTo(String value) {
            addCriterion("dmajor <>", value, "dmajor");
            return (Criteria) this;
        }

        public Criteria andDmajorGreaterThan(String value) {
            addCriterion("dmajor >", value, "dmajor");
            return (Criteria) this;
        }

        public Criteria andDmajorGreaterThanOrEqualTo(String value) {
            addCriterion("dmajor >=", value, "dmajor");
            return (Criteria) this;
        }

        public Criteria andDmajorLessThan(String value) {
            addCriterion("dmajor <", value, "dmajor");
            return (Criteria) this;
        }

        public Criteria andDmajorLessThanOrEqualTo(String value) {
            addCriterion("dmajor <=", value, "dmajor");
            return (Criteria) this;
        }

        public Criteria andDmajorLike(String value) {
            addCriterion("dmajor like", value, "dmajor");
            return (Criteria) this;
        }

        public Criteria andDmajorNotLike(String value) {
            addCriterion("dmajor not like", value, "dmajor");
            return (Criteria) this;
        }

        public Criteria andDmajorIn(List<String> values) {
            addCriterion("dmajor in", values, "dmajor");
            return (Criteria) this;
        }

        public Criteria andDmajorNotIn(List<String> values) {
            addCriterion("dmajor not in", values, "dmajor");
            return (Criteria) this;
        }

        public Criteria andDmajorBetween(String value1, String value2) {
            addCriterion("dmajor between", value1, value2, "dmajor");
            return (Criteria) this;
        }

        public Criteria andDmajorNotBetween(String value1, String value2) {
            addCriterion("dmajor not between", value1, value2, "dmajor");
            return (Criteria) this;
        }

        public Criteria andDdatialIsNull() {
            addCriterion("ddatial is null");
            return (Criteria) this;
        }

        public Criteria andDdatialIsNotNull() {
            addCriterion("ddatial is not null");
            return (Criteria) this;
        }

        public Criteria andDdatialEqualTo(String value) {
            addCriterion("ddatial =", value, "ddatial");
            return (Criteria) this;
        }

        public Criteria andDdatialNotEqualTo(String value) {
            addCriterion("ddatial <>", value, "ddatial");
            return (Criteria) this;
        }

        public Criteria andDdatialGreaterThan(String value) {
            addCriterion("ddatial >", value, "ddatial");
            return (Criteria) this;
        }

        public Criteria andDdatialGreaterThanOrEqualTo(String value) {
            addCriterion("ddatial >=", value, "ddatial");
            return (Criteria) this;
        }

        public Criteria andDdatialLessThan(String value) {
            addCriterion("ddatial <", value, "ddatial");
            return (Criteria) this;
        }

        public Criteria andDdatialLessThanOrEqualTo(String value) {
            addCriterion("ddatial <=", value, "ddatial");
            return (Criteria) this;
        }

        public Criteria andDdatialLike(String value) {
            addCriterion("ddatial like", value, "ddatial");
            return (Criteria) this;
        }

        public Criteria andDdatialNotLike(String value) {
            addCriterion("ddatial not like", value, "ddatial");
            return (Criteria) this;
        }

        public Criteria andDdatialIn(List<String> values) {
            addCriterion("ddatial in", values, "ddatial");
            return (Criteria) this;
        }

        public Criteria andDdatialNotIn(List<String> values) {
            addCriterion("ddatial not in", values, "ddatial");
            return (Criteria) this;
        }

        public Criteria andDdatialBetween(String value1, String value2) {
            addCriterion("ddatial between", value1, value2, "ddatial");
            return (Criteria) this;
        }

        public Criteria andDdatialNotBetween(String value1, String value2) {
            addCriterion("ddatial not between", value1, value2, "ddatial");
            return (Criteria) this;
        }

        public Criteria andDdateIsNull() {
            addCriterion("ddate is null");
            return (Criteria) this;
        }

        public Criteria andDdateIsNotNull() {
            addCriterion("ddate is not null");
            return (Criteria) this;
        }

        public Criteria andDdateEqualTo(Date value) {
            addCriterionForJDBCDate("ddate =", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ddate <>", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ddate >", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ddate >=", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateLessThan(Date value) {
            addCriterionForJDBCDate("ddate <", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ddate <=", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateIn(List<Date> values) {
            addCriterionForJDBCDate("ddate in", values, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ddate not in", values, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ddate between", value1, value2, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ddate not between", value1, value2, "ddate");
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