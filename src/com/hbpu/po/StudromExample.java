package com.hbpu.po;

import java.util.ArrayList;
import java.util.List;

public class StudromExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudromExample() {
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

        public Criteria andDridIsNull() {
            addCriterion("drid is null");
            return (Criteria) this;
        }

        public Criteria andDridIsNotNull() {
            addCriterion("drid is not null");
            return (Criteria) this;
        }

        public Criteria andDridEqualTo(Integer value) {
            addCriterion("drid =", value, "drid");
            return (Criteria) this;
        }

        public Criteria andDridNotEqualTo(Integer value) {
            addCriterion("drid <>", value, "drid");
            return (Criteria) this;
        }

        public Criteria andDridGreaterThan(Integer value) {
            addCriterion("drid >", value, "drid");
            return (Criteria) this;
        }

        public Criteria andDridGreaterThanOrEqualTo(Integer value) {
            addCriterion("drid >=", value, "drid");
            return (Criteria) this;
        }

        public Criteria andDridLessThan(Integer value) {
            addCriterion("drid <", value, "drid");
            return (Criteria) this;
        }

        public Criteria andDridLessThanOrEqualTo(Integer value) {
            addCriterion("drid <=", value, "drid");
            return (Criteria) this;
        }

        public Criteria andDridIn(List<Integer> values) {
            addCriterion("drid in", values, "drid");
            return (Criteria) this;
        }

        public Criteria andDridNotIn(List<Integer> values) {
            addCriterion("drid not in", values, "drid");
            return (Criteria) this;
        }

        public Criteria andDridBetween(Integer value1, Integer value2) {
            addCriterion("drid between", value1, value2, "drid");
            return (Criteria) this;
        }

        public Criteria andDridNotBetween(Integer value1, Integer value2) {
            addCriterion("drid not between", value1, value2, "drid");
            return (Criteria) this;
        }

        public Criteria andDrbuildidIsNull() {
            addCriterion("drbuildid is null");
            return (Criteria) this;
        }

        public Criteria andDrbuildidIsNotNull() {
            addCriterion("drbuildid is not null");
            return (Criteria) this;
        }

        public Criteria andDrbuildidEqualTo(String value) {
            addCriterion("drbuildid =", value, "drbuildid");
            return (Criteria) this;
        }

        public Criteria andDrbuildidNotEqualTo(String value) {
            addCriterion("drbuildid <>", value, "drbuildid");
            return (Criteria) this;
        }

        public Criteria andDrbuildidGreaterThan(String value) {
            addCriterion("drbuildid >", value, "drbuildid");
            return (Criteria) this;
        }

        public Criteria andDrbuildidGreaterThanOrEqualTo(String value) {
            addCriterion("drbuildid >=", value, "drbuildid");
            return (Criteria) this;
        }

        public Criteria andDrbuildidLessThan(String value) {
            addCriterion("drbuildid <", value, "drbuildid");
            return (Criteria) this;
        }

        public Criteria andDrbuildidLessThanOrEqualTo(String value) {
            addCriterion("drbuildid <=", value, "drbuildid");
            return (Criteria) this;
        }

        public Criteria andDrbuildidLike(String value) {
            addCriterion("drbuildid like", value, "drbuildid");
            return (Criteria) this;
        }

        public Criteria andDrbuildidNotLike(String value) {
            addCriterion("drbuildid not like", value, "drbuildid");
            return (Criteria) this;
        }

        public Criteria andDrbuildidIn(List<String> values) {
            addCriterion("drbuildid in", values, "drbuildid");
            return (Criteria) this;
        }

        public Criteria andDrbuildidNotIn(List<String> values) {
            addCriterion("drbuildid not in", values, "drbuildid");
            return (Criteria) this;
        }

        public Criteria andDrbuildidBetween(String value1, String value2) {
            addCriterion("drbuildid between", value1, value2, "drbuildid");
            return (Criteria) this;
        }

        public Criteria andDrbuildidNotBetween(String value1, String value2) {
            addCriterion("drbuildid not between", value1, value2, "drbuildid");
            return (Criteria) this;
        }

        public Criteria andDrdromidIsNull() {
            addCriterion("drdromid is null");
            return (Criteria) this;
        }

        public Criteria andDrdromidIsNotNull() {
            addCriterion("drdromid is not null");
            return (Criteria) this;
        }

        public Criteria andDrdromidEqualTo(String value) {
            addCriterion("drdromid =", value, "drdromid");
            return (Criteria) this;
        }

        public Criteria andDrdromidNotEqualTo(String value) {
            addCriterion("drdromid <>", value, "drdromid");
            return (Criteria) this;
        }

        public Criteria andDrdromidGreaterThan(String value) {
            addCriterion("drdromid >", value, "drdromid");
            return (Criteria) this;
        }

        public Criteria andDrdromidGreaterThanOrEqualTo(String value) {
            addCriterion("drdromid >=", value, "drdromid");
            return (Criteria) this;
        }

        public Criteria andDrdromidLessThan(String value) {
            addCriterion("drdromid <", value, "drdromid");
            return (Criteria) this;
        }

        public Criteria andDrdromidLessThanOrEqualTo(String value) {
            addCriterion("drdromid <=", value, "drdromid");
            return (Criteria) this;
        }

        public Criteria andDrdromidLike(String value) {
            addCriterion("drdromid like", value, "drdromid");
            return (Criteria) this;
        }

        public Criteria andDrdromidNotLike(String value) {
            addCriterion("drdromid not like", value, "drdromid");
            return (Criteria) this;
        }

        public Criteria andDrdromidIn(List<String> values) {
            addCriterion("drdromid in", values, "drdromid");
            return (Criteria) this;
        }

        public Criteria andDrdromidNotIn(List<String> values) {
            addCriterion("drdromid not in", values, "drdromid");
            return (Criteria) this;
        }

        public Criteria andDrdromidBetween(String value1, String value2) {
            addCriterion("drdromid between", value1, value2, "drdromid");
            return (Criteria) this;
        }

        public Criteria andDrdromidNotBetween(String value1, String value2) {
            addCriterion("drdromid not between", value1, value2, "drdromid");
            return (Criteria) this;
        }

        public Criteria andDrnumIsNull() {
            addCriterion("drnum is null");
            return (Criteria) this;
        }

        public Criteria andDrnumIsNotNull() {
            addCriterion("drnum is not null");
            return (Criteria) this;
        }

        public Criteria andDrnumEqualTo(Integer value) {
            addCriterion("drnum =", value, "drnum");
            return (Criteria) this;
        }

        public Criteria andDrnumNotEqualTo(Integer value) {
            addCriterion("drnum <>", value, "drnum");
            return (Criteria) this;
        }

        public Criteria andDrnumGreaterThan(Integer value) {
            addCriterion("drnum >", value, "drnum");
            return (Criteria) this;
        }

        public Criteria andDrnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("drnum >=", value, "drnum");
            return (Criteria) this;
        }

        public Criteria andDrnumLessThan(Integer value) {
            addCriterion("drnum <", value, "drnum");
            return (Criteria) this;
        }

        public Criteria andDrnumLessThanOrEqualTo(Integer value) {
            addCriterion("drnum <=", value, "drnum");
            return (Criteria) this;
        }

        public Criteria andDrnumIn(List<Integer> values) {
            addCriterion("drnum in", values, "drnum");
            return (Criteria) this;
        }

        public Criteria andDrnumNotIn(List<Integer> values) {
            addCriterion("drnum not in", values, "drnum");
            return (Criteria) this;
        }

        public Criteria andDrnumBetween(Integer value1, Integer value2) {
            addCriterion("drnum between", value1, value2, "drnum");
            return (Criteria) this;
        }

        public Criteria andDrnumNotBetween(Integer value1, Integer value2) {
            addCriterion("drnum not between", value1, value2, "drnum");
            return (Criteria) this;
        }

        public Criteria andDrcountIsNull() {
            addCriterion("drcount is null");
            return (Criteria) this;
        }

        public Criteria andDrcountIsNotNull() {
            addCriterion("drcount is not null");
            return (Criteria) this;
        }

        public Criteria andDrcountEqualTo(Integer value) {
            addCriterion("drcount =", value, "drcount");
            return (Criteria) this;
        }

        public Criteria andDrcountNotEqualTo(Integer value) {
            addCriterion("drcount <>", value, "drcount");
            return (Criteria) this;
        }

        public Criteria andDrcountGreaterThan(Integer value) {
            addCriterion("drcount >", value, "drcount");
            return (Criteria) this;
        }

        public Criteria andDrcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("drcount >=", value, "drcount");
            return (Criteria) this;
        }

        public Criteria andDrcountLessThan(Integer value) {
            addCriterion("drcount <", value, "drcount");
            return (Criteria) this;
        }

        public Criteria andDrcountLessThanOrEqualTo(Integer value) {
            addCriterion("drcount <=", value, "drcount");
            return (Criteria) this;
        }

        public Criteria andDrcountIn(List<Integer> values) {
            addCriterion("drcount in", values, "drcount");
            return (Criteria) this;
        }

        public Criteria andDrcountNotIn(List<Integer> values) {
            addCriterion("drcount not in", values, "drcount");
            return (Criteria) this;
        }

        public Criteria andDrcountBetween(Integer value1, Integer value2) {
            addCriterion("drcount between", value1, value2, "drcount");
            return (Criteria) this;
        }

        public Criteria andDrcountNotBetween(Integer value1, Integer value2) {
            addCriterion("drcount not between", value1, value2, "drcount");
            return (Criteria) this;
        }

        public Criteria andDrtelIsNull() {
            addCriterion("drtel is null");
            return (Criteria) this;
        }

        public Criteria andDrtelIsNotNull() {
            addCriterion("drtel is not null");
            return (Criteria) this;
        }

        public Criteria andDrtelEqualTo(String value) {
            addCriterion("drtel =", value, "drtel");
            return (Criteria) this;
        }

        public Criteria andDrtelNotEqualTo(String value) {
            addCriterion("drtel <>", value, "drtel");
            return (Criteria) this;
        }

        public Criteria andDrtelGreaterThan(String value) {
            addCriterion("drtel >", value, "drtel");
            return (Criteria) this;
        }

        public Criteria andDrtelGreaterThanOrEqualTo(String value) {
            addCriterion("drtel >=", value, "drtel");
            return (Criteria) this;
        }

        public Criteria andDrtelLessThan(String value) {
            addCriterion("drtel <", value, "drtel");
            return (Criteria) this;
        }

        public Criteria andDrtelLessThanOrEqualTo(String value) {
            addCriterion("drtel <=", value, "drtel");
            return (Criteria) this;
        }

        public Criteria andDrtelLike(String value) {
            addCriterion("drtel like", value, "drtel");
            return (Criteria) this;
        }

        public Criteria andDrtelNotLike(String value) {
            addCriterion("drtel not like", value, "drtel");
            return (Criteria) this;
        }

        public Criteria andDrtelIn(List<String> values) {
            addCriterion("drtel in", values, "drtel");
            return (Criteria) this;
        }

        public Criteria andDrtelNotIn(List<String> values) {
            addCriterion("drtel not in", values, "drtel");
            return (Criteria) this;
        }

        public Criteria andDrtelBetween(String value1, String value2) {
            addCriterion("drtel between", value1, value2, "drtel");
            return (Criteria) this;
        }

        public Criteria andDrtelNotBetween(String value1, String value2) {
            addCriterion("drtel not between", value1, value2, "drtel");
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