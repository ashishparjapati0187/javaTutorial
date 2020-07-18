package com.accessModifiers;

public class AccessPrivateVariableMainClass {

	public static void main(String[] args) {
		
		AccessPrivateVariablesClass obj=new AccessPrivateVariablesClass();
		
		//obj.name="main";  it will give error as variable is private
		// hence to access private variable we have to  create getter and setter 
		//for that variable with public access modifier
		
		obj.setName("ashish");
		
       System.out.println("private variable value= "+obj.getName());
	
		
	}
	
}
