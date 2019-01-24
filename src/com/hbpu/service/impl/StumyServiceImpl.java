package com.hbpu.service.impl;

import java.util.Date;
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
import com.hbpu.po.Studrom;
import com.hbpu.po.StudromExample;
import com.hbpu.po.Stumy;
import com.hbpu.po.StumyExample;
import com.hbpu.po.StumyExample.Criteria;
import com.hbpu.service.StumyService;
@Service
public class StumyServiceImpl implements StumyService {
	@Autowired
	private StumyMapper stumyMapper;
	@Autowired
	private StudromMapper studromMapper;
	@Autowired
	private StubuildMapper stubuildMapper;
	@Override
	public List<Stumy> selectStumy(int pageNum) {
		PageHelper.startPage(pageNum, 4);
		return stumyMapper.selectByExample(null);
	}
	@Override
	public int selectStumyCount() {
		return stumyMapper.selectByExample(null).size();
	}
	@Override
	public List<Stumy> loginMystu(Stumy stumy) {
		StumyExample stumyExample=new StumyExample();
		Criteria criteria= stumyExample.createCriteria();
		criteria.andMnameEqualTo(stumy.getMname());
		criteria.andMpasswordEqualTo(stumy.getMpassword());
		return stumyMapper.selectByExample(stumyExample);
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map addMystu(Stumy stumy) {
		StumyExample stumyExample=new StumyExample();
		Criteria criteria= stumyExample.createCriteria();
		criteria.andMstuidEqualTo(stumy.getMstuid());
		Map map=new HashMap();
		if(stumyMapper.selectByExample(stumyExample).size()>0){
			map.put("msg", "0");//用0代表学号是否存在
			return map;
		}
		StubuildExample stubuildExample=new StubuildExample();
		com.hbpu.po.StubuildExample.Criteria criteria2= stubuildExample.createCriteria();
		criteria2.andBnameEqualTo(stumy.getMbuildnum());
		List<Stubuild> stubuildList=stubuildMapper.selectByExample(stubuildExample);
		if(!stubuildList.get(0).getBtype().equals(stumy.getMsex())){
			map.put("msg", "1");//用1代表类型是否错误
			return map;
		}
		StudromExample studromExample=new StudromExample();
		com.hbpu.po.StudromExample.Criteria criteria3= studromExample.createCriteria();
		criteria3.andDrbuildidEqualTo(stumy.getMbuildnum());
		criteria3.andDrdromidEqualTo(stumy.getMdrom());
		List<Studrom> studromList= studromMapper.selectByExample(studromExample);
		if(studromList.size()>0){
			if(studromList.get(0).getDrnum()==studromList.get(0).getDrcount()){
				map.put("msg", "2");//用2代表宿舍是否已满
				return map;
			}else{
				Studrom studrom=studromList.get(0);
				StudromExample studromExample1=new StudromExample();
				com.hbpu.po.StudromExample.Criteria criteria4= studromExample1.createCriteria();
				criteria4.andDridEqualTo(studrom.getDrid());
				studrom.setDrcount(studrom.getDrcount()+1);
				stumy.setMdate(new Date());
				stumyMapper.insert(stumy);//先增加个人信息 ,然后再在宿舍信息将寝室现住人数加一
				studromMapper.updateByExample(studrom, studromExample1);//寝室信息人数加一
			}
		}else{
			map.put("msg", "3");//用3代表该宿舍是否建立
			return map;
		}
		return map;
	}
	@Override
	public void delectMystu(Integer[] id) {
		for (Integer integer : id) {
			stumyMapper.deleteByPrimaryKey(integer);
		}
	}
	@Override
	public Boolean updateMystu(Stumy stumy) {
		StumyExample stumyExample=new StumyExample();
		Criteria criteria= stumyExample.createCriteria();
		criteria.andMidEqualTo(stumy.getMid());
		stumy.setMdate(new Date());
		stumyMapper.updateByExample(stumy, stumyExample);
		return null;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map findMystuBySome(Stumy stumy, int pageNum) {
		StumyExample stumyExample=new StumyExample();
		Criteria criteria= stumyExample.createCriteria();
		if(!stumy.getMdrom().equals("")&&stumy.getMdrom()!=null){
			criteria.andMdromEqualTo(stumy.getMdrom());
		}
		if(!stumy.getMstuid().equals("")&&stumy.getMstuid()!=null){
			criteria.andMstuidEqualTo(stumy.getMstuid());
		}
		if(!stumy.getMname().equals("")&&stumy.getMname()!=null){
			criteria.andMnameEqualTo(stumy.getMname());
		}
		List<Stumy> stumieListCount=stumyMapper.selectByExample(stumyExample);
		PageHelper.startPage(pageNum, 4);
		List<Stumy> stumyList=stumyMapper.selectByExample(stumyExample);
		Map map=new HashMap();
		map.put("count", stumieListCount.size());
		map.put("stumyList", stumyList);
		map.put("maxPage", stumieListCount.size()%4==0?stumieListCount.size()/4:stumieListCount.size()/4+1);
		return map;
	}
	@Override
	public Stumy findMystuById(int id) {
		return stumyMapper.selectByPrimaryKey(id);
	}
	@Override
	public List<Stumy> findMystuByBuid(String mbuildnum) {
		StumyExample stumyExample=new StumyExample();
		Criteria criteria= stumyExample.createCriteria();
		criteria.andMbuildnumEqualTo(mbuildnum);
		return stumyMapper.selectByExample(stumyExample);
	}
	@Override
	public int findMystuAll() {
		return stumyMapper.selectByExample(null).size();
	}
	@Override
	public int selectStumySex(String sex) {
		StumyExample stumyExample=new StumyExample();
		Criteria criteria= stumyExample.createCriteria();
		criteria.andMsexEqualTo(sex);
		return stumyMapper.selectByExample(stumyExample).size();
	}

}
