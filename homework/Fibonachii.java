package com.ruby.java.homework;

import java.util.Scanner;

public class Fibonachii {
	static int cal(int n) {
		if(n==1) return 1;
		else if(n==0) return 0;
		return cal(n-1) + cal(n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i < n; i++) System.out.println(cal(i));
		sc.close();
	}
}
