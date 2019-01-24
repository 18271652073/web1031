package com.hbpu.controller;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hbpu.po.Stunotic;
import com.hbpu.service.StunoticeService;
@Controller
@RequestMapping("/NoticeController")
public class NoticeController {
	@Autowired
	private StunoticeService stunoticeService;
	@RequestMapping("/findNotice.action")
	public String findNotice(Model model,int pageNum){
		model.addAttribute("noticeList", stunoticeService.selectNotice(pageNum));
		model.addAttribute("count", stunoticeService.selectNoticeCount());
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", stunoticeService.selectNoticeCount()%4==0?stunoticeService.selectNoticeCount()/4 : stunoticeService.selectNoticeCount()/4+1);
		return "notice-list";
	}
	@RequestMapping("/addNoticePage.action")
	public String addNoticePage(Model model,int pageNum){
		model.addAttribute("pageNum", pageNum);
		return "notice-add";
	}
	@RequestMapping("/editNoticePage.action")
	public String editNoticePage(int nid,int pageNum, Model model){
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("notice", stunoticeService.findNoticeById(nid));
		return "notice-edit";
	}
	@RequestMapping("/addNotice.action")
	public String addNotice(Stunotic stunotic,int pageNum, Model model){
		stunoticeService.addNotice(stunotic);
		return this.findNotice(model, pageNum);
	}
	@RequestMapping("/delectNotice.action")
	public String delectNotice(Integer[] data,int pageNum,Model model){
		stunoticeService.delectNotice(data);
		return this.findNotice(model, pageNum);
	}
	@RequestMapping("updateNotice.action")
	public String updateNoticer(Stunotic stunotic,int pageNum,Model model){
		stunoticeService.updateNotice(stunotic);
		return this.findNotice(model, pageNum);
	}
	@SuppressWarnings("rawtypes")
	@RequestMapping("/findNoticeBySome.action")
	public String findNoticeBySome(Stunotic stunotic,int pageNum,Model model,HttpSession session){
		if(session.getAttribute("stunotic")!=""&&stunotic.getNdate()==null&&stunotic.getNdromnum()==null&&stunotic.getNstate()==null){
			stunotic=(Stunotic) session.getAttribute("stunotic");
		}
		session.setAttribute("stunotic", stunotic);
		Map map= stunoticeService.findNoticeBySome(stunotic, pageNum);
		model.addAttribute("count", map.get("count"));
		model.addAttribute("noticeList",map.get("noticeList"));
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", map.get("maxPage"));
		return "noticemore-list";
	}
}
