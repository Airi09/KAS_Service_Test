package com.test.array;

import java.util.Scanner;

public class SumOfArray {
//Return true if sum of all pairs of array is divisible by k
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Size of Array");
		
		int N= scan.nextInt();
		int[] arr= new int[N];
		
		System.out.println("Enter Array");
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=scan.nextInt();
		}
		System.out.println("Enter value of K: ");
		int k =scan.nextInt();
		
		System.out.println(sumArray(arr,k));
		
		
	}
	
	public static boolean sumArray(int[] arr, int k) {
		
		boolean isFound =true;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(i != j) 
				{
					int sum=arr[i] + arr[j];
					if(sum%k==0) 
					{
					
						System.out.print("(" + arr[i] + ", " + arr[j] + ")"+" ");
						
						isFound =true;
					
					}
					else
					{
						isFound =false;
					}
				}
				
			}
			
		}
		System.out.println("\n");
		return isFound;
		
	}
	
}
