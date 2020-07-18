package com.staticKeyword;

public class StaticExampleClass {
	
	Integer rollNo;
	String name;
	static Integer noOfStudent=0;  // made static to track no . of students in school
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	 StaticExampleClass() {
		noOfStudent++;              // don't use this. keyword as its not specific to partcular instance
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static Integer getNoOfStudent() {
		return noOfStudent;
	}
	public static void setNoOfStudent(Integer noOfStudent) {
		StaticExampleClass.noOfStudent = noOfStudent;
	}
	

}
