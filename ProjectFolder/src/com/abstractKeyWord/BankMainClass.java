package com.abstractKeyWord;

public class BankMainClass {

	public static void main(String[] args) {
		
		Bank customer1=new BankOfBaroda();
		// reference         object
		// object    with    form
		
		Bank customer2=new ICICIBank();
		Bank customer3=new BankOfIndia();
		System.out.println("cust 1 interest = "+customer1.getInterest());
		System.out.println("cust 2 interest = "+customer2.getInterest());
		System.out.println("cust 3 interest = "+customer3.getInterest());
		
		// Bank obj=new Bank(); we cannot create instance of abstract class
		
		

		
	}

}
