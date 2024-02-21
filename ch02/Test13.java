package com.ruby.java.ch02;

public class Test13 {

	public static void main(String[] args) {
		byte a = 0b00010001;
		byte b = 0b00100010;
		
		int c = a&b;
		System.out.println("c = " + Integer.toBinaryString(c));
		
		int d = a|b;
		System.out.println("d = " + Integer.toBinaryString(d));
		
		int e = a^b;
		System.out.println("e = " + Integer.toBinaryString(e));
		
		int f = 12;
		int g = (~f) + 1;//모든 비트 반대로 00001100 -> 11110011 -> 11110100
		System.out.println("g = " + g);
		
		int h = f << 1;//왼쪽으로 1비트 이동 00001100 -> 00011000
		int i = f >> 1;//오른쪽으로 1비트 이동 00001100 -> 00000110
		System.out.println("h = " + h);
		System.out.println("i = " + i);
	}
}
