package com.Glider.ai;

import java.util.Scanner;

public class Pranthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String S=sc.next();
		System.out.println(chechPranthesis(S));
	}

	public static int chechPranthesis(String S) {
		int inserstion=0;
		int open=0;
		for(char c : S.toCharArray()) {
			if(c=='(') {
				open++;
			}
			else {
				if(open==0) {
					return inserstion++;
				}
				else {
					open--;
				}
			}
		}
		return open;
	
	}

}
