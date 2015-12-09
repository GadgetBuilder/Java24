package com.Java24Local;

import java.util.*;

public class StringLister {
	String[] names = { "Spanky", "Alfalfa", "Buckwheat", "Daria",
			          "Stymie", "Marianne", "Scotty", "Tommy", "Chubby"	};

	public StringLister(String[] moreNames) {
		ArrayList<String> characterList = new ArrayList<String>();
		for (int i = 0; i < names.length; i++){
			characterList.add(names[i]);
		}
		for (int i=0; i < moreNames.length; i++) {
			characterList.add(moreNames[i]);
		}
		Collections.sort(characterList);
		for (String name : characterList) {
			System.out.println(name);
		}
	}	

	public static void main(String[] arguments) {
			StringLister lister = new StringLister(arguments);
		}

}
