package com.hackerrank;

import java.util.Scanner; 

public class ReverseArabicNumber { 
public static void main(String[] args) { 
  Scanner sc = new Scanner(System.in); 
 //Integer a=Integer.parseInt(args[0]);
  Integer a=sc.nextInt();
  Integer b=sc.nextInt();
  Integer numA=a;
  Integer numB=b;
  while(numA>0) {
	  if(numA%10==0)
		  {
		  numA=numA/10;
		  }
	  else break;
	  
  }
  while(numB>0) {
	  if(numB%10==0)
		  {
		  numB=numB/10;
		  }
	  else break;
	  
  }
  System.out.println("numA = "+numA);
  System.out.println("numB = "+numB);
//  
//  
//  String valueA=numA.toString();
//  String valueB=numB.toString();
  StringBuffer strA=new StringBuffer(numA.toString());
  StringBuffer strB=new StringBuffer(numB.toString());
  
  
  strA=strA.reverse();
  strB=strB.reverse();
  System.out.println(" A= "+strA);
  System.out.println(" B= "+strB);
  Integer sum=Integer.parseInt(strA.toString())+Integer.parseInt(strB.toString());
  System.out.println("sum="+sum);
  
  StringBuffer sumReverse=new StringBuffer(sum.toString());
  System.out.println("sum="+sumReverse.reverse());
  

  


} 
}
