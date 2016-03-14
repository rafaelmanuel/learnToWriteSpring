package com.pdk.controller.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdk.data.entity.User;
import com.pdk.rest.core.HomeRepository;
import com.pdk.util.StringUtil;

@Controller
public class HomeController {
	
	private StringUtil util;
	@Autowired HomeRepository homeRepo;
	
	@Autowired
	public HomeController(StringUtil util){
		System.out.println("WTF ALSO IM INSTANTIATE");
		this.util = util;
	}
	
	@RequestMapping("/")
	public String home(Model model){
		util.printme();
		model.addAttribute("name", "rafael");
		User user = new User();
		user.setFirstName("ralen");
		user.setLastName("mandap");
		homeRepo.save(user);
		return "index";
	}
	
	@RequestMapping("/candidate")
	@ResponseBody
	public String another(Model model){
		
		return homeRepo.findByFirstName("ralen").toString();
	}
	
	@RequestMapping("/resume")
	public String resume(Model model){
		return "another";
	}
}
