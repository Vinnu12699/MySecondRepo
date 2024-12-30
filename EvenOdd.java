package com.wipro.day1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
				
		System.out.println("Enter the Number to find if it is Odd or Even: ");
		int x=scanner.nextInt();
		
		scanner.close();
		
		if (x%2==0)
			
	        System.out.println( x+ " is Even Number");
		else
			System.out.println( x+ " is Odd Number");
		}

}