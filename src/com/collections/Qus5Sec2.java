package com.collections;

import java.util.LinkedList;
import java.util.List;

public class Qus5Sec2 {
public static void main(String[] args) {
	/*Get the last index value of 10 
	 *   Input:   List = 10,20,30,90,10,10,40,50
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
	
	System.out.println(li);
	
	// to fine the last index value of 10....
	
	int lastIndexOf = li.lastIndexOf(10);
	System.out.println("last index value of 10 is "+lastIndexOf);
	
}
	
}
