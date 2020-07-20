package com.javaCollections;

import java.util.Iterator;
import java.util.PriorityQueue;


public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> q=new PriorityQueue<>();
		
		q.add("ashish");
		q.add("kumar");
		q.add("parjapati");
		System.out.println("element : head "+q.element());
		
		System.out.println("peek :head "+q.peek());
		Iterator itr=q.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		
		q.remove();  
		q.poll();  
		}  

	}

}
