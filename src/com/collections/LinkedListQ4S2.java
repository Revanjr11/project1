package com.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListQ4S2 {

	public static void main(String[] args) {
		
/*Create a new LinkedListlist with values and find the length of it
 *        
 *        Input : List = 100,200,300,400,500,600,700
 */
		
		
		List <Integer> li = new  LinkedList<Integer>();
		
	
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		
		System.out.println(li);
		
//	To	find the Length of the ArrayList
		
		int si = li.size();
		System.out.println("The Lenth is "+si);
		
	}
	
	
}
