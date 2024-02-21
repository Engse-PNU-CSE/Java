package com.ruby.java.ch06;

public class Member {
	private String name;
	private int age;
	
	public Member() {
		System.out.println("Member() 생성자 실행");
	}
	public Member(String name) {
		System.out.println("Member(String) 생성자 실행");
		System.out.println(name);
	}
	public Member(String name, int age) {
		System.out.println("Member(String, Int) 생성자 실행");
		System.out.println(name + " : " + age);
	}
	public Member(int age) {
		System.out.println("Member(Int) 생성자 실행");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		System.out.println("Main() 실행");
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member();
		m2.setName("Amy");
		m3.setAge(23);
		m3.setName("Amy");
		m4.setAge(23);
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		System.out.println(m4.toString());
	}
}
