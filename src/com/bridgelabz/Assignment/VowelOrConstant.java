package com.bridgelabz.Assignment;

import java.util.Scanner;

public class VowelOrConstant {
	
	public static void main(String[] args) {
		char ch;
		System.out.print("Enter any Character ");
		Scanner r=new Scanner(System.in);
		ch=r.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.print("Vowel");
		}
		else
		{
			System.out.print("Consonant");
		}
    }

}
