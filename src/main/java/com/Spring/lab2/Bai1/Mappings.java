package com.Spring.lab2.Bai1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ctrl")
public class Mappings {
	@RequestMapping()
	public String ok() {
		
		return "/bai1/ok";
	}
	@RequestMapping("/ok")
	public String m1(Model model) {
		model.addAttribute("method", "m1");
		return "/bai1/ok";
	}
	@RequestMapping(value = "/ok",method = RequestMethod.GET)
	public String m2(Model model) {
		model.addAttribute("method", "m2");
		return "/bai1/ok";
	}
	@RequestMapping(value = "/ok",params="x")
	public String m3(Model model) {
		model.addAttribute("method", "m3");
		return "/bai1/ok";
	}

}
