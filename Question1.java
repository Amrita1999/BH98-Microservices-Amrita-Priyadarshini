//WAP to print all names along with surname from different list.

package com.java8;

import java.util.Arrays;
import java.util.List;

public class Question1 {
	public static void main(String[] args) {
		List<String> mylist = Arrays.asList("Rajesh", "Suraj", "Tom");
		mylist.stream().map(x -> x + " Sharma").forEach(y -> System.out.println(y));
	}
}