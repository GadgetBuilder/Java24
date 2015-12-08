package com.Java24Local;

public class ConvertFloat {

	public static void main(String[] args) {
		float floatVar = Float.parseFloat(args[0]);
		
		System.out.println("Converted float is " + floatVar) ;
		
		Float origVal = new Float(args[0]);
		float newVal = origVal.floatValue();
		int intVal = (int)newVal;
		System.out.println("The int value is " + intVal);
	}

}
