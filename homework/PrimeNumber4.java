package com.ruby.java.homework;

import java.util.Scanner;

public class PrimeNumber4 {
	static boolean isPrime(int n) {
		if(n==1) return false;
		for(int i=2; i<=(int)Math.sqrt((double)n); i++) if(n%i ==0) return false;
		return true;
	}
	static boolean isAlsoPrime(int n, int m) {
		int num = (int)Math.pow(10, m-1);
		int temp=n;
		while(num>1) {
			if(!isPrime(temp)) return false;
			temp = temp%num;
			num/=10;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		
		for(int j=(int)Math.pow(10, num-1); j<(int)Math.pow(10, num); j++) {
			if(isAlsoPrime(j, num)) System.out.println(j);
		}
	
		sc.close();
	}
}
