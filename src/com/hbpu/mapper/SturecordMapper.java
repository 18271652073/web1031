package com.hbpu.mapper;

import com.hbpu.po.Sturecord;
import com.hbpu.po.SturecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SturecordMapper {
    int countByExample(SturecordExample example);

    int deleteByExample(SturecordExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Sturecord record);

    int insertSelective(Sturecord record);

    List<Sturecord> selectByExample(SturecordExample example);

    Sturecord selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Sturecord record, @Param("example") SturecordExample example);

    int updateByExample(@Param("record") Sturecord record, @Param("example") SturecordExample example);

    int updateByPrimaryKeySelective(Sturecord record);

    int updateByPrimaryKey(Sturecord record);
}