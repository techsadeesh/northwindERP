package com.erp.controller;

import com.erp.dao.EmployeeDao;
import com.erp.dao.ItemRepository;
import com.erp.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
public class LoginController {
	@Autowired
	ItemRepository itemRepo;

	@Autowired
	private EmployeeDao EmployeeDao;

	Logger logger = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView login(ModelMap model) {
		// model.put("name", getLoggedinUserName());
		// return "welcome1";

		ModelAndView mv = new ModelAndView();

		mv.setViewName("login");
		return mv;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView loginout(ModelMap model) {
		// model.put("name", getLoggedinUserName());
		// return "welcome1";

		ModelAndView mv = new ModelAndView();

		mv.setViewName("login");
		return mv;
	}

}
