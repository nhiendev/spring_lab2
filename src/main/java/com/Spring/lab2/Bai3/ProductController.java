package com.Spring.lab2.Bai3;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProductController {
	@Autowired
	javax.servlet.http.HttpServletRequest request;
	@GetMapping("/product/form")
	public String form() {
		return "/bai3/form3";
	}
	
	@PostMapping("/product/save")
	public String save(Product sp,Model model) throws IllegalAccessException, InvocationTargetException {
		
//		sp.setName(request.getParameter("name"));
//		sp.setPrice(Double.valueOf(request.getParameter("price")));
		BeanUtils.populate(sp, request.getParameterMap());
		model.addAttribute("sp",sp);
		return "/bai3/form3";
	}
	

}
