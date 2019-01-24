package com.hbpu.service.impl;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hbpu.mapper.StudressingMapper;
import com.hbpu.po.Studressing;
import com.hbpu.po.StudressingExample;
import com.hbpu.po.StudressingExample.Criteria;
import com.hbpu.service.StudressingService;
@Service
public class StudressingServiceImpl implements StudressingService {
	@Autowired
	private StudressingMapper studressingMapper;
	@Override
	public List<Studressing> selectDressing(int pageNum) {
		PageHelper.startPage(pageNum, 4);
		return studressingMapper.selectByExample(null);
	}

	@Override
	public int selectDressingCount() {
		return studressingMapper.selectByExample(null).size();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Map addDressing(Studressing studressing) {
		studressing.setDdate(new Date());
		studressingMapper.insert(studressing);
		return null;
	}

	@Override
	public void delectDressing(Integer[] id) {
		for (Integer integer : id) {
			studressingMapper.deleteByPrimaryKey(integer);
		}
	}

	@Override
	public Boolean updateDressing(Studressing studressing) {
		StudressingExample studressingExample=new StudressingExample();
		Criteria criteria= studressingExample.createCriteria();
		criteria.andDidEqualTo(studressing.getDid());
		studressingMapper.updateByExample(studressing, studressingExample);
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map findDressingBySome(Studressing studressing, int pageNum) {
		StudressingExample studressingExample=new StudressingExample();
		Criteria criteria= studressingExample.createCriteria();
		if(studressing.getDcollege()!=null){
			criteria.andDcollegeEqualTo(studressing.getDcollege());}
		if(!studressing.getDdromnum().equals("")){
			criteria.andDdromnumEqualTo(studressing.getDdromnum());}
		if(!studressing.getDmajor().equals("")){
			criteria.andDmajorEqualTo(studressing.getDmajor());}
		if(!studressing.getDname().equals("")){
			criteria.andDnameEqualTo(studressing.getDname());}
		if(!studressing.getDstuid().equals("")){
			criteria.andDstuidEqualTo(studressing.getDstuid());}
		List<Studressing> studressingListCount=studressingMapper.selectByExample(studressingExample);
		PageHelper.startPage(pageNum, 4);
		List<Studressing> dressingList=studressingMapper.selectByExample(studressingExample);
		Map map=new HashMap();
		map.put("count", studressingListCount.size());
		map.put("dressingList", dressingList);
		map.put("maxPage", studressingListCount.size()%4==0?studressingListCount.size()/4:studressingListCount.size()/4+1);
		return map;
	}

	@Override
	public Studressing findDressingById(int id) {
		return studressingMapper.selectByPrimaryKey(id);
	}

}
