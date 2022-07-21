package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQ4S1 {

	public static void main(String[] args) {
		
		
//		Create a new ArrayListlist with values and find the length of it
//		Input : List = 10,20,30,90,10,10,40,50
		
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		
		System.out.println(li);
		
		
//	find the Length of the ArrayList
	
		int si = li.size();
		System.out.println("the length is "+si);
		
		
	}
	
}
