package com.ruby.java.ch02;

public class Test15 {

	public static void main(String[] args) {
		char c = 'F';
		String gender;
		
		if(c == 'F') gender = "여자";
		else gender = "남자";
		System.out.println("gender = " + gender);
		
		String gender1 = (c=='F') ? "여자" : "남자";//삼항연산자 : 변수 = (if)조건 (then)? 참 (else): 거짓
		System.out.println("gender1 = " + gender1);
		
	}

}
