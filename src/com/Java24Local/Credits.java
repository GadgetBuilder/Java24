package com.Java24Local;

public class Credits {

	public static void main(String[] args) {
		// set up film information
		String title = "Sharknato";
		int year = 2013;
		String director = "Anthony Ferrante";
		String role1 = "Fin";
		String actor1 = "Ian Ziering";
		String role2 = "April";
		String actor2 = "Tara Reid";
		String role3 = "George";
		String actor3 = "John Heard";
		String role4 = "Nova";
		String actor4 = "Cassie Scerbo";
		// display information
		System.out.println(title + " (" + year + ")\n" +
				"A " + director + " film.\n\n" +
				role1 + "\t" + actor1.toUpperCase() + "\n" +
				role2 + "\t" + actor2.toUpperCase() + "\n" +
				role3 + "\t" + actor3 + "\n" +
				role4 + "\t" + actor4);

	}

}
