package com.pmz.personal.portfolio.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pmz.personal.portfolio.service.InformationPropertiesService;

@Controller
@PropertySource("classpath:information.properties")
public class HomeController {
	
	@Autowired
	private InformationPropertiesService infoPropertiesService;
	
	@ModelAttribute
	public void initInfo(Model model) {
		model.addAttribute("bio", infoPropertiesService.getBiography());	
	}
	
	@RequestMapping(value="/")
	public String getIndex(Model model) {	

		return "home";
	}
}
