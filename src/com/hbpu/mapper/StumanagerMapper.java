package com.hbpu.mapper;

import com.hbpu.po.Stumanager;
import com.hbpu.po.StumanagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StumanagerMapper {
    int countByExample(StumanagerExample example);

    int deleteByExample(StumanagerExample example);

    int deleteByPrimaryKey(Integer mgid);

    int insert(Stumanager record);

    int insertSelective(Stumanager record);

    List<Stumanager> selectByExample(StumanagerExample example);

    Stumanager selectByPrimaryKey(Integer mgid);

    int updateByExampleSelective(@Param("record") Stumanager record, @Param("example") StumanagerExample example);

    int updateByExample(@Param("record") Stumanager record, @Param("example") StumanagerExample example);

    int updateByPrimaryKeySelective(Stumanager record);

    int updateByPrimaryKey(Stumanager record);
}