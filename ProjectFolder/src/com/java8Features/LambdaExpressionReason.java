package com.java8Features;



interface I{
	
	void show(); // by default method in interface is public abstract
}

class Temp implements I{
	
	public void show() {
		
		System.out.println("defining show using temp class");
		
	}
}
public class LambdaExpressionReason {
	
	

	public static void main(String[] args) {
		
		I obj=new Temp(); // we are creating unessary new class to define this method
		// temp class is only using to implement I
		obj.show();

	}

}
