package com.Java24Local;

public class Calculator {

	public static void main(String[] args) {
		float sum = 0;
		for (String argument : args) {
			
				sum = sum + Float.parseFloat(argument);
			
			
		}
		System.out.println("Those numbers add up to " + sum);

	}

}
