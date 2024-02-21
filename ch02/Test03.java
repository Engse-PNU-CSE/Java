package com.ruby.java.ch02;

public class Test03 {

	public static void main(String[] args) {
		//int num = 2147483647;
		int numSize = Integer.SIZE;
		System.out.println("numSize = " + numSize);
		
		//long d = 2147483648L;
		//8 byte면 메모리 공간이 충분하지만 왜그런지?
		//아무말이 없으면 그냥 4byte int 로 간주함, 그래서 끝에 L을 붙여줘야함
		//d변수가 8byte인지 확인하는 방법은?
		int dSize = Long.SIZE;
		System.out.println("dSize = " + dSize);
		
		float exchangeRate = 1236.50f;
		//아무 표시가 없다면 double로 간주하기 때문에 오류가 발생함
		//따라서 float로 표현하기 위해서는 JAVA에서는 숫자의 끝에 f를 붙여주어 표시함
		//double은 8바이트, float는 4바이트;
		//8byte -> 4byte에서 형변환을 할때, 정보손실이 발생함
		System.out.println(exchangeRate);
	}
	
}
