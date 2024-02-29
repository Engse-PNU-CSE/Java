package com.ruby.java.homework;

import java.util.Scanner;
import java.lang.Math;

public class PrimeNumber2 {
	static boolean isPrime(int n) {
		if(n==1) return false;
		for(int i=2; i<=(int)Math.sqrt((double)n); i++) if(n%i ==0) return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		
		for(int j=(int)Math.pow(10, num-1); j<(int)Math.pow(10, num); j++) {
			if(isPrime(j)) System.out.println(j + " is Prime Number.");
		}
	
		sc.close();
	}

}
