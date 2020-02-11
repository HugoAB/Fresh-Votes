package com.freshvotes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {
	//@RequestMapping(value="/aa", method=RequestMethod.GET)
	@GetMapping(value="")
	public String rootView () {
		return "index";
	}
}
