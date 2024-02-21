package com.ruby.java.homework;

import java.util.Scanner;
import java.lang.Math;

public class Primenumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		
		for(double j=Math.pow(10, num-1); j<Math.pow(10, num); j++) {
			//double nn=j;
			double n=Math.sqrt((double)j);
			boolean check = false;
			for(int i=2; i<=n; i++) {
				if(j%i==0) {
					check= true;
					break;
				}
			}
			if(!check && j!=1) System.out.println((int)j + " is Prime Number.");
		}
	
		sc.close();
	}

}
