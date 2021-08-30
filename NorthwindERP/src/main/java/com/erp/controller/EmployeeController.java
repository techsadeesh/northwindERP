package com.erp.controller;

import com.erp.model.Employee;
import com.erp.repo.ItemRepository;
//import com.onlinetutorialspoint.model.Item;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
public class EmployeeController {
	@Autowired
	ItemRepository itemRepo;
	
	Logger logger = LoggerFactory.getLogger(EmployeeController.class);

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
	
	 
		@RequestMapping(value = "/add_employee", method = RequestMethod.GET)
		public ModelAndView AddEmployee(ModelMap model) {
		//	model.put("name", getLoggedinUserName());
		//	return "welcome1";
			
			
			ModelAndView mv = new ModelAndView();
		
			
			mv.setViewName("add_employee");
			return mv;
		}
		
		 
		  @RequestMapping("/ListEmployees")
		    @ResponseBody
		    public ModelAndView ListEmployee(){
			  
			//  logger.info("Inside ListEmployee");
		      //  return itemRepo.ListEmployee();
			  
			  List<Employee> list = itemRepo.ListEmployee();
			   //return back to index.jsp
		        ModelAndView model = new ModelAndView("index");
		        model.addObject("lists", list);

		        return model;
			  
			  
		    }

/*		
		  @RequestMapping("/EditEmployee")
		    @ResponseBody
		    public ModelAndView EditEmployee(@RequestParam("itemId") int itemId){
			  
			//  logger.info("Inside ListEmployee");
		      //  return itemRepo.ListEmployee();
			  
		             //Employee = itemRepo.ListEmployee(itemId);
			
		        ModelAndView model = new ModelAndView("edit_employee");
		   //     model.addObject("lists", list);

		        return model;
			  
			  
		    }
		  
	*/	  
		  
		  @RequestMapping("/EditEmployee/{id}")
		    @ResponseBody
		    public ModelAndView ListEmployee(@PathVariable int id) {
			  
			 System.out.println("sadeeshhhhh - "+id);
			  
		       ModelAndView m = new ModelAndView("edit_employee");
		       
		       List<Employee>  list1 = itemRepo.ListEmployee(id);
		    
		     System.out.println( "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiii"+list1.get(0));
			       m.addObject("lists", list1);
			       return m ;
					  
		    }

		  
		/*  
		  @RequestMapping("/EmployeeEdit/{id}")
			public String EditEmployee(@PathVariable int id, Model m) {
				System.out.println(" sadeesh : Inside EditEmployee Controller id =" + id);
				Employee Employee = EmpService.EditEmployee(id);
				m.addAttribute("Employee", Employee);

		  */
		  
	 
	
   
}

