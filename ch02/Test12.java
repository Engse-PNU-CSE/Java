package com.ruby.java.ch02;

public class Test12 {

	public static void main(String[] args) {
		int a = 017;//8진접을 표현할때는 앞에 0만 붙여줌
		int b = 0xf;//16진법을 표현할때는 앞에 0x를 붙여줌
		
		System.out.println("a = " + a + ", b = " + b);
		
		String hexa = Integer.toHexString(b);//toHexString은 숫자를 16진수로 바꾸어 문자열로 저장함
		
		System.out.println("hexa = " + hexa);
	}

}
