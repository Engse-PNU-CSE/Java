package com.ruby.java.ch12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test03 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Enter the name");
			String name = br.readLine();
			System.out.printf("Hello, %s!", name);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
