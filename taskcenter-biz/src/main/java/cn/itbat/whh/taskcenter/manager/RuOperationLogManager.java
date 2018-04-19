package cn.itbat.whh.taskcenter.manager;

import com.whh.common.mybatis.base.BaseManager;
import cn.itbat.whh.taskcenter.model.RuOperationLog;
import cn.itbat.whh.taskcenter.dao.model.RuOperationLogDOExample;

/**
 * RuOperationLogManager
 * on 2018/4/19.
 */
public interface RuOperationLogManager extends BaseManager<RuOperationLog, RuOperationLogDOExample> {
    /**
     * 记录操作日志
     *
     * @param ruOperationLog 日志
     * @return
     */
    Long insertOperationLog(RuOperationLog ruOperationLog);

    /**
     * 记录操纵日志
     *
     * @param relatedUkid   关联ukid
     * @param relatedType   关联类型
     * @param operationName 操作名称
     * @param userId        操作人
     * @param remark        备注
     * @return operationLogUkid
     */
    Long insertOperationLog(Long relatedUkid, String relatedType, String operationName, Long userId, String remark);

    /**
     * 记录操纵日志
     *
     * @param relatedUkid   关联ukid
     * @param relatedType   关联类型
     * @param operationName 操作名称
     * @param userId        操作人
     * @param remark        备注
     * @param logDyn1       预留字段1
     * @param logDyn2       预留字段2
     * @return operationLogUkid
     */
    Long insertOperationLog(Long relatedUkid, String relatedType, String operationName, Long userId, String remark,
                            String logDyn1, String logDyn2);
}