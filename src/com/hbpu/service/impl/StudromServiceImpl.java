package com.hbpu.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hbpu.mapper.StudromMapper;
import com.hbpu.mapper.StumyMapper;
import com.hbpu.po.Studrom;
import com.hbpu.po.StudromExample;
import com.hbpu.po.StudromExample.Criteria;
import com.hbpu.po.StumyExample;
import com.hbpu.service.StudromService;
@Service
public class StudromServiceImpl implements StudromService {
	@Autowired
	private StudromMapper studromMapper;
	@Autowired
	private StumyMapper stumyMapper;
	@Override
	public List<Studrom> findDrom(String drbuildid,int pageNum) {
		StudromExample studromExample=new StudromExample();
		Criteria criteria= studromExample.createCriteria();
		criteria.andDrbuildidEqualTo(drbuildid);
		PageHelper.startPage(pageNum, 4);
		return studromMapper.selectByExample(studromExample);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map addDrom(Studrom studrom) {
		StudromExample studromExample=new StudromExample();
		Criteria criteria= studromExample.createCriteria();
		criteria.andDrdromidEqualTo(studrom.getDrdromid());
		criteria.andDrbuildidEqualTo(studrom.getDrbuildid());
		Map map=new HashMap();
		if(studromMapper.selectByExample(studromExample).size()>0){
			map.put("msg", "0");
			return map;
		}
		studrom.setDrcount(0);
		studromMapper.insert(studrom);
		return map;
	}

	@Override
	public int findDromByBlidCount(String drbuildid) {
		StudromExample studromExample=new StudromExample();
		Criteria criteria= studromExample.createCriteria();
		criteria.andDrbuildidEqualTo(drbuildid);
		return studromMapper.selectByExample(studromExample).size();
	}

	@Override
	public void delectDrom(Integer[] id) {
		StumyExample stumyExample=new StumyExample();
		com.hbpu.po.StumyExample.Criteria criteria= stumyExample.createCriteria();
		for (Integer integer : id) {
			Studrom studrom= studromMapper.selectByPrimaryKey(integer);
			String dromnum=studrom.getDrdromid();
			studromMapper.deleteByPrimaryKey(integer);
			criteria.andMdromEqualTo(dromnum);
			stumyMapper.deleteByExample(stumyExample);
		}
	}

	@Override
	public Studrom findDromById(int id) {
		return studromMapper.selectByPrimaryKey(id);
	}

	@Override
	public Boolean updateDrom(Studrom studrom) {
		StudromExample studromExample=new StudromExample();
		Criteria criteria= studromExample.createCriteria();
		criteria.andDridEqualTo(studrom.getDrid());
		studromMapper.updateByExample(studrom, studromExample);
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map findDromBySome(Studrom studrom, int pageNum) {
		StudromExample studromExample=new StudromExample();
		Criteria criteria= studromExample.createCriteria();
		if(studrom.getDrdromid()!=null){
			criteria.andDrdromidEqualTo(studrom.getDrdromid());}
		criteria.andDrbuildidEqualTo(studrom.getDrbuildid());
		List<Studrom> studromListCount=studromMapper.selectByExample(studromExample);
		PageHelper.startPage(pageNum, 4);
		List<Studrom> studromList=studromMapper.selectByExample(studromExample);
		Map map=new HashMap();
		map.put("count", studromListCount.size());
		map.put("dromList", studromList);
		map.put("maxPage", studromListCount.size()%4==0?studromListCount.size()/4:studromListCount.size()/4+1);
		return map;
	}
}
