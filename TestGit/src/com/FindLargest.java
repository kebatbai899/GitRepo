package com;

public class FindLargest {
	public static int largestFind(int myArray[]) {
		int greatest=0;
		if(myArray==null) {
			greatest=0;
		}else {
			for(int number: myArray) {
				if(number>=greatest) {
					greatest=number;
				}
			}
		}
		
		return greatest;
	}
	public static void something() {
		System.out.println("hello from something");
	}
}
