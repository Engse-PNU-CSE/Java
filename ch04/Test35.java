package com.ruby.java.ch04;

public class Test35 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		
		for(int num : arr) System.out.println(num);
		
		String[] str = {"apple", "banana", "grape", "peach"};
		
		for(String st : str) System.out.print(st + " ");
		//배열의 모든 원소를 처리해야 할때, 즉 인덱스를 사용할 필요 없을때 사용함
		System.out.println();
	}
}
