package com.ruby.java.ch14;

interface NumberFunc {
	int func(int n);
}

public class Test05 {
	public static void main(String[] args) {
		NumberFunc sum = (n) -> {
			int result = 0;
			for(int i = 1; i <= n; i++) result += i;
			return result;
		};
		NumberFunc odd = (n) -> {
			int result = 0;
			for(int i = 1; i <= n; i++) if(i%2==1) result += i;
			return result;
		};
		NumberFunc even = (n) -> {
			int result = 0;
			for(int i = 1; i <= n; i++) if(i%2==0) result += i;
			return result;
		};
		System.out.println("1부터 10까지의 합 : " + sum.func(10));
		System.out.println("1부터 100까지의 합 : " + sum.func(100));
		System.out.println("1부터 10까지의 짝수합 : " + even.func(10));
		System.out.println("1부터 10까지의 홀수합 : " + odd.func(10));
		System.out.println("1부터 100까지의 짝수합 : " + even.func(100));
		System.out.println("1부터 100까지의 홀수합 : " + odd.func(100));
	}
}
