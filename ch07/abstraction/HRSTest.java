package com.ruby.java.ch07.abstraction;

abstract class Employee {
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBouns();
}

class Saleman extends Employee {
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매수당");
	}
	
	public void calcBouns() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별수당");
	}
	public void calcBouns() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}

class Manager extends Employee {
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과수당");
	}
	
	@Override
	public void calcBouns() {
	}
}

class Director extends Manager {
	public void calcBouns() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}	
}

public class HRSTest {
	public static void main(String[] args) {
		Saleman s = new Saleman();
		Consultant c = new Consultant();
		Director d = new Director();
		
		s.calcBouns();
		c.calcBouns();
		d.calcBouns();
		d.calcSalary();
	}
}
