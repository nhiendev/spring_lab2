package com.Spring.lab2.Bai4;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Spring.lab2.Bai3.Product;

@Controller
@RequestMapping("/product")
public class product_4 {
	@Autowired
	javax.servlet.http.HttpServletRequest request;
	
	List<Product> sp = new ArrayList<Product>();
	@GetMapping("/form4")
	public String form( Model model) {
		Product p = new Product();
		p.setName("iPhone 30");
		p.setPrice(5000.0);
		sp.add(p);
		model.addAttribute("sp", sp);
		return "bai4/form4";
		}
	@GetMapping("/new")
	public String formNew(Model model) {
		model.addAttribute("sp", sp);
		return "bai4/form4_AddNew";
		}
	
	@GetMapping("/save4")
	public String save(Product p, Model model) throws IllegalAccessException, InvocationTargetException {
		BeanUtils.populate(p, request.getParameterMap());
		sp.add(p);
		return "redirect:/product/new";
	}
	
	@ModelAttribute("listSP")
	public List<Product> getItems() {
		return Arrays.asList(new Product("Chuot Gaming", 1.0), new Product("Tai Nghe", 12.0));
		}


}
