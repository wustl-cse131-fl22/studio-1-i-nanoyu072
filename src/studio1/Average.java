package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner first = new Scanner(System.in);
		System.out.print("First integer to be averaged: ");
		double N1 = first.nextInt();
		Scanner second = new Scanner(System.in);
		System.out.print("Second integer to be averaged: ");
		double N2 = second.nextInt();
		
		
		double Average = (N1 + N2)/2;
		System.out.println(Average);
		
	}

}
