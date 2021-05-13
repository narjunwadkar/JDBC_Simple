package com.example.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.crypto.Data;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	
	@RequestMapping("/")
	public String getRequest(Model map) {
		
		System.out.println("In the method...!");		
		return "index.jsp";
	}
	
	
	@RequestMapping("/Calculator")
	public ModelAndView calculator (@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		
		System.out.println("In the calculator Method..."+num1);	
		System.out.println("In the calculator Method..."+num2);
		int add = num1 + num2;
		ModelAndView model = new ModelAndView("Calculator.jsp");
        model.addObject("addition", add);
		return model;
		
	}

}
