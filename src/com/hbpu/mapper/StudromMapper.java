package com.hbpu.mapper;

import com.hbpu.po.Studrom;
import com.hbpu.po.StudromExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudromMapper {
    int countByExample(StudromExample example);

    int deleteByExample(StudromExample example);

    int deleteByPrimaryKey(Integer drid);

    int insert(Studrom record);

    int insertSelective(Studrom record);

    List<Studrom> selectByExample(StudromExample example);

    Studrom selectByPrimaryKey(Integer drid);

    int updateByExampleSelective(@Param("record") Studrom record, @Param("example") StudromExample example);

    int updateByExample(@Param("record") Studrom record, @Param("example") StudromExample example);

    int updateByPrimaryKeySelective(Studrom record);

    int updateByPrimaryKey(Studrom record);
}