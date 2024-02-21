package com.ruby.java.ch02;

public class Test02 {
	public static void main(String[] args) {
		int depositAmount = 50000;
		float ratio = 0.14f;
		boolean result = true;
		char gender = 'F';
		String name = "AMY";
		char c = '\u0057';
		
		result = false;
		
		System.out.println("code = " + c + ", Gender = " + gender);
		System.out.println("Name : " + name);
		System.out.print("저금액 : \t" + depositAmount + "\n");
		System.out.print(ratio + "\n");
		System.out.print(result + "\n");
	}
}
