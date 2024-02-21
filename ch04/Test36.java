package com.ruby.java.ch04;

public class Test36 {
	public static void main(String[] args) {
		char letter = 'A';
		char[] alphabet = new char[26];
		
		for(int i = 0; i < alphabet.length; i++) alphabet[i] = (char) (letter+i);
		//type castinig -> int와 char을 연산할시에, + 연산자는 정수에 대한것이기 때문에, char의 묵시적 형변환이 발생함
		for(char c : alphabet) System.out.print(c + " ");
		System.out.println();
	}
}
