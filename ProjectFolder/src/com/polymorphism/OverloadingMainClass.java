package com.polymorphism;

public class OverloadingMainClass {

	public static void main(String args){System.out.println("main with String");}  
	public static void main(String[] args){System.out.println("main with String[]");}  
	public static void main(){System.out.println("main without args");}  
	
	// will always call first function

}
