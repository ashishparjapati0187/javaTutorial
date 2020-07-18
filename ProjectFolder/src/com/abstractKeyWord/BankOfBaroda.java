package com.abstractKeyWord;

public class BankOfBaroda extends Bank{
	
	public Integer getInterest() {
		return 10;	
	}
	
	// if this method is not present then there will be an error
	// Bank contains one abstract method which must be defined in erieved class

}
