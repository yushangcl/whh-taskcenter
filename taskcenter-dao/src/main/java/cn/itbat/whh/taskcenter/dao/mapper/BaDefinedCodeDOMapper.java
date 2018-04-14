package cn.itbat.whh.taskcenter.dao.mapper;

import cn.itbat.whh.taskcenter.dao.model.BaDefinedCodeDO;
import cn.itbat.whh.taskcenter.dao.model.BaDefinedCodeDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaDefinedCodeDOMapper {
    long countByExample(BaDefinedCodeDOExample example);

    int deleteByExample(BaDefinedCodeDOExample example);

    int deleteByPrimaryKey(@Param("definedCodeType") String definedCodeType, @Param("definedCode") String definedCode);

    int insert(BaDefinedCodeDO record);

    int insertSelective(BaDefinedCodeDO record);

    List<BaDefinedCodeDO> selectByExample(BaDefinedCodeDOExample example);

    BaDefinedCodeDO selectByPrimaryKey(@Param("definedCodeType") String definedCodeType, @Param("definedCode") String definedCode);

    int updateByExampleSelective(@Param("record") BaDefinedCodeDO record, @Param("example") BaDefinedCodeDOExample example);

    int updateByExample(@Param("record") BaDefinedCodeDO record, @Param("example") BaDefinedCodeDOExample example);

    int updateByPrimaryKeySelective(BaDefinedCodeDO record);

    int updateByPrimaryKey(BaDefinedCodeDO record);
}