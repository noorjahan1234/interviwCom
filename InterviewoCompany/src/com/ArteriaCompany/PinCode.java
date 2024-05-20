package com.ArteriaCompany;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		String pan=sc.next();
		Pattern p=Pattern.compile("\\d{6}");
		Matcher m=p.matcher(pan);
		if(m.matches())
		{
			System.out.println("Pin Code Validate");//ABCDE1234F
		}
		else {
			System.out.println("Pin Code Not Validate");//ABCDE1234
		}
	}

}
