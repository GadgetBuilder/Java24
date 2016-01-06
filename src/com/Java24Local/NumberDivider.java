package com.Java24Local;

import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;

public class NumberDivider {

	public static void main(String[] args) {
		if (args.length == 2) {
			int result = 0;
			try {
				result = Integer.parseInt(args[0]) /
						Integer.parseInt(args[1]);
				System.out.println(args[0] + " divided by " +
						args[1] + " equals " + result);
			} catch (NumberFormatException e) {
				System.out.println("Both arguments must be numbers.");
				throw e;
			} catch (ArithmeticException e) {
					System.out.println("You cannot divide by zero.");
					throw e;
				}
			}
		}

	}


