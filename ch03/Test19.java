package com.ruby.java.ch03;

import java.util.Scanner;

public class Test19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		
		int score = sc.nextInt();
		String result = "";
		
		if(score >= 60) {
			result = "합격";
		}
		else
			result = "불합격";
		
		//System.out.println(result);
		//System.out.println(score >= 60 ? "합격" : "불합격");
		
		System.out.println("당신의 점수는 " + score + "점 이므로, 결과는 " + result + " 입니다.");
		
		sc.close();
	}

}
