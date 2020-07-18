package com.abstractKeyWord;

public class ICICIBank  extends Bank {

	public Integer getInterest() {
		return 200;	
	}
	
	// if this method is not present then there will be an error
		// Bank contains one abstract method which must be defined in erieved class
}
