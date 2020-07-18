package com.basics;

public class IncreamentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Increament Operators
		Integer a=10;
		System.out.println("value after post increament= "+a++); // value will be same , in next line it will be increamented
		System.out.println("value after 1 line after post increament="+a);
		
		Integer  b=10;
		System.out.print("value after post increament= ");
		System.out.println(++b);
		System.out.println("value after 1 line after post increament="+b);
		
		// Assignment Operator
		
		a+=b; // same as a=a+b
		a*=b; // same as a=a*b;
		a/=b; // a=a/b
		a-=b; 
 
	}

}
