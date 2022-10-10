package com.bridgelabz.Assignment;

import java.util.Scanner;

public class HarmonicNumber {

public static void checkHarmonicNumber() {
	
	double harmonic = 0.0;
	System.out.println("Enter hte Nth number : ");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	if (number <=0);
		System.out.println("Enter the positive number : ");
		{
			for (int i =1; i <= number; i++) {
				harmonic = harmonic+(1/(double)i);
				System.out.println("Harmonic Number :"+harmonic);
			}
		}

}
	public static void main(String[] args) {
		System.out.println("welcom to the program of Harmonic Number");
		checkHarmonicNumber();
	}
}
