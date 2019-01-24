package com.hbpu.controller;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hbpu.po.Stubuild;
import com.hbpu.po.Studrom;
import com.hbpu.service.StubuildService;
import com.hbpu.service.StudromService;
@Controller
@RequestMapping("/BuildController")
public class BuildController {
	@Autowired
	private StubuildService stubuildService;
	@Autowired
	private StudromService studromService;
	@RequestMapping("findBuild.action")
	public String findBuild(int pageNum,Model model){
		model.addAttribute("buildList", stubuildService.findBuild(pageNum));
		model.addAttribute("buildAllList", stubuildService.findBuildAll());
		model.addAttribute("count", stubuildService.findBuildCount());
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", stubuildService.findBuildCount()%4==0?stubuildService.findBuildCount()/4 : stubuildService.findBuildCount()/4+1);
		return "build-list";
	}
	@RequestMapping("/addBuildPage.action")
	public String addBuildPage(Model model,int pageNum){
		model.addAttribute("pageNum", pageNum);
		return "build-add";
	}
	@RequestMapping("/editBuildPage.action")
	public String editManagerPage(int bid,int pageNum, Model model){
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("build", stubuildService.findBuildById(bid));
		return "build-edit";
	}
	@SuppressWarnings({ "rawtypes" })
	@RequestMapping("/addBuild.action")
	public String addBuild(Stubuild stubuild,int pageNum, Model model){
		Map map=stubuildService.addBuild(stubuild);
		if(map.size()!=0){
			model.addAttribute("msg","0");
			model.addAttribute("pageNum",pageNum);//必须回传多次点击添加,失败情况下得不到pageNUM
			return "build-add";
		}
		return this.findBuild(pageNum, model);
	}
	@RequestMapping("/delectBuild.action")
	public String delectBuild(Integer[] data,int pageNum,Model model){
		stubuildService.delectBuild(data);
		return this.findBuild(pageNum, model);
	}
	@SuppressWarnings("rawtypes")
	@RequestMapping("/findBuildBySome.action")
	public String findBuildBySome(Stubuild stubuild,int pageNum,Model model,HttpSession session){
		if(session.getAttribute("stubuild")!=""&&stubuild.getBid()==null){
			stubuild=(Stubuild) session.getAttribute("stubuild");
		}
		session.setAttribute("stubuild", stubuild);
		Map map= stubuildService.findBuildBySome(stubuild, pageNum);
		model.addAttribute("count", map.get("count"));
		model.addAttribute("buildList",map.get("buildList"));
		model.addAttribute("buildAllList", stubuildService.findBuildAll());
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", map.get("maxPage"));
		return "buildmore-list";
	}
	@RequestMapping("/updateBuild.action")
	public String updateBuild(Stubuild stubuild,int pageNum, Model model){
		stubuildService.updateBuild(stubuild);
		return this.findBuild(pageNum, model);
	}
	@RequestMapping("/showDromPage.action")
	public String showDromPage(String drbuildid,int pageNum, Model model){
//		if(studromService.findDrom(drbuildid,pageNum).size()==0){
//			model.addAttribute("dromList", studromService.findDrom(drbuildid, pageNum-1));
//			model.addAttribute("drbuildid", drbuildid);//需要一直带着宿舍所属楼栋的id，当所有宿舍为空时从dromlist内取不到了，添加需要通过drbuildid这个参数是build的name转换的
//			model.addAttribute("pageNum", pageNum-1);
//		}else {
			model.addAttribute("dromList", studromService.findDrom(drbuildid, pageNum));
			model.addAttribute("drbuildid", drbuildid);
			model.addAttribute("pageNum", pageNum);
//		}
		model.addAttribute("count", studromService.findDromByBlidCount(drbuildid));
		model.addAttribute("maxPage", studromService.findDromByBlidCount(drbuildid)%4==0?studromService.findDromByBlidCount(drbuildid)/4 : studromService.findDromByBlidCount(drbuildid)/4+1);
		return "drom-show";
	}
	@RequestMapping("/addDromPage.action")
	public String addDromPage(String drbuildid,int pageNum, Model model){
		model.addAttribute("drbuildid", drbuildid);
		model.addAttribute("pageNum", pageNum);
		return "drom-add";
	}
	@SuppressWarnings("rawtypes")
	@RequestMapping("/addDrom.action")
	public String addDrom(Studrom studrom,int pageNum,Model model){
		Map map= studromService.addDrom(studrom);
		if(map.size()!=0){
			model.addAttribute("msg","0");
			model.addAttribute("pageNum",pageNum);//必须回传多次点击添加,失败情况下得不到pageNUM
			return "drom-add";
		}
		return this.showDromPage(studrom.getDrbuildid(), pageNum, model);
	}
	@RequestMapping("/delectDrom.action")
	public String delectDrom(Integer[] data,int pageNum,String drbuildid,Model model){
		studromService.delectDrom(data);
		return this.showDromPage(drbuildid,pageNum, model);
	}
	@RequestMapping("/editDromPage.action")
	public String editDromPage(int drid,int pageNum, Model model){
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("drom", studromService.findDromById(drid));
		return "drom-edit";
	}
	@RequestMapping("/updateDrom.action")
	public String updateDrom(Studrom studrom,int pageNum, Model model){
		studromService.updateDrom(studrom);
		return this.showDromPage(studrom.getDrbuildid(), pageNum, model);
	}
	@SuppressWarnings("rawtypes")
	@RequestMapping("/findDromBySome.action")
	public String findDromBySome(Studrom studrom,int pageNum,Model model,HttpSession session){
		if(session.getAttribute("studrom")!=""&&studrom.getDrdromid()==null&&studrom.getDrbuildid()==null){
			studrom=(Studrom) session.getAttribute("studrom");
		}
		session.setAttribute("studrom", studrom);
		Map map= studromService.findDromBySome(studrom, pageNum);
		model.addAttribute("count", map.get("count"));
		model.addAttribute("dromList",map.get("dromList"));
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", map.get("maxPage"));
		return "drommore-list";
	}
	
}
