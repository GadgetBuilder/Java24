package com.Java24Local;

public class FourHundredBy13 {
	public static void main(String[] args) {
		int multiple = 13;
		for(int i = 1; i < 401; i++){
			System.out.print(multiple + "    ");
			multiple = multiple * multiple;
		}
	}

}
