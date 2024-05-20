package com.ArteriaCompany;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mobile Number");
		String mob=sc.next();
		checkMobile(mob);
		
	}

	public static void checkMobile(String mob) {
		//compile regular expression to get the pattern
		Pattern p=Pattern.compile("[0-9]{10}");
		//creating instance of matcher
		Matcher m=p.matcher(mob);
		if(m.matches()) {
			System.out.println("Yes");
		}
		else
		{
			System.out.println("not");
		}
	}

}
