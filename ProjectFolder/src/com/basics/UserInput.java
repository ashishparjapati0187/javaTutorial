package com.basics;

import java.util.Scanner;


public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scan=new Scanner(System.in);
		System.out.println("Enter any number");
		//Integer input=scan.nextInt();
		String input_str=scan.next();
		System.out.println("entered valu= "+input_str);
		Scanner  scan2=new Scanner(System.in);
		Double input_double=scan2.nextDouble();
		System.out.println("entred double value= "+input_double);
		System.out.println("enter entire line ");
		Scanner scan3=new Scanner(System.in);
		String line=scan3.nextLine();
		System.out.println("enter line= "+line);

	}

}
