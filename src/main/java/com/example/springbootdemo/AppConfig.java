package com.example.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AppConfig {

	@GetMapping("/homepage")
	public ModelAndView startPage()
	{
		return new ModelAndView("ReqData");
	}
	
	@PostMapping("/details")
	public ModelAndView nextPage(@RequestParam("cname")String name,ModelMap map)
	{
		map.put("cname",name);
		System.out.println(name);
		return new ModelAndView("Home");
	}
	
	
}
