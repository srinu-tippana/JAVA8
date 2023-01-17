package com.javanew.imper;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample {
	
	public static void main(String[] args)
	{
		/*
		 * Imperative - o to 100 num sum
		 */
		
		int sum =0;
		for(int i=0;i<=100;i++)
		{
			sum+=i;
		}
		 sum =IntStream.rangeClosed(1,100)
				 .parallel()
		         .sum();
		 
		 System.out.println(sum);
	}
	

}
