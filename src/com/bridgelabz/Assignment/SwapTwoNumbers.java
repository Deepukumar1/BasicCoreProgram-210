package com.bridgelabz.Assignment;

import java.util.Scanner;

public class SwapTwoNumbers {
	
public static void main(String[] args) {
		
		int a,b,temp;
		System.out.print("Enter two Numbers ");
		Scanner r=new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();
		System.out.print("Before Swapping "+ a+" "+b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.print("After Swappiing "+ a+" "+b);
	}
}
