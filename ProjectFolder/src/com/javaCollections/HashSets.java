package com.javaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set=new HashSet();
		set.add("ashish");
		set.add("parjapati");
		set.add("ashish");
		System.out.println("list = "+set);
		Iterator<String> itr=set.iterator();

	}

}
