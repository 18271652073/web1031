package com.hbpu.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hbpu.mapper.StunoticMapper;
import com.hbpu.po.Stunotic;
import com.hbpu.po.StunoticExample;
import com.hbpu.po.StunoticExample.Criteria;
import com.hbpu.service.StunoticeService;
@Service
public class StunoticeServiceImpl implements StunoticeService{
	@Autowired
	private StunoticMapper stunoticMapper;
	@Override
	public List<Stunotic> selectNotice(int pageNum) {
		PageHelper.startPage(pageNum, 4);
		return stunoticMapper.selectByExample(null);
	}

	@Override
	public int selectNoticeCount() {
		return stunoticMapper.selectByExample(null).size();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Map addNotice(Stunotic stunotic) {
		stunotic.setNdate(new Date());
		stunoticMapper.insert(stunotic);
		return null;
	}

	@Override
	public void delectNotice(Integer[] id) {
		for (Integer integer : id) {
			stunoticMapper.deleteByPrimaryKey(integer);
		}
	}

	@Override
	public Boolean updateNotice(Stunotic stunotic) {
		stunotic.setNdate(new Date());
		StunoticExample stunoticExample=new StunoticExample();
		Criteria criteria= stunoticExample.createCriteria();
		criteria.andNidEqualTo(stunotic.getNid());
		stunoticMapper.updateByExample(stunotic, stunoticExample);
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map findNoticeBySome(Stunotic stunotic, int pageNum) {
		StunoticExample stunoticExample=new StunoticExample();
		Criteria criteria= stunoticExample.createCriteria();
		if(stunotic.getNdate()!=null){
			criteria.andNdateGreaterThanOrEqualTo(stunotic.getNdate());}
		if(stunotic.getNdromnum()!=null&&!stunotic.getNdromnum().equals("")){
			criteria.andNdromnumEqualTo(stunotic.getNdromnum());}
		if(stunotic.getNstate()!=null&&!stunotic.getNstate().equals("")){
			criteria.andNstateEqualTo(stunotic.getNstate());}
		List<Stunotic> stunoticListCount=stunoticMapper.selectByExample(stunoticExample);
		PageHelper.startPage(pageNum, 4);
		List<Stunotic> stunoticList=stunoticMapper.selectByExample(stunoticExample);
		Map map=new HashMap();
		map.put("count", stunoticListCount.size());
		map.put("noticeList", stunoticList);
		map.put("maxPage", stunoticListCount.size()%4==0?stunoticListCount.size()/4:stunoticListCount.size()/4+1);
		return map;
	}

	@Override
	public Stunotic findNoticeById(int id) {
		return stunoticMapper.selectByPrimaryKey(id);
	}

}
