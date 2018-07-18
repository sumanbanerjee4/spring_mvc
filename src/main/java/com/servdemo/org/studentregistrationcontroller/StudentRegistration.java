package com.servdemo.org.studentregistrationcontroller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.servdemo.org.pojo.Student;
import com.servdemo.org.repo.StudentRepo;



@Controller
public class StudentRegistration {

	
	@Autowired
	StudentRepo studentrepo;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Student student) {
		return "StudentRegistration";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String addNewPost(@Valid Student student, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "StudentRegistration";
		}
		model.addAttribute("firstName", student.getFirstName());
		model.addAttribute("lastName", student.getLastName());
		model.addAttribute("section", student.getSection());
		model.addAttribute("board", student.getBoard());
		model.addAttribute("subject", student.getSubject());
		model.addAttribute("address", student.getAddress());
		model.addAttribute("standard", student.getStandard());
		studentrepo.save(student);
		
		return "StudentRegistrationResult";
	}
}
