package com.hbpu.mapper;

import com.hbpu.po.Bbsreply;
import com.hbpu.po.BbsreplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsreplyMapper {
    int countByExample(BbsreplyExample example);

    int deleteByExample(BbsreplyExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Bbsreply record);

    int insertSelective(Bbsreply record);

    List<Bbsreply> selectByExample(BbsreplyExample example);

    Bbsreply selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Bbsreply record, @Param("example") BbsreplyExample example);

    int updateByExample(@Param("record") Bbsreply record, @Param("example") BbsreplyExample example);

    int updateByPrimaryKeySelective(Bbsreply record);

    int updateByPrimaryKey(Bbsreply record);
}