package com.hbpu.po;

import java.util.ArrayList;
import java.util.List;

public class BbssectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbssectionExample() {
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

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnumberIsNull() {
            addCriterion("snumber is null");
            return (Criteria) this;
        }

        public Criteria andSnumberIsNotNull() {
            addCriterion("snumber is not null");
            return (Criteria) this;
        }

        public Criteria andSnumberEqualTo(String value) {
            addCriterion("snumber =", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberNotEqualTo(String value) {
            addCriterion("snumber <>", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberGreaterThan(String value) {
            addCriterion("snumber >", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberGreaterThanOrEqualTo(String value) {
            addCriterion("snumber >=", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberLessThan(String value) {
            addCriterion("snumber <", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberLessThanOrEqualTo(String value) {
            addCriterion("snumber <=", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberLike(String value) {
            addCriterion("snumber like", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberNotLike(String value) {
            addCriterion("snumber not like", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberIn(List<String> values) {
            addCriterion("snumber in", values, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberNotIn(List<String> values) {
            addCriterion("snumber not in", values, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberBetween(String value1, String value2) {
            addCriterion("snumber between", value1, value2, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberNotBetween(String value1, String value2) {
            addCriterion("snumber not between", value1, value2, "snumber");
            return (Criteria) this;
        }

        public Criteria andSclickcountIsNull() {
            addCriterion("sclickcount is null");
            return (Criteria) this;
        }

        public Criteria andSclickcountIsNotNull() {
            addCriterion("sclickcount is not null");
            return (Criteria) this;
        }

        public Criteria andSclickcountEqualTo(Integer value) {
            addCriterion("sclickcount =", value, "sclickcount");
            return (Criteria) this;
        }

        public Criteria andSclickcountNotEqualTo(Integer value) {
            addCriterion("sclickcount <>", value, "sclickcount");
            return (Criteria) this;
        }

        public Criteria andSclickcountGreaterThan(Integer value) {
            addCriterion("sclickcount >", value, "sclickcount");
            return (Criteria) this;
        }

        public Criteria andSclickcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sclickcount >=", value, "sclickcount");
            return (Criteria) this;
        }

        public Criteria andSclickcountLessThan(Integer value) {
            addCriterion("sclickcount <", value, "sclickcount");
            return (Criteria) this;
        }

        public Criteria andSclickcountLessThanOrEqualTo(Integer value) {
            addCriterion("sclickcount <=", value, "sclickcount");
            return (Criteria) this;
        }

        public Criteria andSclickcountIn(List<Integer> values) {
            addCriterion("sclickcount in", values, "sclickcount");
            return (Criteria) this;
        }

        public Criteria andSclickcountNotIn(List<Integer> values) {
            addCriterion("sclickcount not in", values, "sclickcount");
            return (Criteria) this;
        }

        public Criteria andSclickcountBetween(Integer value1, Integer value2) {
            addCriterion("sclickcount between", value1, value2, "sclickcount");
            return (Criteria) this;
        }

        public Criteria andSclickcountNotBetween(Integer value1, Integer value2) {
            addCriterion("sclickcount not between", value1, value2, "sclickcount");
            return (Criteria) this;
        }

        public Criteria andSreplycountIsNull() {
            addCriterion("sreplycount is null");
            return (Criteria) this;
        }

        public Criteria andSreplycountIsNotNull() {
            addCriterion("sreplycount is not null");
            return (Criteria) this;
        }

        public Criteria andSreplycountEqualTo(Integer value) {
            addCriterion("sreplycount =", value, "sreplycount");
            return (Criteria) this;
        }

        public Criteria andSreplycountNotEqualTo(Integer value) {
            addCriterion("sreplycount <>", value, "sreplycount");
            return (Criteria) this;
        }

        public Criteria andSreplycountGreaterThan(Integer value) {
            addCriterion("sreplycount >", value, "sreplycount");
            return (Criteria) this;
        }

        public Criteria andSreplycountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sreplycount >=", value, "sreplycount");
            return (Criteria) this;
        }

        public Criteria andSreplycountLessThan(Integer value) {
            addCriterion("sreplycount <", value, "sreplycount");
            return (Criteria) this;
        }

        public Criteria andSreplycountLessThanOrEqualTo(Integer value) {
            addCriterion("sreplycount <=", value, "sreplycount");
            return (Criteria) this;
        }

        public Criteria andSreplycountIn(List<Integer> values) {
            addCriterion("sreplycount in", values, "sreplycount");
            return (Criteria) this;
        }

        public Criteria andSreplycountNotIn(List<Integer> values) {
            addCriterion("sreplycount not in", values, "sreplycount");
            return (Criteria) this;
        }

        public Criteria andSreplycountBetween(Integer value1, Integer value2) {
            addCriterion("sreplycount between", value1, value2, "sreplycount");
            return (Criteria) this;
        }

        public Criteria andSreplycountNotBetween(Integer value1, Integer value2) {
            addCriterion("sreplycount not between", value1, value2, "sreplycount");
            return (Criteria) this;
        }

        public Criteria andSpictureIsNull() {
            addCriterion("spicture is null");
            return (Criteria) this;
        }

        public Criteria andSpictureIsNotNull() {
            addCriterion("spicture is not null");
            return (Criteria) this;
        }

        public Criteria andSpictureEqualTo(String value) {
            addCriterion("spicture =", value, "spicture");
            return (Criteria) this;
        }

        public Criteria andSpictureNotEqualTo(String value) {
            addCriterion("spicture <>", value, "spicture");
            return (Criteria) this;
        }

        public Criteria andSpictureGreaterThan(String value) {
            addCriterion("spicture >", value, "spicture");
            return (Criteria) this;
        }

        public Criteria andSpictureGreaterThanOrEqualTo(String value) {
            addCriterion("spicture >=", value, "spicture");
            return (Criteria) this;
        }

        public Criteria andSpictureLessThan(String value) {
            addCriterion("spicture <", value, "spicture");
            return (Criteria) this;
        }

        public Criteria andSpictureLessThanOrEqualTo(String value) {
            addCriterion("spicture <=", value, "spicture");
            return (Criteria) this;
        }

        public Criteria andSpictureLike(String value) {
            addCriterion("spicture like", value, "spicture");
            return (Criteria) this;
        }

        public Criteria andSpictureNotLike(String value) {
            addCriterion("spicture not like", value, "spicture");
            return (Criteria) this;
        }

        public Criteria andSpictureIn(List<String> values) {
            addCriterion("spicture in", values, "spicture");
            return (Criteria) this;
        }

        public Criteria andSpictureNotIn(List<String> values) {
            addCriterion("spicture not in", values, "spicture");
            return (Criteria) this;
        }

        public Criteria andSpictureBetween(String value1, String value2) {
            addCriterion("spicture between", value1, value2, "spicture");
            return (Criteria) this;
        }

        public Criteria andSpictureNotBetween(String value1, String value2) {
            addCriterion("spicture not between", value1, value2, "spicture");
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