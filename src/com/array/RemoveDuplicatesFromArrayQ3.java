package com.array;

import java.util.Arrays;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromArrayQ3 {
	
	public static void main(String[] args) {
		
Integer ar[]= {10,10,20,50,60,80,60,50};
		
		
			
		Set<Integer> si = new TreeSet<>(Arrays.asList(ar));
		
		System.out.println(si);
		
		for (Integer x : si) {
			
			System.out.println(x);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
