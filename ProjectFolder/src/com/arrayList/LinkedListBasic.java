package com.arrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBasic {

	public static void main(String[] args) {

		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(2);
		list.add(3);
		list.add(3);
		//list.addFirst(3);
		list.lastIndexOf(3);
		
		System.out.println("link list = "+list);
		System.out.println("list.lastIndexOf(3) at "+list.lastIndexOf(3));
		
		

	}

}
