package com.ruby.java.homework;

import java.util.Scanner;

class Intersect {
	public int x1, x2, x3, x4, y1, y2, y3, y4;
	public Intersect (int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		x1 = this.x1;
		x2 = this.x2;
		y1 = this.y1;
		y2 = this.y2;
		x3 = this.x3;
		x4 = this.x4;
		y3 = this.y3;
		y4 = this.y4;
	}
	public void GetIntersect(int x, int y, int x_prime, int y_prime) {
		double a = (y2-y1)/(x2-x1);
		double a_prime = (y4-y3)/(x4-x3);
		
	}
	public void printIntersect() {
		
	}
}
public class IntersectOfLines {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();int y1 = sc.nextInt();int x2 = sc.nextInt();int y2 = sc.nextInt();
		int x3 = sc.nextInt();int y3 = sc.nextInt();int x4 = sc.nextInt();int y4 = sc.nextInt();
		Intersect line1 = new Intersect(x1, y1, x2, y2, x3, y3, x4, y4);
		sc.close();
	}
}
