package com.sravanit.localvariable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalVariableInference {

	public static void main(String[] args) {

		var i = 10;
		var d = 12.123;
		int i1 = 10;
		String x = "Sravan";
		var l = new ArrayList<>();

		// Map<String, Integer> m = m1();
		var m2 = m1(); // if change return type of m1 it won't give compile time error

	}

	public static List<Integer> m1() {
		return new ArrayList<>();
	}

	/*
	 * public static Map<String,Integer> m1() { return new HashMap<>(); }
	 */
}
