package cn.itbat.whh.taskcenter.model;

import java.io.Serializable;
import java.util.Date;

public class BaDefinedCode implements Serializable {
    /**
     * 字典类型
     */
    private String definedCodeType;

    /**
     * 编码
     */
    private String definedCode;

    /**
     * 名称
     */
    private String definedName;

    /**
     * 描述
     */
    private String definedDesc;

    /**
     * 分组编码
     */
    private String handleCode;

    /**
     * 显示顺序，越大越靠后
     */
    private Long displaySeq;

    /**
     * 生成枚举数据类型
     */
    private String dataType;

    /**
     * 如果DEFINED_CODE为数字,最好维护这个值,用于枚举的名称,请勿使用中文
     */
    private String displayCode;

    /**
     * 图片URL
     */
    private String imageUrl;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private Long createUserId;

    /**
     * 更新人
     */
    private Long updateUserId;

    private static final long serialVersionUID = 1L;

    /**
     * 字典类型
     * @return defined_code_type 字典类型
     */
    public String getDefinedCodeType() {
        return definedCodeType;
    }

    /**
     * 字典类型
     * @param definedCodeType 字典类型
     */
    public void setDefinedCodeType(String definedCodeType) {
        this.definedCodeType = definedCodeType;
    }

    /**
     * 编码
     * @return defined_code 编码
     */
    public String getDefinedCode() {
        return definedCode;
    }

    /**
     * 编码
     * @param definedCode 编码
     */
    public void setDefinedCode(String definedCode) {
        this.definedCode = definedCode;
    }

    /**
     * 名称
     * @return defined_name 名称
     */
    public String getDefinedName() {
        return definedName;
    }

    /**
     * 名称
     * @param definedName 名称
     */
    public void setDefinedName(String definedName) {
        this.definedName = definedName;
    }

    /**
     * 描述
     * @return defined_desc 描述
     */
    public String getDefinedDesc() {
        return definedDesc;
    }

    /**
     * 描述
     * @param definedDesc 描述
     */
    public void setDefinedDesc(String definedDesc) {
        this.definedDesc = definedDesc;
    }

    /**
     * 分组编码
     * @return handle_code 分组编码
     */
    public String getHandleCode() {
        return handleCode;
    }

    /**
     * 分组编码
     * @param handleCode 分组编码
     */
    public void setHandleCode(String handleCode) {
        this.handleCode = handleCode;
    }

    /**
     * 显示顺序，越大越靠后
     * @return display_seq 显示顺序，越大越靠后
     */
    public Long getDisplaySeq() {
        return displaySeq;
    }

    /**
     * 显示顺序，越大越靠后
     * @param displaySeq 显示顺序，越大越靠后
     */
    public void setDisplaySeq(Long displaySeq) {
        this.displaySeq = displaySeq;
    }

    /**
     * 生成枚举数据类型
     * @return data_type 生成枚举数据类型
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * 生成枚举数据类型
     * @param dataType 生成枚举数据类型
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * 如果DEFINED_CODE为数字,最好维护这个值,用于枚举的名称,请勿使用中文
     * @return display_code 如果DEFINED_CODE为数字,最好维护这个值,用于枚举的名称,请勿使用中文
     */
    public String getDisplayCode() {
        return displayCode;
    }

    /**
     * 如果DEFINED_CODE为数字,最好维护这个值,用于枚举的名称,请勿使用中文
     * @param displayCode 如果DEFINED_CODE为数字,最好维护这个值,用于枚举的名称,请勿使用中文
     */
    public void setDisplayCode(String displayCode) {
        this.displayCode = displayCode;
    }

    /**
     * 图片URL
     * @return image_url 图片URL
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 图片URL
     * @param imageUrl 图片URL
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建人
     * @return create_user_id 创建人
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建人
     * @param createUserId 创建人
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 更新人
     * @return update_user_id 更新人
     */
    public Long getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 更新人
     * @param updateUserId 更新人
     */
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", definedCodeType=").append(definedCodeType);
        sb.append(", definedCode=").append(definedCode);
        sb.append(", definedName=").append(definedName);
        sb.append(", definedDesc=").append(definedDesc);
        sb.append(", handleCode=").append(handleCode);
        sb.append(", displaySeq=").append(displaySeq);
        sb.append(", dataType=").append(dataType);
        sb.append(", displayCode=").append(displayCode);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", updateUserId=").append(updateUserId);
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
        BaDefinedCode other = (BaDefinedCode) that;
        return (this.getDefinedCodeType() == null ? other.getDefinedCodeType() == null : this.getDefinedCodeType().equals(other.getDefinedCodeType()))
            && (this.getDefinedCode() == null ? other.getDefinedCode() == null : this.getDefinedCode().equals(other.getDefinedCode()))
            && (this.getDefinedName() == null ? other.getDefinedName() == null : this.getDefinedName().equals(other.getDefinedName()))
            && (this.getDefinedDesc() == null ? other.getDefinedDesc() == null : this.getDefinedDesc().equals(other.getDefinedDesc()))
            && (this.getHandleCode() == null ? other.getHandleCode() == null : this.getHandleCode().equals(other.getHandleCode()))
            && (this.getDisplaySeq() == null ? other.getDisplaySeq() == null : this.getDisplaySeq().equals(other.getDisplaySeq()))
            && (this.getDataType() == null ? other.getDataType() == null : this.getDataType().equals(other.getDataType()))
            && (this.getDisplayCode() == null ? other.getDisplayCode() == null : this.getDisplayCode().equals(other.getDisplayCode()))
            && (this.getImageUrl() == null ? other.getImageUrl() == null : this.getImageUrl().equals(other.getImageUrl()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDefinedCodeType() == null) ? 0 : getDefinedCodeType().hashCode());
        result = prime * result + ((getDefinedCode() == null) ? 0 : getDefinedCode().hashCode());
        result = prime * result + ((getDefinedName() == null) ? 0 : getDefinedName().hashCode());
        result = prime * result + ((getDefinedDesc() == null) ? 0 : getDefinedDesc().hashCode());
        result = prime * result + ((getHandleCode() == null) ? 0 : getHandleCode().hashCode());
        result = prime * result + ((getDisplaySeq() == null) ? 0 : getDisplaySeq().hashCode());
        result = prime * result + ((getDataType() == null) ? 0 : getDataType().hashCode());
        result = prime * result + ((getDisplayCode() == null) ? 0 : getDisplayCode().hashCode());
        result = prime * result + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        return result;
    }
}