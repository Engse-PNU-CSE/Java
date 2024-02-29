package com.ruby.java.baekjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int index_i=0, index_j=0;
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j ++) {
				int n = sc.nextInt();
				if(max < n) {
					max = n;
					index_i = i+1;
					index_j = j+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(index_i + " " + index_j);
		sc.close();
	}
}
