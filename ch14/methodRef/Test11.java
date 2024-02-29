package com.ruby.java.ch14.methodRef;

interface MyFunc<T> {
	int func(T[] arr,  T val);
}

class MyUtil {
	static <T> int count(T[] arr, T val) {
		int cnt = 0;
		for(int i = 0 ; i < arr.length; i++) if(arr[i] == val) cnt++;
		return cnt;
	}
}

public class Test11 {
	static <T> int test(MyFunc<T> mf, T[] arr, T val) {
		return mf.func(arr, val);
	}
	public static void main(String[] args) {
		
	}
}
