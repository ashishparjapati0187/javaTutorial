package com.staticKeyword;

public class MainClass {

	public static void main(String[] args) {
	
		StaticExampleClass ashish=new StaticExampleClass();
		StaticExampleClass parjapati=new StaticExampleClass(); 
		
		// noOfStudent will increase every time new object is created
		
		System.out.println("no of student = "+StaticExampleClass.getNoOfStudent());

		

	}

}
