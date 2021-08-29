package com.erp.controller;

import com.erp.model.Employee;
import com.erp.repo.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ItemController2 {
	@Autowired
	ItemRepository itemRepo;
	
    
	@RequestMapping(value = "/add_employee", method = RequestMethod.GET)
	public ModelAndView AddEmployee(ModelMap model) {
	//	model.put("name", getLoggedinUserName());
	//	return "welcome1";
		
		
		ModelAndView mv = new ModelAndView();
	
		
		mv.setViewName("add_employee");
		return mv;
	}
	
	
	
	
   
}

