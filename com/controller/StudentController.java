package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.service.StudentServiceInterface;
@Controller
public class StudentController {
	@Autowired
	@Qualifier("studServiceImpl1")
	private StudentServiceInterface studService;


	@RequestMapping(value="getStudnetDetails", method=RequestMethod.POST)
	public ModelAndView getStudentDeils(@RequestParam("id") String id){
		System.out.println("Controller printed..");		
		ModelAndView view = new ModelAndView();
		view.addObject("StudentObj", studService.getStudnetDetails(id));
		view.setViewName("StudentInfo");
		return view;
	}
	
	@RequestMapping(value="getStudnetDetails12", method=RequestMethod.POST)
	public ModelAndView getStudentDeils12(@RequestParam("id") String id){
		System.out.println("Controller printed..");		
		ModelAndView view = new ModelAndView();
		view.addObject("StudentObj", studService.getStudnetDetails(id));
		view.setViewName("StudentInfo");
		return view;
	}
	
	
}
