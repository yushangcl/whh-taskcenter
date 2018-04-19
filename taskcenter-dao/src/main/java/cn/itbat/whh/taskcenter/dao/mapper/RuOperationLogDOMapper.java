package cn.itbat.whh.taskcenter.dao.mapper;

import cn.itbat.whh.taskcenter.dao.model.RuOperationLogDO;
import cn.itbat.whh.taskcenter.dao.model.RuOperationLogDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RuOperationLogDOMapper {
    long countByExample(RuOperationLogDOExample example);

    int deleteByExample(RuOperationLogDOExample example);

    int deleteByPrimaryKey(Long operationLogUkid);

    int insert(RuOperationLogDO record);

    int insertSelective(RuOperationLogDO record);

    List<RuOperationLogDO> selectByExample(RuOperationLogDOExample example);

    RuOperationLogDO selectByPrimaryKey(Long operationLogUkid);

    int updateByExampleSelective(@Param("record") RuOperationLogDO record, @Param("example") RuOperationLogDOExample example);

    int updateByExample(@Param("record") RuOperationLogDO record, @Param("example") RuOperationLogDOExample example);

    int updateByPrimaryKeySelective(RuOperationLogDO record);

    int updateByPrimaryKey(RuOperationLogDO record);
}