package com.ruby.java.baekjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		int num[] = new int[s.length()];
		for(int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			num[i]=(int)c - 55;
		}
		
		sc.close();
	}
}
