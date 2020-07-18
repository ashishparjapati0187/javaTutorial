package com.staticKeyword;

public class CallingStaticClass {

	public static void main(String[] args) {
		
		ClassWithStaticFunc obj=new ClassWithStaticFunc();
		
		System.out.println("callin static method "+obj.staticClassMethod("and giving result"));
		System.out.println("callin non static method "+obj.nonStaticClassMethod("and giving result"));
		
		obj.getValue(); // not preferred
		ClassWithStaticFunc.getValue(); // this is preferred

	}

}
