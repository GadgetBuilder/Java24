package com.Java24Local;

public class NewCalculator {

	public static void main(String[] args) {
		float sum = 0;
		for (String argument : args) {
			try{
				sum = sum + Float.parseFloat(argument);
			} catch (NumberFormatException e) {
				System.out.println(argument + " is not a number");
			}
			
		}
		System.out.println("Those numbers add up to " + sum);

	}

}
