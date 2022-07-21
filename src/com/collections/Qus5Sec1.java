package com.collections;

import java.util.LinkedList;
import java.util.List;

public class Qus5Sec1 {
public static void main(String[] args) {
	
	/*Get the first index value of 10 
	 * Input:   List = 10,20,30,90
	 */
	
	List<Integer> li = new LinkedList<Integer>();
	
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(90);
	
	System.out.println(li);
	
	// to get the 1st index value
	
	Integer in = li.indexOf(10);
	System.out.println("Index value of 10 "+in);
	
	
	
}
	
	
}
