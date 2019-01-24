package com.hbpu.service;
import java.util.List;
import java.util.Map;
import com.hbpu.po.Sturecord;
public interface SturecordService {
	public List<Sturecord> selectRecord(int pageNum);
	public int selectRecordCount();
	public void  delectRecord(Integer[] id);
	public Boolean  updateRecord(Sturecord sturecord);
	@SuppressWarnings("rawtypes")
	public Map  findRecordBySome(Sturecord sturecord,int pageNum);
	public Sturecord  findRecordById(int id);
}
