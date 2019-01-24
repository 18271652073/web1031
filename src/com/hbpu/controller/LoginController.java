package com.hbpu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hbpu.po.Admin;
import com.hbpu.po.Stumanager;
import com.hbpu.service.AdminService;
import com.hbpu.service.StumanagerService;
import com.hbpu.service.StumyService;

@Controller
@RequestMapping("/LoginController")
public class LoginController {
	@Autowired
	private StumanagerService stumanagerService;
	@Autowired 
	public StumyService stumyService;
	@Autowired
	private AdminService adminService;
	//入口              http://localhost:80/web1031/LoginController/jump.action
	//入口              http://localhost:80/web1031/LoginController/admin.action
	@RequestMapping("/jump.action")
	public String jumpPage(){
		return "login";
	}
	@RequestMapping("/admin.action")
	public String adminPage(){
		return "loginadmin";
	}
	@RequestMapping("/main.action")
	public String mainPage(HttpSession session,Model model){
		if(session.getAttribute("user")==null){
			model.addAttribute("msg", "0");
			return "login";
		}
		return "main";
	}
	@RequestMapping("/mainadmin.action")
	public String mainadminPage(HttpSession session,Model model){
		if(session.getAttribute("user")==null){
			model.addAttribute("msg", "0");
			return "loginadmin";
		}
		return "mainadmin";
	}
	@RequestMapping("/loginProving.action")
	public String loginProving(Stumanager stumanager,Model model,HttpSession session){
		List<Stumanager> stumanagerList= stumanagerService.loginManager(stumanager);
		if (stumanagerList.size()==0) {
			model.addAttribute("msg", "10");
			return "login";
		}
		session.setAttribute("user", stumanagerList.get(0));
		return "main";
	}
	@RequestMapping("/adminProving.action")
	public String adminProving(Admin admin,Model model,HttpSession session){
		List<Admin>  adminList= adminService.loginAdmin(admin);
		if (adminList.size()==0) {
			model.addAttribute("msg", "10");
			return "loginadmin";
		}
		session.setAttribute("user", adminList.get(0));
		return "mainadmin";
	}
	@RequestMapping("/adminUpdatePage.action")
	public String adminUpdatePage(){
		return "adminupdate";
	}
	@RequestMapping("/managerUpdatePage.action")
	public String managerUpdatePage(){
		return "managerupdate";
	}
	@RequestMapping("/lineTurn.action")
	public String lineTurn(Model model){
		model.addAttribute("build1", stumyService.findMystuByBuid("1").size());
		model.addAttribute("build2", stumyService.findMystuByBuid("2").size());
		model.addAttribute("build3", stumyService.findMystuByBuid("3").size());
		model.addAttribute("build4", stumyService.findMystuByBuid("4").size());
		model.addAttribute("all", stumyService.findMystuAll());
		return "line";
	}
}
