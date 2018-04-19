package cn.itbat.whh.taskcenter.dao.model;

import java.io.Serializable;
import java.util.Date;

public class RuOperationLogDO implements Serializable {
    /**
     * 
     */
    private Long operationLogUkid;

    /**
     * 关联的ukid
     */
    private Long relatedUkid;

    /**
     * 关联单据类型
     */
    private String relatedType;

    /**
     * 操作名称
     */
    private String operationName;

    /**
     * 操作人
     */
    private Long logUserId;

    /**
     * 操作日期
     */
    private Date logDate;

    /**
     * 操作备注
     */
    private String logRemark;

    /**
     * 动态预留字段1
     */
    private String logDyn1;

    /**
     * 动态预留字段2
     */
    private String logDyn2;

    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return operation_log_ukid 
     */
    public Long getOperationLogUkid() {
        return operationLogUkid;
    }

    /**
     * 
     * @param operationLogUkid 
     */
    public void setOperationLogUkid(Long operationLogUkid) {
        this.operationLogUkid = operationLogUkid;
    }

    /**
     * 关联的ukid
     * @return related_ukid 关联的ukid
     */
    public Long getRelatedUkid() {
        return relatedUkid;
    }

    /**
     * 关联的ukid
     * @param relatedUkid 关联的ukid
     */
    public void setRelatedUkid(Long relatedUkid) {
        this.relatedUkid = relatedUkid;
    }

    /**
     * 关联单据类型
     * @return related_type 关联单据类型
     */
    public String getRelatedType() {
        return relatedType;
    }

    /**
     * 关联单据类型
     * @param relatedType 关联单据类型
     */
    public void setRelatedType(String relatedType) {
        this.relatedType = relatedType;
    }

    /**
     * 操作名称
     * @return operation_name 操作名称
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * 操作名称
     * @param operationName 操作名称
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /**
     * 操作人
     * @return log_user_id 操作人
     */
    public Long getLogUserId() {
        return logUserId;
    }

    /**
     * 操作人
     * @param logUserId 操作人
     */
    public void setLogUserId(Long logUserId) {
        this.logUserId = logUserId;
    }

    /**
     * 操作日期
     * @return log_date 操作日期
     */
    public Date getLogDate() {
        return logDate;
    }

    /**
     * 操作日期
     * @param logDate 操作日期
     */
    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    /**
     * 操作备注
     * @return log_remark 操作备注
     */
    public String getLogRemark() {
        return logRemark;
    }

    /**
     * 操作备注
     * @param logRemark 操作备注
     */
    public void setLogRemark(String logRemark) {
        this.logRemark = logRemark;
    }

    /**
     * 动态预留字段1
     * @return log_dyn1 动态预留字段1
     */
    public String getLogDyn1() {
        return logDyn1;
    }

    /**
     * 动态预留字段1
     * @param logDyn1 动态预留字段1
     */
    public void setLogDyn1(String logDyn1) {
        this.logDyn1 = logDyn1;
    }

    /**
     * 动态预留字段2
     * @return log_dyn2 动态预留字段2
     */
    public String getLogDyn2() {
        return logDyn2;
    }

    /**
     * 动态预留字段2
     * @param logDyn2 动态预留字段2
     */
    public void setLogDyn2(String logDyn2) {
        this.logDyn2 = logDyn2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", operationLogUkid=").append(operationLogUkid);
        sb.append(", relatedUkid=").append(relatedUkid);
        sb.append(", relatedType=").append(relatedType);
        sb.append(", operationName=").append(operationName);
        sb.append(", logUserId=").append(logUserId);
        sb.append(", logDate=").append(logDate);
        sb.append(", logRemark=").append(logRemark);
        sb.append(", logDyn1=").append(logDyn1);
        sb.append(", logDyn2=").append(logDyn2);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RuOperationLogDO other = (RuOperationLogDO) that;
        return (this.getOperationLogUkid() == null ? other.getOperationLogUkid() == null : this.getOperationLogUkid().equals(other.getOperationLogUkid()))
            && (this.getRelatedUkid() == null ? other.getRelatedUkid() == null : this.getRelatedUkid().equals(other.getRelatedUkid()))
            && (this.getRelatedType() == null ? other.getRelatedType() == null : this.getRelatedType().equals(other.getRelatedType()))
            && (this.getOperationName() == null ? other.getOperationName() == null : this.getOperationName().equals(other.getOperationName()))
            && (this.getLogUserId() == null ? other.getLogUserId() == null : this.getLogUserId().equals(other.getLogUserId()))
            && (this.getLogDate() == null ? other.getLogDate() == null : this.getLogDate().equals(other.getLogDate()))
            && (this.getLogRemark() == null ? other.getLogRemark() == null : this.getLogRemark().equals(other.getLogRemark()))
            && (this.getLogDyn1() == null ? other.getLogDyn1() == null : this.getLogDyn1().equals(other.getLogDyn1()))
            && (this.getLogDyn2() == null ? other.getLogDyn2() == null : this.getLogDyn2().equals(other.getLogDyn2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperationLogUkid() == null) ? 0 : getOperationLogUkid().hashCode());
        result = prime * result + ((getRelatedUkid() == null) ? 0 : getRelatedUkid().hashCode());
        result = prime * result + ((getRelatedType() == null) ? 0 : getRelatedType().hashCode());
        result = prime * result + ((getOperationName() == null) ? 0 : getOperationName().hashCode());
        result = prime * result + ((getLogUserId() == null) ? 0 : getLogUserId().hashCode());
        result = prime * result + ((getLogDate() == null) ? 0 : getLogDate().hashCode());
        result = prime * result + ((getLogRemark() == null) ? 0 : getLogRemark().hashCode());
        result = prime * result + ((getLogDyn1() == null) ? 0 : getLogDyn1().hashCode());
        result = prime * result + ((getLogDyn2() == null) ? 0 : getLogDyn2().hashCode());
        return result;
    }
}