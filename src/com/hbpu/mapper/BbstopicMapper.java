package com.hbpu.mapper;

import com.hbpu.po.Bbstopic;
import com.hbpu.po.BbstopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbstopicMapper {
    int countByExample(BbstopicExample example);

    int deleteByExample(BbstopicExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Bbstopic record);

    int insertSelective(Bbstopic record);

    List<Bbstopic> selectByExample(BbstopicExample example);

    Bbstopic selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Bbstopic record, @Param("example") BbstopicExample example);

    int updateByExample(@Param("record") Bbstopic record, @Param("example") BbstopicExample example);

    int updateByPrimaryKeySelective(Bbstopic record);

    int updateByPrimaryKey(Bbstopic record);
}