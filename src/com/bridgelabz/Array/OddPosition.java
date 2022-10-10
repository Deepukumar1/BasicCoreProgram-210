package com.bridgelabz.Array;

public class OddPosition {
	
	 public static void checkOddPosition(){
	        int array[] = new int[]{102,29,47,3,32,14,24,59};
	        System.out.println("Odd position with value:");
	        for (int i = 0; i<array.length; i++){
	            if (i%2 != 0){
	                System.out.println("index :"+i);
	                System.out.println("value : "+array[i]);
	            }
	        }
	    }
	    public static void main(String[] args) {
	        System.out.println("Welcome to the  odd position program");
	        checkOddPosition();
	    }

}
