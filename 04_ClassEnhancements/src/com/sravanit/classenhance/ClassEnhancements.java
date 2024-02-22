package com.sravanit.classenhance;

import java.util.Arrays;
import java.util.HashMap;

public class ClassEnhancements {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(ClassEnhancements.class.getNestMembers()));

		System.out.println(Arrays.toString(HashMap.class.getNestMembers()));

		System.out.println(B.class.getNestHost());

		System.out.println(A.class.getNestHost());
		
		System.out.println(B.class.isNestmateOf(ClassEnhancements.class));

	}

	static class A {

		static class C {

		}
	}

	class B {

	}
}
