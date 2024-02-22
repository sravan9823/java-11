package com.sravanit.stringenhance;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = " ";
		String s2 = "";
		String s3 = "    ";

		System.out.println(s1.isEmpty()); // false
		System.out.println(s1.isBlank()); // true
		System.out.println(s2.isBlank()); // true
		System.out.println(s3.isBlank()); // true

		String s4 = " Sravan" + "\n" + "Java" + "\r\n" + "developer"; // \n or \r line terminator
		System.out.println(s4);
		String[] split = s4.split("\n");
		System.out.println(Arrays.asList(split));
		s4.lines().forEach(str -> System.out.print(str + " ")); // Sravan Java developer

	}

}
