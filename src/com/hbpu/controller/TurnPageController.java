package com.hbpu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hbpu.service.StumyService;

@Controller
@RequestMapping("/TurnPageController")
public class TurnPageController{
	@Autowired
	private  StumyService stumyService;
	@RequestMapping("/lineTurn")
	public String lineTurn(Model model){
			model.addAttribute("build1", stumyService.findMystuByBuid("1").size());
			model.addAttribute("build2", stumyService.findMystuByBuid("2").size());
			model.addAttribute("build3", stumyService.findMystuByBuid("3").size());
			model.addAttribute("build4", stumyService.findMystuByBuid("4").size());
			model.addAttribute("all", stumyService.findMystuAll());
			return "line";
	}
	@RequestMapping("/histogramTurn")
	public String histogramTurn(Model model){
		model.addAttribute("mysex", stumyService.selectStumySex("男"));
		model.addAttribute("all", stumyService.findMystuAll());
		return "histogram";
	}
}
