package com.hbpu.service;
import java.util.List;
import java.util.Map;

import com.hbpu.po.Stumy;

public interface StumyService {
	public List<Stumy> selectStumy(int pageNum);
	public int selectStumyCount();
	public List<Stumy>  loginMystu(Stumy stumy);
	@SuppressWarnings("rawtypes")
	public Map  addMystu(Stumy stumy);
	public void  delectMystu(Integer[] id);
	public Boolean  updateMystu(Stumy stumy);
	@SuppressWarnings("rawtypes")
	public Map  findMystuBySome(Stumy stumy,int pageNum);
	public Stumy  findMystuById(int id);
	public int  findMystuAll();
	public int  selectStumySex(String sex);
	public List<Stumy>  findMystuByBuid(String mbuildnum);
}
