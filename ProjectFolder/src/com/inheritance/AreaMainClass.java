package com.inheritance;

public class AreaMainClass {

	public static void main(String[] args) {

		Rectangle rec=new Rectangle();
		Triangle tri=new Triangle();
		
		rec.setHieght(10.00);
		rec.setLength(20.00);
		
		tri.setHieght(10.00);
		tri.setLength(20.00);
		
		
		System.out.println(" rec.area() = "+rec.area());
		System.out.println("tri.area() = "+tri.area());
		

	}

}
