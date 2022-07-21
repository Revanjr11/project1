package com.collections;

import java.util.LinkedList;
import java.util.List;

public class Ques5Sec5 {

	public static void main(String[] args) {
		/*
		 * Get the each index value of 10 present in below list Input: List =
		 * 10,20,30,90,10,10,40,50,10
		 * 
		 */

		List<Integer> li = new LinkedList<Integer>();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		li.add(10);

		System.out.println(li);

		
	
		
		for (int i =0; i <li.size(); i++) {
			
			if (li.get(i)==10) {
				
				
				System.out.println(i);
				
				
			}
			
			
		}

	}

}
