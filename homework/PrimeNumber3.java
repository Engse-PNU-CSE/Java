package com.ruby.java.homework;

import java.util.Scanner;
import java.lang.Math;

public class PrimeNumber3 {
	static boolean isPrime(int n) {
		if(n==1) return false;
		for(int i=2; i<=(int)Math.sqrt((double)n); i++) if(n%i ==0) return false;
		return true;
	}
	static String reverse(String s) {
		String str = "";
		for(int i = s.length()-1; i>=0; i--) str+=s.charAt(i);
		return str;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		for(int i=(int)Math.pow(10.0, num-1); i<(int)Math.pow(10.0, num); i++) {
			if(isPrime(i)) {
				String str = Integer.toString(i);
				String str2 = reverse(str);
				if(str.equals(str2)) System.out.println(i);
			}
		}
		sc.close();
	}

}
