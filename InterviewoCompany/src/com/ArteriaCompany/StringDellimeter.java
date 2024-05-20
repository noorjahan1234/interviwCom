package com.ArteriaCompany;

public class StringDellimeter {

	public static void main(String[] args) {
		String str1="Hello,world";
		String s[]=str1.split("\\.",4);
		for(String s1 : s)
		{
			System.out.println(s1);
		}
	}

}
