package com.ruby.java.homework;

import java.util.Random;

public class Maxrix {
	public static void main(String[] args) {
		int A[][] = new int[3][4];
		int B[][] = new int[4][5];
		int C[][] = new int[3][5];//C는 A*B의 값을 출력하시오.
		int D[][] = new int[3][4];//D는 A+B의 값을 출력하시오.
		int E[][] = new int[3][4];//E는 A+D의 값을 출력하시오.
		int F[][] = new int[4][3];//F는 A의 전치행렬
	
		Random rand = new Random();
		
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A[i].length; j++) {
				A[i][j] = rand.nextInt(10);
				B[i][j] = rand.nextInt(10);
			}
		}
		for(int i = 0; i < C.length; i++) {
			for(int j = 0; j < C[i].length; j++) {
				int sum=0;
				for(int k = 0; k < A[i].length; k++) sum+=A[i][k]*B[k][j];
				C[i][j]=sum;
			}
		}
		for(int i = 0; i < D.length; i++) {
			for(int j = 0; j < D[i].length; j++) D[i][j] = A[i][j] + B[i][j];
		}
		for(int i = 0; i < E.length; i++) {
			for(int j = 0; j < E[i].length; j++) E[i][j] = A[i][j] + D[i][j];
		}
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A[i].length; j++) {
				F[j][i] = A[i][j];
			}
		}
		System.out.println("Maxtrix A");
		printMatrix(A);
		System.out.println("Maxtrix B");
		printMatrix(B);
		System.out.println("Maxtrix C");
		printMatrix(C);
		System.out.println("Maxtrix D");
		printMatrix(D);
		System.out.println("Maxtrix E");
		printMatrix(E);
		System.out.println("Maxtrix F");
		printMatrix(F);
		
	}
	static void printMatrix(int arr[][]) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
