package com.hbpu.service;
import java.util.List;
import java.util.Map;

import com.hbpu.po.Stubuild;

public interface StubuildService {
	public List<Stubuild> findBuildAll();
	public int findBuildCount();
	public List<Stubuild> findBuild(int pageNum);
	public void  delectBuild(Integer[] id);
	@SuppressWarnings("rawtypes")
	public Map  addBuild(Stubuild stubuild);
	public Boolean  updateBuild(Stubuild stubuild);
	@SuppressWarnings("rawtypes")
	public Map  findBuildBySome(Stubuild stubuild,int pageNum);
	public Stubuild  findBuildById(int id);
}
