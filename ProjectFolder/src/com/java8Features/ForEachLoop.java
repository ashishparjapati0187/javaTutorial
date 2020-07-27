package com.java8Features;

import java.util.Arrays;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
	
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		// external loop
		for(Integer i:list) {
			System.out.println("internal loop values= "+i);
		}
		
		// internal loop in java 8
		list.forEach(value->System.out.println("internal lop value="+value));

	}

}
