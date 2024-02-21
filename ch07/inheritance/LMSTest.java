package com.ruby.java.ch07.inheritance;

public class LMSTest {
	public static void main(String[] args) {
		Employee e = new Employee("james", 47, "pp");
		Professor p = new Professor("michael", 22, "bigdata");
		Student s = new Student("tom", 20, "computer science");
		
		/*
		 * e.setName("james"); e.setAge(47); e.setDept("Physical");
		 * p.setName("michael"); p.setAge(22); p.setSubject("bigdata");
		 * s.setName("tom"); s.setAge(20); s.setMajor("computerscience");
		 */
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}
