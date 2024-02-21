package com.ruby.java.homework;

import java.util.Random;

class makeMatrix {
    private int[][] matrix;
    private int[] array;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void printMatrix() {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void printArray() {
        for(int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
        System.out.println();
    }

    public int[][] sumMatrix(int[][] arr1, int[][] arr2) {
        int sum[][] = new int[arr1.length][arr1[0].length];
        for(int i = 0; i < arr1.length; i++) for(int j=0; j < arr1[i].length; j++) sum[i][j] = arr1[i][j] + arr2[i][j];
        return sum;
    }

    public int[][] multipleMatrix(int[][] arr1, int[][] arr2) {

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

    public void sortArray() {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public int[][] make3_4Matrix(int[] arr, int index) {
        int[][] matrix3_4 = new int[3][4];
        int cnt = index;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
            matrix3_4[i][j]=arr[cnt];
            cnt++;
            }
        }
        return matrix3_4;
    }
    public int[][] make4_3Matrix(int[] arr, int index) {
        int[][] matrix4_3 = new int[4][3];
        int cnt = index;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 3; j++) {
            matrix4_3[i][j]=arr[cnt];
            cnt++;
            }
        }
        return matrix4_3;
    }
}



public class Matrix2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] realArray = new int[24];
        for(int i = 0; i < realArray.length; i++) realArray[i]=random.nextInt(10);
        int[] arr = new int[24];
        for(int i=0; i<realArray.length; i++) arr[i]=realArray[i];

        System.out.println("--------------------------");
        makeMatrix originalArray = new makeMatrix(), SortArray = new makeMatrix();
        originalArray.setArray(realArray);
        System.out.print("Original Arrays : ");
        originalArray.printArray();
        SortArray.setArray(arr);
        SortArray.sortArray();
        System.out.print("Sorted Arrays   : ");
        SortArray.printArray();

        System.out.println("--------------------------");
        makeMatrix A = new makeMatrix(), B = new makeMatrix();
        System.out.println("Make Matrix A");
        A.setMatrix(A.make3_4Matrix(realArray, 0));
        A.printMatrix();
        System.out.println("Make Matrix B");
        B.setMatrix(B.make3_4Matrix(realArray, 11));
        B.printMatrix();

        System.out.println("--------------------------");
        makeMatrix sumofAB = new makeMatrix();
        System.out.println("Matrix A+B");
        sumofAB.setMatrix(sumofAB.sumMatrix(A.getMatrix(), B.getMatrix()));
        sumofAB.printMatrix();

        System.out.println("--------------------------");
        makeMatrix A1 = new makeMatrix(), B1 = new makeMatrix(), mulofAB1 = new makeMatrix();
        A1.setMatrix(A1.make3_4Matrix(realArray, 0));
        B1.setMatrix(B1.make4_3Matrix(realArray, 11));
        System.out.println("Make Matrix A1");
        A1.printMatrix();
        System.out.println("Make Matrix B1");
        B1.printMatrix();
        System.out.println("--------------------------");
        System.out.println("Matrix A1*B1");
        mulofAB1.setMatrix(mulofAB1.multipleMatrix(A1.getMatrix(), B1.getMatrix()));
        mulofAB1.printMatrix();
        System.out.println("--------------------------");

        makeMatrix A2 = new makeMatrix(), B2 = new makeMatrix(), mulofAB2 = new makeMatrix();
        A2.setMatrix(A2.make4_3Matrix(realArray, 0));
        B2.setMatrix(B2.make3_4Matrix(realArray, 11));
        System.out.println("Make Matrix A2");
        A1.printMatrix();
        System.out.println("Make Matrix B2");
        B1.printMatrix();
        System.out.println("--------------------------");
        System.out.println("Matrix A2*B2");
        mulofAB2.setMatrix(mulofAB2.multipleMatrix(A2.getMatrix(), B2.getMatrix()));
        mulofAB2.printMatrix();
        System.out.println("--------------------------");
    }
}
