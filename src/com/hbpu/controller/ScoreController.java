package com.hbpu.controller;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hbpu.po.Stuscore;
import com.hbpu.service.StuscoreService;
@Controller
@RequestMapping("/ScoreController")
public class ScoreController {
	@Autowired
	private StuscoreService stuscoreService;
	@RequestMapping("/findScore.action")
	public String findScore(Model model,int pageNum){
		model.addAttribute("scoreList", stuscoreService.selectScore(pageNum));
		model.addAttribute("count", stuscoreService.selectScoreCount());
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", stuscoreService.selectScoreCount()%4==0?stuscoreService.selectScoreCount()/4 : stuscoreService.selectScoreCount()/4+1);
		return "score-list";
	}
	@RequestMapping("/addScorePage.action")
	public String addScorePage(Model model,int pageNum){
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("scoreList", stuscoreService.selectScore(pageNum));
		return "score-add";
	}
	@RequestMapping("/editScorePage.action")
	public String editScorePage(int sid,int pageNum, Model model){
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("score", stuscoreService.findScoreById(sid));
		return "score-edit";
	}
	@RequestMapping("/addScore.action")
	public String addMystu(Stuscore stuscore,int pageNum, Model model){
		stuscoreService.addScore(stuscore);
		return this.findScore(model, pageNum);
	}
	@RequestMapping("/delectScore.action")
	public String delectScore(Integer[] data,int pageNum,Model model){
		stuscoreService.delectScore(data);
		return this.findScore(model, pageNum);
	}
	@RequestMapping("/updateScore.action")
	public String updateScore(Stuscore stuscore,int pageNum,Model model){
		stuscoreService.updateScore(stuscore);
		return this.findScore(model, pageNum);
	}
	@SuppressWarnings("rawtypes")
	@RequestMapping("/findScoreBySome.action")
	public String findScoreBySome(Stuscore stuscore,int pageNum,Model model,HttpSession session){
		if(session.getAttribute("stuscore")!=""&&stuscore.getSdromnum()==null&&stuscore.getSgrade()==null){
			stuscore=(Stuscore) session.getAttribute("stuscore");
		}
		session.setAttribute("stuscore", stuscore);
		Map map= stuscoreService.findScoreBySome(stuscore, pageNum);
		model.addAttribute("count", map.get("count"));
		model.addAttribute("stuscoreList",map.get("stuscoreList"));
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", map.get("maxPage"));
		return "scoremore-list";
	}
}
