package com.Java24Local;
public class VirusLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numViruses = Integer.parseInt(args[0]);
		if (numViruses > 0) {
			Virus[] virii = new Virus[numViruses];
			for (int i = 0; i< numViruses; i++) {
				virii[i] = new Virus();
			}
			System.out.println("There are " +
			Virus.getVirusCount()
			+ " viruses.");
		}

	}

}
