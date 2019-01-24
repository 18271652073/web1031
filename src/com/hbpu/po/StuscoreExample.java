package com.hbpu.po;

import java.util.ArrayList;
import java.util.List;

public class StuscoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuscoreExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSdromnumIsNull() {
            addCriterion("sdromnum is null");
            return (Criteria) this;
        }

        public Criteria andSdromnumIsNotNull() {
            addCriterion("sdromnum is not null");
            return (Criteria) this;
        }

        public Criteria andSdromnumEqualTo(String value) {
            addCriterion("sdromnum =", value, "sdromnum");
            return (Criteria) this;
        }

        public Criteria andSdromnumNotEqualTo(String value) {
            addCriterion("sdromnum <>", value, "sdromnum");
            return (Criteria) this;
        }

        public Criteria andSdromnumGreaterThan(String value) {
            addCriterion("sdromnum >", value, "sdromnum");
            return (Criteria) this;
        }

        public Criteria andSdromnumGreaterThanOrEqualTo(String value) {
            addCriterion("sdromnum >=", value, "sdromnum");
            return (Criteria) this;
        }

        public Criteria andSdromnumLessThan(String value) {
            addCriterion("sdromnum <", value, "sdromnum");
            return (Criteria) this;
        }

        public Criteria andSdromnumLessThanOrEqualTo(String value) {
            addCriterion("sdromnum <=", value, "sdromnum");
            return (Criteria) this;
        }

        public Criteria andSdromnumLike(String value) {
            addCriterion("sdromnum like", value, "sdromnum");
            return (Criteria) this;
        }

        public Criteria andSdromnumNotLike(String value) {
            addCriterion("sdromnum not like", value, "sdromnum");
            return (Criteria) this;
        }

        public Criteria andSdromnumIn(List<String> values) {
            addCriterion("sdromnum in", values, "sdromnum");
            return (Criteria) this;
        }

        public Criteria andSdromnumNotIn(List<String> values) {
            addCriterion("sdromnum not in", values, "sdromnum");
            return (Criteria) this;
        }

        public Criteria andSdromnumBetween(String value1, String value2) {
            addCriterion("sdromnum between", value1, value2, "sdromnum");
            return (Criteria) this;
        }

        public Criteria andSdromnumNotBetween(String value1, String value2) {
            addCriterion("sdromnum not between", value1, value2, "sdromnum");
            return (Criteria) this;
        }

        public Criteria andShygieneIsNull() {
            addCriterion("shygiene is null");
            return (Criteria) this;
        }

        public Criteria andShygieneIsNotNull() {
            addCriterion("shygiene is not null");
            return (Criteria) this;
        }

        public Criteria andShygieneEqualTo(Integer value) {
            addCriterion("shygiene =", value, "shygiene");
            return (Criteria) this;
        }

        public Criteria andShygieneNotEqualTo(Integer value) {
            addCriterion("shygiene <>", value, "shygiene");
            return (Criteria) this;
        }

        public Criteria andShygieneGreaterThan(Integer value) {
            addCriterion("shygiene >", value, "shygiene");
            return (Criteria) this;
        }

        public Criteria andShygieneGreaterThanOrEqualTo(Integer value) {
            addCriterion("shygiene >=", value, "shygiene");
            return (Criteria) this;
        }

        public Criteria andShygieneLessThan(Integer value) {
            addCriterion("shygiene <", value, "shygiene");
            return (Criteria) this;
        }

        public Criteria andShygieneLessThanOrEqualTo(Integer value) {
            addCriterion("shygiene <=", value, "shygiene");
            return (Criteria) this;
        }

        public Criteria andShygieneIn(List<Integer> values) {
            addCriterion("shygiene in", values, "shygiene");
            return (Criteria) this;
        }

        public Criteria andShygieneNotIn(List<Integer> values) {
            addCriterion("shygiene not in", values, "shygiene");
            return (Criteria) this;
        }

        public Criteria andShygieneBetween(Integer value1, Integer value2) {
            addCriterion("shygiene between", value1, value2, "shygiene");
            return (Criteria) this;
        }

        public Criteria andShygieneNotBetween(Integer value1, Integer value2) {
            addCriterion("shygiene not between", value1, value2, "shygiene");
            return (Criteria) this;
        }

        public Criteria andScultureIsNull() {
            addCriterion("sculture is null");
            return (Criteria) this;
        }

        public Criteria andScultureIsNotNull() {
            addCriterion("sculture is not null");
            return (Criteria) this;
        }

        public Criteria andScultureEqualTo(Integer value) {
            addCriterion("sculture =", value, "sculture");
            return (Criteria) this;
        }

        public Criteria andScultureNotEqualTo(Integer value) {
            addCriterion("sculture <>", value, "sculture");
            return (Criteria) this;
        }

        public Criteria andScultureGreaterThan(Integer value) {
            addCriterion("sculture >", value, "sculture");
            return (Criteria) this;
        }

        public Criteria andScultureGreaterThanOrEqualTo(Integer value) {
            addCriterion("sculture >=", value, "sculture");
            return (Criteria) this;
        }

        public Criteria andScultureLessThan(Integer value) {
            addCriterion("sculture <", value, "sculture");
            return (Criteria) this;
        }

        public Criteria andScultureLessThanOrEqualTo(Integer value) {
            addCriterion("sculture <=", value, "sculture");
            return (Criteria) this;
        }

        public Criteria andScultureIn(List<Integer> values) {
            addCriterion("sculture in", values, "sculture");
            return (Criteria) this;
        }

        public Criteria andScultureNotIn(List<Integer> values) {
            addCriterion("sculture not in", values, "sculture");
            return (Criteria) this;
        }

        public Criteria andScultureBetween(Integer value1, Integer value2) {
            addCriterion("sculture between", value1, value2, "sculture");
            return (Criteria) this;
        }

        public Criteria andScultureNotBetween(Integer value1, Integer value2) {
            addCriterion("sculture not between", value1, value2, "sculture");
            return (Criteria) this;
        }

        public Criteria andSsaveIsNull() {
            addCriterion("ssave is null");
            return (Criteria) this;
        }

        public Criteria andSsaveIsNotNull() {
            addCriterion("ssave is not null");
            return (Criteria) this;
        }

        public Criteria andSsaveEqualTo(Integer value) {
            addCriterion("ssave =", value, "ssave");
            return (Criteria) this;
        }

        public Criteria andSsaveNotEqualTo(Integer value) {
            addCriterion("ssave <>", value, "ssave");
            return (Criteria) this;
        }

        public Criteria andSsaveGreaterThan(Integer value) {
            addCriterion("ssave >", value, "ssave");
            return (Criteria) this;
        }

        public Criteria andSsaveGreaterThanOrEqualTo(Integer value) {
            addCriterion("ssave >=", value, "ssave");
            return (Criteria) this;
        }

        public Criteria andSsaveLessThan(Integer value) {
            addCriterion("ssave <", value, "ssave");
            return (Criteria) this;
        }

        public Criteria andSsaveLessThanOrEqualTo(Integer value) {
            addCriterion("ssave <=", value, "ssave");
            return (Criteria) this;
        }

        public Criteria andSsaveIn(List<Integer> values) {
            addCriterion("ssave in", values, "ssave");
            return (Criteria) this;
        }

        public Criteria andSsaveNotIn(List<Integer> values) {
            addCriterion("ssave not in", values, "ssave");
            return (Criteria) this;
        }

        public Criteria andSsaveBetween(Integer value1, Integer value2) {
            addCriterion("ssave between", value1, value2, "ssave");
            return (Criteria) this;
        }

        public Criteria andSsaveNotBetween(Integer value1, Integer value2) {
            addCriterion("ssave not between", value1, value2, "ssave");
            return (Criteria) this;
        }

        public Criteria andSgradeIsNull() {
            addCriterion("sgrade is null");
            return (Criteria) this;
        }

        public Criteria andSgradeIsNotNull() {
            addCriterion("sgrade is not null");
            return (Criteria) this;
        }

        public Criteria andSgradeEqualTo(String value) {
            addCriterion("sgrade =", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotEqualTo(String value) {
            addCriterion("sgrade <>", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeGreaterThan(String value) {
            addCriterion("sgrade >", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeGreaterThanOrEqualTo(String value) {
            addCriterion("sgrade >=", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLessThan(String value) {
            addCriterion("sgrade <", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLessThanOrEqualTo(String value) {
            addCriterion("sgrade <=", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLike(String value) {
            addCriterion("sgrade like", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotLike(String value) {
            addCriterion("sgrade not like", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeIn(List<String> values) {
            addCriterion("sgrade in", values, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotIn(List<String> values) {
            addCriterion("sgrade not in", values, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeBetween(String value1, String value2) {
            addCriterion("sgrade between", value1, value2, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotBetween(String value1, String value2) {
            addCriterion("sgrade not between", value1, value2, "sgrade");
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