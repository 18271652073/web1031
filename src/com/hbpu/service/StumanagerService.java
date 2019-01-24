package com.hbpu.service;

import java.util.List;
import java.util.Map;

import com.hbpu.po.Stumanager;

public interface StumanagerService {
	public List<Stumanager>  loginManager(Stumanager stumanager);
	public List<Stumanager>  selectManager(int pageNum);
	public int  selectAllManager();
	public Boolean  addManager(Stumanager stumanager);
	public void  delectManager(Integer[] id);
	public Boolean  updateManager(Stumanager stumanager);
	@SuppressWarnings("rawtypes")
	public Map  findManagerBySome(Stumanager stumanager,int pageNum);
	public Stumanager  findManagerById(int id);
}
