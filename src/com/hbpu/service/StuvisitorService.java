package com.hbpu.service;

import java.util.List;
import java.util.Map;

import com.hbpu.po.Stuvisitor;

public interface StuvisitorService {
	public List<Stuvisitor> selectVisitor(int pageNum);
	public int selectVisitorCount();
	@SuppressWarnings("rawtypes")
	public Map  addVisitor(Stuvisitor stuvisitor);
	public void  delectVisitor(Integer[] id);
	@SuppressWarnings("rawtypes")
	public Map  findVisitorBySome(Stuvisitor stuvisitor,int pageNum);
	public Stuvisitor  findVisitorById(int id);
}
