package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner first = new Scanner(System.in);
		System.out.print("Is the following year a leap year?");
		int N1 = first.nextInt();
		boolean leapYear;
		
		if (N1%400==0) leapYear = true;
		else if (N1%4==0 && N1%100!=0) leapYear = true;
		else leapYear = false;
		
		System.out.println(leapYear);
			
		}
	
	}

