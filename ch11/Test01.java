package com.ruby.java.ch11;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("test start");
		test();
		System.out.println("test end");
	}
	
	private static void test() {
		System.out.println("test2 start");
		test2();
		System.out.println("test2 end");
	}
	private static void test2() {
		try {
			int arr[] = new int[3];
			arr[3]=30;
			System.out.println("ok");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Insert Wrong Index: " + e.getMessage());
			e.printStackTrace();
			//System.out.println(e.toString());
		}
		System.out.println("T_T");
		try {
			String s = new String("java");
			int len = s.length();
			s=null;
			s.length();
		}
		catch (NullPointerException e) {
			System.out.println("Null pointer : " + e.getMessage());
		}
		try {
			int a = 10/0;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
