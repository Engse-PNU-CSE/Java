package com.ruby.java.homework;

import java.util.Scanner;

public class RotationMatrix {
	static double[][] rotation(double angle) {
		double rotate[][] = new double[2][2];
		rotate[0][0] = Math.cos(angle);
		rotate[0][1] = -Math.sin(angle);
		rotate[1][0] = Math.sin(angle);
		rotate[1][1] = Math.cos(angle);
		return rotate;	
	}
	static void print(double index_x, double index_y, double[][] Matrix) {
		double rotateIndex_x = index_x * Matrix[0][0] + index_y * Matrix[0][1];
		double rotateIndex_y = index_x * Matrix[1][0] + index_y * Matrix[1][1];
		System.out.println("(" + rotateIndex_x + ", " + rotateIndex_y + ")");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert index X : ");
		double index_x = sc.nextDouble();
		System.out.print("Insert index Y : ");
		double index_y = sc.nextDouble();
		System.out.print("Insert roate angle : ");
		double angle = sc.nextDouble();
		
		print(index_x, index_y, rotation(Math.toRadians(angle)));
		sc.close();
	}

}
