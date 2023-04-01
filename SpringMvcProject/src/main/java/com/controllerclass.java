package com;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controllerclass {

	@RequestMapping("/about")
	public String test(Model model) {
		
		System.out.println("hello this is my program is runnig !!");
		
		model.addAttribute("name","sachin patil");
		model.addAttribute("id",101);
		
		
		List<String> fnds=new ArrayList<String>();
		
		fnds.add("Sai");
		fnds.add("balaji");
		fnds.add("vasudev");
		fnds.add("ram");
		
		model.addAttribute("fndsName",fnds);
		
		return "about";
	}
	
	@GetMapping("/help")
	public ModelAndView help() {
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name", "sachin");
		
		LocalDateTime datetime = LocalDateTime.now();
		
		modelAndView.addObject("date", datetime);
		
		
		
		//setting the view name 
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
	
	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView modelAndView=new ModelAndView();
		
		Address address = new Address("wadi","bidar");
		
		Student s=new Student(101,"sachin",address);
		
		modelAndView.addObject("student",s);
		
		modelAndView.setViewName("home");
		
		return modelAndView;
	}
	
	
	@GetMapping("/test")
	public ModelAndView testList() {
		ModelAndView modelAndView=new ModelAndView();
		
		List<String> fnds=new ArrayList<String>();
		
		fnds.add("Sai");
		fnds.add("balaji");
		fnds.add("vasudev");
		fnds.add("ram");
		
		modelAndView.addObject("frients",fnds);
		 modelAndView.setViewName("test");
		
		return modelAndView;
	}
}
