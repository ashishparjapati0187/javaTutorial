package com.finalKeyword;

public class InitialiseFinalVariableInContructor {
	
	public final Integer limit;
	InitialiseFinalVariableInContructor(){
		limit=100;
	}
	

	public static void main(String[] args) {
		
		InitialiseFinalVariableInContructor obj=new InitialiseFinalVariableInContructor();

	}

}
