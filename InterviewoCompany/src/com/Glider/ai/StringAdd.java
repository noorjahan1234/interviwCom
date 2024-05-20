package com.Glider.ai;

import java.util.Scanner;

public class StringAdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		String s1=sc.next();
		System.out.println("Enter the second number");
		String s2=sc.next();
		System.out.println("Enter the third number");
		String s3=sc.next();
		String res=letters(s1, s2, s3);
		System.out.println(res);
	}

	private static String letters(String s1, String s2, String s3) {
		String conbmnation=s1+s2;
		for(char c : conbmnation.toCharArray())
		{
			if(s3.indexOf(c)==-1) {
				return "No";
			}
			s3=s3.replaceFirst(String.valueOf(c), "");
		}
		if(s3.isEmpty()) {
			return "Yes";
		}
		return "No";
	}

}
