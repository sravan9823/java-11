package com.sravanit.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateChanges {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("","\t","One","Two","Three"," ","  ");
		
		List<String> collect = list.stream().filter(str -> str.isBlank()).collect(Collectors.toList());
		System.out.println(collect);
		
		List<String> collect1 = list.stream().filter(str -> !str.isBlank()).collect(Collectors.toList());
		System.out.println(collect1);
		
		List<String> collect2 = list.stream().filter(Predicate.not(str -> !str.isBlank())).collect(Collectors.toList());
		System.out.println(collect2);
	}

}
