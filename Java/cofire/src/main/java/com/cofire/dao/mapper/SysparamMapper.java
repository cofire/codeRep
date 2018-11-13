package com.cofire.dao.mapper;

import com.cofire.dao.domain.Sysparam;
import com.cofire.dao.domain.SysparamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysparamMapper {
    long countByExample(SysparamExample example);

    int deleteByExample(SysparamExample example);

    int deleteByPrimaryKey(@Param("paramgroupId") String paramgroupId, @Param("paramId") String paramId);

    int insert(Sysparam record);

    int insertSelective(Sysparam record);

    List<Sysparam> selectByExample(SysparamExample example);

    Sysparam selectByPrimaryKey(@Param("paramgroupId") String paramgroupId, @Param("paramId") String paramId);

    int updateByExampleSelective(@Param("record") Sysparam record, @Param("example") SysparamExample example);

    int updateByExample(@Param("record") Sysparam record, @Param("example") SysparamExample example);

    int updateByPrimaryKeySelective(Sysparam record);

    int updateByPrimaryKey(Sysparam record);
}