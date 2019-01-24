package com.hbpu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hbpu.mapper.StuscoreMapper;
import com.hbpu.po.Stuscore;
import com.hbpu.po.StuscoreExample;
import com.hbpu.po.StuscoreExample.Criteria;
import com.hbpu.service.StuscoreService;
@Service
public class StuscoreServiceImpl implements StuscoreService {
	@Autowired
	private StuscoreMapper stuscoreMapper;
	@Override
	public List<Stuscore> selectScore(int pageNum) {
		PageHelper.startPage(pageNum, 4);
		return stuscoreMapper.selectByExample(null);
	}

	@Override
	public int selectScoreCount() {
		return stuscoreMapper.selectByExample(null).size();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Map addScore(Stuscore stuscore) {
		int i=stuscore.getSculture()+stuscore.getShygiene()+stuscore.getSsave();
		if(i>=280){
			stuscore.setSgrade("A");
		}else if (i>=270 && i<=280) {
			stuscore.setSgrade("B");
		}else {
			stuscore.setSgrade("C");
		}
		stuscoreMapper.insert(stuscore);
		return null;
	}

	@Override
	public void delectScore(Integer[] id) {
		for (Integer integer : id) {
			stuscoreMapper.deleteByPrimaryKey(integer);
		}
	}

	@Override
	public Boolean updateScore(Stuscore stuscore) {
		int i=stuscore.getSculture()+stuscore.getShygiene()+stuscore.getSsave();
		if(i>=280){
			stuscore.setSgrade("A");
		}else if (i>=270 && i<=280) {
			stuscore.setSgrade("B");
		}else {
			stuscore.setSgrade("C");
		}
		StuscoreExample stuscoreExample=new StuscoreExample();
		Criteria criteria= stuscoreExample.createCriteria();
		criteria.andSidEqualTo(stuscore.getSid());
		stuscoreMapper.updateByExample(stuscore, stuscoreExample);
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map findScoreBySome(Stuscore stuscore, int pageNum) {
		StuscoreExample stuscoreExample=new StuscoreExample();
		Criteria criteria= stuscoreExample.createCriteria();
		if(!stuscore.getSdromnum().equals("")&&stuscore.getSdromnum()!=null){
			criteria.andSdromnumEqualTo(stuscore.getSdromnum());
		}
		if(!stuscore.getSgrade().equals("")&&stuscore.getSgrade()!=null){
			criteria.andSgradeEqualTo(stuscore.getSgrade());
		}
		List<Stuscore> stuscoreListCount=stuscoreMapper.selectByExample(stuscoreExample);
		PageHelper.startPage(pageNum, 4);
		List<Stuscore> stuscoreList=stuscoreMapper.selectByExample(stuscoreExample);
		Map map=new HashMap();
		map.put("count", stuscoreListCount.size());
		map.put("stuscoreList", stuscoreList);
		map.put("maxPage", stuscoreListCount.size()%4==0?stuscoreListCount.size()/4:stuscoreListCount.size()/4+1);
		return map;
	}

	@Override
	public Stuscore findScoreById(int id) {
		return stuscoreMapper.selectByPrimaryKey(id);
	}

}
