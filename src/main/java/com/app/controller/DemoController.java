package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.pojos.Search;

@Controller
public class DemoController {

//	@Autowired
//	PropertyFileReader reader;
	Search search = null;
	@GetMapping("/h")
	public String airlineHomePage(ModelMap model) {
		if (model.containsAttribute("search"))
			model.remove("search");
		if (model.containsAttribute("flightDetails"))
			model.remove("flightDetails");
		model.addAttribute("search", new Search());
		return "demo";
	}

	@PostMapping("/h")
	public String airlineSearchResult(@ModelAttribute("search") Search search, BindingResult error, ModelMap model) {
		this.search = search;
		System.out.println(search);
		return "redirect:/h";
	}

}
