package com.mysite.main;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	@ResponseBody
	String hello() {
		return "Hello from my spring boot application!";
	}

	@RequestMapping("/Calculator/{num1}/{num2}/{operation}")
	String calc(@PathVariable int num1, @PathVariable int num2, @PathVariable String operation) {
		int result = 0;
		switch (operation) {

		case "Add":
			result = num1 + num2;
			System.out.println (num1 + " + " + num2 + " " + "=" + result);
			break;

		case "Sub":
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " " + "=" + result);
			break;

		case "Mul":
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " " + "=" + result);
			break;
		default:
			System.out.println("Invalid Input");

		}
		return  "The result is : " +result;
	}
	
	

	@RequestMapping("/Student/{name}/{marks}")
	String stud(@PathVariable String name, @PathVariable int marks) {
		if(marks>= 90 && marks<=100) {
			return "Student "+name+" scored "+ "Grade-A";
		}else if(marks>= 80 && marks<=90) {
			return ("Student "+name+" scored "+ "Grade-B");
		}else if(marks>= 70 && marks<=80) {
			return("Student "+name+" scored "+ "Grade-C");
		}else {
			return("Student "+name+" scored "+ "Failed!");
		} 
	}
	
	

}
