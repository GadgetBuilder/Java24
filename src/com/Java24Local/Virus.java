package com.Java24Local;

public class Virus {
	static int virusCount = 0;
	static int newSeconds = 0;
	
	public Virus() {
		virusCount++;
	}
	
	static int getVirusCount() {
		return virusCount;
	}
	
	static int getNewSeconds() {
		if (virusCount >= 60 & virusCount <= 100) 
				{newSeconds = 70;}
		return newSeconds;
	}

}
