package com.arrayList;

import java.util.ArrayList;

public class ArrayListBasic {

	public static void main(String[] args) {
		
		int[] array= {6,9,8};
		ArrayList<Integer> list=new ArrayList<>();
		list.add(array[0]);
		list.add(array[2]);
		list.set(1, array[1]);
		System.out.println(" arrayList = "+list);
		int a=2&2;
		
		System.out.println("aa"+a);
		
//		list.remove(1);
//		System.out.println(" removed after values= "+list);
//		
//		list.set(0, 45);
//		System.out.println(" set after values= "+list);

//		list.clear();
//		System.out.println(" clear after values= "+list);
		
		
		
	    /**
	     * Trims the capacity of this <tt>ArrayList</tt> instance to be the
	     * list's current size.  An application can use this operation to minimize
	     * the storage of an <tt>ArrayList</tt> instance.
	     */
		
		list.trimToSize();
		System.out.println("size after trim"+list.size());
	}

}
