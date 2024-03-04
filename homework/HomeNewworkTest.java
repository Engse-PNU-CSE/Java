package com.ruby.java.homework;

import java.util.Scanner;

public class HomeNewworkTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Switch[] oldswitch = new Switch[3];
		for(int i = 0; i < 3; i++) {
			oldswitch[i] = new SwitchOld();
			System.out.print("Enter Status : ");
			oldswitch[i].status = sc.nextBoolean();
		}
		for(int i = 0 ; i < 3; i++) System.out.println(oldswitch[i].toString());
		
		Switch[] sensorswtich = new Switch[2];
		sensorswtich[0] = new SwitchVeranda();
		sensorswtich[1] = new SwitchEnterance();
		((SwitchVeranda) sensorswtich[0]).isCondition();
		System.out.println(sensorswtich[0].toString());
		
		sc.close();
	}
}
