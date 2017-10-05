package com.libertymutual.goforcode.smallvoting.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.smallvoting.models.User;
import com.libertymutual.goforcode.smallvoting.repositories.UserRepository;



@Controller
@RequestMapping("/")
public class MainController {

	private UserRepository userRepo;
	
	public MainController(UserRepository userRepo) {
		this.userRepo = userRepo;

		User user = new User("Bob 1");
		User user2 = new User("Bob 2");
		User user3 = new User("Bob 3");
		
		userRepo.save(user);
		userRepo.save(user2);
		userRepo.save(user3);
		
	}

	@GetMapping("")
	public ModelAndView showDefault() {
		ModelAndView mv = new ModelAndView("users");
		
		return mv;
	}
	
	@PostMapping("") 
	public ModelAndView chooseUser() {
		ModelAndView mv = new ModelAndView("projects");
		
		return mv;
	}
	
}
