package com.javaCollections;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDeqeue {

	public static void main(String[] args) {
		
		ArrayDeque<String> deQue=new ArrayDeque<>();
		
		// or
		
		Queue<String> que=new ArrayDeque<String>();
		
		// Queue is interface and ArrayDeque implements that
		deQue.add("ashish"); // ashish
		deQue.add("kumar");   // ashish kumar 
		deQue.offerFirst("ashish"); // ashish ashish kumar
		deQue.removeLast(); // ashish ashish
		
		System.out.println("dequeue = "+deQue);

	}

}
