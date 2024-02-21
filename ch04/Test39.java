package com.ruby.java.ch04;

import java.util.Random;

public class Test39 {
	public static void main(String[] args) {
		int arr[][]	 = new int[5][5];
		Random rand = new Random();
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) arr[i][j] = rand.nextInt(500);
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i == j) {
					if(arr[i][j] < 100) System.out.print(" ");
					if(arr[i][j] < 10) System.out.print(" ");
					System.out.print(arr[i][j] + " ");
				}
				else System.out.print("    ");
			}
			System.out.println();
		}
	}
}
