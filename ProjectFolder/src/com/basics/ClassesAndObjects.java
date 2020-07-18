package com.basics;

public class ClassesAndObjects {

	String name;
	Integer rollNo;
	Integer age;

	@Override
	public String toString() {
		return "ClassesAndObjects [name=" + name + ", rollNo=" + rollNo + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

}
