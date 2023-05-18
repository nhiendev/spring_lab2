package com.Spring.lab2.Bai2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping("/param/form")
	public String form() {
		return "bai2/form";
	}
	@RequestMapping("/param/save/{x}")
	public String save(@PathVariable("x")  String x, @RequestParam("y") String y , Model model) {
		model.addAttribute("x", x);
		model.addAttribute("y", y);
		return "bai2/form";
	}
	
}
