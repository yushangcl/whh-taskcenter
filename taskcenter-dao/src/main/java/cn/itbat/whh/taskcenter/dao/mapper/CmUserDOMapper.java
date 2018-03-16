package cn.itbat.whh.taskcenter.dao.mapper;

import cn.itbat.whh.taskcenter.dao.model.CmUserDO;
import cn.itbat.whh.taskcenter.dao.model.CmUserDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmUserDOMapper {
    long countByExample(CmUserDOExample example);

    int deleteByExample(CmUserDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmUserDO record);

    int insertSelective(CmUserDO record);

    List<CmUserDO> selectByExample(CmUserDOExample example);

    CmUserDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmUserDO record, @Param("example") CmUserDOExample example);

    int updateByExample(@Param("record") CmUserDO record, @Param("example") CmUserDOExample example);

    int updateByPrimaryKeySelective(CmUserDO record);

    int updateByPrimaryKey(CmUserDO record);
}