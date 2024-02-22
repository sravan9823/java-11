package com.sravanit.stringenhance;

public class StringEnhancements {

	public static void main(String[] args) {

		String str = " Sravan ";
		System.out.println(str); // Sravan
		System.out.println(str.repeat(2)); // Sravan Sravan
		// str.repeat(Integer.MAX_VALUE);

		String s1 = " Sravan is a Java developer ";

		System.out.println(s1); // Sravan is a Java developer
		System.out.println(s1.trim()); // Sravan is a Java developer
		System.out.println(s1.strip()); // Sravan is a Java developer
		System.out.println(s1.stripLeading());	//Sravan is a Java developer 
		System.out.println(s1.stripTrailing());	// Sravan is a Java developer

		String s2 = '\u2001' + " Sravan   is  a  Java  developer " + '\u2001';

		System.out.println(s2); // ? Sravan is a Java developer ?
		System.out.println(s2.trim()); // ? Sravan is a Java developer ?
		System.out.println(s2.strip()); // Sravan is a Java developer
	}

}
