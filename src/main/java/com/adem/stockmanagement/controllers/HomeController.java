package com.adem.stockmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	@RequestMapping(value={"/", "h**"})
	public String home()
	{
		return "maquette_ams/index.html";
	}
}