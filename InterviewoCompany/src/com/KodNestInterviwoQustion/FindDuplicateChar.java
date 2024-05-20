
//Write a program that identifies and prints all the duplicate characters in a
//given string. For example, in the string "programming", the duplicate
//characters are "r", "g", and "m".
package com.KodNestInterviwoQustion;

public class FindDuplicateChar {

	public static void main(String[] args) {
		String str="Programming";
		//System.out.println(findDuplicateChar(str));
		findDuplicateChar(str);
	}

	public static void findDuplicateChar(String str) {
		int[] count = new int[256];
		//convert string to character
		for(char c : str.toCharArray()) {
			//Increment the character count in the array
			count[c]++;
		}
		System.out.println("Duplicate String");
		boolean dupfind=false;
		for(int i=0; i<count.length; i++) {
			if(count[i] > 1) {
				System.out.println((char) i+" ");
				dupfind=true;
			}
		}
		if(!dupfind) {
			System.out.println("Noun");
		}
	}

}
