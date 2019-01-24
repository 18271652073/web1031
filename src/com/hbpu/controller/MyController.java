package com.hbpu.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.hbpu.po.Stumy;
import com.hbpu.service.StubuildService;
import com.hbpu.service.StumyService;

@Controller
@RequestMapping("/MyController")
public class MyController {
	@Autowired
	private StumyService stumyService;
	@Autowired
	private StubuildService stubuildService;
	@RequestMapping("findMystu.action")
	public String findMystu(int pageNum,Model model){
		model.addAttribute("stumyList", stumyService.selectStumy(pageNum));
		model.addAttribute("count", stumyService.selectStumyCount());
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", stumyService.selectStumyCount()%4==0?stumyService.selectStumyCount()/4 : stumyService.selectStumyCount()/4+1);
		return "stumy-list";
	}
	@RequestMapping("/addMystuPage.action")
	public String addMystuPage(Model model,int pageNum){
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("stumyList", stumyService.selectStumy(pageNum));
		model.addAttribute("buildList", stubuildService.findBuildAll());
		return "stumy-add";
	}
	@RequestMapping("/editMystuPage.action")
	public String editManagerPage(int mid,int pageNum, Model model){
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("stumy", stumyService.findMystuById(mid));
		model.addAttribute("buildList", stubuildService.findBuildAll());
		return "stumy-edit";
	}
	@SuppressWarnings("deprecation")
	@RequestMapping("/showMystuPage.action")
	public String showMystuPage(int mid, Model model){
		Stumy  stumy = stumyService.findMystuById(mid);
		int age = new Date().getYear() - stumy.getMage().getYear() ;
		model.addAttribute("stumy", stumy);
		model.addAttribute("age", age);
		return "stumy-show";
	}
	@SuppressWarnings("rawtypes")
	@RequestMapping("/addMystu.action")
	public String addMystu(Stumy stumy,int pageNum,MultipartFile pictureFile, Model model) throws IllegalStateException, IOException{
		String picturename =  pictureFile.getOriginalFilename();
			if(!picturename.equals("")&&picturename!=null){	
				String newFileName =System.currentTimeMillis() +picturename.substring(picturename.lastIndexOf("."));
				File uploadPic = new java.io.File("E:/develop/upload/temp/"+newFileName);
				if(!uploadPic.exists()){
					uploadPic.mkdirs();
				}
				pictureFile.transferTo(uploadPic);
				stumy.setMpicture("/pic/"+newFileName);
				Map map= stumyService.addMystu(stumy);
				if(map.size()!=0){
					model.addAttribute("map", map);
					model.addAttribute("pageNum", pageNum);
					model.addAttribute("buildList", stubuildService.findBuildAll());
					return "stumy-add";
				}
				return this.findMystu(pageNum, model);
			}
		stumy.setMpicture("/pic/1.png");
		Map map= stumyService.addMystu(stumy);
		if(map.size()!=0){
			model.addAttribute("map", map);
			model.addAttribute("pageNum", pageNum);
			model.addAttribute("buildList", stubuildService.findBuildAll());
			return "stumy-add";
		}
		return this.findMystu(pageNum, model);
	}
	@RequestMapping("/delectMystu.action")
	public String delectMystu(Integer[] data,int pageNum,Model model){
		stumyService.delectMystu(data);
		return this.findMystu(pageNum, model);
	}
	@RequestMapping("/updateMystu.action")
	public String updateMystu(Stumy stumy,int pageNum,MultipartFile pictureFile,Model model) throws IllegalStateException, IOException{
		String picturename =  pictureFile.getOriginalFilename();
			if(!picturename.equals("")&&picturename!=null){	
				String newFileName =System.currentTimeMillis() +picturename.substring(picturename.lastIndexOf("."));
				File uploadPic = new java.io.File("E:/develop/upload/temp/"+newFileName);
				if(!uploadPic.exists()){
					uploadPic.mkdirs();
				}
				pictureFile.transferTo(uploadPic);
				stumy.setMpicture("/pic/"+newFileName);
				stumyService.updateMystu(stumy);
				return this.findMystu(pageNum, model);
			}
		stumyService.updateMystu(stumy);
		return this.findMystu(pageNum, model);
	}
	@SuppressWarnings("rawtypes")
	@RequestMapping("/findMystuBySome.action")
	public String findMystuBySome(Stumy stumy,int pageNum,Model model,HttpSession session){
		if(session.getAttribute("stumanager")!=""&&stumy.getMstuid()==null&&stumy.getMname()==null&&stumy.getMdrom()==null){
			stumy=(Stumy) session.getAttribute("stumy");
		}
		session.setAttribute("stumy", stumy);
		Map map= stumyService.findMystuBySome(stumy, pageNum);
		model.addAttribute("count", map.get("count"));
		model.addAttribute("stumyList",map.get("stumyList"));
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", map.get("maxPage"));
		return "stumymore-list";
	}
	@RequestMapping("/showMy.action")
	public String showMy(int mstuid,Model model){
		model.addAttribute("stumy", stumyService.findMystuById(mstuid));
		return "stumy-show";
	}
}
