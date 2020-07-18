package com.basics;

public class MethodOverLoading {

	public static void main(String[] args) {
		System.out.println(add(10,20));
		System.out.println(add(10.20,23.30));
		System.out.println(add(20));
		

	}

	public static Integer add(Integer a, Integer b) {
		return a+b;
	}
	public static Double add(Double a, Double  b) {
		return a+b;
	}
	public static Integer add(Integer a) {
		return 2*a;
	}
	
}
