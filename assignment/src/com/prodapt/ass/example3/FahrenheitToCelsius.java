package com.prodapt.ass.example3;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		double fahrenheitTemp, celsiusTemp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fahrenheit temperature");
		fahrenheitTemp = sc.nextDouble();
		System.out.println("Temperature in celcius is :" + toCelsius(fahrenheitTemp));

	}

	static double toCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

}
