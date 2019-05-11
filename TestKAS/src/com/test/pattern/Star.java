package com.test.pattern;

import java.util.*;
public class Star {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in); 
		System.out.println("Enter No of Lines to Print:");
		int n= scan.nextInt();
		printStarPattern(n);
		
	}
	
	public static void printStarPattern(int n) {
		
		for(int i=0;i<n;++i)
		{
			for(int j=1;j<=(n-i-1);++j) 
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i; ++k)
			{
			System.out.print("*"+" ");
			}
			
			System.out.println("\n");
			
		}
		
		
		
		
		
	}
	
	
}
