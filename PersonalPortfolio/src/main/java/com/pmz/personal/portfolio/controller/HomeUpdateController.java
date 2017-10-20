package com.pmz.personal.portfolio.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pmz.personal.portfolio.model.forms.HomeForm;
import com.pmz.personal.portfolio.service.UpdateInformationPropertiesService;

@Controller
@RequestMapping(value="/home-update")
public class HomeUpdateController {
	
	static Logger log = Logger.getLogger(HomeUpdateController.class.getName());
	
	@Autowired
	private UpdateInformationPropertiesService updateInformationPropertiesService;

	
	@RequestMapping(method=RequestMethod.GET)
	public String getUpdateForm(Model model) {
		HomeForm homeForm = new HomeForm();
		model.addAttribute("homeForm", homeForm);
		
		return "home-update";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submitUpdateForm(Model model,
			@ModelAttribute("homeForm") @Valid HomeForm homeForm,
			BindingResult binding) {
		
		model.addAttribute("homeForm", homeForm);
		String returnVal = "home";
		if (binding.hasErrors()) {
			log.info("Wrong Fields");
			returnVal = "home-update";
		} else {
			updateInformationPropertiesService.updateProperties(homeForm);
		}
		return returnVal;
	}
	
}
