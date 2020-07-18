package com.basics;

public class MethodInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myFunction();
		Integer result=addFunction(10, 20);
		System.out.println("result after calling add func = "+result);
		printString("my name is ashish");
	}
	
	public static void myFunction() {
		System.out.println("calling my function");
	}
	public static Integer addFunction(Integer a,Integer b) {
		return a+b;
	}
	public static void printString(String a) {
		System.out.println("pased string= "+a);
	}

}
