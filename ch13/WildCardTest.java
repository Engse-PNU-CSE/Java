package com.ruby.java.ch13;

import java.util.Arrays;
import java.util.List;

public class WildCardTest {
	public static void main(String[] args) {
		Integer inum[] = {1, 2, 3, 4, 5};
		Double dnum[] = {1.1, 2.2, 3.3, 4.4, 5.5};
		//String snum[] = {"1", "2", "3", "4", "5"};
		
		List<Integer> iList = Arrays.asList(inum);
		List<Double> dList = Arrays.asList(dnum);
		
		double isum = sum(iList);
		double dsum = sum(dList);
		double asum = sum(iList, dList);
		
		System.out.println("Sum of isum : " + isum);
		System.out.println("Sum of dsum : " + dsum);
		System.out.println("Sum of asum : " + asum);
	}
	
	private static double sum(List<? extends Number> list) {
		double total = 0;
		for(Number v : list) total+=v.doubleValue();
		return total;
	}
	private static double sum(List<? extends Number> list, List<? extends Number> list2) {
		double total = 0;
		for(Number v : list) total+=v.doubleValue();
		for(Number v : list2) total+=v.doubleValue();
		return total;
	}
}
