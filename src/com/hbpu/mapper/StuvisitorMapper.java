package com.hbpu.mapper;

import com.hbpu.po.Stuvisitor;
import com.hbpu.po.StuvisitorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuvisitorMapper {
    int countByExample(StuvisitorExample example);

    int deleteByExample(StuvisitorExample example);

    int deleteByPrimaryKey(Integer vid);

    int insert(Stuvisitor record);

    int insertSelective(Stuvisitor record);

    List<Stuvisitor> selectByExample(StuvisitorExample example);

    Stuvisitor selectByPrimaryKey(Integer vid);

    int updateByExampleSelective(@Param("record") Stuvisitor record, @Param("example") StuvisitorExample example);

    int updateByExample(@Param("record") Stuvisitor record, @Param("example") StuvisitorExample example);

    int updateByPrimaryKeySelective(Stuvisitor record);

    int updateByPrimaryKey(Stuvisitor record);
}