package com.ruby.java.ch06;

import java.util.Scanner;

public class ArmorTeest {
	public static void main(String[] args) {
		Armor suit1 = new Armor();
		Armor suit2 = new Armor();
		Armor suit3 = new Armor();
		Scanner sc = new Scanner(System.in);
//		Armor[] suit = new Armor[10];
//		System.out.println("------Jimmy's Company------");
//		System.out.println("Hangar size : " + suit.length);
//		System.out.println("1. Create New Suite");
//		System.out.println("2. Show Stats");
//		System.out.println("3. Exit");
//		boolean check = true;
//		while(check) {
//			System.out.println("Press number : ");
//			int num = sc.nextInt(), hangarNum;
//			switch(num) {
//			case(1):
//				System.out.print("Creat New Suit, Enter Hangar Number : ");
//				hangarNum = sc.nextInt();
//				System.out.print("Enter Suit name : ");
//				suit[hangarNum].setName(sc.next());
//				System.out.print("Enter Suit Height : ");
//				suit[hangarNum].setHeight(sc.nextInt());
//				System.out.print("Enter Suit Weight : ");
//				suit[hangarNum].setWeight(sc.nextInt());
//				System.out.print("Enter Suit Color : ");
//				suit[hangarNum].setColor(sc.next());
//				break;
//			case(2):
//				System.out.println("Show Stats, Enter Hangar Number");
//				hangarNum = sc.nextInt();
//				suit[hangarNum].stats();
//				break;
//			case(3):
//				check=false;
//				break;
//			default:
//				System.out.println("Wrong Number.");
//				break;
//			}
//			if(!check) break;
//		}
		System.out.print("Enter Suit name : ");
		suit1.setName(sc.next());
		suit1.setHeight(180);
		suit1.setWeight(50);
		
		suit2.setName("mark22");
		suit2.setHeight(200);
		
		suit3.setName("dwarf");
		suit3.setHeight(140);
		
		suit1.setFly(true);
		suit1.setLaser(true);
		suit1.stats();
		suit2.stats();
		

		sc.close();
	}
}
