package com.hbpu.mapper;

import com.hbpu.po.Stuscore;
import com.hbpu.po.StuscoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuscoreMapper {
    int countByExample(StuscoreExample example);

    int deleteByExample(StuscoreExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Stuscore record);

    int insertSelective(Stuscore record);

    List<Stuscore> selectByExample(StuscoreExample example);

    Stuscore selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Stuscore record, @Param("example") StuscoreExample example);

    int updateByExample(@Param("record") Stuscore record, @Param("example") StuscoreExample example);

    int updateByPrimaryKeySelective(Stuscore record);

    int updateByPrimaryKey(Stuscore record);
}