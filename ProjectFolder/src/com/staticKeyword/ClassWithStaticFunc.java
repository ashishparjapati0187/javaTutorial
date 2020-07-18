package com.staticKeyword;

public class ClassWithStaticFunc {
	
	public static Integer value;

	public static Integer getValue() {
		return value;
	}

	public static void setValue(Integer value) {
		ClassWithStaticFunc.value = value;
	}

	public static String staticClassMethod(String s) {
		System.out.println("static method called");
		return s;
	}
	
	public  String nonStaticClassMethod(String s) {
		System.out.println("non static method called");
		return s;
	}
}
