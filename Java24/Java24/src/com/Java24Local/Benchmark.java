package com.Java24Local;

public class Benchmark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 60000;
		long index = 0;
		//int multi = 5;
		long multiResult = 2;
		while (true) {
			double x = Math.sqrt(index);
			long now = System.currentTimeMillis();
			//System.out.print(multiResult + "  before  ");
			multiResult = multiResult * 2;
			System.out.print(multiResult + "  after  ");
			
			if (now > endTime) {
				break;
			}
			index++;
		}
		System.out.println(index + "loops in one minute.");
		System.out.println( "The final result is " + multiResult);

	}

}
