package com.ruby.java.ch03;

import java.util.Scanner;

public class Test23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Grade : ");
		String Grade = sc.next();
		
		switch(Grade) {
		case "A":
			System.out.println("Over 90");
			break;
		case "B":
			System.out.println("Over 80");
			break;
		case "C":
			System.out.println("Over 70");
			break;
		case "D":
			System.out.println("Over 60");
			break;
		default :
			System.out.println("Under 60");
		}
		sc.close();
	}
}
