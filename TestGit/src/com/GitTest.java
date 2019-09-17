package com;

public class GitTest {

	public static void main(String[] args) {
		int a = 6;
		int[] myArray= {2,5,7,9};
		FindLargest function = new FindLargest();
		
		System.out.println("hello world "+a);
		System.out.println("hello world from remote");
		System.out.println("hello world from remote 2nd pull");
		System.out.println("last pull");
		
		function.something();
		System.out.println(function.largestFind(myArray));
		

	}

}
