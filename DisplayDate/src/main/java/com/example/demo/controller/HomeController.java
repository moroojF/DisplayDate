package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
    public String index() {
		return "Dashboard.jsp";
    }
	@RequestMapping("/time")
    public String showTime() {
		return "Time.jsp";
    }
	@RequestMapping("/date")
    public String ShowDate() {
		return "Date.jsp";
    }
}
