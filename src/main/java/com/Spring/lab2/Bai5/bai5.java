package com.Spring.lab2.Bai5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class bai5 {
	@RequestMapping(value = "/a", method = RequestMethod.GET)
	public String m1(Model model,@RequestParam("message") String x) {
		model.addAttribute("message", "I come from c");
		return "a";
	}

	@RequestMapping(value = "/b", method = RequestMethod.GET)
	public String m2(Model model) {
		model.addAttribute("message", "I come from b");
		return "forward:/a";
	}

	@RequestMapping("/c")
	public String m3(RedirectAttributes params) {
		params.addAttribute("message", "I come from c");
		return "redirect:/a";
	}

	@ResponseBody
	@RequestMapping("/d")
	public String m4() {
		return "I come from d";
	}

}
