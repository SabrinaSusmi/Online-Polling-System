package com.web.pollingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.pollingsystem.entity.User;
import com.web.pollingsystem.repository.CandidateRepo;
import com.web.pollingsystem.repository.UserRepo;

@Controller
public class VotingController {

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	CandidateRepo candidateRepo;
	
//	@RequestMapping("/doAction")
//	public String doAction() {
//		User u = new User((long) 1,"Susmi");
//		userRepo.save(u);
//		
//		System.out.println("saaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa");
//		
//		return "Success";
//	}
	
	@RequestMapping("/")
	public String goToVote() {
		return "login.html";
	}
	
	@RequestMapping("/isLoginSuccessful")
	public String loginSuccessful(@RequestParam Long id) {
		if(userRepo.existsById(id)) {
			return "vote.html";
		}else {
			return "login.html";
		}
	}
	
}
