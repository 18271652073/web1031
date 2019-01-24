package com.hbpu.mapper;

import com.hbpu.po.Studressing;
import com.hbpu.po.StudressingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudressingMapper {
    int countByExample(StudressingExample example);

    int deleteByExample(StudressingExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Studressing record);

    int insertSelective(Studressing record);

    List<Studressing> selectByExample(StudressingExample example);

    Studressing selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") Studressing record, @Param("example") StudressingExample example);

    int updateByExample(@Param("record") Studressing record, @Param("example") StudressingExample example);

    int updateByPrimaryKeySelective(Studressing record);

    int updateByPrimaryKey(Studressing record);
}