package com.ruby.java.homework;

import java.util.Scanner;

public class TheNumberOfCases {  

	public static int[] usedWeight = {0, 0, 0};
	public static int[] valueWeight = new int[3];
	public static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		System.out.println("Enter the kind of weights");
		System.out.print("First Weight : ");
		valueWeight[0] = sc.nextInt();
		System.out.print("Second Weight : ");
		valueWeight[1] = sc.nextInt();
		System.out.print("Third Weight : ");
		valueWeight[2] = sc.nextInt();
		cases(num-10, 0);//각 동전을 최소 1번 이상 사용하기 때문에 입력된 값에서 -10을 해줌
		System.out.println("총 경우의 수 : " + cnt);
		sc.close();
	}
	static void cases(int mass, int index) {
		if(mass == 0) {
			System.out.println("(" + (usedWeight[0]+1) + ", " + (usedWeight[1]+1) + ", " + (usedWeight[2]+1) + ")");
			cnt++;
			return;
		}
		if(mass == 1 || mass < 0 || index >= valueWeight.length) return;
		
		for(int i = 0; i*valueWeight[index] <= mass; i++) {
			usedWeight[index] = i; // 현재 동전의 사용 갯수를 배열에 저장
			cases(mass-(i*valueWeight[index]), index+1); // 다음 동전갯수 출발
			
		}
	}
}
