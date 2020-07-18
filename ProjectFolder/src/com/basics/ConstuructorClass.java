package com.basics;

public class ConstuructorClass {
	
	Integer a=10;
	Integer b=20;
	
	  ConstuructorClass(){ 
		
	}
	  ConstuructorClass(Integer a, Integer b){
		  this.a=a;
		  this.b=b;
	  }
	@Override
	public String toString() {
		return "ConstuructorClass [a=" + a + ", b=" + b + "]";
	}
	  
	

}
