package com.hbpu.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hbpu.mapper.StuvisitorMapper;
import com.hbpu.po.Stuvisitor;
import com.hbpu.po.StuvisitorExample;
import com.hbpu.po.StuvisitorExample.Criteria;
import com.hbpu.service.StuvisitorService;
@Service
public class StuvisitorServiceImpl implements StuvisitorService {
	@Autowired
	private StuvisitorMapper stuvisitorMapper;
	@Override
	public List<Stuvisitor> selectVisitor(int pageNum) {
		PageHelper.startPage(pageNum, 4);
		return stuvisitorMapper.selectByExample(null) ;
	}

	@Override
	public int selectVisitorCount() {
		return stuvisitorMapper.selectByExample(null).size();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Map addVisitor(Stuvisitor stuvisitor) {
		stuvisitor.setVcdate(new Date());
		stuvisitorMapper.insert(stuvisitor);
		return null;
	}

	@Override
	public void delectVisitor(Integer[] id) {
		for (Integer integer : id) {
			stuvisitorMapper.deleteByPrimaryKey(integer);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map findVisitorBySome(Stuvisitor stuvisitor, int pageNum) {
		StuvisitorExample stuvisitorExample=new StuvisitorExample();
		Criteria criteria=  stuvisitorExample.createCriteria();
		if(stuvisitor.getVcdate()!=null){
			criteria.andVcdateGreaterThanOrEqualTo(stuvisitor.getVcdate());
		}
		if(stuvisitor.getVldate()!=null){
			criteria.andVcdateLessThanOrEqualTo(stuvisitor.getVldate());
		}
		List<Stuvisitor> stuvisitorListCount=stuvisitorMapper.selectByExample(stuvisitorExample);
		PageHelper.startPage(pageNum, 4);
		List<Stuvisitor> stuvisitorList=stuvisitorMapper.selectByExample(stuvisitorExample);
		Map map=new HashMap();
		map.put("count", stuvisitorListCount.size());
		map.put("visitorList", stuvisitorList);
		map.put("maxPage", stuvisitorListCount.size()%4==0?stuvisitorListCount.size()/4:stuvisitorListCount.size()/4+1);
		return map;
	}
	@Override
	public Stuvisitor findVisitorById(int id) {
		return stuvisitorMapper.selectByPrimaryKey(id);
	}
}
