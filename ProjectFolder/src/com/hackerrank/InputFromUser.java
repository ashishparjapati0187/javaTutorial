package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Integer i=sc.nextInt();
		Integer j=sc.nextInt();
		Integer[] inputArray=new Integer[j] ;
		
		System.out.println("first ="+i+" and second ="+j);
		
		for (int k=0;k<j;k++) {
			inputArray[k]=sc.nextInt();
		}
		System.out.println("array = "+Arrays.toString(inputArray));
		

	}

}
