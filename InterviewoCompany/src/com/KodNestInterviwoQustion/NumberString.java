
//1. Create a program that takes a string representing a number between 1 and
//999,999,999 and formats it with commas as separators. For example, the input
//"4500000" should return "4,500,000".
package com.KodNestInterviwoQustion;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NumberString {

	public static void formatNumberWithCommas(String str) {
		//parse the input String to a number
		long parsedNumber = Long.parseLong(str);
		NumberFormat numberFormate= NumberFormat.getNumberInstance(Locale.US);
		//return numberFormate.format(parsedNumber);
		System.out.println(numberFormate.format(parsedNumber));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String str=sc.next();
		formatNumberWithCommas(str);
		//System.out.println(formatNumberWithCommas(str));
	}
}
