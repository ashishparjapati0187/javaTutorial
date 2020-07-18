package com.inheritance;

public class Triangle extends Polygon{
	
//	protected Double length;
//	protected Double hieght;  // they are indirectly here as it extend that class
	
	public Double area() {
		return (length*hieght)/2;
	}

}
