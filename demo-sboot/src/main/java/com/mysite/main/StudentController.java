package com.mysite.main;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class StudentController {
//	
//	public final StudentRepository studRepository;
//	
//	StudentController( StudentRepository studRepository)
//	{
//		this.studRepository = studRepository;
//	}
//	
//	@GetMapping("/Student")
//	
//	List<Student> getAll(){
//		return studRepository.findAll();
//	}
//}

@RestController
public class StudentController {
	public final StudentRepository stud1Repository;

	public StudentController(StudentRepository stud1Repository) {
		this.stud1Repository = stud1Repository;
	}
	
	@GetMapping("/Student1")
	
	
	List<Student1> getAll(){
				
		return stud1Repository.findAll();
	}
	
	@GetMapping("/Student1/{id}")
	Optional<Student1> getUserById(@PathVariable Long id){
		return stud1Repository.findById(id);
	}
	
	@PostMapping("/Student1")
	Student1 newStudent1(@RequestBody Student1 stud1){
		return stud1Repository.save(stud1);
	}
	
	@DeleteMapping("/Student1/{id}")
	void deleteUserById(@PathVariable Long id){
		stud1Repository.deleteById(id);
	}
}
	
