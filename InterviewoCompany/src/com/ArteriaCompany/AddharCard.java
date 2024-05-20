package com.ArteriaCompany;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddharCard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		String adha=sc.next();
		Pattern a=Pattern.compile("\\d{12}");
		Matcher m=a.matcher(adha);
		if(m.matches())
		{
			System.out.println("Addhar Card Validate");//123467893042
		}
		else {
			System.out.println("Addhar Card Not Validate");//5678098043
		}

	}

}
