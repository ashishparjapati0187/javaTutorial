package com.basics;

public class ConstructorClass2 {

	public static void main(String[] args) {
		
		ConstuructorClass obj=new ConstuructorClass();
		ConstuructorClass value=new ConstuructorClass(10, 20);
		
		System.out.println("normal consatructor value="+obj.toString());
		System.out.println("parameter consatructor value="+value.toString());

	}

}
