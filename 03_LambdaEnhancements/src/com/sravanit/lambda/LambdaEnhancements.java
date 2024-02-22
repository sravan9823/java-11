package com.sravanit.lambda;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntBiFunction;

public class LambdaEnhancements {

	public static void main(String[] args) {

		Function<String, Integer> f1 = (String str) -> str.length();
		System.out.println(f1.apply("Sravan"));

		IntFunction<String> if2 = (var i) -> {
			return "Hi";
		};

		ToIntBiFunction<Object, Object> tibf = (var i, var j) -> {
			return 10;
		};
		
		tibf.applyAsInt("Sravan", "test");
		

	}

}
