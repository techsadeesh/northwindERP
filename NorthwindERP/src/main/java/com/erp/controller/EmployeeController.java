package com.erp.controller;

import com.erp.dao.EmployeeDao;
import com.erp.dao.ItemRepository;
import com.erp.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;

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

	@Autowired
	private EmployeeDao EmployeeDao;

	Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView showWelcomePage(ModelMap model) {
		// model.put("name", getLoggedinUserName());
		// return "welcome1";

		ModelAndView mv = new ModelAndView();

		mv.setViewName("Home");
		return mv;
	}

	@RequestMapping(value = "/addEmployeeForm", method = RequestMethod.GET)
	public ModelAndView addEmployeeForm(ModelMap model) {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("employee_add");
		return mv;
	}

	@RequestMapping("/insertEmployee")
	@ResponseBody
	public ModelAndView insertEmployee(@RequestParam("emp_id") int emp_id, @RequestParam("name") String name,
			@RequestParam("department") String department, @RequestParam("designation") String designation,
			@RequestParam("email") String email, @RequestParam("mobile") String mobile, ModelAndView mv)

	{

		Employee emp = new Employee();
		emp.setId(emp_id);
		emp.setName(name);
		emp.setDepartment(department);
		emp.setDesignation(designation);
		emp.setEmail(email);
		emp.setMobile(mobile);

		int counter = EmployeeDao.addEmployee(emp);

		if (counter > 0) {
			mv.addObject("msg", "Student registration successful.");
		} else {
			mv.addObject("msg", "Error- check the console log.");
		}

		mv.setViewName("Home");

		return mv;

	}

	@RequestMapping("/listEmployees")
	@ResponseBody
	public ModelAndView listEmployees(ModelAndView model) {

		logger.info("--------------------Sadeesh Inside listEmployees------------------------------ ");
		List<Employee> emplist = EmployeeDao.listEmployee();

		model.addObject("listEmployees", emplist);
		model.setViewName("employees_list");

		return model;
	}

	@RequestMapping("/EditEmployee/{id}")
	@ResponseBody
	public ModelAndView ListEmployee(@PathVariable int id) {
		logger.info("--------------------Sadeesh Edit Emoployee------------------------------ ");

		System.out.println("sadeeshhhhh - " + id);

		ModelAndView m = new ModelAndView("edit_employee");

		// List<Employee> list1 = itemRepo.ListEmployee(id);

		List<Employee> employee_detail = EmployeeDao.getEmployeeById(id);

		for (int i = 0; i < employee_detail.size(); i++) {
			System.out.print(employee_detail.get(i) + " ");
		}

		m.addObject("employee_detail", employee_detail);
		return m;

	}

	@RequestMapping("/deleteEmployee/{id}")
	@ResponseBody
	public ModelAndView deleteEmployee(@PathVariable int id) {
		logger.info("--------------------Sadeesh delete Emoployee------------------------------ ");

		System.out.println("sadeeshhhhh - " + id);

		ModelAndView m = new ModelAndView("sucess");

		EmployeeDao.deleteEmployee(id);

		// m.addObject("employee_detail", employee_detail);
		return m;

	}

	// ----------------------------------------------------------Current------------------------------------------------------------
	// @RequestMapping(value = "/update", method = RequestMethod.POST)

	@RequestMapping("/update")
	@ResponseBody
	public ModelAndView updateStudent(@RequestParam("emp_id") int emp_id, @RequestParam("name") String name,
			@RequestParam("department") String department, @RequestParam("designation") String designation,
			@RequestParam("email") String email, @RequestParam("mobile") String mobile, ModelAndView mv) {
		logger.info("--------------------Sadeesh UPDATE Emoployee------------------------------ ");
		Employee emp = new Employee();
		emp.setId(emp_id);
		emp.setName(name);
		emp.setDepartment(department);
		emp.setDesignation(designation);
		emp.setEmail(email);
		emp.setMobile(mobile);
		System.out.println(emp.getId());
		System.out.println(emp.getName());

		/*
		 * emp.setId(emp_id); emp.setName(name); emp.setDesignation(designation);
		 * emp.setDepartment(department); emp.setEmail(email); emp.setMobile(mobile);
		 */
		int counter = EmployeeDao.updateEmployee(emp);

		if (counter > 0) {
			mv.addObject("msg", "Student records updated against student id: " + emp.getId());
		} else {
			mv.addObject("msg", "Error- check the console log.");
		}

		mv.setViewName("sucess");

		return mv;
	}

	// ------------------------------------------------------------NOT
	// YET-----------------------------------------------------------

}
