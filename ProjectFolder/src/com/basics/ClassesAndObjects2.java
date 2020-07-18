package com.basics;

public class ClassesAndObjects2 {

	public static void main(String[] args) {
		
		ClassesAndObjects obj=new ClassesAndObjects();
		
		obj.name="ashish"; // this is not preferred as anyone can change value of it(no encapsulation)
		obj.age=24;
		obj.rollNo=736953;
		
		System.out.println(" Object value= "+obj);
		
		// or
		
		obj.setName("Parjapati"); // this is mostly used(encapsulation)
		obj.setAge(24);
		obj.setRollNo(736953);
		
		System.out.println(" Object value= "+obj);
	}

}
