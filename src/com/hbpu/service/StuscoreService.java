package com.hbpu.service;
import java.util.List;
import java.util.Map;

import com.hbpu.po.Stuscore;

public interface StuscoreService {
	public List<Stuscore> selectScore(int pageNum);
	public int selectScoreCount();
	@SuppressWarnings("rawtypes")
	public Map  addScore(Stuscore stuscore);
	public void  delectScore(Integer[] id);
	public Boolean  updateScore(Stuscore stuscore);
	@SuppressWarnings("rawtypes")
	public Map  findScoreBySome(Stuscore stuscore,int pageNum);
	public Stuscore  findScoreById(int id);
}
