package cn.itbat.whh.taskcenter.manager.impl;

import com.whh.common.mybatis.base.BaseManagerImpl;
import cn.itbat.whh.taskcenter.dao.mapper.RuOperationLogDOMapper;
import cn.itbat.whh.taskcenter.model.RuOperationLog;
import cn.itbat.whh.taskcenter.dao.model.RuOperationLogDO;
import cn.itbat.whh.taskcenter.dao.model.RuOperationLogDOExample;
import cn.itbat.whh.taskcenter.manager.RuOperationLogManager;
import com.whh.common.ukid.UKID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
* RuOperationLogManagerImpl
*  on 2018/4/19.
*/
@Service
@Transactional
public class RuOperationLogManagerImpl extends BaseManagerImpl<RuOperationLogDOMapper, RuOperationLog, RuOperationLogDO, RuOperationLogDOExample> implements RuOperationLogManager {

    private static Logger _log = LoggerFactory.getLogger(RuOperationLogManagerImpl.class);

    @Autowired
    RuOperationLogDOMapper ruOperationLogDOMapper;

    @Override
    public RuOperationLogDOMapper getMapper() {
        return ruOperationLogDOMapper;
    }

    @Override
    public Long insertOperationLog(RuOperationLog ruOperationLog) {
        if (ruOperationLog.getOperationLogUkid() == null) {
            ruOperationLog.setOperationLogUkid(UKID.getUKID());
        }
        ruOperationLogDOMapper.insert(convertDO(ruOperationLog));
        return ruOperationLog.getOperationLogUkid();
    }

    @Override
    public Long insertOperationLog(Long relatedUkid, String relatedType, String operationName, Long userId, String remark) {
        RuOperationLogDO operationLogDO = new RuOperationLogDO();
        operationLogDO.setOperationLogUkid(UKID.getUKID());
        operationLogDO.setRelatedUkid(relatedUkid);
        operationLogDO.setRelatedType(relatedType);
        operationLogDO.setOperationName(operationName);
        operationLogDO.setLogUserId(userId);
        operationLogDO.setLogDate(new Date());
        operationLogDO.setLogRemark(remark);
        ruOperationLogDOMapper.insert(operationLogDO);
        return operationLogDO.getOperationLogUkid();
    }

    @Override
    public Long insertOperationLog(Long relatedUkid, String relatedType, String operationName, Long userId, String remark,
                                   String logDyn1, String logDyn2) {
        RuOperationLogDO operationLogDO = new RuOperationLogDO();
        operationLogDO.setOperationLogUkid(UKID.getUKID());
        operationLogDO.setRelatedUkid(relatedUkid);
        operationLogDO.setRelatedType(relatedType);
        operationLogDO.setOperationName(operationName);
        operationLogDO.setLogUserId(userId);
        operationLogDO.setLogDate(new Date());
        operationLogDO.setLogRemark(remark);
        operationLogDO.setLogDyn1(logDyn1);
        operationLogDO.setLogDyn2(logDyn2);
        ruOperationLogDOMapper.insert(operationLogDO);
        return operationLogDO.getOperationLogUkid();
    }
}