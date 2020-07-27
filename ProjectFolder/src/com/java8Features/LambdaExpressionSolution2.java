package com.java8Features;

interface B
{
	
	void show(); // by default method in interface is public abstract
}


public class LambdaExpressionSolution2 {

	public static void main(String[] args) {
		
		
		B obj;
		obj=()->
				
				System.out.println("using ananyomous class for method definition");
		
		obj.show();
	}

}