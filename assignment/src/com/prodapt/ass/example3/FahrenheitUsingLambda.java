package com.prodapt.ass.example3;

import java.util.function.Function;

public class FahrenheitUsingLambda {

	public static void main(String[] args) {

		Function<Integer, Double> fahrenheitToCelcius = a -> new Double((a - 32) * 5 / 9);
		double celsius = fahrenheitToCelcius.apply(56);
		System.out.println("fahrenheit to celsius is :" + celsius);
	}

}
