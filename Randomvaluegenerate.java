package com.javaprogram.com;

import java.util.HashSet;
import java.util.Set;

public class Randomvaluegenerate {

	public static void main(String[] args) {
				
		generateRamdomValue();

	}
	
	public static void generateRamdomValue()
	{
		Set<Integer> store = new HashSet<>();
		
		while(true)
		{
			int random  = (int) (Math.random() * 12) +1; 
			System.out.println(random);
			
			if(!store.contains(random))
			{
				store.add(random);
				System.out.println("Gift Number "+ store);		
			}
			
			
			if(store.size() == 12)
			{
				break; 
				
			}
			
			
			
			
		}
		
		
		
	}
	

}
