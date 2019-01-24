package com.hbpu.mapper;

import com.hbpu.po.Stubuild;
import com.hbpu.po.StubuildExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StubuildMapper {
    int countByExample(StubuildExample example);

    int deleteByExample(StubuildExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Stubuild record);

    int insertSelective(Stubuild record);

    List<Stubuild> selectByExample(StubuildExample example);

    Stubuild selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Stubuild record, @Param("example") StubuildExample example);

    int updateByExample(@Param("record") Stubuild record, @Param("example") StubuildExample example);

    int updateByPrimaryKeySelective(Stubuild record);

    int updateByPrimaryKey(Stubuild record);
}