package com.ruby.java.ch03;

import java.util.Scanner;

public class Test25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num : ");
		int num = sc.nextInt();
		int sumEven=0, sumOdd=0;
		
		for(int i=1; i<=num; i++) {
			if(i%2 == 0) sumEven+=i;
			else sumOdd+=i;
		}
		
		System.out.println("Sum of Even Number from 1 to num : " + sumEven);
		System.out.println("Sum of Odd Number from 1 to num : " + sumOdd);
		sc.close();
	}

}
