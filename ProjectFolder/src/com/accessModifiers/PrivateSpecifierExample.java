package com.accessModifiers;

public class PrivateSpecifierExample {
	
	private Integer privateVariable; // it will not be accessible by its class instance
	// only access by class name directly

	private Integer getPrivateVariable() {
		return privateVariable;
	}

	private void setPrivateVariable(Integer privateVariable) {
		this.privateVariable = privateVariable;
	}
	
	
	
	

}
