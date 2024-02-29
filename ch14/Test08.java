package com.ruby.java.ch14;

import java.util.Arrays;

interface StringFunc2 {
	String[] modify(String s);
}
class EmptyStringException extends Exception {
	public EmptyStringException() {
		// TODO Auto-generated constructor stub
		super("Empty String");
	}
}
public class Test08 {
	public static void main(String[] args) {
		String str = "Korea,Australia,China,Germany,Spain,Turkey";
		StringFunc2 sf = (s) -> {
			try {
				int n = 1/s.length();
			}
			catch(Exception e) {
				System.out.println("Empty String");
			};
			return s.split(",");
		};
		String result[] = sf.modify(str);
		System.out.println(Arrays.toString(result));
		
		String str2 = "";
		String result2[] = sf.modify(str2);
		System.out.println(Arrays.toString(result2));
	}
}
