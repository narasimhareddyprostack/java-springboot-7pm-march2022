package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mvc.model.CustomerBean;

@Controller
public class CRMController {

	@GetMapping("/index")
	public String getIndexPage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String getRegistrationPage(Model model) {
		CustomerBean customerBean = new CustomerBean();
		model.addAttribute("custBean", customerBean);
		return "registration";
	}
	
	@PostMapping("/save")
	public String registerCustomer(@ModelAttribute("custBean") CustomerBean customerBean) {
		System.out.print(customerBean.getFirstName());
		return "success";
	}
}
