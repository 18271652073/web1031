package com.hbpu.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SturecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SturecordExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRdromnumIsNull() {
            addCriterion("rdromnum is null");
            return (Criteria) this;
        }

        public Criteria andRdromnumIsNotNull() {
            addCriterion("rdromnum is not null");
            return (Criteria) this;
        }

        public Criteria andRdromnumEqualTo(String value) {
            addCriterion("rdromnum =", value, "rdromnum");
            return (Criteria) this;
        }

        public Criteria andRdromnumNotEqualTo(String value) {
            addCriterion("rdromnum <>", value, "rdromnum");
            return (Criteria) this;
        }

        public Criteria andRdromnumGreaterThan(String value) {
            addCriterion("rdromnum >", value, "rdromnum");
            return (Criteria) this;
        }

        public Criteria andRdromnumGreaterThanOrEqualTo(String value) {
            addCriterion("rdromnum >=", value, "rdromnum");
            return (Criteria) this;
        }

        public Criteria andRdromnumLessThan(String value) {
            addCriterion("rdromnum <", value, "rdromnum");
            return (Criteria) this;
        }

        public Criteria andRdromnumLessThanOrEqualTo(String value) {
            addCriterion("rdromnum <=", value, "rdromnum");
            return (Criteria) this;
        }

        public Criteria andRdromnumLike(String value) {
            addCriterion("rdromnum like", value, "rdromnum");
            return (Criteria) this;
        }

        public Criteria andRdromnumNotLike(String value) {
            addCriterion("rdromnum not like", value, "rdromnum");
            return (Criteria) this;
        }

        public Criteria andRdromnumIn(List<String> values) {
            addCriterion("rdromnum in", values, "rdromnum");
            return (Criteria) this;
        }

        public Criteria andRdromnumNotIn(List<String> values) {
            addCriterion("rdromnum not in", values, "rdromnum");
            return (Criteria) this;
        }

        public Criteria andRdromnumBetween(String value1, String value2) {
            addCriterion("rdromnum between", value1, value2, "rdromnum");
            return (Criteria) this;
        }

        public Criteria andRdromnumNotBetween(String value1, String value2) {
            addCriterion("rdromnum not between", value1, value2, "rdromnum");
            return (Criteria) this;
        }

        public Criteria andRnameIsNull() {
            addCriterion("rname is null");
            return (Criteria) this;
        }

        public Criteria andRnameIsNotNull() {
            addCriterion("rname is not null");
            return (Criteria) this;
        }

        public Criteria andRnameEqualTo(String value) {
            addCriterion("rname =", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotEqualTo(String value) {
            addCriterion("rname <>", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThan(String value) {
            addCriterion("rname >", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThanOrEqualTo(String value) {
            addCriterion("rname >=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThan(String value) {
            addCriterion("rname <", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThanOrEqualTo(String value) {
            addCriterion("rname <=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLike(String value) {
            addCriterion("rname like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotLike(String value) {
            addCriterion("rname not like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameIn(List<String> values) {
            addCriterion("rname in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotIn(List<String> values) {
            addCriterion("rname not in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameBetween(String value1, String value2) {
            addCriterion("rname between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotBetween(String value1, String value2) {
            addCriterion("rname not between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andRnoteIsNull() {
            addCriterion("rnote is null");
            return (Criteria) this;
        }

        public Criteria andRnoteIsNotNull() {
            addCriterion("rnote is not null");
            return (Criteria) this;
        }

        public Criteria andRnoteEqualTo(String value) {
            addCriterion("rnote =", value, "rnote");
            return (Criteria) this;
        }

        public Criteria andRnoteNotEqualTo(String value) {
            addCriterion("rnote <>", value, "rnote");
            return (Criteria) this;
        }

        public Criteria andRnoteGreaterThan(String value) {
            addCriterion("rnote >", value, "rnote");
            return (Criteria) this;
        }

        public Criteria andRnoteGreaterThanOrEqualTo(String value) {
            addCriterion("rnote >=", value, "rnote");
            return (Criteria) this;
        }

        public Criteria andRnoteLessThan(String value) {
            addCriterion("rnote <", value, "rnote");
            return (Criteria) this;
        }

        public Criteria andRnoteLessThanOrEqualTo(String value) {
            addCriterion("rnote <=", value, "rnote");
            return (Criteria) this;
        }

        public Criteria andRnoteLike(String value) {
            addCriterion("rnote like", value, "rnote");
            return (Criteria) this;
        }

        public Criteria andRnoteNotLike(String value) {
            addCriterion("rnote not like", value, "rnote");
            return (Criteria) this;
        }

        public Criteria andRnoteIn(List<String> values) {
            addCriterion("rnote in", values, "rnote");
            return (Criteria) this;
        }

        public Criteria andRnoteNotIn(List<String> values) {
            addCriterion("rnote not in", values, "rnote");
            return (Criteria) this;
        }

        public Criteria andRnoteBetween(String value1, String value2) {
            addCriterion("rnote between", value1, value2, "rnote");
            return (Criteria) this;
        }

        public Criteria andRnoteNotBetween(String value1, String value2) {
            addCriterion("rnote not between", value1, value2, "rnote");
            return (Criteria) this;
        }

        public Criteria andRdateIsNull() {
            addCriterion("rdate is null");
            return (Criteria) this;
        }

        public Criteria andRdateIsNotNull() {
            addCriterion("rdate is not null");
            return (Criteria) this;
        }

        public Criteria andRdateEqualTo(Date value) {
            addCriterionForJDBCDate("rdate =", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("rdate <>", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThan(Date value) {
            addCriterionForJDBCDate("rdate >", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rdate >=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThan(Date value) {
            addCriterionForJDBCDate("rdate <", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rdate <=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateIn(List<Date> values) {
            addCriterionForJDBCDate("rdate in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("rdate not in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rdate between", value1, value2, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rdate not between", value1, value2, "rdate");
            return (Criteria) this;
        }

        public Criteria andRstateIsNull() {
            addCriterion("rstate is null");
            return (Criteria) this;
        }

        public Criteria andRstateIsNotNull() {
            addCriterion("rstate is not null");
            return (Criteria) this;
        }

        public Criteria andRstateEqualTo(String value) {
            addCriterion("rstate =", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateNotEqualTo(String value) {
            addCriterion("rstate <>", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateGreaterThan(String value) {
            addCriterion("rstate >", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateGreaterThanOrEqualTo(String value) {
            addCriterion("rstate >=", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateLessThan(String value) {
            addCriterion("rstate <", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateLessThanOrEqualTo(String value) {
            addCriterion("rstate <=", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateLike(String value) {
            addCriterion("rstate like", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateNotLike(String value) {
            addCriterion("rstate not like", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateIn(List<String> values) {
            addCriterion("rstate in", values, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateNotIn(List<String> values) {
            addCriterion("rstate not in", values, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateBetween(String value1, String value2) {
            addCriterion("rstate between", value1, value2, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateNotBetween(String value1, String value2) {
            addCriterion("rstate not between", value1, value2, "rstate");
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