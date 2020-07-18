package com.hackerrank;

import java.util.Scanner;

public class MindfireProblem {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Integer size=sc.nextInt();
	
	
     Boolean checkOddorEven=true;
     Integer sum=0;
     String valueString;
     
     for(int i=1;i<=size;i++) {
    	  valueString=String.valueOf(i); 
    	  
    	  for(int j=0;j<valueString.length();j++) {
    		  if(checkOddorEven) {
    			sum=sum+valueString.charAt(j);  
    			checkOddorEven=false;
    		  }
    		  else if(!checkOddorEven) {
      			sum=sum-valueString.charAt(j);  
      			checkOddorEven=true;
      		  }
    	  }
     }
     
     System.out.println("sum = "+sum);
}
}