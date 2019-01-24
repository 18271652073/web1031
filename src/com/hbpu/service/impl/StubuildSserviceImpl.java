package com.hbpu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hbpu.mapper.StubuildMapper;
import com.hbpu.mapper.StudromMapper;
import com.hbpu.mapper.StumyMapper;
import com.hbpu.po.Stubuild;
import com.hbpu.po.StubuildExample;
import com.hbpu.po.StubuildExample.Criteria;
import com.hbpu.po.StudromExample;
import com.hbpu.po.StumyExample;
import com.hbpu.service.StubuildService;
@Service
public class StubuildSserviceImpl implements StubuildService {
	@Autowired
	private StubuildMapper stubuildMapper;
	@Autowired
	private StudromMapper studromMapper;
	@Autowired
	private StumyMapper stumyMapper;
	@Override
	public List<Stubuild> findBuildAll() {
		return stubuildMapper.selectByExample(null);
	}
	@Override
	public List<Stubuild> findBuild(int pageNum) {
		PageHelper.startPage(pageNum, 4);
		return stubuildMapper.selectByExample(null);
	}
	@Override
	public int findBuildCount() {
		return stubuildMapper.selectByExample(null).size();
	}
	@Override
	public void delectBuild(Integer[] id) {
		StudromExample studromExample=new StudromExample();
		com.hbpu.po.StudromExample.Criteria criteria= studromExample.createCriteria();
		StumyExample stumyExample=new StumyExample();
		com.hbpu.po.StumyExample.Criteria criteria2= stumyExample.createCriteria();
		for (Integer integer : id) {
			Stubuild stubuild= stubuildMapper.selectByPrimaryKey(integer);
			String buildid=stubuild.getBname();
			stubuildMapper.deleteByPrimaryKey(integer);
			criteria.andDrbuildidEqualTo(buildid);
			studromMapper.deleteByExample(studromExample);
			criteria2.andMbuildnumEqualTo(buildid);
			stumyMapper.deleteByExample(stumyExample);
		}
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map findBuildBySome(Stubuild stubuild, int pageNum) {
		StubuildExample stubuildExample=new StubuildExample();
		Criteria criteria= stubuildExample.createCriteria();
		criteria.andBidEqualTo(stubuild.getBid());
		List<Stubuild> stubuildListCount=stubuildMapper.selectByExample(stubuildExample);
		PageHelper.startPage(pageNum, 4);
		List<Stubuild> stubuildList=stubuildMapper.selectByExample(stubuildExample);
		Map map=new HashMap();
		map.put("count", stubuildListCount.size());
		map.put("buildList", stubuildList);
		map.put("maxPage", stubuildListCount.size()%4==0?stubuildListCount.size()/4:stubuildListCount.size()/4+1);
		return map;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map addBuild(Stubuild stubuild) {
		StubuildExample stubuildExample=new StubuildExample();
		Criteria criteria= stubuildExample.createCriteria();
		criteria.andBnameEqualTo(stubuild.getBname());
		Map map=new HashMap();
		if (stubuildMapper.selectByExample(stubuildExample).size()>0) {
			map.put("msg", "0");
			return map;
		}
		stubuildMapper.insert(stubuild);
		return map;
	}
	@Override
	public Stubuild findBuildById(int id) {
		return stubuildMapper.selectByPrimaryKey(id);
	}
	@Override
	public Boolean updateBuild(Stubuild stubuild) {
		StubuildExample stubuildExample=new StubuildExample();
		Criteria criteria= stubuildExample.createCriteria();
		criteria.andBidEqualTo(stubuild.getBid());
		stubuildMapper.updateByExample(stubuild, stubuildExample);
		return null;
	}

}
