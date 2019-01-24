package com.hbpu.controller;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hbpu.po.Stuvisitor;
import com.hbpu.service.StuvisitorService;

@Controller
@RequestMapping("/VisitorController")
public class VisitorController {
	@Autowired
	private StuvisitorService stuvisitorService;
	@RequestMapping("/findVisitor.action")
	public String findVisitor(Model model,int pageNum){
		model.addAttribute("visitorList", stuvisitorService.selectVisitor(pageNum));
		model.addAttribute("count", stuvisitorService.selectVisitorCount());
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", stuvisitorService.selectVisitorCount()%4==0?stuvisitorService.selectVisitorCount()/4 : stuvisitorService.selectVisitorCount()/4+1);
		return "visitor-list";
	}
	@RequestMapping("/addVisitorPage.action")
	public String addVisitorPage(Model model,int pageNum){
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("visitorList", stuvisitorService.selectVisitor(pageNum));
		return "visitor-add";
	}
	@RequestMapping("/addVisitor.action")
	public String addVisitor(Stuvisitor stuvisitor,int pageNum, Model model){
		stuvisitorService.addVisitor(stuvisitor);
		return this.findVisitor(model, pageNum);
	}
	@RequestMapping("/delectVisitor.action")
	public String delectVisitor(Integer[] data,int pageNum,Model model){
		stuvisitorService.delectVisitor(data);
		return this.findVisitor(model, pageNum);
	}
	@SuppressWarnings("rawtypes")
	@RequestMapping("/findVisitorBySome.action")
	public String findVisitorBySome(Stuvisitor stuvisitor,int pageNum,Model model,HttpSession session){
		if(session.getAttribute("stuvisitor")!=""&&stuvisitor.getVcdate()==null&&stuvisitor.getVldate()==null){
			stuvisitor=(Stuvisitor) session.getAttribute("stuvisitor");
		}
		session.setAttribute("stuvisitor", stuvisitor);
		Map map= stuvisitorService.findVisitorBySome(stuvisitor, pageNum);
		model.addAttribute("count", map.get("count"));
		model.addAttribute("visitorList",map.get("visitorList"));
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", map.get("maxPage"));
		return "visitormore-list";
	}
}
