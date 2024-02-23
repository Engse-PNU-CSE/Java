package com.ruby.java.ch11;

import java.io.FileInputStream;
import java.io.IOException;

public class Test04 {
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void test() throws Exception {
		FileInputStream fi = new FileInputStream("input1.txt");
		int c = fi.read();
		System.out.println((char) c + " = " + c);
		c = fi.read();

	}
}
