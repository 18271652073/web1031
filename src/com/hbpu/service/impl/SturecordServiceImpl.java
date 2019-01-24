package com.hbpu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.hbpu.mapper.SturecordMapper;
import com.hbpu.po.Sturecord;
import com.hbpu.po.SturecordExample;
import com.hbpu.po.SturecordExample.Criteria;
import com.hbpu.service.SturecordService;
@Service
public class SturecordServiceImpl implements SturecordService {
	@Autowired
	private SturecordMapper sturecordMapper;
	@Override
	public List<Sturecord> selectRecord(int pageNum) {
		PageHelper.startPage(pageNum, 4);
		return sturecordMapper.selectByExample(null);
	}

	@Override
	public int selectRecordCount() {
		return sturecordMapper.selectByExample(null).size();
	}

	@Override
	public void delectRecord(Integer[] id) {
		for (Integer integer : id) {
			sturecordMapper.deleteByPrimaryKey(integer);
		}
	}

	@Override
	public Boolean updateRecord(Sturecord sturecord) {
		SturecordExample sturecordExample=new SturecordExample();
		Criteria criteria= sturecordExample.createCriteria();
		criteria.andRidEqualTo(sturecord.getRid());
		sturecordMapper.updateByExample(sturecord, sturecordExample);
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map findRecordBySome(Sturecord sturecord, int pageNum) {
		SturecordExample sturecordExample=new SturecordExample();
		Criteria criteria= sturecordExample.createCriteria();
		if(sturecord.getRdate()!=null){
			criteria.andRdateGreaterThanOrEqualTo(sturecord.getRdate());}
		if(sturecord.getRdromnum()!=null&&!sturecord.getRdromnum().equals("")){
			criteria.andRdromnumEqualTo(sturecord.getRdromnum());}
		if(sturecord.getRstate()!=null&&!sturecord.getRstate().equals("")){
			criteria.andRstateEqualTo(sturecord.getRstate());
		}		
		List<Sturecord> sturecordListCount=sturecordMapper.selectByExample(sturecordExample);
		PageHelper.startPage(pageNum, 4);
		List<Sturecord> sturecordList=sturecordMapper.selectByExample(sturecordExample);
		Map map=new HashMap();
		map.put("count", sturecordListCount.size());
		map.put("recordList", sturecordList);
		map.put("maxPage", sturecordListCount.size()%4==0?sturecordListCount.size()/4:sturecordListCount.size()/4+1);
		return map;
	}

	@Override
	public Sturecord findRecordById(int id) {
		return sturecordMapper.selectByPrimaryKey(id);
	}

}
