package cn.itbat.whh.taskcenter.manager.impl;

import com.whh.common.mybatis.base.BaseManagerImpl;
import cn.itbat.whh.taskcenter.dao.mapper.CmUserDOMapper;
import cn.itbat.whh.taskcenter.model.CmUser;
import cn.itbat.whh.taskcenter.dao.model.CmUserDO;
import cn.itbat.whh.taskcenter.dao.model.CmUserDOExample;
import cn.itbat.whh.taskcenter.manager.CmUserManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmUserManagerImpl
*  on 2018/3/16.
*/
@Service
@Transactional
public class CmUserManagerImpl extends BaseManagerImpl<CmUserDOMapper, CmUser, CmUserDO, CmUserDOExample> implements CmUserManager {

    private static Logger _log = LoggerFactory.getLogger(CmUserManagerImpl.class);

    @Autowired
    CmUserDOMapper cmUserDOMapper;

    @Override
    public CmUserDOMapper getMapper() {
        return cmUserDOMapper;
    }
}