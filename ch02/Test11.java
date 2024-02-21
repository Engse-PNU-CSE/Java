package com.ruby.java.ch02;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0b00000000000000000000000000001100; //2진수 표현시 앞에 0b를 붙임
		int b = 0b11111111111111111111111111110100;
		
		System.out.println(a + "  " + b);
		
		a = 12;
		b = -12;
		
		String aBit = Integer.toBinaryString(a);
		System.out.println("aBit = " + aBit);
		String bBit = Integer.toBinaryString(b);
		System.out.println("bBit = " + bBit);
		//toBinaryString 메서드는 정수를 2진수로 바꾸어 문자열로 만들어 줌
	}

}
