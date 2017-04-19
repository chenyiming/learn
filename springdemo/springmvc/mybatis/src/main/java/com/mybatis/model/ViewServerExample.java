package com.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ViewServerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewServerExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameIsNull() {
            addCriterion("organization_name is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameIsNotNull() {
            addCriterion("organization_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameEqualTo(String value) {
            addCriterion("organization_name =", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotEqualTo(String value) {
            addCriterion("organization_name <>", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameGreaterThan(String value) {
            addCriterion("organization_name >", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameGreaterThanOrEqualTo(String value) {
            addCriterion("organization_name >=", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameLessThan(String value) {
            addCriterion("organization_name <", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameLessThanOrEqualTo(String value) {
            addCriterion("organization_name <=", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameLike(String value) {
            addCriterion("organization_name like", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotLike(String value) {
            addCriterion("organization_name not like", value, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameIn(List<String> values) {
            addCriterion("organization_name in", values, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotIn(List<String> values) {
            addCriterion("organization_name not in", values, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameBetween(String value1, String value2) {
            addCriterion("organization_name between", value1, value2, "organizationName");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameNotBetween(String value1, String value2) {
            addCriterion("organization_name not between", value1, value2, "organizationName");
            return (Criteria) this;
        }

        public Criteria andBusinessCriticityIsNull() {
            addCriterion("business_criticity is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCriticityIsNotNull() {
            addCriterion("business_criticity is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCriticityEqualTo(String value) {
            addCriterion("business_criticity =", value, "businessCriticity");
            return (Criteria) this;
        }

        public Criteria andBusinessCriticityNotEqualTo(String value) {
            addCriterion("business_criticity <>", value, "businessCriticity");
            return (Criteria) this;
        }

        public Criteria andBusinessCriticityGreaterThan(String value) {
            addCriterion("business_criticity >", value, "businessCriticity");
            return (Criteria) this;
        }

        public Criteria andBusinessCriticityGreaterThanOrEqualTo(String value) {
            addCriterion("business_criticity >=", value, "businessCriticity");
            return (Criteria) this;
        }

        public Criteria andBusinessCriticityLessThan(String value) {
            addCriterion("business_criticity <", value, "businessCriticity");
            return (Criteria) this;
        }

        public Criteria andBusinessCriticityLessThanOrEqualTo(String value) {
            addCriterion("business_criticity <=", value, "businessCriticity");
            return (Criteria) this;
        }

        public Criteria andBusinessCriticityLike(String value) {
            addCriterion("business_criticity like", value, "businessCriticity");
            return (Criteria) this;
        }

        public Criteria andBusinessCriticityNotLike(String value) {
            addCriterion("business_criticity not like", value, "businessCriticity");
            return (Criteria) this;
        }

        public Criteria andBusinessCriticityIn(List<String> values) {
            addCriterion("business_criticity in", values, "businessCriticity");
            return (Criteria) this;
        }

        public Criteria andBusinessCriticityNotIn(List<String> values) {
            addCriterion("business_criticity not in", values, "businessCriticity");
            return (Criteria) this;
        }

        public Criteria andBusinessCriticityBetween(String value1, String value2) {
            addCriterion("business_criticity between", value1, value2, "businessCriticity");
            return (Criteria) this;
        }

        public Criteria andBusinessCriticityNotBetween(String value1, String value2) {
            addCriterion("business_criticity not between", value1, value2, "businessCriticity");
            return (Criteria) this;
        }

        public Criteria andMove2productionIsNull() {
            addCriterion("move2production is null");
            return (Criteria) this;
        }

        public Criteria andMove2productionIsNotNull() {
            addCriterion("move2production is not null");
            return (Criteria) this;
        }

        public Criteria andMove2productionEqualTo(Date value) {
            addCriterionForJDBCDate("move2production =", value, "move2production");
            return (Criteria) this;
        }

        public Criteria andMove2productionNotEqualTo(Date value) {
            addCriterionForJDBCDate("move2production <>", value, "move2production");
            return (Criteria) this;
        }

        public Criteria andMove2productionGreaterThan(Date value) {
            addCriterionForJDBCDate("move2production >", value, "move2production");
            return (Criteria) this;
        }

        public Criteria andMove2productionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("move2production >=", value, "move2production");
            return (Criteria) this;
        }

        public Criteria andMove2productionLessThan(Date value) {
            addCriterionForJDBCDate("move2production <", value, "move2production");
            return (Criteria) this;
        }

        public Criteria andMove2productionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("move2production <=", value, "move2production");
            return (Criteria) this;
        }

        public Criteria andMove2productionIn(List<Date> values) {
            addCriterionForJDBCDate("move2production in", values, "move2production");
            return (Criteria) this;
        }

        public Criteria andMove2productionNotIn(List<Date> values) {
            addCriterionForJDBCDate("move2production not in", values, "move2production");
            return (Criteria) this;
        }

        public Criteria andMove2productionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("move2production between", value1, value2, "move2production");
            return (Criteria) this;
        }

        public Criteria andMove2productionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("move2production not between", value1, value2, "move2production");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIsNull() {
            addCriterion("serialnumber is null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIsNotNull() {
            addCriterion("serialnumber is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberEqualTo(String value) {
            addCriterion("serialnumber =", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotEqualTo(String value) {
            addCriterion("serialnumber <>", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberGreaterThan(String value) {
            addCriterion("serialnumber >", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberGreaterThanOrEqualTo(String value) {
            addCriterion("serialnumber >=", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLessThan(String value) {
            addCriterion("serialnumber <", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLessThanOrEqualTo(String value) {
            addCriterion("serialnumber <=", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLike(String value) {
            addCriterion("serialnumber like", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotLike(String value) {
            addCriterion("serialnumber not like", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIn(List<String> values) {
            addCriterion("serialnumber in", values, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotIn(List<String> values) {
            addCriterion("serialnumber not in", values, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberBetween(String value1, String value2) {
            addCriterion("serialnumber between", value1, value2, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotBetween(String value1, String value2) {
            addCriterion("serialnumber not between", value1, value2, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andLocationIdIsNull() {
            addCriterion("location_id is null");
            return (Criteria) this;
        }

        public Criteria andLocationIdIsNotNull() {
            addCriterion("location_id is not null");
            return (Criteria) this;
        }

        public Criteria andLocationIdEqualTo(Integer value) {
            addCriterion("location_id =", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotEqualTo(Integer value) {
            addCriterion("location_id <>", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThan(Integer value) {
            addCriterion("location_id >", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("location_id >=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThan(Integer value) {
            addCriterion("location_id <", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("location_id <=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdIn(List<Integer> values) {
            addCriterion("location_id in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotIn(List<Integer> values) {
            addCriterion("location_id not in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdBetween(Integer value1, Integer value2) {
            addCriterion("location_id between", value1, value2, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("location_id not between", value1, value2, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationNameIsNull() {
            addCriterion("location_name is null");
            return (Criteria) this;
        }

        public Criteria andLocationNameIsNotNull() {
            addCriterion("location_name is not null");
            return (Criteria) this;
        }

        public Criteria andLocationNameEqualTo(String value) {
            addCriterion("location_name =", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotEqualTo(String value) {
            addCriterion("location_name <>", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameGreaterThan(String value) {
            addCriterion("location_name >", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameGreaterThanOrEqualTo(String value) {
            addCriterion("location_name >=", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameLessThan(String value) {
            addCriterion("location_name <", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameLessThanOrEqualTo(String value) {
            addCriterion("location_name <=", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameLike(String value) {
            addCriterion("location_name like", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotLike(String value) {
            addCriterion("location_name not like", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameIn(List<String> values) {
            addCriterion("location_name in", values, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotIn(List<String> values) {
            addCriterion("location_name not in", values, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameBetween(String value1, String value2) {
            addCriterion("location_name between", value1, value2, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotBetween(String value1, String value2) {
            addCriterion("location_name not between", value1, value2, "locationName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Integer value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Integer value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Integer value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Integer value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Integer> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Integer> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Integer value1, Integer value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNull() {
            addCriterion("model_name is null");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNotNull() {
            addCriterion("model_name is not null");
            return (Criteria) this;
        }

        public Criteria andModelNameEqualTo(String value) {
            addCriterion("model_name =", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotEqualTo(String value) {
            addCriterion("model_name <>", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThan(String value) {
            addCriterion("model_name >", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("model_name >=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThan(String value) {
            addCriterion("model_name <", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThanOrEqualTo(String value) {
            addCriterion("model_name <=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLike(String value) {
            addCriterion("model_name like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotLike(String value) {
            addCriterion("model_name not like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameIn(List<String> values) {
            addCriterion("model_name in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotIn(List<String> values) {
            addCriterion("model_name not in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameBetween(String value1, String value2) {
            addCriterion("model_name between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotBetween(String value1, String value2) {
            addCriterion("model_name not between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andAssetNumberIsNull() {
            addCriterion("asset_number is null");
            return (Criteria) this;
        }

        public Criteria andAssetNumberIsNotNull() {
            addCriterion("asset_number is not null");
            return (Criteria) this;
        }

        public Criteria andAssetNumberEqualTo(String value) {
            addCriterion("asset_number =", value, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberNotEqualTo(String value) {
            addCriterion("asset_number <>", value, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberGreaterThan(String value) {
            addCriterion("asset_number >", value, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberGreaterThanOrEqualTo(String value) {
            addCriterion("asset_number >=", value, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberLessThan(String value) {
            addCriterion("asset_number <", value, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberLessThanOrEqualTo(String value) {
            addCriterion("asset_number <=", value, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberLike(String value) {
            addCriterion("asset_number like", value, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberNotLike(String value) {
            addCriterion("asset_number not like", value, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberIn(List<String> values) {
            addCriterion("asset_number in", values, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberNotIn(List<String> values) {
            addCriterion("asset_number not in", values, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberBetween(String value1, String value2) {
            addCriterion("asset_number between", value1, value2, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andAssetNumberNotBetween(String value1, String value2) {
            addCriterion("asset_number not between", value1, value2, "assetNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNull() {
            addCriterion("purchase_date is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNotNull() {
            addCriterion("purchase_date is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_date =", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_date <>", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("purchase_date >", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_date >=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThan(Date value) {
            addCriterionForJDBCDate("purchase_date <", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_date <=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("purchase_date in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("purchase_date not in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purchase_date between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purchase_date not between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andEndOfWarrantyIsNull() {
            addCriterion("end_of_warranty is null");
            return (Criteria) this;
        }

        public Criteria andEndOfWarrantyIsNotNull() {
            addCriterion("end_of_warranty is not null");
            return (Criteria) this;
        }

        public Criteria andEndOfWarrantyEqualTo(Date value) {
            addCriterionForJDBCDate("end_of_warranty =", value, "endOfWarranty");
            return (Criteria) this;
        }

        public Criteria andEndOfWarrantyNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_of_warranty <>", value, "endOfWarranty");
            return (Criteria) this;
        }

        public Criteria andEndOfWarrantyGreaterThan(Date value) {
            addCriterionForJDBCDate("end_of_warranty >", value, "endOfWarranty");
            return (Criteria) this;
        }

        public Criteria andEndOfWarrantyGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_of_warranty >=", value, "endOfWarranty");
            return (Criteria) this;
        }

        public Criteria andEndOfWarrantyLessThan(Date value) {
            addCriterionForJDBCDate("end_of_warranty <", value, "endOfWarranty");
            return (Criteria) this;
        }

        public Criteria andEndOfWarrantyLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_of_warranty <=", value, "endOfWarranty");
            return (Criteria) this;
        }

        public Criteria andEndOfWarrantyIn(List<Date> values) {
            addCriterionForJDBCDate("end_of_warranty in", values, "endOfWarranty");
            return (Criteria) this;
        }

        public Criteria andEndOfWarrantyNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_of_warranty not in", values, "endOfWarranty");
            return (Criteria) this;
        }

        public Criteria andEndOfWarrantyBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_of_warranty between", value1, value2, "endOfWarranty");
            return (Criteria) this;
        }

        public Criteria andEndOfWarrantyNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_of_warranty not between", value1, value2, "endOfWarranty");
            return (Criteria) this;
        }

        public Criteria andRackIdIsNull() {
            addCriterion("rack_id is null");
            return (Criteria) this;
        }

        public Criteria andRackIdIsNotNull() {
            addCriterion("rack_id is not null");
            return (Criteria) this;
        }

        public Criteria andRackIdEqualTo(Integer value) {
            addCriterion("rack_id =", value, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIdNotEqualTo(Integer value) {
            addCriterion("rack_id <>", value, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIdGreaterThan(Integer value) {
            addCriterion("rack_id >", value, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rack_id >=", value, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIdLessThan(Integer value) {
            addCriterion("rack_id <", value, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIdLessThanOrEqualTo(Integer value) {
            addCriterion("rack_id <=", value, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIdIn(List<Integer> values) {
            addCriterion("rack_id in", values, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIdNotIn(List<Integer> values) {
            addCriterion("rack_id not in", values, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIdBetween(Integer value1, Integer value2) {
            addCriterion("rack_id between", value1, value2, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rack_id not between", value1, value2, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackNameIsNull() {
            addCriterion("rack_name is null");
            return (Criteria) this;
        }

        public Criteria andRackNameIsNotNull() {
            addCriterion("rack_name is not null");
            return (Criteria) this;
        }

        public Criteria andRackNameEqualTo(String value) {
            addCriterion("rack_name =", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameNotEqualTo(String value) {
            addCriterion("rack_name <>", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameGreaterThan(String value) {
            addCriterion("rack_name >", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameGreaterThanOrEqualTo(String value) {
            addCriterion("rack_name >=", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameLessThan(String value) {
            addCriterion("rack_name <", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameLessThanOrEqualTo(String value) {
            addCriterion("rack_name <=", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameLike(String value) {
            addCriterion("rack_name like", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameNotLike(String value) {
            addCriterion("rack_name not like", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameIn(List<String> values) {
            addCriterion("rack_name in", values, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameNotIn(List<String> values) {
            addCriterion("rack_name not in", values, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameBetween(String value1, String value2) {
            addCriterion("rack_name between", value1, value2, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameNotBetween(String value1, String value2) {
            addCriterion("rack_name not between", value1, value2, "rackName");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdIsNull() {
            addCriterion("enclosure_id is null");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdIsNotNull() {
            addCriterion("enclosure_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdEqualTo(Integer value) {
            addCriterion("enclosure_id =", value, "enclosureId");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdNotEqualTo(Integer value) {
            addCriterion("enclosure_id <>", value, "enclosureId");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdGreaterThan(Integer value) {
            addCriterion("enclosure_id >", value, "enclosureId");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("enclosure_id >=", value, "enclosureId");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdLessThan(Integer value) {
            addCriterion("enclosure_id <", value, "enclosureId");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdLessThanOrEqualTo(Integer value) {
            addCriterion("enclosure_id <=", value, "enclosureId");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdIn(List<Integer> values) {
            addCriterion("enclosure_id in", values, "enclosureId");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdNotIn(List<Integer> values) {
            addCriterion("enclosure_id not in", values, "enclosureId");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdBetween(Integer value1, Integer value2) {
            addCriterion("enclosure_id between", value1, value2, "enclosureId");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("enclosure_id not between", value1, value2, "enclosureId");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameIsNull() {
            addCriterion("enclosure_name is null");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameIsNotNull() {
            addCriterion("enclosure_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameEqualTo(String value) {
            addCriterion("enclosure_name =", value, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameNotEqualTo(String value) {
            addCriterion("enclosure_name <>", value, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameGreaterThan(String value) {
            addCriterion("enclosure_name >", value, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameGreaterThanOrEqualTo(String value) {
            addCriterion("enclosure_name >=", value, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameLessThan(String value) {
            addCriterion("enclosure_name <", value, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameLessThanOrEqualTo(String value) {
            addCriterion("enclosure_name <=", value, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameLike(String value) {
            addCriterion("enclosure_name like", value, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameNotLike(String value) {
            addCriterion("enclosure_name not like", value, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameIn(List<String> values) {
            addCriterion("enclosure_name in", values, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameNotIn(List<String> values) {
            addCriterion("enclosure_name not in", values, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameBetween(String value1, String value2) {
            addCriterion("enclosure_name between", value1, value2, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameNotBetween(String value1, String value2) {
            addCriterion("enclosure_name not between", value1, value2, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andNbUIsNull() {
            addCriterion("nb_u is null");
            return (Criteria) this;
        }

        public Criteria andNbUIsNotNull() {
            addCriterion("nb_u is not null");
            return (Criteria) this;
        }

        public Criteria andNbUEqualTo(Integer value) {
            addCriterion("nb_u =", value, "nbU");
            return (Criteria) this;
        }

        public Criteria andNbUNotEqualTo(Integer value) {
            addCriterion("nb_u <>", value, "nbU");
            return (Criteria) this;
        }

        public Criteria andNbUGreaterThan(Integer value) {
            addCriterion("nb_u >", value, "nbU");
            return (Criteria) this;
        }

        public Criteria andNbUGreaterThanOrEqualTo(Integer value) {
            addCriterion("nb_u >=", value, "nbU");
            return (Criteria) this;
        }

        public Criteria andNbULessThan(Integer value) {
            addCriterion("nb_u <", value, "nbU");
            return (Criteria) this;
        }

        public Criteria andNbULessThanOrEqualTo(Integer value) {
            addCriterion("nb_u <=", value, "nbU");
            return (Criteria) this;
        }

        public Criteria andNbUIn(List<Integer> values) {
            addCriterion("nb_u in", values, "nbU");
            return (Criteria) this;
        }

        public Criteria andNbUNotIn(List<Integer> values) {
            addCriterion("nb_u not in", values, "nbU");
            return (Criteria) this;
        }

        public Criteria andNbUBetween(Integer value1, Integer value2) {
            addCriterion("nb_u between", value1, value2, "nbU");
            return (Criteria) this;
        }

        public Criteria andNbUNotBetween(Integer value1, Integer value2) {
            addCriterion("nb_u not between", value1, value2, "nbU");
            return (Criteria) this;
        }

        public Criteria andManagementipIsNull() {
            addCriterion("managementip is null");
            return (Criteria) this;
        }

        public Criteria andManagementipIsNotNull() {
            addCriterion("managementip is not null");
            return (Criteria) this;
        }

        public Criteria andManagementipEqualTo(String value) {
            addCriterion("managementip =", value, "managementip");
            return (Criteria) this;
        }

        public Criteria andManagementipNotEqualTo(String value) {
            addCriterion("managementip <>", value, "managementip");
            return (Criteria) this;
        }

        public Criteria andManagementipGreaterThan(String value) {
            addCriterion("managementip >", value, "managementip");
            return (Criteria) this;
        }

        public Criteria andManagementipGreaterThanOrEqualTo(String value) {
            addCriterion("managementip >=", value, "managementip");
            return (Criteria) this;
        }

        public Criteria andManagementipLessThan(String value) {
            addCriterion("managementip <", value, "managementip");
            return (Criteria) this;
        }

        public Criteria andManagementipLessThanOrEqualTo(String value) {
            addCriterion("managementip <=", value, "managementip");
            return (Criteria) this;
        }

        public Criteria andManagementipLike(String value) {
            addCriterion("managementip like", value, "managementip");
            return (Criteria) this;
        }

        public Criteria andManagementipNotLike(String value) {
            addCriterion("managementip not like", value, "managementip");
            return (Criteria) this;
        }

        public Criteria andManagementipIn(List<String> values) {
            addCriterion("managementip in", values, "managementip");
            return (Criteria) this;
        }

        public Criteria andManagementipNotIn(List<String> values) {
            addCriterion("managementip not in", values, "managementip");
            return (Criteria) this;
        }

        public Criteria andManagementipBetween(String value1, String value2) {
            addCriterion("managementip between", value1, value2, "managementip");
            return (Criteria) this;
        }

        public Criteria andManagementipNotBetween(String value1, String value2) {
            addCriterion("managementip not between", value1, value2, "managementip");
            return (Criteria) this;
        }

        public Criteria andPoweraIdIsNull() {
            addCriterion("powerA_id is null");
            return (Criteria) this;
        }

        public Criteria andPoweraIdIsNotNull() {
            addCriterion("powerA_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoweraIdEqualTo(Integer value) {
            addCriterion("powerA_id =", value, "poweraId");
            return (Criteria) this;
        }

        public Criteria andPoweraIdNotEqualTo(Integer value) {
            addCriterion("powerA_id <>", value, "poweraId");
            return (Criteria) this;
        }

        public Criteria andPoweraIdGreaterThan(Integer value) {
            addCriterion("powerA_id >", value, "poweraId");
            return (Criteria) this;
        }

        public Criteria andPoweraIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("powerA_id >=", value, "poweraId");
            return (Criteria) this;
        }

        public Criteria andPoweraIdLessThan(Integer value) {
            addCriterion("powerA_id <", value, "poweraId");
            return (Criteria) this;
        }

        public Criteria andPoweraIdLessThanOrEqualTo(Integer value) {
            addCriterion("powerA_id <=", value, "poweraId");
            return (Criteria) this;
        }

        public Criteria andPoweraIdIn(List<Integer> values) {
            addCriterion("powerA_id in", values, "poweraId");
            return (Criteria) this;
        }

        public Criteria andPoweraIdNotIn(List<Integer> values) {
            addCriterion("powerA_id not in", values, "poweraId");
            return (Criteria) this;
        }

        public Criteria andPoweraIdBetween(Integer value1, Integer value2) {
            addCriterion("powerA_id between", value1, value2, "poweraId");
            return (Criteria) this;
        }

        public Criteria andPoweraIdNotBetween(Integer value1, Integer value2) {
            addCriterion("powerA_id not between", value1, value2, "poweraId");
            return (Criteria) this;
        }

        public Criteria andPoweraNameIsNull() {
            addCriterion("powerA_name is null");
            return (Criteria) this;
        }

        public Criteria andPoweraNameIsNotNull() {
            addCriterion("powerA_name is not null");
            return (Criteria) this;
        }

        public Criteria andPoweraNameEqualTo(String value) {
            addCriterion("powerA_name =", value, "poweraName");
            return (Criteria) this;
        }

        public Criteria andPoweraNameNotEqualTo(String value) {
            addCriterion("powerA_name <>", value, "poweraName");
            return (Criteria) this;
        }

        public Criteria andPoweraNameGreaterThan(String value) {
            addCriterion("powerA_name >", value, "poweraName");
            return (Criteria) this;
        }

        public Criteria andPoweraNameGreaterThanOrEqualTo(String value) {
            addCriterion("powerA_name >=", value, "poweraName");
            return (Criteria) this;
        }

        public Criteria andPoweraNameLessThan(String value) {
            addCriterion("powerA_name <", value, "poweraName");
            return (Criteria) this;
        }

        public Criteria andPoweraNameLessThanOrEqualTo(String value) {
            addCriterion("powerA_name <=", value, "poweraName");
            return (Criteria) this;
        }

        public Criteria andPoweraNameLike(String value) {
            addCriterion("powerA_name like", value, "poweraName");
            return (Criteria) this;
        }

        public Criteria andPoweraNameNotLike(String value) {
            addCriterion("powerA_name not like", value, "poweraName");
            return (Criteria) this;
        }

        public Criteria andPoweraNameIn(List<String> values) {
            addCriterion("powerA_name in", values, "poweraName");
            return (Criteria) this;
        }

        public Criteria andPoweraNameNotIn(List<String> values) {
            addCriterion("powerA_name not in", values, "poweraName");
            return (Criteria) this;
        }

        public Criteria andPoweraNameBetween(String value1, String value2) {
            addCriterion("powerA_name between", value1, value2, "poweraName");
            return (Criteria) this;
        }

        public Criteria andPoweraNameNotBetween(String value1, String value2) {
            addCriterion("powerA_name not between", value1, value2, "poweraName");
            return (Criteria) this;
        }

        public Criteria andPowerbIdIsNull() {
            addCriterion("powerB_id is null");
            return (Criteria) this;
        }

        public Criteria andPowerbIdIsNotNull() {
            addCriterion("powerB_id is not null");
            return (Criteria) this;
        }

        public Criteria andPowerbIdEqualTo(Integer value) {
            addCriterion("powerB_id =", value, "powerbId");
            return (Criteria) this;
        }

        public Criteria andPowerbIdNotEqualTo(Integer value) {
            addCriterion("powerB_id <>", value, "powerbId");
            return (Criteria) this;
        }

        public Criteria andPowerbIdGreaterThan(Integer value) {
            addCriterion("powerB_id >", value, "powerbId");
            return (Criteria) this;
        }

        public Criteria andPowerbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("powerB_id >=", value, "powerbId");
            return (Criteria) this;
        }

        public Criteria andPowerbIdLessThan(Integer value) {
            addCriterion("powerB_id <", value, "powerbId");
            return (Criteria) this;
        }

        public Criteria andPowerbIdLessThanOrEqualTo(Integer value) {
            addCriterion("powerB_id <=", value, "powerbId");
            return (Criteria) this;
        }

        public Criteria andPowerbIdIn(List<Integer> values) {
            addCriterion("powerB_id in", values, "powerbId");
            return (Criteria) this;
        }

        public Criteria andPowerbIdNotIn(List<Integer> values) {
            addCriterion("powerB_id not in", values, "powerbId");
            return (Criteria) this;
        }

        public Criteria andPowerbIdBetween(Integer value1, Integer value2) {
            addCriterion("powerB_id between", value1, value2, "powerbId");
            return (Criteria) this;
        }

        public Criteria andPowerbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("powerB_id not between", value1, value2, "powerbId");
            return (Criteria) this;
        }

        public Criteria andPowerbNameIsNull() {
            addCriterion("powerB_name is null");
            return (Criteria) this;
        }

        public Criteria andPowerbNameIsNotNull() {
            addCriterion("powerB_name is not null");
            return (Criteria) this;
        }

        public Criteria andPowerbNameEqualTo(String value) {
            addCriterion("powerB_name =", value, "powerbName");
            return (Criteria) this;
        }

        public Criteria andPowerbNameNotEqualTo(String value) {
            addCriterion("powerB_name <>", value, "powerbName");
            return (Criteria) this;
        }

        public Criteria andPowerbNameGreaterThan(String value) {
            addCriterion("powerB_name >", value, "powerbName");
            return (Criteria) this;
        }

        public Criteria andPowerbNameGreaterThanOrEqualTo(String value) {
            addCriterion("powerB_name >=", value, "powerbName");
            return (Criteria) this;
        }

        public Criteria andPowerbNameLessThan(String value) {
            addCriterion("powerB_name <", value, "powerbName");
            return (Criteria) this;
        }

        public Criteria andPowerbNameLessThanOrEqualTo(String value) {
            addCriterion("powerB_name <=", value, "powerbName");
            return (Criteria) this;
        }

        public Criteria andPowerbNameLike(String value) {
            addCriterion("powerB_name like", value, "powerbName");
            return (Criteria) this;
        }

        public Criteria andPowerbNameNotLike(String value) {
            addCriterion("powerB_name not like", value, "powerbName");
            return (Criteria) this;
        }

        public Criteria andPowerbNameIn(List<String> values) {
            addCriterion("powerB_name in", values, "powerbName");
            return (Criteria) this;
        }

        public Criteria andPowerbNameNotIn(List<String> values) {
            addCriterion("powerB_name not in", values, "powerbName");
            return (Criteria) this;
        }

        public Criteria andPowerbNameBetween(String value1, String value2) {
            addCriterion("powerB_name between", value1, value2, "powerbName");
            return (Criteria) this;
        }

        public Criteria andPowerbNameNotBetween(String value1, String value2) {
            addCriterion("powerB_name not between", value1, value2, "powerbName");
            return (Criteria) this;
        }

        public Criteria andRedundancyIsNull() {
            addCriterion("redundancy is null");
            return (Criteria) this;
        }

        public Criteria andRedundancyIsNotNull() {
            addCriterion("redundancy is not null");
            return (Criteria) this;
        }

        public Criteria andRedundancyEqualTo(String value) {
            addCriterion("redundancy =", value, "redundancy");
            return (Criteria) this;
        }

        public Criteria andRedundancyNotEqualTo(String value) {
            addCriterion("redundancy <>", value, "redundancy");
            return (Criteria) this;
        }

        public Criteria andRedundancyGreaterThan(String value) {
            addCriterion("redundancy >", value, "redundancy");
            return (Criteria) this;
        }

        public Criteria andRedundancyGreaterThanOrEqualTo(String value) {
            addCriterion("redundancy >=", value, "redundancy");
            return (Criteria) this;
        }

        public Criteria andRedundancyLessThan(String value) {
            addCriterion("redundancy <", value, "redundancy");
            return (Criteria) this;
        }

        public Criteria andRedundancyLessThanOrEqualTo(String value) {
            addCriterion("redundancy <=", value, "redundancy");
            return (Criteria) this;
        }

        public Criteria andRedundancyLike(String value) {
            addCriterion("redundancy like", value, "redundancy");
            return (Criteria) this;
        }

        public Criteria andRedundancyNotLike(String value) {
            addCriterion("redundancy not like", value, "redundancy");
            return (Criteria) this;
        }

        public Criteria andRedundancyIn(List<String> values) {
            addCriterion("redundancy in", values, "redundancy");
            return (Criteria) this;
        }

        public Criteria andRedundancyNotIn(List<String> values) {
            addCriterion("redundancy not in", values, "redundancy");
            return (Criteria) this;
        }

        public Criteria andRedundancyBetween(String value1, String value2) {
            addCriterion("redundancy between", value1, value2, "redundancy");
            return (Criteria) this;
        }

        public Criteria andRedundancyNotBetween(String value1, String value2) {
            addCriterion("redundancy not between", value1, value2, "redundancy");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdIsNull() {
            addCriterion("osfamily_id is null");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdIsNotNull() {
            addCriterion("osfamily_id is not null");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdEqualTo(Integer value) {
            addCriterion("osfamily_id =", value, "osfamilyId");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdNotEqualTo(Integer value) {
            addCriterion("osfamily_id <>", value, "osfamilyId");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdGreaterThan(Integer value) {
            addCriterion("osfamily_id >", value, "osfamilyId");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("osfamily_id >=", value, "osfamilyId");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdLessThan(Integer value) {
            addCriterion("osfamily_id <", value, "osfamilyId");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdLessThanOrEqualTo(Integer value) {
            addCriterion("osfamily_id <=", value, "osfamilyId");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdIn(List<Integer> values) {
            addCriterion("osfamily_id in", values, "osfamilyId");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdNotIn(List<Integer> values) {
            addCriterion("osfamily_id not in", values, "osfamilyId");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdBetween(Integer value1, Integer value2) {
            addCriterion("osfamily_id between", value1, value2, "osfamilyId");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("osfamily_id not between", value1, value2, "osfamilyId");
            return (Criteria) this;
        }

        public Criteria andOsfamilyNameIsNull() {
            addCriterion("osfamily_name is null");
            return (Criteria) this;
        }

        public Criteria andOsfamilyNameIsNotNull() {
            addCriterion("osfamily_name is not null");
            return (Criteria) this;
        }

        public Criteria andOsfamilyNameEqualTo(String value) {
            addCriterion("osfamily_name =", value, "osfamilyName");
            return (Criteria) this;
        }

        public Criteria andOsfamilyNameNotEqualTo(String value) {
            addCriterion("osfamily_name <>", value, "osfamilyName");
            return (Criteria) this;
        }

        public Criteria andOsfamilyNameGreaterThan(String value) {
            addCriterion("osfamily_name >", value, "osfamilyName");
            return (Criteria) this;
        }

        public Criteria andOsfamilyNameGreaterThanOrEqualTo(String value) {
            addCriterion("osfamily_name >=", value, "osfamilyName");
            return (Criteria) this;
        }

        public Criteria andOsfamilyNameLessThan(String value) {
            addCriterion("osfamily_name <", value, "osfamilyName");
            return (Criteria) this;
        }

        public Criteria andOsfamilyNameLessThanOrEqualTo(String value) {
            addCriterion("osfamily_name <=", value, "osfamilyName");
            return (Criteria) this;
        }

        public Criteria andOsfamilyNameLike(String value) {
            addCriterion("osfamily_name like", value, "osfamilyName");
            return (Criteria) this;
        }

        public Criteria andOsfamilyNameNotLike(String value) {
            addCriterion("osfamily_name not like", value, "osfamilyName");
            return (Criteria) this;
        }

        public Criteria andOsfamilyNameIn(List<String> values) {
            addCriterion("osfamily_name in", values, "osfamilyName");
            return (Criteria) this;
        }

        public Criteria andOsfamilyNameNotIn(List<String> values) {
            addCriterion("osfamily_name not in", values, "osfamilyName");
            return (Criteria) this;
        }

        public Criteria andOsfamilyNameBetween(String value1, String value2) {
            addCriterion("osfamily_name between", value1, value2, "osfamilyName");
            return (Criteria) this;
        }

        public Criteria andOsfamilyNameNotBetween(String value1, String value2) {
            addCriterion("osfamily_name not between", value1, value2, "osfamilyName");
            return (Criteria) this;
        }

        public Criteria andOsversionIdIsNull() {
            addCriterion("osversion_id is null");
            return (Criteria) this;
        }

        public Criteria andOsversionIdIsNotNull() {
            addCriterion("osversion_id is not null");
            return (Criteria) this;
        }

        public Criteria andOsversionIdEqualTo(Integer value) {
            addCriterion("osversion_id =", value, "osversionId");
            return (Criteria) this;
        }

        public Criteria andOsversionIdNotEqualTo(Integer value) {
            addCriterion("osversion_id <>", value, "osversionId");
            return (Criteria) this;
        }

        public Criteria andOsversionIdGreaterThan(Integer value) {
            addCriterion("osversion_id >", value, "osversionId");
            return (Criteria) this;
        }

        public Criteria andOsversionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("osversion_id >=", value, "osversionId");
            return (Criteria) this;
        }

        public Criteria andOsversionIdLessThan(Integer value) {
            addCriterion("osversion_id <", value, "osversionId");
            return (Criteria) this;
        }

        public Criteria andOsversionIdLessThanOrEqualTo(Integer value) {
            addCriterion("osversion_id <=", value, "osversionId");
            return (Criteria) this;
        }

        public Criteria andOsversionIdIn(List<Integer> values) {
            addCriterion("osversion_id in", values, "osversionId");
            return (Criteria) this;
        }

        public Criteria andOsversionIdNotIn(List<Integer> values) {
            addCriterion("osversion_id not in", values, "osversionId");
            return (Criteria) this;
        }

        public Criteria andOsversionIdBetween(Integer value1, Integer value2) {
            addCriterion("osversion_id between", value1, value2, "osversionId");
            return (Criteria) this;
        }

        public Criteria andOsversionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("osversion_id not between", value1, value2, "osversionId");
            return (Criteria) this;
        }

        public Criteria andOsversionNameIsNull() {
            addCriterion("osversion_name is null");
            return (Criteria) this;
        }

        public Criteria andOsversionNameIsNotNull() {
            addCriterion("osversion_name is not null");
            return (Criteria) this;
        }

        public Criteria andOsversionNameEqualTo(String value) {
            addCriterion("osversion_name =", value, "osversionName");
            return (Criteria) this;
        }

        public Criteria andOsversionNameNotEqualTo(String value) {
            addCriterion("osversion_name <>", value, "osversionName");
            return (Criteria) this;
        }

        public Criteria andOsversionNameGreaterThan(String value) {
            addCriterion("osversion_name >", value, "osversionName");
            return (Criteria) this;
        }

        public Criteria andOsversionNameGreaterThanOrEqualTo(String value) {
            addCriterion("osversion_name >=", value, "osversionName");
            return (Criteria) this;
        }

        public Criteria andOsversionNameLessThan(String value) {
            addCriterion("osversion_name <", value, "osversionName");
            return (Criteria) this;
        }

        public Criteria andOsversionNameLessThanOrEqualTo(String value) {
            addCriterion("osversion_name <=", value, "osversionName");
            return (Criteria) this;
        }

        public Criteria andOsversionNameLike(String value) {
            addCriterion("osversion_name like", value, "osversionName");
            return (Criteria) this;
        }

        public Criteria andOsversionNameNotLike(String value) {
            addCriterion("osversion_name not like", value, "osversionName");
            return (Criteria) this;
        }

        public Criteria andOsversionNameIn(List<String> values) {
            addCriterion("osversion_name in", values, "osversionName");
            return (Criteria) this;
        }

        public Criteria andOsversionNameNotIn(List<String> values) {
            addCriterion("osversion_name not in", values, "osversionName");
            return (Criteria) this;
        }

        public Criteria andOsversionNameBetween(String value1, String value2) {
            addCriterion("osversion_name between", value1, value2, "osversionName");
            return (Criteria) this;
        }

        public Criteria andOsversionNameNotBetween(String value1, String value2) {
            addCriterion("osversion_name not between", value1, value2, "osversionName");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdIsNull() {
            addCriterion("oslicence_id is null");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdIsNotNull() {
            addCriterion("oslicence_id is not null");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdEqualTo(Integer value) {
            addCriterion("oslicence_id =", value, "oslicenceId");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdNotEqualTo(Integer value) {
            addCriterion("oslicence_id <>", value, "oslicenceId");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdGreaterThan(Integer value) {
            addCriterion("oslicence_id >", value, "oslicenceId");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("oslicence_id >=", value, "oslicenceId");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdLessThan(Integer value) {
            addCriterion("oslicence_id <", value, "oslicenceId");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdLessThanOrEqualTo(Integer value) {
            addCriterion("oslicence_id <=", value, "oslicenceId");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdIn(List<Integer> values) {
            addCriterion("oslicence_id in", values, "oslicenceId");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdNotIn(List<Integer> values) {
            addCriterion("oslicence_id not in", values, "oslicenceId");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdBetween(Integer value1, Integer value2) {
            addCriterion("oslicence_id between", value1, value2, "oslicenceId");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("oslicence_id not between", value1, value2, "oslicenceId");
            return (Criteria) this;
        }

        public Criteria andOslicenceNameIsNull() {
            addCriterion("oslicence_name is null");
            return (Criteria) this;
        }

        public Criteria andOslicenceNameIsNotNull() {
            addCriterion("oslicence_name is not null");
            return (Criteria) this;
        }

        public Criteria andOslicenceNameEqualTo(String value) {
            addCriterion("oslicence_name =", value, "oslicenceName");
            return (Criteria) this;
        }

        public Criteria andOslicenceNameNotEqualTo(String value) {
            addCriterion("oslicence_name <>", value, "oslicenceName");
            return (Criteria) this;
        }

        public Criteria andOslicenceNameGreaterThan(String value) {
            addCriterion("oslicence_name >", value, "oslicenceName");
            return (Criteria) this;
        }

        public Criteria andOslicenceNameGreaterThanOrEqualTo(String value) {
            addCriterion("oslicence_name >=", value, "oslicenceName");
            return (Criteria) this;
        }

        public Criteria andOslicenceNameLessThan(String value) {
            addCriterion("oslicence_name <", value, "oslicenceName");
            return (Criteria) this;
        }

        public Criteria andOslicenceNameLessThanOrEqualTo(String value) {
            addCriterion("oslicence_name <=", value, "oslicenceName");
            return (Criteria) this;
        }

        public Criteria andOslicenceNameLike(String value) {
            addCriterion("oslicence_name like", value, "oslicenceName");
            return (Criteria) this;
        }

        public Criteria andOslicenceNameNotLike(String value) {
            addCriterion("oslicence_name not like", value, "oslicenceName");
            return (Criteria) this;
        }

        public Criteria andOslicenceNameIn(List<String> values) {
            addCriterion("oslicence_name in", values, "oslicenceName");
            return (Criteria) this;
        }

        public Criteria andOslicenceNameNotIn(List<String> values) {
            addCriterion("oslicence_name not in", values, "oslicenceName");
            return (Criteria) this;
        }

        public Criteria andOslicenceNameBetween(String value1, String value2) {
            addCriterion("oslicence_name between", value1, value2, "oslicenceName");
            return (Criteria) this;
        }

        public Criteria andOslicenceNameNotBetween(String value1, String value2) {
            addCriterion("oslicence_name not between", value1, value2, "oslicenceName");
            return (Criteria) this;
        }

        public Criteria andCpuIsNull() {
            addCriterion("cpu is null");
            return (Criteria) this;
        }

        public Criteria andCpuIsNotNull() {
            addCriterion("cpu is not null");
            return (Criteria) this;
        }

        public Criteria andCpuEqualTo(String value) {
            addCriterion("cpu =", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotEqualTo(String value) {
            addCriterion("cpu <>", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuGreaterThan(String value) {
            addCriterion("cpu >", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuGreaterThanOrEqualTo(String value) {
            addCriterion("cpu >=", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLessThan(String value) {
            addCriterion("cpu <", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLessThanOrEqualTo(String value) {
            addCriterion("cpu <=", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLike(String value) {
            addCriterion("cpu like", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotLike(String value) {
            addCriterion("cpu not like", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuIn(List<String> values) {
            addCriterion("cpu in", values, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotIn(List<String> values) {
            addCriterion("cpu not in", values, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuBetween(String value1, String value2) {
            addCriterion("cpu between", value1, value2, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotBetween(String value1, String value2) {
            addCriterion("cpu not between", value1, value2, "cpu");
            return (Criteria) this;
        }

        public Criteria andRamIsNull() {
            addCriterion("ram is null");
            return (Criteria) this;
        }

        public Criteria andRamIsNotNull() {
            addCriterion("ram is not null");
            return (Criteria) this;
        }

        public Criteria andRamEqualTo(String value) {
            addCriterion("ram =", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotEqualTo(String value) {
            addCriterion("ram <>", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamGreaterThan(String value) {
            addCriterion("ram >", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamGreaterThanOrEqualTo(String value) {
            addCriterion("ram >=", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamLessThan(String value) {
            addCriterion("ram <", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamLessThanOrEqualTo(String value) {
            addCriterion("ram <=", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamLike(String value) {
            addCriterion("ram like", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotLike(String value) {
            addCriterion("ram not like", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamIn(List<String> values) {
            addCriterion("ram in", values, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotIn(List<String> values) {
            addCriterion("ram not in", values, "ram");
            return (Criteria) this;
        }

        public Criteria andRamBetween(String value1, String value2) {
            addCriterion("ram between", value1, value2, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotBetween(String value1, String value2) {
            addCriterion("ram not between", value1, value2, "ram");
            return (Criteria) this;
        }

        public Criteria andFinalclassIsNull() {
            addCriterion("finalclass is null");
            return (Criteria) this;
        }

        public Criteria andFinalclassIsNotNull() {
            addCriterion("finalclass is not null");
            return (Criteria) this;
        }

        public Criteria andFinalclassEqualTo(String value) {
            addCriterion("finalclass =", value, "finalclass");
            return (Criteria) this;
        }

        public Criteria andFinalclassNotEqualTo(String value) {
            addCriterion("finalclass <>", value, "finalclass");
            return (Criteria) this;
        }

        public Criteria andFinalclassGreaterThan(String value) {
            addCriterion("finalclass >", value, "finalclass");
            return (Criteria) this;
        }

        public Criteria andFinalclassGreaterThanOrEqualTo(String value) {
            addCriterion("finalclass >=", value, "finalclass");
            return (Criteria) this;
        }

        public Criteria andFinalclassLessThan(String value) {
            addCriterion("finalclass <", value, "finalclass");
            return (Criteria) this;
        }

        public Criteria andFinalclassLessThanOrEqualTo(String value) {
            addCriterion("finalclass <=", value, "finalclass");
            return (Criteria) this;
        }

        public Criteria andFinalclassLike(String value) {
            addCriterion("finalclass like", value, "finalclass");
            return (Criteria) this;
        }

        public Criteria andFinalclassNotLike(String value) {
            addCriterion("finalclass not like", value, "finalclass");
            return (Criteria) this;
        }

        public Criteria andFinalclassIn(List<String> values) {
            addCriterion("finalclass in", values, "finalclass");
            return (Criteria) this;
        }

        public Criteria andFinalclassNotIn(List<String> values) {
            addCriterion("finalclass not in", values, "finalclass");
            return (Criteria) this;
        }

        public Criteria andFinalclassBetween(String value1, String value2) {
            addCriterion("finalclass between", value1, value2, "finalclass");
            return (Criteria) this;
        }

        public Criteria andFinalclassNotBetween(String value1, String value2) {
            addCriterion("finalclass not between", value1, value2, "finalclass");
            return (Criteria) this;
        }

        public Criteria andFriendlynameIsNull() {
            addCriterion("friendlyname is null");
            return (Criteria) this;
        }

        public Criteria andFriendlynameIsNotNull() {
            addCriterion("friendlyname is not null");
            return (Criteria) this;
        }

        public Criteria andFriendlynameEqualTo(String value) {
            addCriterion("friendlyname =", value, "friendlyname");
            return (Criteria) this;
        }

        public Criteria andFriendlynameNotEqualTo(String value) {
            addCriterion("friendlyname <>", value, "friendlyname");
            return (Criteria) this;
        }

        public Criteria andFriendlynameGreaterThan(String value) {
            addCriterion("friendlyname >", value, "friendlyname");
            return (Criteria) this;
        }

        public Criteria andFriendlynameGreaterThanOrEqualTo(String value) {
            addCriterion("friendlyname >=", value, "friendlyname");
            return (Criteria) this;
        }

        public Criteria andFriendlynameLessThan(String value) {
            addCriterion("friendlyname <", value, "friendlyname");
            return (Criteria) this;
        }

        public Criteria andFriendlynameLessThanOrEqualTo(String value) {
            addCriterion("friendlyname <=", value, "friendlyname");
            return (Criteria) this;
        }

        public Criteria andFriendlynameLike(String value) {
            addCriterion("friendlyname like", value, "friendlyname");
            return (Criteria) this;
        }

        public Criteria andFriendlynameNotLike(String value) {
            addCriterion("friendlyname not like", value, "friendlyname");
            return (Criteria) this;
        }

        public Criteria andFriendlynameIn(List<String> values) {
            addCriterion("friendlyname in", values, "friendlyname");
            return (Criteria) this;
        }

        public Criteria andFriendlynameNotIn(List<String> values) {
            addCriterion("friendlyname not in", values, "friendlyname");
            return (Criteria) this;
        }

        public Criteria andFriendlynameBetween(String value1, String value2) {
            addCriterion("friendlyname between", value1, value2, "friendlyname");
            return (Criteria) this;
        }

        public Criteria andFriendlynameNotBetween(String value1, String value2) {
            addCriterion("friendlyname not between", value1, value2, "friendlyname");
            return (Criteria) this;
        }

        public Criteria andOrgIdFriendlynameIsNull() {
            addCriterion("org_id_friendlyname is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdFriendlynameIsNotNull() {
            addCriterion("org_id_friendlyname is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdFriendlynameEqualTo(String value) {
            addCriterion("org_id_friendlyname =", value, "orgIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOrgIdFriendlynameNotEqualTo(String value) {
            addCriterion("org_id_friendlyname <>", value, "orgIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOrgIdFriendlynameGreaterThan(String value) {
            addCriterion("org_id_friendlyname >", value, "orgIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOrgIdFriendlynameGreaterThanOrEqualTo(String value) {
            addCriterion("org_id_friendlyname >=", value, "orgIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOrgIdFriendlynameLessThan(String value) {
            addCriterion("org_id_friendlyname <", value, "orgIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOrgIdFriendlynameLessThanOrEqualTo(String value) {
            addCriterion("org_id_friendlyname <=", value, "orgIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOrgIdFriendlynameLike(String value) {
            addCriterion("org_id_friendlyname like", value, "orgIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOrgIdFriendlynameNotLike(String value) {
            addCriterion("org_id_friendlyname not like", value, "orgIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOrgIdFriendlynameIn(List<String> values) {
            addCriterion("org_id_friendlyname in", values, "orgIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOrgIdFriendlynameNotIn(List<String> values) {
            addCriterion("org_id_friendlyname not in", values, "orgIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOrgIdFriendlynameBetween(String value1, String value2) {
            addCriterion("org_id_friendlyname between", value1, value2, "orgIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOrgIdFriendlynameNotBetween(String value1, String value2) {
            addCriterion("org_id_friendlyname not between", value1, value2, "orgIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andLocationIdFriendlynameIsNull() {
            addCriterion("location_id_friendlyname is null");
            return (Criteria) this;
        }

        public Criteria andLocationIdFriendlynameIsNotNull() {
            addCriterion("location_id_friendlyname is not null");
            return (Criteria) this;
        }

        public Criteria andLocationIdFriendlynameEqualTo(String value) {
            addCriterion("location_id_friendlyname =", value, "locationIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andLocationIdFriendlynameNotEqualTo(String value) {
            addCriterion("location_id_friendlyname <>", value, "locationIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andLocationIdFriendlynameGreaterThan(String value) {
            addCriterion("location_id_friendlyname >", value, "locationIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andLocationIdFriendlynameGreaterThanOrEqualTo(String value) {
            addCriterion("location_id_friendlyname >=", value, "locationIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andLocationIdFriendlynameLessThan(String value) {
            addCriterion("location_id_friendlyname <", value, "locationIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andLocationIdFriendlynameLessThanOrEqualTo(String value) {
            addCriterion("location_id_friendlyname <=", value, "locationIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andLocationIdFriendlynameLike(String value) {
            addCriterion("location_id_friendlyname like", value, "locationIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andLocationIdFriendlynameNotLike(String value) {
            addCriterion("location_id_friendlyname not like", value, "locationIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andLocationIdFriendlynameIn(List<String> values) {
            addCriterion("location_id_friendlyname in", values, "locationIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andLocationIdFriendlynameNotIn(List<String> values) {
            addCriterion("location_id_friendlyname not in", values, "locationIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andLocationIdFriendlynameBetween(String value1, String value2) {
            addCriterion("location_id_friendlyname between", value1, value2, "locationIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andLocationIdFriendlynameNotBetween(String value1, String value2) {
            addCriterion("location_id_friendlyname not between", value1, value2, "locationIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andBrandIdFriendlynameIsNull() {
            addCriterion("brand_id_friendlyname is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdFriendlynameIsNotNull() {
            addCriterion("brand_id_friendlyname is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdFriendlynameEqualTo(String value) {
            addCriterion("brand_id_friendlyname =", value, "brandIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andBrandIdFriendlynameNotEqualTo(String value) {
            addCriterion("brand_id_friendlyname <>", value, "brandIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andBrandIdFriendlynameGreaterThan(String value) {
            addCriterion("brand_id_friendlyname >", value, "brandIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andBrandIdFriendlynameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_id_friendlyname >=", value, "brandIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andBrandIdFriendlynameLessThan(String value) {
            addCriterion("brand_id_friendlyname <", value, "brandIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andBrandIdFriendlynameLessThanOrEqualTo(String value) {
            addCriterion("brand_id_friendlyname <=", value, "brandIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andBrandIdFriendlynameLike(String value) {
            addCriterion("brand_id_friendlyname like", value, "brandIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andBrandIdFriendlynameNotLike(String value) {
            addCriterion("brand_id_friendlyname not like", value, "brandIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andBrandIdFriendlynameIn(List<String> values) {
            addCriterion("brand_id_friendlyname in", values, "brandIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andBrandIdFriendlynameNotIn(List<String> values) {
            addCriterion("brand_id_friendlyname not in", values, "brandIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andBrandIdFriendlynameBetween(String value1, String value2) {
            addCriterion("brand_id_friendlyname between", value1, value2, "brandIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andBrandIdFriendlynameNotBetween(String value1, String value2) {
            addCriterion("brand_id_friendlyname not between", value1, value2, "brandIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andModelIdFriendlynameIsNull() {
            addCriterion("model_id_friendlyname is null");
            return (Criteria) this;
        }

        public Criteria andModelIdFriendlynameIsNotNull() {
            addCriterion("model_id_friendlyname is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdFriendlynameEqualTo(String value) {
            addCriterion("model_id_friendlyname =", value, "modelIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andModelIdFriendlynameNotEqualTo(String value) {
            addCriterion("model_id_friendlyname <>", value, "modelIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andModelIdFriendlynameGreaterThan(String value) {
            addCriterion("model_id_friendlyname >", value, "modelIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andModelIdFriendlynameGreaterThanOrEqualTo(String value) {
            addCriterion("model_id_friendlyname >=", value, "modelIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andModelIdFriendlynameLessThan(String value) {
            addCriterion("model_id_friendlyname <", value, "modelIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andModelIdFriendlynameLessThanOrEqualTo(String value) {
            addCriterion("model_id_friendlyname <=", value, "modelIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andModelIdFriendlynameLike(String value) {
            addCriterion("model_id_friendlyname like", value, "modelIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andModelIdFriendlynameNotLike(String value) {
            addCriterion("model_id_friendlyname not like", value, "modelIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andModelIdFriendlynameIn(List<String> values) {
            addCriterion("model_id_friendlyname in", values, "modelIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andModelIdFriendlynameNotIn(List<String> values) {
            addCriterion("model_id_friendlyname not in", values, "modelIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andModelIdFriendlynameBetween(String value1, String value2) {
            addCriterion("model_id_friendlyname between", value1, value2, "modelIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andModelIdFriendlynameNotBetween(String value1, String value2) {
            addCriterion("model_id_friendlyname not between", value1, value2, "modelIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andRackIdFriendlynameIsNull() {
            addCriterion("rack_id_friendlyname is null");
            return (Criteria) this;
        }

        public Criteria andRackIdFriendlynameIsNotNull() {
            addCriterion("rack_id_friendlyname is not null");
            return (Criteria) this;
        }

        public Criteria andRackIdFriendlynameEqualTo(String value) {
            addCriterion("rack_id_friendlyname =", value, "rackIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andRackIdFriendlynameNotEqualTo(String value) {
            addCriterion("rack_id_friendlyname <>", value, "rackIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andRackIdFriendlynameGreaterThan(String value) {
            addCriterion("rack_id_friendlyname >", value, "rackIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andRackIdFriendlynameGreaterThanOrEqualTo(String value) {
            addCriterion("rack_id_friendlyname >=", value, "rackIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andRackIdFriendlynameLessThan(String value) {
            addCriterion("rack_id_friendlyname <", value, "rackIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andRackIdFriendlynameLessThanOrEqualTo(String value) {
            addCriterion("rack_id_friendlyname <=", value, "rackIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andRackIdFriendlynameLike(String value) {
            addCriterion("rack_id_friendlyname like", value, "rackIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andRackIdFriendlynameNotLike(String value) {
            addCriterion("rack_id_friendlyname not like", value, "rackIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andRackIdFriendlynameIn(List<String> values) {
            addCriterion("rack_id_friendlyname in", values, "rackIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andRackIdFriendlynameNotIn(List<String> values) {
            addCriterion("rack_id_friendlyname not in", values, "rackIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andRackIdFriendlynameBetween(String value1, String value2) {
            addCriterion("rack_id_friendlyname between", value1, value2, "rackIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andRackIdFriendlynameNotBetween(String value1, String value2) {
            addCriterion("rack_id_friendlyname not between", value1, value2, "rackIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdFriendlynameIsNull() {
            addCriterion("enclosure_id_friendlyname is null");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdFriendlynameIsNotNull() {
            addCriterion("enclosure_id_friendlyname is not null");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdFriendlynameEqualTo(String value) {
            addCriterion("enclosure_id_friendlyname =", value, "enclosureIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdFriendlynameNotEqualTo(String value) {
            addCriterion("enclosure_id_friendlyname <>", value, "enclosureIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdFriendlynameGreaterThan(String value) {
            addCriterion("enclosure_id_friendlyname >", value, "enclosureIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdFriendlynameGreaterThanOrEqualTo(String value) {
            addCriterion("enclosure_id_friendlyname >=", value, "enclosureIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdFriendlynameLessThan(String value) {
            addCriterion("enclosure_id_friendlyname <", value, "enclosureIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdFriendlynameLessThanOrEqualTo(String value) {
            addCriterion("enclosure_id_friendlyname <=", value, "enclosureIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdFriendlynameLike(String value) {
            addCriterion("enclosure_id_friendlyname like", value, "enclosureIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdFriendlynameNotLike(String value) {
            addCriterion("enclosure_id_friendlyname not like", value, "enclosureIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdFriendlynameIn(List<String> values) {
            addCriterion("enclosure_id_friendlyname in", values, "enclosureIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdFriendlynameNotIn(List<String> values) {
            addCriterion("enclosure_id_friendlyname not in", values, "enclosureIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdFriendlynameBetween(String value1, String value2) {
            addCriterion("enclosure_id_friendlyname between", value1, value2, "enclosureIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andEnclosureIdFriendlynameNotBetween(String value1, String value2) {
            addCriterion("enclosure_id_friendlyname not between", value1, value2, "enclosureIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFriendlynameIsNull() {
            addCriterion("powerA_id_friendlyname is null");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFriendlynameIsNotNull() {
            addCriterion("powerA_id_friendlyname is not null");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFriendlynameEqualTo(String value) {
            addCriterion("powerA_id_friendlyname =", value, "poweraIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFriendlynameNotEqualTo(String value) {
            addCriterion("powerA_id_friendlyname <>", value, "poweraIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFriendlynameGreaterThan(String value) {
            addCriterion("powerA_id_friendlyname >", value, "poweraIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFriendlynameGreaterThanOrEqualTo(String value) {
            addCriterion("powerA_id_friendlyname >=", value, "poweraIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFriendlynameLessThan(String value) {
            addCriterion("powerA_id_friendlyname <", value, "poweraIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFriendlynameLessThanOrEqualTo(String value) {
            addCriterion("powerA_id_friendlyname <=", value, "poweraIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFriendlynameLike(String value) {
            addCriterion("powerA_id_friendlyname like", value, "poweraIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFriendlynameNotLike(String value) {
            addCriterion("powerA_id_friendlyname not like", value, "poweraIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFriendlynameIn(List<String> values) {
            addCriterion("powerA_id_friendlyname in", values, "poweraIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFriendlynameNotIn(List<String> values) {
            addCriterion("powerA_id_friendlyname not in", values, "poweraIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFriendlynameBetween(String value1, String value2) {
            addCriterion("powerA_id_friendlyname between", value1, value2, "poweraIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFriendlynameNotBetween(String value1, String value2) {
            addCriterion("powerA_id_friendlyname not between", value1, value2, "poweraIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFinalclassRecallIsNull() {
            addCriterion("powerA_id_finalclass_recall is null");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFinalclassRecallIsNotNull() {
            addCriterion("powerA_id_finalclass_recall is not null");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFinalclassRecallEqualTo(String value) {
            addCriterion("powerA_id_finalclass_recall =", value, "poweraIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFinalclassRecallNotEqualTo(String value) {
            addCriterion("powerA_id_finalclass_recall <>", value, "poweraIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFinalclassRecallGreaterThan(String value) {
            addCriterion("powerA_id_finalclass_recall >", value, "poweraIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFinalclassRecallGreaterThanOrEqualTo(String value) {
            addCriterion("powerA_id_finalclass_recall >=", value, "poweraIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFinalclassRecallLessThan(String value) {
            addCriterion("powerA_id_finalclass_recall <", value, "poweraIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFinalclassRecallLessThanOrEqualTo(String value) {
            addCriterion("powerA_id_finalclass_recall <=", value, "poweraIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFinalclassRecallLike(String value) {
            addCriterion("powerA_id_finalclass_recall like", value, "poweraIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFinalclassRecallNotLike(String value) {
            addCriterion("powerA_id_finalclass_recall not like", value, "poweraIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFinalclassRecallIn(List<String> values) {
            addCriterion("powerA_id_finalclass_recall in", values, "poweraIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFinalclassRecallNotIn(List<String> values) {
            addCriterion("powerA_id_finalclass_recall not in", values, "poweraIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFinalclassRecallBetween(String value1, String value2) {
            addCriterion("powerA_id_finalclass_recall between", value1, value2, "poweraIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPoweraIdFinalclassRecallNotBetween(String value1, String value2) {
            addCriterion("powerA_id_finalclass_recall not between", value1, value2, "poweraIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFriendlynameIsNull() {
            addCriterion("powerB_id_friendlyname is null");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFriendlynameIsNotNull() {
            addCriterion("powerB_id_friendlyname is not null");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFriendlynameEqualTo(String value) {
            addCriterion("powerB_id_friendlyname =", value, "powerbIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFriendlynameNotEqualTo(String value) {
            addCriterion("powerB_id_friendlyname <>", value, "powerbIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFriendlynameGreaterThan(String value) {
            addCriterion("powerB_id_friendlyname >", value, "powerbIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFriendlynameGreaterThanOrEqualTo(String value) {
            addCriterion("powerB_id_friendlyname >=", value, "powerbIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFriendlynameLessThan(String value) {
            addCriterion("powerB_id_friendlyname <", value, "powerbIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFriendlynameLessThanOrEqualTo(String value) {
            addCriterion("powerB_id_friendlyname <=", value, "powerbIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFriendlynameLike(String value) {
            addCriterion("powerB_id_friendlyname like", value, "powerbIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFriendlynameNotLike(String value) {
            addCriterion("powerB_id_friendlyname not like", value, "powerbIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFriendlynameIn(List<String> values) {
            addCriterion("powerB_id_friendlyname in", values, "powerbIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFriendlynameNotIn(List<String> values) {
            addCriterion("powerB_id_friendlyname not in", values, "powerbIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFriendlynameBetween(String value1, String value2) {
            addCriterion("powerB_id_friendlyname between", value1, value2, "powerbIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFriendlynameNotBetween(String value1, String value2) {
            addCriterion("powerB_id_friendlyname not between", value1, value2, "powerbIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFinalclassRecallIsNull() {
            addCriterion("powerB_id_finalclass_recall is null");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFinalclassRecallIsNotNull() {
            addCriterion("powerB_id_finalclass_recall is not null");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFinalclassRecallEqualTo(String value) {
            addCriterion("powerB_id_finalclass_recall =", value, "powerbIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFinalclassRecallNotEqualTo(String value) {
            addCriterion("powerB_id_finalclass_recall <>", value, "powerbIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFinalclassRecallGreaterThan(String value) {
            addCriterion("powerB_id_finalclass_recall >", value, "powerbIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFinalclassRecallGreaterThanOrEqualTo(String value) {
            addCriterion("powerB_id_finalclass_recall >=", value, "powerbIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFinalclassRecallLessThan(String value) {
            addCriterion("powerB_id_finalclass_recall <", value, "powerbIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFinalclassRecallLessThanOrEqualTo(String value) {
            addCriterion("powerB_id_finalclass_recall <=", value, "powerbIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFinalclassRecallLike(String value) {
            addCriterion("powerB_id_finalclass_recall like", value, "powerbIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFinalclassRecallNotLike(String value) {
            addCriterion("powerB_id_finalclass_recall not like", value, "powerbIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFinalclassRecallIn(List<String> values) {
            addCriterion("powerB_id_finalclass_recall in", values, "powerbIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFinalclassRecallNotIn(List<String> values) {
            addCriterion("powerB_id_finalclass_recall not in", values, "powerbIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFinalclassRecallBetween(String value1, String value2) {
            addCriterion("powerB_id_finalclass_recall between", value1, value2, "powerbIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andPowerbIdFinalclassRecallNotBetween(String value1, String value2) {
            addCriterion("powerB_id_finalclass_recall not between", value1, value2, "powerbIdFinalclassRecall");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdFriendlynameIsNull() {
            addCriterion("osfamily_id_friendlyname is null");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdFriendlynameIsNotNull() {
            addCriterion("osfamily_id_friendlyname is not null");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdFriendlynameEqualTo(String value) {
            addCriterion("osfamily_id_friendlyname =", value, "osfamilyIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdFriendlynameNotEqualTo(String value) {
            addCriterion("osfamily_id_friendlyname <>", value, "osfamilyIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdFriendlynameGreaterThan(String value) {
            addCriterion("osfamily_id_friendlyname >", value, "osfamilyIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdFriendlynameGreaterThanOrEqualTo(String value) {
            addCriterion("osfamily_id_friendlyname >=", value, "osfamilyIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdFriendlynameLessThan(String value) {
            addCriterion("osfamily_id_friendlyname <", value, "osfamilyIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdFriendlynameLessThanOrEqualTo(String value) {
            addCriterion("osfamily_id_friendlyname <=", value, "osfamilyIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdFriendlynameLike(String value) {
            addCriterion("osfamily_id_friendlyname like", value, "osfamilyIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdFriendlynameNotLike(String value) {
            addCriterion("osfamily_id_friendlyname not like", value, "osfamilyIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdFriendlynameIn(List<String> values) {
            addCriterion("osfamily_id_friendlyname in", values, "osfamilyIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdFriendlynameNotIn(List<String> values) {
            addCriterion("osfamily_id_friendlyname not in", values, "osfamilyIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdFriendlynameBetween(String value1, String value2) {
            addCriterion("osfamily_id_friendlyname between", value1, value2, "osfamilyIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsfamilyIdFriendlynameNotBetween(String value1, String value2) {
            addCriterion("osfamily_id_friendlyname not between", value1, value2, "osfamilyIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsversionIdFriendlynameIsNull() {
            addCriterion("osversion_id_friendlyname is null");
            return (Criteria) this;
        }

        public Criteria andOsversionIdFriendlynameIsNotNull() {
            addCriterion("osversion_id_friendlyname is not null");
            return (Criteria) this;
        }

        public Criteria andOsversionIdFriendlynameEqualTo(String value) {
            addCriterion("osversion_id_friendlyname =", value, "osversionIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsversionIdFriendlynameNotEqualTo(String value) {
            addCriterion("osversion_id_friendlyname <>", value, "osversionIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsversionIdFriendlynameGreaterThan(String value) {
            addCriterion("osversion_id_friendlyname >", value, "osversionIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsversionIdFriendlynameGreaterThanOrEqualTo(String value) {
            addCriterion("osversion_id_friendlyname >=", value, "osversionIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsversionIdFriendlynameLessThan(String value) {
            addCriterion("osversion_id_friendlyname <", value, "osversionIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsversionIdFriendlynameLessThanOrEqualTo(String value) {
            addCriterion("osversion_id_friendlyname <=", value, "osversionIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsversionIdFriendlynameLike(String value) {
            addCriterion("osversion_id_friendlyname like", value, "osversionIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsversionIdFriendlynameNotLike(String value) {
            addCriterion("osversion_id_friendlyname not like", value, "osversionIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsversionIdFriendlynameIn(List<String> values) {
            addCriterion("osversion_id_friendlyname in", values, "osversionIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsversionIdFriendlynameNotIn(List<String> values) {
            addCriterion("osversion_id_friendlyname not in", values, "osversionIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsversionIdFriendlynameBetween(String value1, String value2) {
            addCriterion("osversion_id_friendlyname between", value1, value2, "osversionIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOsversionIdFriendlynameNotBetween(String value1, String value2) {
            addCriterion("osversion_id_friendlyname not between", value1, value2, "osversionIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdFriendlynameIsNull() {
            addCriterion("oslicence_id_friendlyname is null");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdFriendlynameIsNotNull() {
            addCriterion("oslicence_id_friendlyname is not null");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdFriendlynameEqualTo(String value) {
            addCriterion("oslicence_id_friendlyname =", value, "oslicenceIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdFriendlynameNotEqualTo(String value) {
            addCriterion("oslicence_id_friendlyname <>", value, "oslicenceIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdFriendlynameGreaterThan(String value) {
            addCriterion("oslicence_id_friendlyname >", value, "oslicenceIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdFriendlynameGreaterThanOrEqualTo(String value) {
            addCriterion("oslicence_id_friendlyname >=", value, "oslicenceIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdFriendlynameLessThan(String value) {
            addCriterion("oslicence_id_friendlyname <", value, "oslicenceIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdFriendlynameLessThanOrEqualTo(String value) {
            addCriterion("oslicence_id_friendlyname <=", value, "oslicenceIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdFriendlynameLike(String value) {
            addCriterion("oslicence_id_friendlyname like", value, "oslicenceIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdFriendlynameNotLike(String value) {
            addCriterion("oslicence_id_friendlyname not like", value, "oslicenceIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdFriendlynameIn(List<String> values) {
            addCriterion("oslicence_id_friendlyname in", values, "oslicenceIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdFriendlynameNotIn(List<String> values) {
            addCriterion("oslicence_id_friendlyname not in", values, "oslicenceIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdFriendlynameBetween(String value1, String value2) {
            addCriterion("oslicence_id_friendlyname between", value1, value2, "oslicenceIdFriendlyname");
            return (Criteria) this;
        }

        public Criteria andOslicenceIdFriendlynameNotBetween(String value1, String value2) {
            addCriterion("oslicence_id_friendlyname not between", value1, value2, "oslicenceIdFriendlyname");
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