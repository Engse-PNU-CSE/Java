package com.ruby.java.homework;

import java.util.Scanner;

public class Member {
	private String userName;
	private String password;
	String role;
	private boolean enabled;
	
	@Override
	public String toString() {
		return "Member [userName=" + userName + ", password=" + password + ", role=" + role + ", enabled=" + (enabled ? "True" : "False")
				+ "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member[] member = new Member[3];
		for(int i = 0; i < member.length; i++) {
			member[i] = new Member();
			System.out.println("---------------");
			System.out.print("Enter Name : ");
			String str = sc.next();
			member[i].setUserName(str);
			System.out.print("Enter Password : ");
			str = sc.next();
			member[i].setPassword(str);
			System.out.print("Enter Role : ");
			str = sc.next();
			member[i].setRole(str);
			System.out.print("Enter enabled : ");
			str = sc.next();
			member[i].setEnabled((str=="T"));
			System.out.println("---------------");
		}
		for(int i = 0; i < member.length; i++) System.out.println(member[i].toString());
		
		sc.close();
	}
}
