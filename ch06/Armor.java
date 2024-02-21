package com.ruby.java.ch06;

public class Armor {
	private String name;
	private int height;
	private int weight;
	private boolean isFly=false;
	private boolean isLaser=false;
	String color="red";
	
	public boolean isFly() {
		return isFly;
	}
	public boolean isLaser() {
		return isLaser;
	}
	public String getColor() {
		return color;
	}
	void stats() {
		System.out.println("Name : " + name);
		System.out.println("Height : " + height);
		System.out.println("Weight : " + weight);
		System.out.println("Color : " + color);
		System.out.println("------Module-----");
		if(isFly) System.out.println("Fly Module");
		if(isLaser) System.out.println("Laser Module");
		else System.out.println(name + " hasn't any module.");
		System.out.println("-----------------");
	}
	void takeOff() {
		setLaser(false);
		setFly(false);
	}
	void setLaser(boolean value) {
		isLaser=value;
	}
	public void setFly(boolean value) {
		isFly=value;
	}
	void land() {
		System.out.println("Land");
	}
	void shootLaser() {
		if(isLaser) System.out.println("Shoot Laser");
		else System.out.println(name + "has not Laser Module");
	}
	public String getName() {
		return name;
	}
	public void setColor(String value) {
		color=value;
	}
	public void setName(String value) {
		name=value;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int value) {
		height=value;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int value) {
		weight=value;
	}

}