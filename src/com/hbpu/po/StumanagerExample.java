package com.hbpu.po;

import java.util.ArrayList;
import java.util.List;

public class StumanagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StumanagerExample() {
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

        public Criteria andMgidIsNull() {
            addCriterion("mgid is null");
            return (Criteria) this;
        }

        public Criteria andMgidIsNotNull() {
            addCriterion("mgid is not null");
            return (Criteria) this;
        }

        public Criteria andMgidEqualTo(Integer value) {
            addCriterion("mgid =", value, "mgid");
            return (Criteria) this;
        }

        public Criteria andMgidNotEqualTo(Integer value) {
            addCriterion("mgid <>", value, "mgid");
            return (Criteria) this;
        }

        public Criteria andMgidGreaterThan(Integer value) {
            addCriterion("mgid >", value, "mgid");
            return (Criteria) this;
        }

        public Criteria andMgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mgid >=", value, "mgid");
            return (Criteria) this;
        }

        public Criteria andMgidLessThan(Integer value) {
            addCriterion("mgid <", value, "mgid");
            return (Criteria) this;
        }

        public Criteria andMgidLessThanOrEqualTo(Integer value) {
            addCriterion("mgid <=", value, "mgid");
            return (Criteria) this;
        }

        public Criteria andMgidIn(List<Integer> values) {
            addCriterion("mgid in", values, "mgid");
            return (Criteria) this;
        }

        public Criteria andMgidNotIn(List<Integer> values) {
            addCriterion("mgid not in", values, "mgid");
            return (Criteria) this;
        }

        public Criteria andMgidBetween(Integer value1, Integer value2) {
            addCriterion("mgid between", value1, value2, "mgid");
            return (Criteria) this;
        }

        public Criteria andMgidNotBetween(Integer value1, Integer value2) {
            addCriterion("mgid not between", value1, value2, "mgid");
            return (Criteria) this;
        }

        public Criteria andMgstuidIsNull() {
            addCriterion("mgstuid is null");
            return (Criteria) this;
        }

        public Criteria andMgstuidIsNotNull() {
            addCriterion("mgstuid is not null");
            return (Criteria) this;
        }

        public Criteria andMgstuidEqualTo(String value) {
            addCriterion("mgstuid =", value, "mgstuid");
            return (Criteria) this;
        }

        public Criteria andMgstuidNotEqualTo(String value) {
            addCriterion("mgstuid <>", value, "mgstuid");
            return (Criteria) this;
        }

        public Criteria andMgstuidGreaterThan(String value) {
            addCriterion("mgstuid >", value, "mgstuid");
            return (Criteria) this;
        }

        public Criteria andMgstuidGreaterThanOrEqualTo(String value) {
            addCriterion("mgstuid >=", value, "mgstuid");
            return (Criteria) this;
        }

        public Criteria andMgstuidLessThan(String value) {
            addCriterion("mgstuid <", value, "mgstuid");
            return (Criteria) this;
        }

        public Criteria andMgstuidLessThanOrEqualTo(String value) {
            addCriterion("mgstuid <=", value, "mgstuid");
            return (Criteria) this;
        }

        public Criteria andMgstuidLike(String value) {
            addCriterion("mgstuid like", value, "mgstuid");
            return (Criteria) this;
        }

        public Criteria andMgstuidNotLike(String value) {
            addCriterion("mgstuid not like", value, "mgstuid");
            return (Criteria) this;
        }

        public Criteria andMgstuidIn(List<String> values) {
            addCriterion("mgstuid in", values, "mgstuid");
            return (Criteria) this;
        }

        public Criteria andMgstuidNotIn(List<String> values) {
            addCriterion("mgstuid not in", values, "mgstuid");
            return (Criteria) this;
        }

        public Criteria andMgstuidBetween(String value1, String value2) {
            addCriterion("mgstuid between", value1, value2, "mgstuid");
            return (Criteria) this;
        }

        public Criteria andMgstuidNotBetween(String value1, String value2) {
            addCriterion("mgstuid not between", value1, value2, "mgstuid");
            return (Criteria) this;
        }

        public Criteria andMgnameIsNull() {
            addCriterion("mgname is null");
            return (Criteria) this;
        }

        public Criteria andMgnameIsNotNull() {
            addCriterion("mgname is not null");
            return (Criteria) this;
        }

        public Criteria andMgnameEqualTo(String value) {
            addCriterion("mgname =", value, "mgname");
            return (Criteria) this;
        }

        public Criteria andMgnameNotEqualTo(String value) {
            addCriterion("mgname <>", value, "mgname");
            return (Criteria) this;
        }

        public Criteria andMgnameGreaterThan(String value) {
            addCriterion("mgname >", value, "mgname");
            return (Criteria) this;
        }

        public Criteria andMgnameGreaterThanOrEqualTo(String value) {
            addCriterion("mgname >=", value, "mgname");
            return (Criteria) this;
        }

        public Criteria andMgnameLessThan(String value) {
            addCriterion("mgname <", value, "mgname");
            return (Criteria) this;
        }

        public Criteria andMgnameLessThanOrEqualTo(String value) {
            addCriterion("mgname <=", value, "mgname");
            return (Criteria) this;
        }

        public Criteria andMgnameLike(String value) {
            addCriterion("mgname like", value, "mgname");
            return (Criteria) this;
        }

        public Criteria andMgnameNotLike(String value) {
            addCriterion("mgname not like", value, "mgname");
            return (Criteria) this;
        }

        public Criteria andMgnameIn(List<String> values) {
            addCriterion("mgname in", values, "mgname");
            return (Criteria) this;
        }

        public Criteria andMgnameNotIn(List<String> values) {
            addCriterion("mgname not in", values, "mgname");
            return (Criteria) this;
        }

        public Criteria andMgnameBetween(String value1, String value2) {
            addCriterion("mgname between", value1, value2, "mgname");
            return (Criteria) this;
        }

        public Criteria andMgnameNotBetween(String value1, String value2) {
            addCriterion("mgname not between", value1, value2, "mgname");
            return (Criteria) this;
        }

        public Criteria andMgpasswordIsNull() {
            addCriterion("mgpassword is null");
            return (Criteria) this;
        }

        public Criteria andMgpasswordIsNotNull() {
            addCriterion("mgpassword is not null");
            return (Criteria) this;
        }

        public Criteria andMgpasswordEqualTo(String value) {
            addCriterion("mgpassword =", value, "mgpassword");
            return (Criteria) this;
        }

        public Criteria andMgpasswordNotEqualTo(String value) {
            addCriterion("mgpassword <>", value, "mgpassword");
            return (Criteria) this;
        }

        public Criteria andMgpasswordGreaterThan(String value) {
            addCriterion("mgpassword >", value, "mgpassword");
            return (Criteria) this;
        }

        public Criteria andMgpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("mgpassword >=", value, "mgpassword");
            return (Criteria) this;
        }

        public Criteria andMgpasswordLessThan(String value) {
            addCriterion("mgpassword <", value, "mgpassword");
            return (Criteria) this;
        }

        public Criteria andMgpasswordLessThanOrEqualTo(String value) {
            addCriterion("mgpassword <=", value, "mgpassword");
            return (Criteria) this;
        }

        public Criteria andMgpasswordLike(String value) {
            addCriterion("mgpassword like", value, "mgpassword");
            return (Criteria) this;
        }

        public Criteria andMgpasswordNotLike(String value) {
            addCriterion("mgpassword not like", value, "mgpassword");
            return (Criteria) this;
        }

        public Criteria andMgpasswordIn(List<String> values) {
            addCriterion("mgpassword in", values, "mgpassword");
            return (Criteria) this;
        }

        public Criteria andMgpasswordNotIn(List<String> values) {
            addCriterion("mgpassword not in", values, "mgpassword");
            return (Criteria) this;
        }

        public Criteria andMgpasswordBetween(String value1, String value2) {
            addCriterion("mgpassword between", value1, value2, "mgpassword");
            return (Criteria) this;
        }

        public Criteria andMgpasswordNotBetween(String value1, String value2) {
            addCriterion("mgpassword not between", value1, value2, "mgpassword");
            return (Criteria) this;
        }

        public Criteria andMgbuildnumIsNull() {
            addCriterion("mgbuildnum is null");
            return (Criteria) this;
        }

        public Criteria andMgbuildnumIsNotNull() {
            addCriterion("mgbuildnum is not null");
            return (Criteria) this;
        }

        public Criteria andMgbuildnumEqualTo(String value) {
            addCriterion("mgbuildnum =", value, "mgbuildnum");
            return (Criteria) this;
        }

        public Criteria andMgbuildnumNotEqualTo(String value) {
            addCriterion("mgbuildnum <>", value, "mgbuildnum");
            return (Criteria) this;
        }

        public Criteria andMgbuildnumGreaterThan(String value) {
            addCriterion("mgbuildnum >", value, "mgbuildnum");
            return (Criteria) this;
        }

        public Criteria andMgbuildnumGreaterThanOrEqualTo(String value) {
            addCriterion("mgbuildnum >=", value, "mgbuildnum");
            return (Criteria) this;
        }

        public Criteria andMgbuildnumLessThan(String value) {
            addCriterion("mgbuildnum <", value, "mgbuildnum");
            return (Criteria) this;
        }

        public Criteria andMgbuildnumLessThanOrEqualTo(String value) {
            addCriterion("mgbuildnum <=", value, "mgbuildnum");
            return (Criteria) this;
        }

        public Criteria andMgbuildnumLike(String value) {
            addCriterion("mgbuildnum like", value, "mgbuildnum");
            return (Criteria) this;
        }

        public Criteria andMgbuildnumNotLike(String value) {
            addCriterion("mgbuildnum not like", value, "mgbuildnum");
            return (Criteria) this;
        }

        public Criteria andMgbuildnumIn(List<String> values) {
            addCriterion("mgbuildnum in", values, "mgbuildnum");
            return (Criteria) this;
        }

        public Criteria andMgbuildnumNotIn(List<String> values) {
            addCriterion("mgbuildnum not in", values, "mgbuildnum");
            return (Criteria) this;
        }

        public Criteria andMgbuildnumBetween(String value1, String value2) {
            addCriterion("mgbuildnum between", value1, value2, "mgbuildnum");
            return (Criteria) this;
        }

        public Criteria andMgbuildnumNotBetween(String value1, String value2) {
            addCriterion("mgbuildnum not between", value1, value2, "mgbuildnum");
            return (Criteria) this;
        }

        public Criteria andMgmynameIsNull() {
            addCriterion("mgmyname is null");
            return (Criteria) this;
        }

        public Criteria andMgmynameIsNotNull() {
            addCriterion("mgmyname is not null");
            return (Criteria) this;
        }

        public Criteria andMgmynameEqualTo(String value) {
            addCriterion("mgmyname =", value, "mgmyname");
            return (Criteria) this;
        }

        public Criteria andMgmynameNotEqualTo(String value) {
            addCriterion("mgmyname <>", value, "mgmyname");
            return (Criteria) this;
        }

        public Criteria andMgmynameGreaterThan(String value) {
            addCriterion("mgmyname >", value, "mgmyname");
            return (Criteria) this;
        }

        public Criteria andMgmynameGreaterThanOrEqualTo(String value) {
            addCriterion("mgmyname >=", value, "mgmyname");
            return (Criteria) this;
        }

        public Criteria andMgmynameLessThan(String value) {
            addCriterion("mgmyname <", value, "mgmyname");
            return (Criteria) this;
        }

        public Criteria andMgmynameLessThanOrEqualTo(String value) {
            addCriterion("mgmyname <=", value, "mgmyname");
            return (Criteria) this;
        }

        public Criteria andMgmynameLike(String value) {
            addCriterion("mgmyname like", value, "mgmyname");
            return (Criteria) this;
        }

        public Criteria andMgmynameNotLike(String value) {
            addCriterion("mgmyname not like", value, "mgmyname");
            return (Criteria) this;
        }

        public Criteria andMgmynameIn(List<String> values) {
            addCriterion("mgmyname in", values, "mgmyname");
            return (Criteria) this;
        }

        public Criteria andMgmynameNotIn(List<String> values) {
            addCriterion("mgmyname not in", values, "mgmyname");
            return (Criteria) this;
        }

        public Criteria andMgmynameBetween(String value1, String value2) {
            addCriterion("mgmyname between", value1, value2, "mgmyname");
            return (Criteria) this;
        }

        public Criteria andMgmynameNotBetween(String value1, String value2) {
            addCriterion("mgmyname not between", value1, value2, "mgmyname");
            return (Criteria) this;
        }

        public Criteria andMgsexIsNull() {
            addCriterion("mgsex is null");
            return (Criteria) this;
        }

        public Criteria andMgsexIsNotNull() {
            addCriterion("mgsex is not null");
            return (Criteria) this;
        }

        public Criteria andMgsexEqualTo(String value) {
            addCriterion("mgsex =", value, "mgsex");
            return (Criteria) this;
        }

        public Criteria andMgsexNotEqualTo(String value) {
            addCriterion("mgsex <>", value, "mgsex");
            return (Criteria) this;
        }

        public Criteria andMgsexGreaterThan(String value) {
            addCriterion("mgsex >", value, "mgsex");
            return (Criteria) this;
        }

        public Criteria andMgsexGreaterThanOrEqualTo(String value) {
            addCriterion("mgsex >=", value, "mgsex");
            return (Criteria) this;
        }

        public Criteria andMgsexLessThan(String value) {
            addCriterion("mgsex <", value, "mgsex");
            return (Criteria) this;
        }

        public Criteria andMgsexLessThanOrEqualTo(String value) {
            addCriterion("mgsex <=", value, "mgsex");
            return (Criteria) this;
        }

        public Criteria andMgsexLike(String value) {
            addCriterion("mgsex like", value, "mgsex");
            return (Criteria) this;
        }

        public Criteria andMgsexNotLike(String value) {
            addCriterion("mgsex not like", value, "mgsex");
            return (Criteria) this;
        }

        public Criteria andMgsexIn(List<String> values) {
            addCriterion("mgsex in", values, "mgsex");
            return (Criteria) this;
        }

        public Criteria andMgsexNotIn(List<String> values) {
            addCriterion("mgsex not in", values, "mgsex");
            return (Criteria) this;
        }

        public Criteria andMgsexBetween(String value1, String value2) {
            addCriterion("mgsex between", value1, value2, "mgsex");
            return (Criteria) this;
        }

        public Criteria andMgsexNotBetween(String value1, String value2) {
            addCriterion("mgsex not between", value1, value2, "mgsex");
            return (Criteria) this;
        }

        public Criteria andMgtelIsNull() {
            addCriterion("mgtel is null");
            return (Criteria) this;
        }

        public Criteria andMgtelIsNotNull() {
            addCriterion("mgtel is not null");
            return (Criteria) this;
        }

        public Criteria andMgtelEqualTo(String value) {
            addCriterion("mgtel =", value, "mgtel");
            return (Criteria) this;
        }

        public Criteria andMgtelNotEqualTo(String value) {
            addCriterion("mgtel <>", value, "mgtel");
            return (Criteria) this;
        }

        public Criteria andMgtelGreaterThan(String value) {
            addCriterion("mgtel >", value, "mgtel");
            return (Criteria) this;
        }

        public Criteria andMgtelGreaterThanOrEqualTo(String value) {
            addCriterion("mgtel >=", value, "mgtel");
            return (Criteria) this;
        }

        public Criteria andMgtelLessThan(String value) {
            addCriterion("mgtel <", value, "mgtel");
            return (Criteria) this;
        }

        public Criteria andMgtelLessThanOrEqualTo(String value) {
            addCriterion("mgtel <=", value, "mgtel");
            return (Criteria) this;
        }

        public Criteria andMgtelLike(String value) {
            addCriterion("mgtel like", value, "mgtel");
            return (Criteria) this;
        }

        public Criteria andMgtelNotLike(String value) {
            addCriterion("mgtel not like", value, "mgtel");
            return (Criteria) this;
        }

        public Criteria andMgtelIn(List<String> values) {
            addCriterion("mgtel in", values, "mgtel");
            return (Criteria) this;
        }

        public Criteria andMgtelNotIn(List<String> values) {
            addCriterion("mgtel not in", values, "mgtel");
            return (Criteria) this;
        }

        public Criteria andMgtelBetween(String value1, String value2) {
            addCriterion("mgtel between", value1, value2, "mgtel");
            return (Criteria) this;
        }

        public Criteria andMgtelNotBetween(String value1, String value2) {
            addCriterion("mgtel not between", value1, value2, "mgtel");
            return (Criteria) this;
        }

        public Criteria andMgpowerIsNull() {
            addCriterion("mgpower is null");
            return (Criteria) this;
        }

        public Criteria andMgpowerIsNotNull() {
            addCriterion("mgpower is not null");
            return (Criteria) this;
        }

        public Criteria andMgpowerEqualTo(String value) {
            addCriterion("mgpower =", value, "mgpower");
            return (Criteria) this;
        }

        public Criteria andMgpowerNotEqualTo(String value) {
            addCriterion("mgpower <>", value, "mgpower");
            return (Criteria) this;
        }

        public Criteria andMgpowerGreaterThan(String value) {
            addCriterion("mgpower >", value, "mgpower");
            return (Criteria) this;
        }

        public Criteria andMgpowerGreaterThanOrEqualTo(String value) {
            addCriterion("mgpower >=", value, "mgpower");
            return (Criteria) this;
        }

        public Criteria andMgpowerLessThan(String value) {
            addCriterion("mgpower <", value, "mgpower");
            return (Criteria) this;
        }

        public Criteria andMgpowerLessThanOrEqualTo(String value) {
            addCriterion("mgpower <=", value, "mgpower");
            return (Criteria) this;
        }

        public Criteria andMgpowerLike(String value) {
            addCriterion("mgpower like", value, "mgpower");
            return (Criteria) this;
        }

        public Criteria andMgpowerNotLike(String value) {
            addCriterion("mgpower not like", value, "mgpower");
            return (Criteria) this;
        }

        public Criteria andMgpowerIn(List<String> values) {
            addCriterion("mgpower in", values, "mgpower");
            return (Criteria) this;
        }

        public Criteria andMgpowerNotIn(List<String> values) {
            addCriterion("mgpower not in", values, "mgpower");
            return (Criteria) this;
        }

        public Criteria andMgpowerBetween(String value1, String value2) {
            addCriterion("mgpower between", value1, value2, "mgpower");
            return (Criteria) this;
        }

        public Criteria andMgpowerNotBetween(String value1, String value2) {
            addCriterion("mgpower not between", value1, value2, "mgpower");
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