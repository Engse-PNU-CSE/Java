package com.ruby.java.ch09;

//구현 실습 코드
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test_StringStringArray {
	static void getData(String[] arr, String st) {
		int cnt=0;
		StringTokenizer st1 = new StringTokenizer(st);
		while (st1.hasMoreTokens()) {
			arr[cnt++]=st1.nextToken();
		}
	}
	static void showData(String[] arr) {
		System.out.println(arr.toString());
	}
	/*
	 * 교재 407 Test02: if (s1 == s2)
	 * 교재 409 Test02: if (s1.equals(s2))
	 * compareTo() 사용 
	 */
	static void findString(String[] arr, String st) {
		for (int i = 0; i < arr.length; i++) {

		}
		System.out.println(st + "배열에 없다");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[]arr= new String[5];
		System.out.print("Enter String : ");
		String st = sc.next();
		System.out.print("Enter String : ");
		String check = sc.next();
		//화면에서 입력
		getData(arr, st);
		showData(arr);
		findString(arr, check);
		sc.close();
	}
}
