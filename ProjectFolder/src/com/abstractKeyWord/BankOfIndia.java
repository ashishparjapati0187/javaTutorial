package com.abstractKeyWord;

public class BankOfIndia  extends Bank {

	public Integer getInterest() {
		return 100;	
	}
	
	// if this method is not present then there will be an error
		// Bank contains one abstract method which must be defined in erieved class
}
