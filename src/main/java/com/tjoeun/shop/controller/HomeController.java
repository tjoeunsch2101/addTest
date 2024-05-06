package com.tjoeun.shop.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {

		return "index";

	}
}
