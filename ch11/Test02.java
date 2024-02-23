package com.ruby.java.ch11;

public class Test02 {
	public static void main(String[] args) {
		System.out.println(test1());
	}
	private static int test1() {
		try {
			int a=10/0;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
			//e.printStackTrace();
			//System.out.println(e.toString());
		}
		finally {
			System.out.println("4");
		}
		System.out.println("5");
		return 1;
	}
}
