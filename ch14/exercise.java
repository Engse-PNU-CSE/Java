package com.ruby.java.ch14;

import java.util.function.Function;

interface Geometry {
	double getArea();
}
class Circle implements Geometry {
	private double radius;
	public double getArea() {
		return radius*radius*3.14;
	}
	public Circle(double n) {
		this.radius = n;
	}
}
class Rectangle implements Geometry {
	private double height, width;
	
	public double getArea() {
		return width*height*0.5;
	}
	public Rectangle(double n, double m) {
		this.height = n;
		this.width = m;
	}
	
}
class Triangle implements Geometry {
	private double height, width;

	public Triangle(double n, double m) {
		this.height = n;
		this.width = m;
	}
	public double getArea() {
		return width*height;
	}
}

public class exercise {
	public static void main(String[] args) {
		Function<Geometry, Double> Area = (n) -> {
			return n.getArea();
		};
		
		System.out.println("원 넓이 : " + Area.apply(new Circle(5)));
		System.out.println("삼각형 넓이 : " + Area.apply(new Triangle(10, 10)));
		System.out.println("사각형 넓이 : " + Area.apply(new Rectangle(10, 10)));

	}
}
