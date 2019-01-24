package com.hbpu.service;
import java.util.List;
import java.util.Map;

import com.hbpu.po.Studressing;
public interface StudressingService {
	public List<Studressing> selectDressing(int pageNum);
	public int selectDressingCount();
	@SuppressWarnings("rawtypes")
	public Map addDressing(Studressing studressing);
	public void  delectDressing(Integer[] id);
	public Boolean  updateDressing(Studressing studressing);
	@SuppressWarnings("rawtypes")
	public Map  findDressingBySome(Studressing studressing,int pageNum);
	public Studressing  findDressingById(int id);
}
