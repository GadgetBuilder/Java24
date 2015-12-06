package com.Java24Local;

public class SpaceRemover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mostFamous = "Rudolf the Red-Nosed Reindeer";
		char[] mfl = mostFamous.toCharArray();
		for (int dex = 0; dex < mfl.length; dex++) {
			char current = mfl[dex];
			if (current != ' ') {
				System.out.print(current);
			} else {
				System.out.print('.');
			}
			
		}
		System.out.println();
	}

}
