package com.finalKeyword;



class JavaFinalMethodex{  
	  final void run(){System.out.println("running");}  
	}  
	     
	class Honda extends JavaFinalMethodex{  
	   //void run(){System.out.println("running safely with 100kmph");}  
	   // we cannot change defination of final method 
	     
	   public static void main(String args[]){  
	   Honda honda= new Honda();  
	   honda.run();  
	   }  
	}  