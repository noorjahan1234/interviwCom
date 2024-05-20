
//Write a program that, given a string, outputs all the possible pairs of
//consecutive characters. For example, given the input "hello", the output
//should be ["he", "el", "ll", "lo"].
package com.KodNestInterviwoQustion;

public class ConsentiveChar {

	public static void main(String[] args) {
		String str="hello";
		String[] res=findConsecutivePairs(str);
		for(String pair : res) {
			System.out.println(pair);
		}
	}

	public static String[] findConsecutivePairs(String str) {
		// Check if the string length is less than 2
		if(str.length() < 2) {
			return new String[0]; //// Initialize an array to hold the pairs of consecutive characters
		}
		String[] pairs = new String[str.length() - 1];
		for(int i=0; i<str.length()-1; i++) {
			// // Form a pair using consecutive characters
			pairs[i] = str.substring(i, i+2);
		}
		return pairs;
	}

}
