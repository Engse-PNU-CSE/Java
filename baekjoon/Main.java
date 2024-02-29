package com.ruby.java.baekjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		int num[] = new int[s.length()];
		if(n > 10) { 
			for(int i = 0; i < s.length(); i++) {
				char c=s.charAt(i);
				num[i]=(int)c - 55;
			}
		}
		else {
			for(int i = 0; i < s.length(); i++) {
				char c=s.charAt(i);
				num[i]=(int)c - 48;
			}
		}
		long tmp = 1;
		long sum = 0;
		for(int i = s.length()-1; i >= 0; i--) {
			sum += num[i] * tmp;
			tmp *= n;
		}
		System.out.println(sum);
		sc.close();
	}
}
