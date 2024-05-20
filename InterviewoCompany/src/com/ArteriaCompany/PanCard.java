package com.ArteriaCompany;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanCard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		String pan=sc.next();
		Pattern p=Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		Matcher m=p.matcher(pan);
		if(m.matches())
		{
			System.out.println("Pan Card Validate");//ABCDE1234F
		}
		else {
			System.out.println("Pan Card Not Validate");//ABCDE1234
		}
	}

}
