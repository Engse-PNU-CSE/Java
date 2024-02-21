package com.ruby.java.ch04;

import java.util.Random;

public class Test37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] score = new int[20];
		int sum = 0, max = 0, min = 999;
		double avg = 0;
		
		for(int i = 0; i < score.length; i++) score[i]=rand.nextInt(20);
		//rand.nextInt(n) : 0과 n 사이의 난수를 생성
		
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
			if(score[i]<10) System.out.print(" ");
			if(i%5 == 4) System.out.println();
		}
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
			if(max < score[i]) max = score[i];
			if(min > score[i]) min = score[i];
		}
		
		avg = (double)sum / score.length;
		
		System.out.println("총 점 : " + sum);
		System.out.println("평 균 : " + avg);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}

}
