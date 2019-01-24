package com.hbpu.mapper;

import com.hbpu.po.Stumy;
import com.hbpu.po.StumyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StumyMapper {
    int countByExample(StumyExample example);

    int deleteByExample(StumyExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Stumy record);

    int insertSelective(Stumy record);

    List<Stumy> selectByExample(StumyExample example);

    Stumy selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Stumy record, @Param("example") StumyExample example);

    int updateByExample(@Param("record") Stumy record, @Param("example") StumyExample example);

    int updateByPrimaryKeySelective(Stumy record);

    int updateByPrimaryKey(Stumy record);
}