package com.hbpu.service;

import java.util.List;
import java.util.Map;

import com.hbpu.po.Studrom;
public interface StudromService {
	public List<Studrom> findDrom(String drbuildid, int pageNum);
	public Studrom findDromById(int id);
	public int findDromByBlidCount(String drbuildid);
	@SuppressWarnings("rawtypes")
	public Map addDrom(Studrom studrom);
	public Boolean updateDrom(Studrom studrom);
	@SuppressWarnings("rawtypes")
	public Map findDromBySome(Studrom studrom,int pageNum);
	public void delectDrom(Integer[] id);
}
