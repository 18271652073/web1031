package com.hbpu.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StumyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StumyExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMstuidIsNull() {
            addCriterion("mstuid is null");
            return (Criteria) this;
        }

        public Criteria andMstuidIsNotNull() {
            addCriterion("mstuid is not null");
            return (Criteria) this;
        }

        public Criteria andMstuidEqualTo(String value) {
            addCriterion("mstuid =", value, "mstuid");
            return (Criteria) this;
        }

        public Criteria andMstuidNotEqualTo(String value) {
            addCriterion("mstuid <>", value, "mstuid");
            return (Criteria) this;
        }

        public Criteria andMstuidGreaterThan(String value) {
            addCriterion("mstuid >", value, "mstuid");
            return (Criteria) this;
        }

        public Criteria andMstuidGreaterThanOrEqualTo(String value) {
            addCriterion("mstuid >=", value, "mstuid");
            return (Criteria) this;
        }

        public Criteria andMstuidLessThan(String value) {
            addCriterion("mstuid <", value, "mstuid");
            return (Criteria) this;
        }

        public Criteria andMstuidLessThanOrEqualTo(String value) {
            addCriterion("mstuid <=", value, "mstuid");
            return (Criteria) this;
        }

        public Criteria andMstuidLike(String value) {
            addCriterion("mstuid like", value, "mstuid");
            return (Criteria) this;
        }

        public Criteria andMstuidNotLike(String value) {
            addCriterion("mstuid not like", value, "mstuid");
            return (Criteria) this;
        }

        public Criteria andMstuidIn(List<String> values) {
            addCriterion("mstuid in", values, "mstuid");
            return (Criteria) this;
        }

        public Criteria andMstuidNotIn(List<String> values) {
            addCriterion("mstuid not in", values, "mstuid");
            return (Criteria) this;
        }

        public Criteria andMstuidBetween(String value1, String value2) {
            addCriterion("mstuid between", value1, value2, "mstuid");
            return (Criteria) this;
        }

        public Criteria andMstuidNotBetween(String value1, String value2) {
            addCriterion("mstuid not between", value1, value2, "mstuid");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMpasswordIsNull() {
            addCriterion("mpassword is null");
            return (Criteria) this;
        }

        public Criteria andMpasswordIsNotNull() {
            addCriterion("mpassword is not null");
            return (Criteria) this;
        }

        public Criteria andMpasswordEqualTo(String value) {
            addCriterion("mpassword =", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordNotEqualTo(String value) {
            addCriterion("mpassword <>", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordGreaterThan(String value) {
            addCriterion("mpassword >", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("mpassword >=", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordLessThan(String value) {
            addCriterion("mpassword <", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordLessThanOrEqualTo(String value) {
            addCriterion("mpassword <=", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordLike(String value) {
            addCriterion("mpassword like", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordNotLike(String value) {
            addCriterion("mpassword not like", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordIn(List<String> values) {
            addCriterion("mpassword in", values, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordNotIn(List<String> values) {
            addCriterion("mpassword not in", values, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordBetween(String value1, String value2) {
            addCriterion("mpassword between", value1, value2, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordNotBetween(String value1, String value2) {
            addCriterion("mpassword not between", value1, value2, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMsexIsNull() {
            addCriterion("msex is null");
            return (Criteria) this;
        }

        public Criteria andMsexIsNotNull() {
            addCriterion("msex is not null");
            return (Criteria) this;
        }

        public Criteria andMsexEqualTo(String value) {
            addCriterion("msex =", value, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexNotEqualTo(String value) {
            addCriterion("msex <>", value, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexGreaterThan(String value) {
            addCriterion("msex >", value, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexGreaterThanOrEqualTo(String value) {
            addCriterion("msex >=", value, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexLessThan(String value) {
            addCriterion("msex <", value, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexLessThanOrEqualTo(String value) {
            addCriterion("msex <=", value, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexLike(String value) {
            addCriterion("msex like", value, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexNotLike(String value) {
            addCriterion("msex not like", value, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexIn(List<String> values) {
            addCriterion("msex in", values, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexNotIn(List<String> values) {
            addCriterion("msex not in", values, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexBetween(String value1, String value2) {
            addCriterion("msex between", value1, value2, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexNotBetween(String value1, String value2) {
            addCriterion("msex not between", value1, value2, "msex");
            return (Criteria) this;
        }

        public Criteria andMageIsNull() {
            addCriterion("mage is null");
            return (Criteria) this;
        }

        public Criteria andMageIsNotNull() {
            addCriterion("mage is not null");
            return (Criteria) this;
        }

        public Criteria andMageEqualTo(Date value) {
            addCriterionForJDBCDate("mage =", value, "mage");
            return (Criteria) this;
        }

        public Criteria andMageNotEqualTo(Date value) {
            addCriterionForJDBCDate("mage <>", value, "mage");
            return (Criteria) this;
        }

        public Criteria andMageGreaterThan(Date value) {
            addCriterionForJDBCDate("mage >", value, "mage");
            return (Criteria) this;
        }

        public Criteria andMageGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mage >=", value, "mage");
            return (Criteria) this;
        }

        public Criteria andMageLessThan(Date value) {
            addCriterionForJDBCDate("mage <", value, "mage");
            return (Criteria) this;
        }

        public Criteria andMageLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mage <=", value, "mage");
            return (Criteria) this;
        }

        public Criteria andMageIn(List<Date> values) {
            addCriterionForJDBCDate("mage in", values, "mage");
            return (Criteria) this;
        }

        public Criteria andMageNotIn(List<Date> values) {
            addCriterionForJDBCDate("mage not in", values, "mage");
            return (Criteria) this;
        }

        public Criteria andMageBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mage between", value1, value2, "mage");
            return (Criteria) this;
        }

        public Criteria andMageNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mage not between", value1, value2, "mage");
            return (Criteria) this;
        }

        public Criteria andMbuildnumIsNull() {
            addCriterion("mbuildnum is null");
            return (Criteria) this;
        }

        public Criteria andMbuildnumIsNotNull() {
            addCriterion("mbuildnum is not null");
            return (Criteria) this;
        }

        public Criteria andMbuildnumEqualTo(String value) {
            addCriterion("mbuildnum =", value, "mbuildnum");
            return (Criteria) this;
        }

        public Criteria andMbuildnumNotEqualTo(String value) {
            addCriterion("mbuildnum <>", value, "mbuildnum");
            return (Criteria) this;
        }

        public Criteria andMbuildnumGreaterThan(String value) {
            addCriterion("mbuildnum >", value, "mbuildnum");
            return (Criteria) this;
        }

        public Criteria andMbuildnumGreaterThanOrEqualTo(String value) {
            addCriterion("mbuildnum >=", value, "mbuildnum");
            return (Criteria) this;
        }

        public Criteria andMbuildnumLessThan(String value) {
            addCriterion("mbuildnum <", value, "mbuildnum");
            return (Criteria) this;
        }

        public Criteria andMbuildnumLessThanOrEqualTo(String value) {
            addCriterion("mbuildnum <=", value, "mbuildnum");
            return (Criteria) this;
        }

        public Criteria andMbuildnumLike(String value) {
            addCriterion("mbuildnum like", value, "mbuildnum");
            return (Criteria) this;
        }

        public Criteria andMbuildnumNotLike(String value) {
            addCriterion("mbuildnum not like", value, "mbuildnum");
            return (Criteria) this;
        }

        public Criteria andMbuildnumIn(List<String> values) {
            addCriterion("mbuildnum in", values, "mbuildnum");
            return (Criteria) this;
        }

        public Criteria andMbuildnumNotIn(List<String> values) {
            addCriterion("mbuildnum not in", values, "mbuildnum");
            return (Criteria) this;
        }

        public Criteria andMbuildnumBetween(String value1, String value2) {
            addCriterion("mbuildnum between", value1, value2, "mbuildnum");
            return (Criteria) this;
        }

        public Criteria andMbuildnumNotBetween(String value1, String value2) {
            addCriterion("mbuildnum not between", value1, value2, "mbuildnum");
            return (Criteria) this;
        }

        public Criteria andMdromIsNull() {
            addCriterion("mdrom is null");
            return (Criteria) this;
        }

        public Criteria andMdromIsNotNull() {
            addCriterion("mdrom is not null");
            return (Criteria) this;
        }

        public Criteria andMdromEqualTo(String value) {
            addCriterion("mdrom =", value, "mdrom");
            return (Criteria) this;
        }

        public Criteria andMdromNotEqualTo(String value) {
            addCriterion("mdrom <>", value, "mdrom");
            return (Criteria) this;
        }

        public Criteria andMdromGreaterThan(String value) {
            addCriterion("mdrom >", value, "mdrom");
            return (Criteria) this;
        }

        public Criteria andMdromGreaterThanOrEqualTo(String value) {
            addCriterion("mdrom >=", value, "mdrom");
            return (Criteria) this;
        }

        public Criteria andMdromLessThan(String value) {
            addCriterion("mdrom <", value, "mdrom");
            return (Criteria) this;
        }

        public Criteria andMdromLessThanOrEqualTo(String value) {
            addCriterion("mdrom <=", value, "mdrom");
            return (Criteria) this;
        }

        public Criteria andMdromLike(String value) {
            addCriterion("mdrom like", value, "mdrom");
            return (Criteria) this;
        }

        public Criteria andMdromNotLike(String value) {
            addCriterion("mdrom not like", value, "mdrom");
            return (Criteria) this;
        }

        public Criteria andMdromIn(List<String> values) {
            addCriterion("mdrom in", values, "mdrom");
            return (Criteria) this;
        }

        public Criteria andMdromNotIn(List<String> values) {
            addCriterion("mdrom not in", values, "mdrom");
            return (Criteria) this;
        }

        public Criteria andMdromBetween(String value1, String value2) {
            addCriterion("mdrom between", value1, value2, "mdrom");
            return (Criteria) this;
        }

        public Criteria andMdromNotBetween(String value1, String value2) {
            addCriterion("mdrom not between", value1, value2, "mdrom");
            return (Criteria) this;
        }

        public Criteria andMcollegeIsNull() {
            addCriterion("mcollege is null");
            return (Criteria) this;
        }

        public Criteria andMcollegeIsNotNull() {
            addCriterion("mcollege is not null");
            return (Criteria) this;
        }

        public Criteria andMcollegeEqualTo(String value) {
            addCriterion("mcollege =", value, "mcollege");
            return (Criteria) this;
        }

        public Criteria andMcollegeNotEqualTo(String value) {
            addCriterion("mcollege <>", value, "mcollege");
            return (Criteria) this;
        }

        public Criteria andMcollegeGreaterThan(String value) {
            addCriterion("mcollege >", value, "mcollege");
            return (Criteria) this;
        }

        public Criteria andMcollegeGreaterThanOrEqualTo(String value) {
            addCriterion("mcollege >=", value, "mcollege");
            return (Criteria) this;
        }

        public Criteria andMcollegeLessThan(String value) {
            addCriterion("mcollege <", value, "mcollege");
            return (Criteria) this;
        }

        public Criteria andMcollegeLessThanOrEqualTo(String value) {
            addCriterion("mcollege <=", value, "mcollege");
            return (Criteria) this;
        }

        public Criteria andMcollegeLike(String value) {
            addCriterion("mcollege like", value, "mcollege");
            return (Criteria) this;
        }

        public Criteria andMcollegeNotLike(String value) {
            addCriterion("mcollege not like", value, "mcollege");
            return (Criteria) this;
        }

        public Criteria andMcollegeIn(List<String> values) {
            addCriterion("mcollege in", values, "mcollege");
            return (Criteria) this;
        }

        public Criteria andMcollegeNotIn(List<String> values) {
            addCriterion("mcollege not in", values, "mcollege");
            return (Criteria) this;
        }

        public Criteria andMcollegeBetween(String value1, String value2) {
            addCriterion("mcollege between", value1, value2, "mcollege");
            return (Criteria) this;
        }

        public Criteria andMcollegeNotBetween(String value1, String value2) {
            addCriterion("mcollege not between", value1, value2, "mcollege");
            return (Criteria) this;
        }

        public Criteria andMmajorIsNull() {
            addCriterion("mmajor is null");
            return (Criteria) this;
        }

        public Criteria andMmajorIsNotNull() {
            addCriterion("mmajor is not null");
            return (Criteria) this;
        }

        public Criteria andMmajorEqualTo(String value) {
            addCriterion("mmajor =", value, "mmajor");
            return (Criteria) this;
        }

        public Criteria andMmajorNotEqualTo(String value) {
            addCriterion("mmajor <>", value, "mmajor");
            return (Criteria) this;
        }

        public Criteria andMmajorGreaterThan(String value) {
            addCriterion("mmajor >", value, "mmajor");
            return (Criteria) this;
        }

        public Criteria andMmajorGreaterThanOrEqualTo(String value) {
            addCriterion("mmajor >=", value, "mmajor");
            return (Criteria) this;
        }

        public Criteria andMmajorLessThan(String value) {
            addCriterion("mmajor <", value, "mmajor");
            return (Criteria) this;
        }

        public Criteria andMmajorLessThanOrEqualTo(String value) {
            addCriterion("mmajor <=", value, "mmajor");
            return (Criteria) this;
        }

        public Criteria andMmajorLike(String value) {
            addCriterion("mmajor like", value, "mmajor");
            return (Criteria) this;
        }

        public Criteria andMmajorNotLike(String value) {
            addCriterion("mmajor not like", value, "mmajor");
            return (Criteria) this;
        }

        public Criteria andMmajorIn(List<String> values) {
            addCriterion("mmajor in", values, "mmajor");
            return (Criteria) this;
        }

        public Criteria andMmajorNotIn(List<String> values) {
            addCriterion("mmajor not in", values, "mmajor");
            return (Criteria) this;
        }

        public Criteria andMmajorBetween(String value1, String value2) {
            addCriterion("mmajor between", value1, value2, "mmajor");
            return (Criteria) this;
        }

        public Criteria andMmajorNotBetween(String value1, String value2) {
            addCriterion("mmajor not between", value1, value2, "mmajor");
            return (Criteria) this;
        }

        public Criteria andMtelIsNull() {
            addCriterion("mtel is null");
            return (Criteria) this;
        }

        public Criteria andMtelIsNotNull() {
            addCriterion("mtel is not null");
            return (Criteria) this;
        }

        public Criteria andMtelEqualTo(String value) {
            addCriterion("mtel =", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelNotEqualTo(String value) {
            addCriterion("mtel <>", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelGreaterThan(String value) {
            addCriterion("mtel >", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelGreaterThanOrEqualTo(String value) {
            addCriterion("mtel >=", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelLessThan(String value) {
            addCriterion("mtel <", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelLessThanOrEqualTo(String value) {
            addCriterion("mtel <=", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelLike(String value) {
            addCriterion("mtel like", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelNotLike(String value) {
            addCriterion("mtel not like", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelIn(List<String> values) {
            addCriterion("mtel in", values, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelNotIn(List<String> values) {
            addCriterion("mtel not in", values, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelBetween(String value1, String value2) {
            addCriterion("mtel between", value1, value2, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelNotBetween(String value1, String value2) {
            addCriterion("mtel not between", value1, value2, "mtel");
            return (Criteria) this;
        }

        public Criteria andMparenttelIsNull() {
            addCriterion("mparenttel is null");
            return (Criteria) this;
        }

        public Criteria andMparenttelIsNotNull() {
            addCriterion("mparenttel is not null");
            return (Criteria) this;
        }

        public Criteria andMparenttelEqualTo(String value) {
            addCriterion("mparenttel =", value, "mparenttel");
            return (Criteria) this;
        }

        public Criteria andMparenttelNotEqualTo(String value) {
            addCriterion("mparenttel <>", value, "mparenttel");
            return (Criteria) this;
        }

        public Criteria andMparenttelGreaterThan(String value) {
            addCriterion("mparenttel >", value, "mparenttel");
            return (Criteria) this;
        }

        public Criteria andMparenttelGreaterThanOrEqualTo(String value) {
            addCriterion("mparenttel >=", value, "mparenttel");
            return (Criteria) this;
        }

        public Criteria andMparenttelLessThan(String value) {
            addCriterion("mparenttel <", value, "mparenttel");
            return (Criteria) this;
        }

        public Criteria andMparenttelLessThanOrEqualTo(String value) {
            addCriterion("mparenttel <=", value, "mparenttel");
            return (Criteria) this;
        }

        public Criteria andMparenttelLike(String value) {
            addCriterion("mparenttel like", value, "mparenttel");
            return (Criteria) this;
        }

        public Criteria andMparenttelNotLike(String value) {
            addCriterion("mparenttel not like", value, "mparenttel");
            return (Criteria) this;
        }

        public Criteria andMparenttelIn(List<String> values) {
            addCriterion("mparenttel in", values, "mparenttel");
            return (Criteria) this;
        }

        public Criteria andMparenttelNotIn(List<String> values) {
            addCriterion("mparenttel not in", values, "mparenttel");
            return (Criteria) this;
        }

        public Criteria andMparenttelBetween(String value1, String value2) {
            addCriterion("mparenttel between", value1, value2, "mparenttel");
            return (Criteria) this;
        }

        public Criteria andMparenttelNotBetween(String value1, String value2) {
            addCriterion("mparenttel not between", value1, value2, "mparenttel");
            return (Criteria) this;
        }

        public Criteria andMpictureIsNull() {
            addCriterion("mpicture is null");
            return (Criteria) this;
        }

        public Criteria andMpictureIsNotNull() {
            addCriterion("mpicture is not null");
            return (Criteria) this;
        }

        public Criteria andMpictureEqualTo(String value) {
            addCriterion("mpicture =", value, "mpicture");
            return (Criteria) this;
        }

        public Criteria andMpictureNotEqualTo(String value) {
            addCriterion("mpicture <>", value, "mpicture");
            return (Criteria) this;
        }

        public Criteria andMpictureGreaterThan(String value) {
            addCriterion("mpicture >", value, "mpicture");
            return (Criteria) this;
        }

        public Criteria andMpictureGreaterThanOrEqualTo(String value) {
            addCriterion("mpicture >=", value, "mpicture");
            return (Criteria) this;
        }

        public Criteria andMpictureLessThan(String value) {
            addCriterion("mpicture <", value, "mpicture");
            return (Criteria) this;
        }

        public Criteria andMpictureLessThanOrEqualTo(String value) {
            addCriterion("mpicture <=", value, "mpicture");
            return (Criteria) this;
        }

        public Criteria andMpictureLike(String value) {
            addCriterion("mpicture like", value, "mpicture");
            return (Criteria) this;
        }

        public Criteria andMpictureNotLike(String value) {
            addCriterion("mpicture not like", value, "mpicture");
            return (Criteria) this;
        }

        public Criteria andMpictureIn(List<String> values) {
            addCriterion("mpicture in", values, "mpicture");
            return (Criteria) this;
        }

        public Criteria andMpictureNotIn(List<String> values) {
            addCriterion("mpicture not in", values, "mpicture");
            return (Criteria) this;
        }

        public Criteria andMpictureBetween(String value1, String value2) {
            addCriterion("mpicture between", value1, value2, "mpicture");
            return (Criteria) this;
        }

        public Criteria andMpictureNotBetween(String value1, String value2) {
            addCriterion("mpicture not between", value1, value2, "mpicture");
            return (Criteria) this;
        }

        public Criteria andMaddressIsNull() {
            addCriterion("maddress is null");
            return (Criteria) this;
        }

        public Criteria andMaddressIsNotNull() {
            addCriterion("maddress is not null");
            return (Criteria) this;
        }

        public Criteria andMaddressEqualTo(String value) {
            addCriterion("maddress =", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotEqualTo(String value) {
            addCriterion("maddress <>", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressGreaterThan(String value) {
            addCriterion("maddress >", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressGreaterThanOrEqualTo(String value) {
            addCriterion("maddress >=", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressLessThan(String value) {
            addCriterion("maddress <", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressLessThanOrEqualTo(String value) {
            addCriterion("maddress <=", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressLike(String value) {
            addCriterion("maddress like", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotLike(String value) {
            addCriterion("maddress not like", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressIn(List<String> values) {
            addCriterion("maddress in", values, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotIn(List<String> values) {
            addCriterion("maddress not in", values, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressBetween(String value1, String value2) {
            addCriterion("maddress between", value1, value2, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotBetween(String value1, String value2) {
            addCriterion("maddress not between", value1, value2, "maddress");
            return (Criteria) this;
        }

        public Criteria andMdateIsNull() {
            addCriterion("mdate is null");
            return (Criteria) this;
        }

        public Criteria andMdateIsNotNull() {
            addCriterion("mdate is not null");
            return (Criteria) this;
        }

        public Criteria andMdateEqualTo(Date value) {
            addCriterionForJDBCDate("mdate =", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("mdate <>", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateGreaterThan(Date value) {
            addCriterionForJDBCDate("mdate >", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mdate >=", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateLessThan(Date value) {
            addCriterionForJDBCDate("mdate <", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mdate <=", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateIn(List<Date> values) {
            addCriterionForJDBCDate("mdate in", values, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("mdate not in", values, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mdate between", value1, value2, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mdate not between", value1, value2, "mdate");
            return (Criteria) this;
        }

        public Criteria andMstateIsNull() {
            addCriterion("mstate is null");
            return (Criteria) this;
        }

        public Criteria andMstateIsNotNull() {
            addCriterion("mstate is not null");
            return (Criteria) this;
        }

        public Criteria andMstateEqualTo(String value) {
            addCriterion("mstate =", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotEqualTo(String value) {
            addCriterion("mstate <>", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateGreaterThan(String value) {
            addCriterion("mstate >", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateGreaterThanOrEqualTo(String value) {
            addCriterion("mstate >=", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateLessThan(String value) {
            addCriterion("mstate <", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateLessThanOrEqualTo(String value) {
            addCriterion("mstate <=", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateLike(String value) {
            addCriterion("mstate like", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotLike(String value) {
            addCriterion("mstate not like", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateIn(List<String> values) {
            addCriterion("mstate in", values, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotIn(List<String> values) {
            addCriterion("mstate not in", values, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateBetween(String value1, String value2) {
            addCriterion("mstate between", value1, value2, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotBetween(String value1, String value2) {
            addCriterion("mstate not between", value1, value2, "mstate");
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