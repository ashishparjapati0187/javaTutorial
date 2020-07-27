package com.java8Features;

public interface InterfaceWithDefaultMedthod {

	
	default public void show() {
		System.out.println("Inside InterfaceWithDefaultMedthod show()");
	}
	
	
//	public void show() {
//		System.out.println("Inside InterfaceWithDefaultMedthod show()");
//	}
	
	// above will give error default without default keyword
}
