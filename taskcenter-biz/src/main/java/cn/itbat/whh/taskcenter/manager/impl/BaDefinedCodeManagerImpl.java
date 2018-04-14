package cn.itbat.whh.taskcenter.manager.impl;

import com.whh.common.mybatis.base.BaseManagerImpl;
import cn.itbat.whh.taskcenter.dao.mapper.BaDefinedCodeDOMapper;
import cn.itbat.whh.taskcenter.model.BaDefinedCode;
import cn.itbat.whh.taskcenter.dao.model.BaDefinedCodeDO;
import cn.itbat.whh.taskcenter.dao.model.BaDefinedCodeDOExample;
import cn.itbat.whh.taskcenter.manager.BaDefinedCodeManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* BaDefinedCodeManagerImpl
*  on 2018/4/14.
*/
@Service
@Transactional
public class BaDefinedCodeManagerImpl extends BaseManagerImpl<BaDefinedCodeDOMapper, BaDefinedCode, BaDefinedCodeDO, BaDefinedCodeDOExample> implements BaDefinedCodeManager {

    private static Logger _log = LoggerFactory.getLogger(BaDefinedCodeManagerImpl.class);

    @Autowired
    BaDefinedCodeDOMapper baDefinedCodeDOMapper;

    @Override
    public BaDefinedCodeDOMapper getMapper() {
        return baDefinedCodeDOMapper;
    }
}