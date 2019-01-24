package com.hbpu.service;
import java.util.List;
import java.util.Map;

import com.hbpu.po.Stunotic;

public interface StunoticeService {
	public List<Stunotic> selectNotice(int pageNum);
	public int selectNoticeCount();
	@SuppressWarnings("rawtypes")
	public Map  addNotice(Stunotic stunotic);
	public void  delectNotice(Integer[] id);
	public Boolean  updateNotice(Stunotic stunotic);
	@SuppressWarnings("rawtypes")
	public Map  findNoticeBySome(Stunotic stunotic,int pageNum);
	public Stunotic  findNoticeById(int id);
}
