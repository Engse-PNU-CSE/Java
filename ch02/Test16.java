package com.ruby.java.ch02;

public class Test16 {

	public static void main(String[] args) {
		byte a = 23;
		int b = a;
		System.out.println(b);
		
		byte c = 23;
		short d = 47;
		int e = 65;
		int f = c + d + e; //다른형의 연산이 발생할 경우에, 기본적으로 가장 큰 형태의 형으로 자동형변환이 발생함
		System.out.println(f);
		
		int g = 23;
		byte h = (byte)g;
		System.out.println(h);
		
		byte i = 10;
		byte j = 20;
		byte k = (byte)(i+j);// + 연산을 수행할때는 각 값이 int로 바뀌어서 실행이 되기 때문에 형변환이 필수
		System.out.println(k);
	}

}
