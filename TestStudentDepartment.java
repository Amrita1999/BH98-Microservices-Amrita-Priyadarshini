package com.java8;

import java.util.Arrays;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


class Student3 {
	private int id;
	private String name;
	private Department dept_id;
	private int cmarks, pmarks, mmarks;

	public Student3(int id, String name, Department dept_id, int cmarks, int pmarks, int mmarks) {
		super();
		this.id = id;
		this.name = name;
		this.dept_id = dept_id;
		this.cmarks = cmarks;
		this.pmarks = pmarks;
		this.mmarks = mmarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept_id() {
		return dept_id;
	}

	public void setDept_id(Department dept_id) {
		this.dept_id = dept_id;
	}

	public int getCmarks() {
		return cmarks;
	}

	public void setCmarks(int cmarks) {
		this.cmarks = cmarks;
	}

	public int getPmarks() {
		return pmarks;
	}

	public void setPmarks(int pmarks) {
		this.pmarks = pmarks;
	}

	public int getMmarks() {
		return mmarks;
	}

	public void setMmarks(int mmarks) {
		this.mmarks = mmarks;
	}

	@Override
	public String toString() {
		return "Student3 [id=" + id + ", name=" + name + ", dept_id=" + dept_id + "]";
	}
}

class Department {
	private int dept_id;
	private String dept_name;

	public Department(int dept_id, String dept_name) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + "]";
	}

}

public class TestStudentDepartment {

	public static void main(String[] args) {

		Department d1 = new Department(111, "CSE");
		Department d2 = new Department(222, "EEE");
		Department d3 = new Department(333, "ECE");

		Student3 s1 = new Student3(101, "Sumit", d1, 90, 95, 93);
		Student3 s2 = new Student3(102, "Rajesh", d1, 87, 95, 93);
		Student3 s3 = new Student3(103, "Suraj", d2, 66, 95, 78);
		Student3 s4 = new Student3(104, "Tom", d2, 79, 95, 93);
		Student3 s5 = new Student3(105, "Shiva", d2, 90, 78, 93);
		Student3 s6 = new Student3(106, "Jay", d3, 90, 95, 93);
		Student3 s7 = new Student3(107, "Sagar", d3, 83, 67, 93);

		List<Student3> students = Arrays.asList(s1, s2, s3, s4, s5, s6, s7);
//		Map<Integer, List<Student3>> studentDeptWise = students.stream()
//				.collect(Collectors.groupingBy(Student3::getDept_id));

		// Question1- give student record department wise.
		Map<Department, List<Student3>> studentDeptWise = students.stream()
				.collect(Collectors.groupingBy(Student3::getDept_id));

		System.out.println(studentDeptWise);
	}

}
