package com.hbpu.controller;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hbpu.po.Stumanager;
import com.hbpu.service.StubuildService;
import com.hbpu.service.StumanagerService;
@Controller
@RequestMapping("/ManagerController")
public class ManagerController {
	@Autowired 
	private StumanagerService stumanagerService;
	@Autowired 
	private StubuildService stubuildService;
	@RequestMapping("/findManager.action")
	public String findManager(int pageNum,Model model){
		model.addAttribute("count", stumanagerService.selectAllManager());
		model.addAttribute("managerList", stumanagerService.selectManager(pageNum));
		model.addAttribute("buildList", stubuildService.findBuildAll());
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", stumanagerService.selectAllManager()%4==0?stumanagerService.selectAllManager()/4 : stumanagerService.selectAllManager()/4+1);
		return "manager-list";
	}
	@RequestMapping("/addManagerPage.action")
	public String addManagerPage(Model model,int pageNum){
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("buildList", stubuildService.findBuildAll());
		return "manager-add";
	}
	@RequestMapping("/editManagerPage.action")
	public String editManagerPage(int mgid,int pageNum, Model model){
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("buildList", stubuildService.findBuildAll());
		model.addAttribute("stumanager", stumanagerService.findManagerById(mgid));
		return "manager-edit";
	}
	@RequestMapping("/addManager.action")
	public String addManager(Stumanager stumanager,int pageNum, Model model){
		if(stumanagerService.addManager(stumanager)){
			return this.findManager(pageNum, model);
		}
		model.addAttribute("msg", "0");
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("buildList", stubuildService.findBuildAll());
		return "manager-add";
	}
	@RequestMapping("/delectManager.action")
	public String delectManager(Integer[] data,int pageNum,Model model){
		stumanagerService.delectManager(data);
		return this.findManager(pageNum, model);
	}
	@RequestMapping("updateManager.action")
	public String updateManager(Stumanager stumanager,int pageNum,Model model){
		stumanagerService.updateManager(stumanager);
		return this.findManager(pageNum, model);
	}
	@SuppressWarnings("rawtypes")
	@RequestMapping("/findManagerBySome.action")
	public String findManagerBySome(Stumanager stumanager,int pageNum,Model model,HttpSession session){
		if(session.getAttribute("stumanager")!=""&&stumanager.getMgbuildnum()==null&&stumanager.getMgmyname()==null&&stumanager.getMgstuid()==null){
			stumanager=(Stumanager) session.getAttribute("stumanager");
		}
		session.setAttribute("stumanager", stumanager);
		Map map= stumanagerService.findManagerBySome(stumanager, pageNum);
//		model.addAttribute("stumanager", stumanager);
		model.addAttribute("count", map.get("count"));
		model.addAttribute("managerList",map.get("managerList"));
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", map.get("maxPage"));
		return "managermore-list";
	}
}
