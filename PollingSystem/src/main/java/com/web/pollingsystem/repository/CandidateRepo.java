package com.web.pollingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.web.pollingsystem.entity.Candidate;

@RestController
public interface CandidateRepo extends JpaRepository<Candidate,Long>{

}
