package com.ruby.java.homework;

import java.util.Scanner;

class Intersect {
	public int x1, x2, y1, y2;
	public Intersect (int x1, int x2, int y1, int y2) {
		x1 = this.x1;
		x2 = this.x2;
		y1 = this.y1;
		y2 = this.x1;
	}
}
public class IntersectOfLines {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();int y1 = sc.nextInt();int x2 = sc.nextInt();int y2 = sc.nextInt();
		int x3 = sc.nextInt();int y3 = sc.nextInt();int x4 = sc.nextInt();int y4 = sc.nextInt();
		Intersect line1 = new Intersect(x1, y1, x2, y2);
		sc.close();
	}
}
