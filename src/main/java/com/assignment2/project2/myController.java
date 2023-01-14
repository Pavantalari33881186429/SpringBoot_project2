package com.assignment2.project2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class myController {

	    @GetMapping("/branches")
		public String nameHandler() {
	      return "branches";
		}
		@GetMapping("/services")
		public String addresHandler() {
	      return "services";
		}
	}

