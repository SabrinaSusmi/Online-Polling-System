package com.web.pollingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.pollingsystem.entity.User;
import com.web.pollingsystem.repository.UserRepo;

@RestController
public class UserController {

	@Autowired
	UserRepo userRepo;
	
	@RequestMapping("/doAction")
	public String doAction() {
		User u = new User((long) 1,"Susmi");
		userRepo.save(u);
		
		System.out.println("saaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa");
		
		return "Success";
	}
}
