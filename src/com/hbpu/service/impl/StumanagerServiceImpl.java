package com.hbpu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hbpu.mapper.StumanagerMapper;
import com.hbpu.po.Stumanager;
import com.hbpu.po.StumanagerExample;
import com.hbpu.po.StumanagerExample.Criteria;
import com.hbpu.service.StumanagerService;
@Service
public class StumanagerServiceImpl implements StumanagerService {
	@Autowired
	private StumanagerMapper stumanagerMapper;
	@Override
	public List<Stumanager> loginManager(Stumanager stumanager) {
		StumanagerExample stumanagerExample=new StumanagerExample();
		Criteria criteria= stumanagerExample.createCriteria();
		criteria.andMgnameEqualTo(stumanager.getMgname());
		criteria.andMgpasswordEqualTo(stumanager.getMgpassword());
		List<Stumanager> stumanagerList= stumanagerMapper.selectByExample(stumanagerExample);
		return stumanagerList;
	}
	@Override
	public List<Stumanager> selectManager(int pageNum) {
		PageHelper.startPage(pageNum, 4);
		List<Stumanager> stumanagerList= stumanagerMapper.selectByExample(null);
		return stumanagerList;
	}
	@Override
	public Boolean addManager(Stumanager stumanager) {
		StumanagerExample stumanagerExample=new StumanagerExample();
		Criteria criteria= stumanagerExample.createCriteria();
		criteria.andMgstuidEqualTo(stumanager.getMgstuid());
		if(stumanagerMapper.selectByExample(stumanagerExample).size()>0){
			return false;
		}
		stumanagerMapper.insert(stumanager);
		return true;
	}
	@Override
	public int selectAllManager() {
		return stumanagerMapper.selectByExample(null).size();
	}
	@Override
	public void delectManager(Integer[] id) {
		for (Integer integer : id) {
			stumanagerMapper.deleteByPrimaryKey(integer);
		}
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map findManagerBySome(Stumanager stumanager,int pageNum) {
		StumanagerExample stumanagerExample=new StumanagerExample();
		Criteria criteria= stumanagerExample.createCriteria();
		if(!stumanager.getMgmyname().equals("")&&stumanager.getMgmyname()!=null){
			criteria.andMgmynameEqualTo(stumanager.getMgmyname());}
		if(!stumanager.getMgbuildnum().equals("")&&stumanager.getMgbuildnum()!=null){
			criteria.andMgbuildnumEqualTo(stumanager.getMgbuildnum());}
		if(!stumanager.getMgstuid().equals("")&&stumanager.getMgstuid()!=null){
			criteria.andMgstuidEqualTo(stumanager.getMgstuid());}
		List<Stumanager> stumanagerListCount= stumanagerMapper.selectByExample(stumanagerExample);
		PageHelper.startPage(pageNum, 4);
		List<Stumanager> stumanagerList= stumanagerMapper.selectByExample(stumanagerExample);
		Map map=new HashMap();
		map.put("count", stumanagerListCount.size());
		map.put("managerList", stumanagerList);
		map.put("maxPage", stumanagerListCount.size()%4==0?stumanagerListCount.size()/4:stumanagerListCount.size()/4+1);
		return map;
	}
	@Override
	public Stumanager findManagerById(int id) {
		return stumanagerMapper.selectByPrimaryKey(id);
	}
	@Override
	public Boolean updateManager(Stumanager stumanager) {
		StumanagerExample stumanagerExample=new StumanagerExample();
		Criteria criteria= stumanagerExample.createCriteria();
		criteria.andMgidEqualTo(stumanager.getMgid());
		stumanagerMapper.updateByExample(stumanager, stumanagerExample);
		return null;
	}
}
