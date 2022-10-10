package com.bridgelabz.Array;

import java.util.Scanner;

public class EvenPosition {
	
	 public static void checkEvenPosition(){
	        int array[] = new int[10];//{1,2,8,6,2,13,2,15,14,31,16,12,10};
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Element of Array: ");
	        for (int i = 0; i<array.length; i++){
	            array[i]=sc.nextInt();
	        }
	        for (int i = 2; i<array.length; i++){
	            if (i%2 == 0) {
	                System.out.println("Index =" + i);
	                System.out.println("Value =" + array[i]);
	            }

	        }
	    }
	    public static void main(String[] args) {
	        System.out.println("Welcome to the Even position program in Array");
	        checkEvenPosition();
	    }

}
