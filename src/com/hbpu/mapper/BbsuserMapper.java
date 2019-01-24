package com.hbpu.mapper;

import com.hbpu.po.Bbsuser;
import com.hbpu.po.BbsuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsuserMapper {
    int countByExample(BbsuserExample example);

    int deleteByExample(BbsuserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Bbsuser record);

    int insertSelective(Bbsuser record);

    List<Bbsuser> selectByExample(BbsuserExample example);

    Bbsuser selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Bbsuser record, @Param("example") BbsuserExample example);

    int updateByExample(@Param("record") Bbsuser record, @Param("example") BbsuserExample example);

    int updateByPrimaryKeySelective(Bbsuser record);

    int updateByPrimaryKey(Bbsuser record);
}