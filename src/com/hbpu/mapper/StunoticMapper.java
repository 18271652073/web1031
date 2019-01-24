package com.hbpu.mapper;

import com.hbpu.po.Stunotic;
import com.hbpu.po.StunoticExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StunoticMapper {
    int countByExample(StunoticExample example);

    int deleteByExample(StunoticExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(Stunotic record);

    int insertSelective(Stunotic record);

    List<Stunotic> selectByExample(StunoticExample example);

    Stunotic selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") Stunotic record, @Param("example") StunoticExample example);

    int updateByExample(@Param("record") Stunotic record, @Param("example") StunoticExample example);

    int updateByPrimaryKeySelective(Stunotic record);

    int updateByPrimaryKey(Stunotic record);
}