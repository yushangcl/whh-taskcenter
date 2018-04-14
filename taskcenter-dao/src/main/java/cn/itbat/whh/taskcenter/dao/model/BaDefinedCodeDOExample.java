package cn.itbat.whh.taskcenter.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaDefinedCodeDOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public BaDefinedCodeDOExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    /**
     * ba_defined_code 2018-04-14
     */
    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andDefinedCodeTypeIsNull() {
            addCriterion("defined_code_type is null");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeTypeIsNotNull() {
            addCriterion("defined_code_type is not null");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeTypeEqualTo(String value) {
            addCriterion("defined_code_type =", value, "definedCodeType");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeTypeNotEqualTo(String value) {
            addCriterion("defined_code_type <>", value, "definedCodeType");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeTypeGreaterThan(String value) {
            addCriterion("defined_code_type >", value, "definedCodeType");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("defined_code_type >=", value, "definedCodeType");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeTypeLessThan(String value) {
            addCriterion("defined_code_type <", value, "definedCodeType");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeTypeLessThanOrEqualTo(String value) {
            addCriterion("defined_code_type <=", value, "definedCodeType");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeTypeLike(String value) {
            addCriterion("defined_code_type like", value, "definedCodeType");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeTypeNotLike(String value) {
            addCriterion("defined_code_type not like", value, "definedCodeType");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeTypeIn(List<String> values) {
            addCriterion("defined_code_type in", values, "definedCodeType");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeTypeNotIn(List<String> values) {
            addCriterion("defined_code_type not in", values, "definedCodeType");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeTypeBetween(String value1, String value2) {
            addCriterion("defined_code_type between", value1, value2, "definedCodeType");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeTypeNotBetween(String value1, String value2) {
            addCriterion("defined_code_type not between", value1, value2, "definedCodeType");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeIsNull() {
            addCriterion("defined_code is null");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeIsNotNull() {
            addCriterion("defined_code is not null");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeEqualTo(String value) {
            addCriterion("defined_code =", value, "definedCode");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeNotEqualTo(String value) {
            addCriterion("defined_code <>", value, "definedCode");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeGreaterThan(String value) {
            addCriterion("defined_code >", value, "definedCode");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeGreaterThanOrEqualTo(String value) {
            addCriterion("defined_code >=", value, "definedCode");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeLessThan(String value) {
            addCriterion("defined_code <", value, "definedCode");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeLessThanOrEqualTo(String value) {
            addCriterion("defined_code <=", value, "definedCode");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeLike(String value) {
            addCriterion("defined_code like", value, "definedCode");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeNotLike(String value) {
            addCriterion("defined_code not like", value, "definedCode");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeIn(List<String> values) {
            addCriterion("defined_code in", values, "definedCode");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeNotIn(List<String> values) {
            addCriterion("defined_code not in", values, "definedCode");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeBetween(String value1, String value2) {
            addCriterion("defined_code between", value1, value2, "definedCode");
            return (Criteria) this;
        }

        public Criteria andDefinedCodeNotBetween(String value1, String value2) {
            addCriterion("defined_code not between", value1, value2, "definedCode");
            return (Criteria) this;
        }

        public Criteria andDefinedNameIsNull() {
            addCriterion("defined_name is null");
            return (Criteria) this;
        }

        public Criteria andDefinedNameIsNotNull() {
            addCriterion("defined_name is not null");
            return (Criteria) this;
        }

        public Criteria andDefinedNameEqualTo(String value) {
            addCriterion("defined_name =", value, "definedName");
            return (Criteria) this;
        }

        public Criteria andDefinedNameNotEqualTo(String value) {
            addCriterion("defined_name <>", value, "definedName");
            return (Criteria) this;
        }

        public Criteria andDefinedNameGreaterThan(String value) {
            addCriterion("defined_name >", value, "definedName");
            return (Criteria) this;
        }

        public Criteria andDefinedNameGreaterThanOrEqualTo(String value) {
            addCriterion("defined_name >=", value, "definedName");
            return (Criteria) this;
        }

        public Criteria andDefinedNameLessThan(String value) {
            addCriterion("defined_name <", value, "definedName");
            return (Criteria) this;
        }

        public Criteria andDefinedNameLessThanOrEqualTo(String value) {
            addCriterion("defined_name <=", value, "definedName");
            return (Criteria) this;
        }

        public Criteria andDefinedNameLike(String value) {
            addCriterion("defined_name like", value, "definedName");
            return (Criteria) this;
        }

        public Criteria andDefinedNameNotLike(String value) {
            addCriterion("defined_name not like", value, "definedName");
            return (Criteria) this;
        }

        public Criteria andDefinedNameIn(List<String> values) {
            addCriterion("defined_name in", values, "definedName");
            return (Criteria) this;
        }

        public Criteria andDefinedNameNotIn(List<String> values) {
            addCriterion("defined_name not in", values, "definedName");
            return (Criteria) this;
        }

        public Criteria andDefinedNameBetween(String value1, String value2) {
            addCriterion("defined_name between", value1, value2, "definedName");
            return (Criteria) this;
        }

        public Criteria andDefinedNameNotBetween(String value1, String value2) {
            addCriterion("defined_name not between", value1, value2, "definedName");
            return (Criteria) this;
        }

        public Criteria andDefinedDescIsNull() {
            addCriterion("defined_desc is null");
            return (Criteria) this;
        }

        public Criteria andDefinedDescIsNotNull() {
            addCriterion("defined_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDefinedDescEqualTo(String value) {
            addCriterion("defined_desc =", value, "definedDesc");
            return (Criteria) this;
        }

        public Criteria andDefinedDescNotEqualTo(String value) {
            addCriterion("defined_desc <>", value, "definedDesc");
            return (Criteria) this;
        }

        public Criteria andDefinedDescGreaterThan(String value) {
            addCriterion("defined_desc >", value, "definedDesc");
            return (Criteria) this;
        }

        public Criteria andDefinedDescGreaterThanOrEqualTo(String value) {
            addCriterion("defined_desc >=", value, "definedDesc");
            return (Criteria) this;
        }

        public Criteria andDefinedDescLessThan(String value) {
            addCriterion("defined_desc <", value, "definedDesc");
            return (Criteria) this;
        }

        public Criteria andDefinedDescLessThanOrEqualTo(String value) {
            addCriterion("defined_desc <=", value, "definedDesc");
            return (Criteria) this;
        }

        public Criteria andDefinedDescLike(String value) {
            addCriterion("defined_desc like", value, "definedDesc");
            return (Criteria) this;
        }

        public Criteria andDefinedDescNotLike(String value) {
            addCriterion("defined_desc not like", value, "definedDesc");
            return (Criteria) this;
        }

        public Criteria andDefinedDescIn(List<String> values) {
            addCriterion("defined_desc in", values, "definedDesc");
            return (Criteria) this;
        }

        public Criteria andDefinedDescNotIn(List<String> values) {
            addCriterion("defined_desc not in", values, "definedDesc");
            return (Criteria) this;
        }

        public Criteria andDefinedDescBetween(String value1, String value2) {
            addCriterion("defined_desc between", value1, value2, "definedDesc");
            return (Criteria) this;
        }

        public Criteria andDefinedDescNotBetween(String value1, String value2) {
            addCriterion("defined_desc not between", value1, value2, "definedDesc");
            return (Criteria) this;
        }

        public Criteria andHandleCodeIsNull() {
            addCriterion("handle_code is null");
            return (Criteria) this;
        }

        public Criteria andHandleCodeIsNotNull() {
            addCriterion("handle_code is not null");
            return (Criteria) this;
        }

        public Criteria andHandleCodeEqualTo(String value) {
            addCriterion("handle_code =", value, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeNotEqualTo(String value) {
            addCriterion("handle_code <>", value, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeGreaterThan(String value) {
            addCriterion("handle_code >", value, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("handle_code >=", value, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeLessThan(String value) {
            addCriterion("handle_code <", value, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeLessThanOrEqualTo(String value) {
            addCriterion("handle_code <=", value, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeLike(String value) {
            addCriterion("handle_code like", value, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeNotLike(String value) {
            addCriterion("handle_code not like", value, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeIn(List<String> values) {
            addCriterion("handle_code in", values, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeNotIn(List<String> values) {
            addCriterion("handle_code not in", values, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeBetween(String value1, String value2) {
            addCriterion("handle_code between", value1, value2, "handleCode");
            return (Criteria) this;
        }

        public Criteria andHandleCodeNotBetween(String value1, String value2) {
            addCriterion("handle_code not between", value1, value2, "handleCode");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqIsNull() {
            addCriterion("display_seq is null");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqIsNotNull() {
            addCriterion("display_seq is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqEqualTo(Long value) {
            addCriterion("display_seq =", value, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqNotEqualTo(Long value) {
            addCriterion("display_seq <>", value, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqGreaterThan(Long value) {
            addCriterion("display_seq >", value, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqGreaterThanOrEqualTo(Long value) {
            addCriterion("display_seq >=", value, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqLessThan(Long value) {
            addCriterion("display_seq <", value, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqLessThanOrEqualTo(Long value) {
            addCriterion("display_seq <=", value, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqIn(List<Long> values) {
            addCriterion("display_seq in", values, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqNotIn(List<Long> values) {
            addCriterion("display_seq not in", values, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqBetween(Long value1, Long value2) {
            addCriterion("display_seq between", value1, value2, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqNotBetween(Long value1, Long value2) {
            addCriterion("display_seq not between", value1, value2, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("data_type =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("data_type <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("data_type >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("data_type >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("data_type <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("data_type <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("data_type like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("data_type not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("data_type in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("data_type not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDisplayCodeIsNull() {
            addCriterion("display_code is null");
            return (Criteria) this;
        }

        public Criteria andDisplayCodeIsNotNull() {
            addCriterion("display_code is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayCodeEqualTo(String value) {
            addCriterion("display_code =", value, "displayCode");
            return (Criteria) this;
        }

        public Criteria andDisplayCodeNotEqualTo(String value) {
            addCriterion("display_code <>", value, "displayCode");
            return (Criteria) this;
        }

        public Criteria andDisplayCodeGreaterThan(String value) {
            addCriterion("display_code >", value, "displayCode");
            return (Criteria) this;
        }

        public Criteria andDisplayCodeGreaterThanOrEqualTo(String value) {
            addCriterion("display_code >=", value, "displayCode");
            return (Criteria) this;
        }

        public Criteria andDisplayCodeLessThan(String value) {
            addCriterion("display_code <", value, "displayCode");
            return (Criteria) this;
        }

        public Criteria andDisplayCodeLessThanOrEqualTo(String value) {
            addCriterion("display_code <=", value, "displayCode");
            return (Criteria) this;
        }

        public Criteria andDisplayCodeLike(String value) {
            addCriterion("display_code like", value, "displayCode");
            return (Criteria) this;
        }

        public Criteria andDisplayCodeNotLike(String value) {
            addCriterion("display_code not like", value, "displayCode");
            return (Criteria) this;
        }

        public Criteria andDisplayCodeIn(List<String> values) {
            addCriterion("display_code in", values, "displayCode");
            return (Criteria) this;
        }

        public Criteria andDisplayCodeNotIn(List<String> values) {
            addCriterion("display_code not in", values, "displayCode");
            return (Criteria) this;
        }

        public Criteria andDisplayCodeBetween(String value1, String value2) {
            addCriterion("display_code between", value1, value2, "displayCode");
            return (Criteria) this;
        }

        public Criteria andDisplayCodeNotBetween(String value1, String value2) {
            addCriterion("display_code not between", value1, value2, "displayCode");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Long value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Long value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Long value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Long value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Long> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Long> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Long value1, Long value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("update_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("update_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(Long value) {
            addCriterion("update_user_id =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(Long value) {
            addCriterion("update_user_id <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(Long value) {
            addCriterion("update_user_id >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_user_id >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(Long value) {
            addCriterion("update_user_id <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("update_user_id <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<Long> values) {
            addCriterion("update_user_id in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<Long> values) {
            addCriterion("update_user_id not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(Long value1, Long value2) {
            addCriterion("update_user_id between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("update_user_id not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }
    }

    /**
     * ba_defined_code
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    /**
     * ba_defined_code 2018-04-14
     */
    public static class Criterion implements Serializable {
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