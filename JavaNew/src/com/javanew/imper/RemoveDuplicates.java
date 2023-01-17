package com.javanew.imper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	
	public static void main(String[] args)
	{
	
	List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,9,10);
	
	List<Integer> uniqueList = new ArrayList<Integer>();
	
	
	

	
	for(Integer integer:integerList){
		if(!uniqueList.contains(integer))
		{
			uniqueList.add(integer);
		}
		
	}
	Iterator itr = uniqueList.iterator();
	
	while(itr.hasNext())
	{
		System.out.print(itr.next());
	}
	
	
	List<Integer> uniqueList1=integerList.stream()
	           .distinct()
	           .collect(Collectors.toList());
	
	System.out.println(uniqueList1);
	
	  
	
	}

}
