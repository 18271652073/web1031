package com.hbpu.mapper;

import com.hbpu.po.Bbssection;
import com.hbpu.po.BbssectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbssectionMapper {
    int countByExample(BbssectionExample example);

    int deleteByExample(BbssectionExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Bbssection record);

    int insertSelective(Bbssection record);

    List<Bbssection> selectByExample(BbssectionExample example);

    Bbssection selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Bbssection record, @Param("example") BbssectionExample example);

    int updateByExample(@Param("record") Bbssection record, @Param("example") BbssectionExample example);

    int updateByPrimaryKeySelective(Bbssection record);

    int updateByPrimaryKey(Bbssection record);
}