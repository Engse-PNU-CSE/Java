package com.ruby.java.ch03;

import java.util.Scanner;

public class Test22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A : ");
		int a = sc.nextInt();
		System.out.print("Enter B : ");
		int b = sc.nextInt();
		System.out.print("Enter OP : ");
		String op = sc.next();
		
		switch(op) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "/":
			System.out.println(a / b);
			break;
		default :
			System.out.println("Wrong Operator");
		}
		sc.close();
	}
}
