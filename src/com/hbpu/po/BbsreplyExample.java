package com.hbpu.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BbsreplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbsreplyExample() {
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

        public Criteria andRtidIsNull() {
            addCriterion("rtid is null");
            return (Criteria) this;
        }

        public Criteria andRtidIsNotNull() {
            addCriterion("rtid is not null");
            return (Criteria) this;
        }

        public Criteria andRtidEqualTo(Integer value) {
            addCriterion("rtid =", value, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidNotEqualTo(Integer value) {
            addCriterion("rtid <>", value, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidGreaterThan(Integer value) {
            addCriterion("rtid >", value, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rtid >=", value, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidLessThan(Integer value) {
            addCriterion("rtid <", value, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidLessThanOrEqualTo(Integer value) {
            addCriterion("rtid <=", value, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidIn(List<Integer> values) {
            addCriterion("rtid in", values, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidNotIn(List<Integer> values) {
            addCriterion("rtid not in", values, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidBetween(Integer value1, Integer value2) {
            addCriterion("rtid between", value1, value2, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidNotBetween(Integer value1, Integer value2) {
            addCriterion("rtid not between", value1, value2, "rtid");
            return (Criteria) this;
        }

        public Criteria andTuidIsNull() {
            addCriterion("tuid is null");
            return (Criteria) this;
        }

        public Criteria andTuidIsNotNull() {
            addCriterion("tuid is not null");
            return (Criteria) this;
        }

        public Criteria andTuidEqualTo(Integer value) {
            addCriterion("tuid =", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidNotEqualTo(Integer value) {
            addCriterion("tuid <>", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidGreaterThan(Integer value) {
            addCriterion("tuid >", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tuid >=", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidLessThan(Integer value) {
            addCriterion("tuid <", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidLessThanOrEqualTo(Integer value) {
            addCriterion("tuid <=", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidIn(List<Integer> values) {
            addCriterion("tuid in", values, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidNotIn(List<Integer> values) {
            addCriterion("tuid not in", values, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidBetween(Integer value1, Integer value2) {
            addCriterion("tuid between", value1, value2, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidNotBetween(Integer value1, Integer value2) {
            addCriterion("tuid not between", value1, value2, "tuid");
            return (Criteria) this;
        }

        public Criteria andRcontentIsNull() {
            addCriterion("rcontent is null");
            return (Criteria) this;
        }

        public Criteria andRcontentIsNotNull() {
            addCriterion("rcontent is not null");
            return (Criteria) this;
        }

        public Criteria andRcontentEqualTo(String value) {
            addCriterion("rcontent =", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotEqualTo(String value) {
            addCriterion("rcontent <>", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentGreaterThan(String value) {
            addCriterion("rcontent >", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentGreaterThanOrEqualTo(String value) {
            addCriterion("rcontent >=", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentLessThan(String value) {
            addCriterion("rcontent <", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentLessThanOrEqualTo(String value) {
            addCriterion("rcontent <=", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentLike(String value) {
            addCriterion("rcontent like", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotLike(String value) {
            addCriterion("rcontent not like", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentIn(List<String> values) {
            addCriterion("rcontent in", values, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotIn(List<String> values) {
            addCriterion("rcontent not in", values, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentBetween(String value1, String value2) {
            addCriterion("rcontent between", value1, value2, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotBetween(String value1, String value2) {
            addCriterion("rcontent not between", value1, value2, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRreplydateIsNull() {
            addCriterion("rreplydate is null");
            return (Criteria) this;
        }

        public Criteria andRreplydateIsNotNull() {
            addCriterion("rreplydate is not null");
            return (Criteria) this;
        }

        public Criteria andRreplydateEqualTo(Date value) {
            addCriterion("rreplydate =", value, "rreplydate");
            return (Criteria) this;
        }

        public Criteria andRreplydateNotEqualTo(Date value) {
            addCriterion("rreplydate <>", value, "rreplydate");
            return (Criteria) this;
        }

        public Criteria andRreplydateGreaterThan(Date value) {
            addCriterion("rreplydate >", value, "rreplydate");
            return (Criteria) this;
        }

        public Criteria andRreplydateGreaterThanOrEqualTo(Date value) {
            addCriterion("rreplydate >=", value, "rreplydate");
            return (Criteria) this;
        }

        public Criteria andRreplydateLessThan(Date value) {
            addCriterion("rreplydate <", value, "rreplydate");
            return (Criteria) this;
        }

        public Criteria andRreplydateLessThanOrEqualTo(Date value) {
            addCriterion("rreplydate <=", value, "rreplydate");
            return (Criteria) this;
        }

        public Criteria andRreplydateIn(List<Date> values) {
            addCriterion("rreplydate in", values, "rreplydate");
            return (Criteria) this;
        }

        public Criteria andRreplydateNotIn(List<Date> values) {
            addCriterion("rreplydate not in", values, "rreplydate");
            return (Criteria) this;
        }

        public Criteria andRreplydateBetween(Date value1, Date value2) {
            addCriterion("rreplydate between", value1, value2, "rreplydate");
            return (Criteria) this;
        }

        public Criteria andRreplydateNotBetween(Date value1, Date value2) {
            addCriterion("rreplydate not between", value1, value2, "rreplydate");
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