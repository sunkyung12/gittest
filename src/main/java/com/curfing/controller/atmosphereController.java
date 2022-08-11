package com.curfing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curfing.domain.atmosphereVO;
import com.curfing.service.atmosphereService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/curfing/*")
@AllArgsConstructor
public class atmosphereController extends atmosphereVO{

	private  final atmosphereService service;
	
	@GetMapping("/atmosphere") //페이지 열기  연결 인기
	public String get(Model model) {
		
		log.info("list");
		model.addAttribute("List", service.atmosphereList()); 
		
		return "atmosphere";
	}
}
