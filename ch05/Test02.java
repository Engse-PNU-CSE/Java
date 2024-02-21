package com.ruby.java.ch05;

public class Test02 {
	static void test(String name, int... v) {
		System.out.print(name + " : ");
		for(int x : v) System.out.print(x + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		test("엄복동", 11, 22, 33);
		test("엄준식", 1, 2);
		test("james", 1, 5, 9, 4);
	}

}
