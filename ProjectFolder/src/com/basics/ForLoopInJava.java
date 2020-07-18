package com.basics;

public class ForLoopInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] value= {1,5,3,5};
		
		for(int i=0;i<value.length;i++) {
			System.out.println(" value at "+i+" = "+value[i]);
		}
		for(Integer val:value) {
			System.out.println(" value at"+val);
		}
	}

}
