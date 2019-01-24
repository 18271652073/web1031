package com.hbpu.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hbpu.po.Studressing;
import com.hbpu.service.StudressingService;

@Controller
@RequestMapping("/DressingController")
public class DressingController {
	@Autowired
	private StudressingService studressingService;
	@RequestMapping("/findDressing.action")
	public String findDressing(Model model,int pageNum){
		model.addAttribute("dressingList", studressingService.selectDressing(pageNum));
		model.addAttribute("count", studressingService.selectDressingCount());
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", studressingService.selectDressingCount()%4==0?studressingService.selectDressingCount()/4 : studressingService.selectDressingCount()/4+1);
		return "dressing-list";
	}
	@RequestMapping("/addDressingPage.action")
	public String addDressingPage(Model model,int pageNum){
		model.addAttribute("pageNum", pageNum);
		return "dressing-add";
	}
	@RequestMapping("/addDressing.action")
	public String addDressing(Studressing studressing,int pageNum, Model model){
		studressingService.addDressing(studressing);
		return this.findDressing(model, pageNum);
	}
	@RequestMapping("/delectDressing.action")
	public String delectDressing(Integer[] data,int pageNum,Model model){
		studressingService.delectDressing(data);
		return this.findDressing(model, pageNum);
	}
//	@RequestMapping("updateDressing.action")
//	public String updateDressing(Studressing studressing,int pageNum,Model model){
//		studressingService.updateDressing(studressing);
//		return this.findDressing(model, pageNum);
//	}
	@SuppressWarnings("rawtypes")
	@RequestMapping("/findDressingBySome.action")
	public String findDressingBySome(Studressing studressing,int pageNum,Model model,HttpSession session){
		if(session.getAttribute("studressing")!=""&&studressing.getDcollege()==null
				&&studressing.getDmajor()==null&&studressing.getDdromnum()==null
				&&studressing.getDname()==null&&studressing.getDstuid()==null){
			studressing=(Studressing) session.getAttribute("studressing");
		}
		session.setAttribute("studressing", studressing);
		Map map= studressingService.findDressingBySome(studressing, pageNum);
		model.addAttribute("count", map.get("count"));
		model.addAttribute("dressingList",map.get("dressingList"));
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", map.get("maxPage"));
		return "dressingmore-list";
	}
}
