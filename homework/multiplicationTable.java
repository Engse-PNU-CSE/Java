package com.ruby.java.homework;

public class multiplicationTable {

	public void print(int number) {
		System.out.println(number + "단 출력");
		for(int i = 1; i < 10; i++) System.out.println(number + " * " + i + " = " + i*number);
		System.out.println("-".repeat(15));
	}

}
