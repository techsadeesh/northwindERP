package com.erp.controller;

import com.erp.model.Employee;
import com.erp.repo.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ItemController {
	@Autowired
	ItemRepository itemRepo;

	@RequestMapping("/addItem")
    @ResponseBody
    public String addEmployee(
    		@RequestParam("emp_id") int emp_id,
    		@RequestParam("name") String name,
    		@RequestParam("department") String department,
    		@RequestParam("designation") String designation,     		
    		@RequestParam("email") String email,
    		@RequestParam("mobile") String mobile)
		
    
    {
        if(itemRepo.addEmployee(emp_id,name,department,designation,email,mobile) >= 1){
        	
        	
            return "Item Added Successfully by sadeesh";
        }else{
            return "Something went wrong !";
        }
    }
	
	

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView showWelcomePage(ModelMap model) {
	//	model.put("name", getLoggedinUserName());
	//	return "welcome1";
		
		
		ModelAndView mv = new ModelAndView();
	
		
		mv.setViewName("Home");
		return mv;
	}
	
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView login(ModelMap model) {
	//	model.put("name", getLoggedinUserName());
	//	return "welcome1";
		
		
		ModelAndView mv = new ModelAndView();
	
		
		mv.setViewName("login");
		return mv;
	}
	

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView loginout(ModelMap model) {
	//	model.put("name", getLoggedinUserName());
	//	return "welcome1";
		
		
		ModelAndView mv = new ModelAndView();
	
		
		mv.setViewName("login");
		return mv;
	}
	
/*
	@RequestMapping(value = "/add_employee", method = RequestMethod.GET)
	public ModelAndView AddEmployee(ModelMap model) {
	//	model.put("name", getLoggedinUserName());
	//	return "welcome1";
		
		
		ModelAndView mv = new ModelAndView();
	
		
		mv.setViewName("add_employee");
		return mv;
	}
	
	*/
	
	
   
}

