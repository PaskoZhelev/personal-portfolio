package com.pmz.personal.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pmz.personal.portfolio.model.forms.HomeForm;

@Controller
@RequestMapping(value="/home-update")
public class HomeUpdateController {
	
	@Autowired
	private Validator homeValidator;

	@InitBinder("homeForm")
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(homeValidator);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String getUpdateForm(Model model) {
		HomeForm homeForm = new HomeForm();
		model.addAttribute("homeForm", homeForm);
		
		return "home-update";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submitUpdateForm(Model model,
			@ModelAttribute("homeForm") @Validated HomeForm homeForm,
			BindingResult binding) {
		
		model.addAttribute("homeForm", homeForm);
		String returnVal = "home";
		if (binding.hasErrors()) {
			returnVal = "home_update";
		} else {
			model.addAttribute("homeSess", homeForm);
		}
		return returnVal;
	}
	
}
