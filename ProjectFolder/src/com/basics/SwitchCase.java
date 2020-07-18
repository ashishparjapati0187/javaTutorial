package com.basics;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a=10;
		
		switch (a) {
		case 10:
			System.out.println("a= "+a);
			break;
		case 20:
			System.out.println("a= "+a);
		case 50:
		case 60:
			
		default:
			System.out.println("default");
			break;
		}

	}

}
