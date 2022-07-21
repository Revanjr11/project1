package com.collections;

import java.util.LinkedList;
import java.util.List;

public class Ques5Sec4 {

	public static void main(String[] args) {
		/*
		 * Get the index value of 90 Input: List = 10,20,30,90,10,10,40,50
		 * 
		 */

		// creating a list by given Input.....

		List<Integer> li = new LinkedList<Integer>();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);

		System.out.println(li);

		// Get the index value of 50

		int indxOf = li.indexOf(90);
		System.out.println("index value of 90 is.."+indxOf);

	}
}
