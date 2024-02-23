package com.ruby.java.ch11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test05 {
	int battery = 0;
	
	public void charge(int time) {
		battery += time;
		System.out.println("현재 배터리 : " + battery);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test05 test = new Test05();
		while(true) {
			int time;
			try {
				time = sc.nextInt();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				break;
			}
			if(time < 0) {
				time = 0;
				try {
					throw new NagativeNumberException("음수는안돼에에에");
				}
				catch(NagativeNumberException e){
					e.printStackTrace();
				}
			}
			else test.charge(time);
		
		}
	}
}
