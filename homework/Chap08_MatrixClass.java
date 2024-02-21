package com.ruby.java.homework;

import java.util.Random;

class Matrix {
    private int[][] matrix;
    int row;
    int col;
    
    Matrix addMatrix(Matrix b) {
		Matrix m = new Matrix(this.row, this.col);
		m.setMatrix(addMatrix(this.matrix, b.getMatrix()));
		return m;
	}
	Matrix multiplyMatrix(Matrix b) {
		Matrix m = new Matrix(this.row, b.col);
		m.setMatrix(multiplyMatrix(this.matrix, b.getMatrix()));
		return m;	
	}
	Matrix transposeMatrix() {
		Matrix m = new Matrix(this.col, this.row);
		m.setMatrix(transposeMatrix(this.matrix));
		return m;
	}
    
    public Matrix(int row, int col) {
    	this.row=row;
    	this.col=col;
    }

    public Matrix() {
	}
    
    void getData() {
    	this.matrix=makeMatrix(row, col);
    }

	public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void showMatrix(String str) {
    	System.out.println(str);
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private int[][] addMatrix(int[][] arr1, int[][] arr2) {
        int add[][] = new int[arr1.length][arr1[0].length];
        for(int i = 0; i < arr1.length; i++) for(int j=0; j < arr1[i].length; j++) add[i][j] = arr1[i][j] + arr2[i][j];
        return add;
    }

    private int[][] multiplyMatrix(int[][] arr1, int[][] arr2) {
        int[][] mulMatrix = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    mulMatrix[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return mulMatrix;
    }
    private int[][] transposeMatrix(int[][] arr) {
    	int[][] transMatrix = new int[arr[0].length][arr.length];
    	for(int i = 0; i < arr.length; i++) for(int j = 0; j < arr[i].length; j++) transMatrix[j][i]=arr[i][j];
    	return transMatrix;
    }
    
    private int[][] makeMatrix(int row, int col) {
    	Random rand = new Random();
    	int[][] randMatrix = new int [row][col];
    	for(int i = 0; i < row; i++) for(int j = 0; j < col; j++) randMatrix[i][j] = rand.nextInt(10);
    	return randMatrix;
    }
}
public class Chap08_MatrixClass {
	public static void main(String[] args) {
		Matrix A = new Matrix(), B = new Matrix(3, 4), C = new Matrix(3, 4), D = new Matrix(), E = new Matrix(4, 5), F = new Matrix();
		System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
		B.getData();C.getData();E.getData();
		
		A = B.addMatrix(C);
		B.showMatrix("B[3][4]");C.showMatrix("C[3][4]");A.showMatrix("A[3][4]");
		
		System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
		D = B.multiplyMatrix(E);
		B.showMatrix("B[3][4]");E.showMatrix("E[4][5]");D.showMatrix("D[3][5]");
		
		System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
		F = B.transposeMatrix();
		B.showMatrix("B[3][4]"); F.showMatrix("F[4][3]");
		
	}
}
