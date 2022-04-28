package com.mysite.main;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	public final StudentRepository studRepository;
	
	StudentController( StudentRepository studRepository)
	{
		this.studRepository = studRepository;
	}
	
	@GetMapping("/Student")
	
	List<Student> getAll(){
		return studRepository.findAll();
	}
}