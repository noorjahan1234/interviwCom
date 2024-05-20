package com.ArteriaCompany;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckMail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mobile Number");
		String email=sc.next();
		checkEmail(email);
	}

	public static void checkEmail(String email) {
		//compile regular expression get pattern
		Pattern p=Pattern.compile("^[0-9](.+)@(.+)$");
		//creating the instance to matcher
		Matcher m=p.matcher(email);
		if(m.matches())
		{
			System.out.println("Mail is Validate");
		}
		else
		{
			System.out.println("Mail is Not-Validate");
		}
	}

}
