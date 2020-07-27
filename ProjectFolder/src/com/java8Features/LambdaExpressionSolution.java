package com.java8Features;


interface A
{
	
	void show(); // by default method in interface is public abstract
}


public class LambdaExpressionSolution {

	public static void main(String[] args) {
		
		
		A obj;
		obj=new A() {
			
			public void show() {
				
				System.out.println("using ananyomous class for method definition");
			}
			
		};

		obj.show();
	}

}

