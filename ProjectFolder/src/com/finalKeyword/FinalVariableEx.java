package com.finalKeyword;

public class FinalVariableEx {
	
	final Integer limit=10;
	
	void run() {
		//limit=100;  we can't change value of final in function also
	}
	
	public static void main(String[] args) {
		
		FinalVariableEx obj=new FinalVariableEx();
		//obj.limit=100;   it will give error as its final variable and cant be changed
	}

	public Integer getLimit() {
		return limit;
	}
	
	FinalVariableEx(){
		//limit=90;   only be initialised in constructor not be changed
	}
	
}
