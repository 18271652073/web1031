package com.hbpu.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StunoticExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StunoticExample() {
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

        public Criteria andNidIsNull() {
            addCriterion("nid is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("nid is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(Integer value) {
            addCriterion("nid =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(Integer value) {
            addCriterion("nid <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(Integer value) {
            addCriterion("nid >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nid >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(Integer value) {
            addCriterion("nid <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(Integer value) {
            addCriterion("nid <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<Integer> values) {
            addCriterion("nid in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<Integer> values) {
            addCriterion("nid not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(Integer value1, Integer value2) {
            addCriterion("nid between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(Integer value1, Integer value2) {
            addCriterion("nid not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNdromnumIsNull() {
            addCriterion("ndromnum is null");
            return (Criteria) this;
        }

        public Criteria andNdromnumIsNotNull() {
            addCriterion("ndromnum is not null");
            return (Criteria) this;
        }

        public Criteria andNdromnumEqualTo(String value) {
            addCriterion("ndromnum =", value, "ndromnum");
            return (Criteria) this;
        }

        public Criteria andNdromnumNotEqualTo(String value) {
            addCriterion("ndromnum <>", value, "ndromnum");
            return (Criteria) this;
        }

        public Criteria andNdromnumGreaterThan(String value) {
            addCriterion("ndromnum >", value, "ndromnum");
            return (Criteria) this;
        }

        public Criteria andNdromnumGreaterThanOrEqualTo(String value) {
            addCriterion("ndromnum >=", value, "ndromnum");
            return (Criteria) this;
        }

        public Criteria andNdromnumLessThan(String value) {
            addCriterion("ndromnum <", value, "ndromnum");
            return (Criteria) this;
        }

        public Criteria andNdromnumLessThanOrEqualTo(String value) {
            addCriterion("ndromnum <=", value, "ndromnum");
            return (Criteria) this;
        }

        public Criteria andNdromnumLike(String value) {
            addCriterion("ndromnum like", value, "ndromnum");
            return (Criteria) this;
        }

        public Criteria andNdromnumNotLike(String value) {
            addCriterion("ndromnum not like", value, "ndromnum");
            return (Criteria) this;
        }

        public Criteria andNdromnumIn(List<String> values) {
            addCriterion("ndromnum in", values, "ndromnum");
            return (Criteria) this;
        }

        public Criteria andNdromnumNotIn(List<String> values) {
            addCriterion("ndromnum not in", values, "ndromnum");
            return (Criteria) this;
        }

        public Criteria andNdromnumBetween(String value1, String value2) {
            addCriterion("ndromnum between", value1, value2, "ndromnum");
            return (Criteria) this;
        }

        public Criteria andNdromnumNotBetween(String value1, String value2) {
            addCriterion("ndromnum not between", value1, value2, "ndromnum");
            return (Criteria) this;
        }

        public Criteria andNwaterIsNull() {
            addCriterion("nwater is null");
            return (Criteria) this;
        }

        public Criteria andNwaterIsNotNull() {
            addCriterion("nwater is not null");
            return (Criteria) this;
        }

        public Criteria andNwaterEqualTo(Integer value) {
            addCriterion("nwater =", value, "nwater");
            return (Criteria) this;
        }

        public Criteria andNwaterNotEqualTo(Integer value) {
            addCriterion("nwater <>", value, "nwater");
            return (Criteria) this;
        }

        public Criteria andNwaterGreaterThan(Integer value) {
            addCriterion("nwater >", value, "nwater");
            return (Criteria) this;
        }

        public Criteria andNwaterGreaterThanOrEqualTo(Integer value) {
            addCriterion("nwater >=", value, "nwater");
            return (Criteria) this;
        }

        public Criteria andNwaterLessThan(Integer value) {
            addCriterion("nwater <", value, "nwater");
            return (Criteria) this;
        }

        public Criteria andNwaterLessThanOrEqualTo(Integer value) {
            addCriterion("nwater <=", value, "nwater");
            return (Criteria) this;
        }

        public Criteria andNwaterIn(List<Integer> values) {
            addCriterion("nwater in", values, "nwater");
            return (Criteria) this;
        }

        public Criteria andNwaterNotIn(List<Integer> values) {
            addCriterion("nwater not in", values, "nwater");
            return (Criteria) this;
        }

        public Criteria andNwaterBetween(Integer value1, Integer value2) {
            addCriterion("nwater between", value1, value2, "nwater");
            return (Criteria) this;
        }

        public Criteria andNwaterNotBetween(Integer value1, Integer value2) {
            addCriterion("nwater not between", value1, value2, "nwater");
            return (Criteria) this;
        }

        public Criteria andNelectricIsNull() {
            addCriterion("nelectric is null");
            return (Criteria) this;
        }

        public Criteria andNelectricIsNotNull() {
            addCriterion("nelectric is not null");
            return (Criteria) this;
        }

        public Criteria andNelectricEqualTo(Integer value) {
            addCriterion("nelectric =", value, "nelectric");
            return (Criteria) this;
        }

        public Criteria andNelectricNotEqualTo(Integer value) {
            addCriterion("nelectric <>", value, "nelectric");
            return (Criteria) this;
        }

        public Criteria andNelectricGreaterThan(Integer value) {
            addCriterion("nelectric >", value, "nelectric");
            return (Criteria) this;
        }

        public Criteria andNelectricGreaterThanOrEqualTo(Integer value) {
            addCriterion("nelectric >=", value, "nelectric");
            return (Criteria) this;
        }

        public Criteria andNelectricLessThan(Integer value) {
            addCriterion("nelectric <", value, "nelectric");
            return (Criteria) this;
        }

        public Criteria andNelectricLessThanOrEqualTo(Integer value) {
            addCriterion("nelectric <=", value, "nelectric");
            return (Criteria) this;
        }

        public Criteria andNelectricIn(List<Integer> values) {
            addCriterion("nelectric in", values, "nelectric");
            return (Criteria) this;
        }

        public Criteria andNelectricNotIn(List<Integer> values) {
            addCriterion("nelectric not in", values, "nelectric");
            return (Criteria) this;
        }

        public Criteria andNelectricBetween(Integer value1, Integer value2) {
            addCriterion("nelectric between", value1, value2, "nelectric");
            return (Criteria) this;
        }

        public Criteria andNelectricNotBetween(Integer value1, Integer value2) {
            addCriterion("nelectric not between", value1, value2, "nelectric");
            return (Criteria) this;
        }

        public Criteria andNdateIsNull() {
            addCriterion("ndate is null");
            return (Criteria) this;
        }

        public Criteria andNdateIsNotNull() {
            addCriterion("ndate is not null");
            return (Criteria) this;
        }

        public Criteria andNdateEqualTo(Date value) {
            addCriterionForJDBCDate("ndate =", value, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ndate <>", value, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ndate >", value, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ndate >=", value, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateLessThan(Date value) {
            addCriterionForJDBCDate("ndate <", value, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ndate <=", value, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateIn(List<Date> values) {
            addCriterionForJDBCDate("ndate in", values, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ndate not in", values, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ndate between", value1, value2, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ndate not between", value1, value2, "ndate");
            return (Criteria) this;
        }

        public Criteria andNstateIsNull() {
            addCriterion("nstate is null");
            return (Criteria) this;
        }

        public Criteria andNstateIsNotNull() {
            addCriterion("nstate is not null");
            return (Criteria) this;
        }

        public Criteria andNstateEqualTo(String value) {
            addCriterion("nstate =", value, "nstate");
            return (Criteria) this;
        }

        public Criteria andNstateNotEqualTo(String value) {
            addCriterion("nstate <>", value, "nstate");
            return (Criteria) this;
        }

        public Criteria andNstateGreaterThan(String value) {
            addCriterion("nstate >", value, "nstate");
            return (Criteria) this;
        }

        public Criteria andNstateGreaterThanOrEqualTo(String value) {
            addCriterion("nstate >=", value, "nstate");
            return (Criteria) this;
        }

        public Criteria andNstateLessThan(String value) {
            addCriterion("nstate <", value, "nstate");
            return (Criteria) this;
        }

        public Criteria andNstateLessThanOrEqualTo(String value) {
            addCriterion("nstate <=", value, "nstate");
            return (Criteria) this;
        }

        public Criteria andNstateLike(String value) {
            addCriterion("nstate like", value, "nstate");
            return (Criteria) this;
        }

        public Criteria andNstateNotLike(String value) {
            addCriterion("nstate not like", value, "nstate");
            return (Criteria) this;
        }

        public Criteria andNstateIn(List<String> values) {
            addCriterion("nstate in", values, "nstate");
            return (Criteria) this;
        }

        public Criteria andNstateNotIn(List<String> values) {
            addCriterion("nstate not in", values, "nstate");
            return (Criteria) this;
        }

        public Criteria andNstateBetween(String value1, String value2) {
            addCriterion("nstate between", value1, value2, "nstate");
            return (Criteria) this;
        }

        public Criteria andNstateNotBetween(String value1, String value2) {
            addCriterion("nstate not between", value1, value2, "nstate");
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