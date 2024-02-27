package com.ruby.java.homework;

public class multiplicationTable {
	private final int MAXRANGE_J = 9;

	public void print(int number) {
		System.out.println(number + "단 출력");
		for (int i = 1; i < 10; i++)
			System.out.println(number + " * " + i + " = " + i * number);
		System.out.println("-".repeat(15));
	}

	public void printHorizental() {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++)
				System.out.print(j + " * " + i + " = " + i * j + "\t");
			System.out.println();
		}
	}

	public void printColoum(int col) {
		int startJ = 2;

		while (startJ < 10) {
			int endJ = col + startJ - 1;
			System.out.println("----------------".repeat(col));
			for (int i = 1; i < 10; i++) {
				if(endJ>9) endJ=MAXRANGE_J;
				for (int j = startJ; j <= endJ; j++)
					System.out.print(j + " * " + i + " = " + i * j + "\t");
				System.out.println();
			}
			startJ += col;
		}
		System.out.println("----------------".repeat(col));
	}
}
