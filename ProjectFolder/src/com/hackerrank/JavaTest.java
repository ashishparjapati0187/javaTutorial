package com.hackerrank;

import java.util.Scanner;

public class JavaTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Integer size=sc.nextInt();
		
		
	Boolean checkOddorEven=false;
	Integer sum=0;
	
	
		for(int i=1;i<=size;i++) {
			
			String valueString=String.valueOf(i);
			System.out.println("number ="+valueString);
			
			if(valueString.length()>1)
			{
				
				Boolean innerCheck=!checkOddorEven;
				System.out.println("length="+valueString.length());
				for(int l=0;l<valueString.length();l++) {
					System.out.println("innerCheck = "+innerCheck);
					if(innerCheck)
						sum=sum-Integer.valueOf(valueString.charAt(l));
					else if(!innerCheck)
						sum=sum+Integer.valueOf(valueString.charAt(l));
					
					
					innerCheck=!innerCheck;
				}
				checkOddorEven=!innerCheck;
			}
			else {
				System.out.println("checkOddorEven = "+checkOddorEven);
				if(checkOddorEven)
					sum=sum-i;
				else if(!checkOddorEven)
					sum=sum+i;
			}
			
			checkOddorEven=!checkOddorEven;
			
				
		}
		System.out.println("sum= "+sum);

	}

}
