package com.mysite.main;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="STUDENT1")
public class Student1 {
	private @Id @GeneratedValue Long id;
	private String name;
	private int marks;
	
	public Student1() {}

	public Student1(Long id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, marks, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return Objects.equals(id, other.id) && Objects.equals(marks, other.marks) && Objects.equals(name, other.name);
	}	
	
	
	public String getGrade() {
		if(marks>= 90 && marks<=100) {
			return "Student scored "+ "Grade-A";
		}else if(marks>= 80 && marks<=90) {
			return ("Student  scored "+ "Grade-B");
		}else if(marks>= 70 && marks<=80) {
			return("Student  scored "+ "Grade-C");
		}else {
			return("Student scored "+ "Failed!");
		} 
	}
	
	
	

}
