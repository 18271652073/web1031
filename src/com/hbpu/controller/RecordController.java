package com.hbpu.controller;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hbpu.po.Sturecord;
import com.hbpu.service.SturecordService;
@Controller
@RequestMapping("/RecordController")
public class RecordController {
	@Autowired
	private SturecordService sturecordService;
	@RequestMapping("/findRecord.action")
	public String findRecord(Model model,int pageNum){
		model.addAttribute("recordList", sturecordService.selectRecord(pageNum));
		model.addAttribute("count", sturecordService.selectRecordCount());
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", sturecordService.selectRecordCount()%4==0?sturecordService.selectRecordCount()/4 : sturecordService.selectRecordCount()/4+1);
		return "record-list";
	}
	@RequestMapping("/editRecordPage.action")
	public String editRecordPage(int rid,int pageNum, Model model){
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("record", sturecordService.findRecordById(rid));
		return "record-edit";
	}
	@RequestMapping("/delectRecord.action")
	public String delectRecord(Integer[] data,int pageNum,Model model){
		sturecordService.delectRecord(data);
		return this.findRecord(model, pageNum);
	}
	@RequestMapping("updateRecord.action")
	public String updateRecord(Sturecord sturecord,int pageNum,Model model){
		sturecordService.updateRecord(sturecord);
		return this.findRecord(model, pageNum);
	}
	@SuppressWarnings("rawtypes")
	@RequestMapping("/findRecordBySome.action")
	public String findRecordBySome(Sturecord sturecord,int pageNum,Model model,HttpSession session){
		if(session.getAttribute("sturecord")!=""&&sturecord.getRstate()==null&&sturecord.getRdromnum()==null&&sturecord.getRdate()==null){
			sturecord=(Sturecord) session.getAttribute("sturecord");
		}
		session.setAttribute("sturecord", sturecord);
		Map map= sturecordService.findRecordBySome(sturecord, pageNum);
		model.addAttribute("count", map.get("count"));
		model.addAttribute("recordList",map.get("recordList"));
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", map.get("maxPage"));
		return "recordmore-list";
	}
}
