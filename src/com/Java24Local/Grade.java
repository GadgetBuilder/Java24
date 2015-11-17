package com.Java24Local;

public class Grade {

	public static void main(String[] args) {
		// Define number score to grade letter mapping
		int grade = 71;
		{
			if (grade >= 90) System.out.println("You got an A");
			else if (grade < 90 & grade >= 80) System.out.println("You got a B");
			else if (grade < 80 & grade >= 70) System.out.println("You got a C");
			else if (grade < 70 & grade >= 60) System.out.println("You got a D");
			else System.out.println("You got an F");
		}
		String letterGrade = null;
		switch(grade)		
			{
				case 100:
				case 99:
				case 98:
				case 97:
				case 96:
				case 95:
				case 94:
				case 93:
				case 92:
				case 91:
				case 90:
					letterGrade = "A";
					break;
				case 89:
				case 88:
				case 87:
				case 86:
				case 85:
				case 84:
				case 83:
				case 82:
				case 81:
				case 80:
					letterGrade = "B";
					break;
				default: letterGrade = "F";
			}
		System.out.println("Your leeter grade is " + letterGrade);

	}

}
