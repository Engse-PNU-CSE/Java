package com.ruby.java.ch08.innerClass;

public class OuterClassTest {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.instanceClass inner01 = outer.new instanceClass();
		inner01.a = 123;
		inner01.method();

		OuterClass.StaticClass inner02 = new OuterClass.StaticClass();
		inner02.b=456;
		inner02.method3();
		
		OuterClass.StaticClass.c=789;
		OuterClass.StaticClass.method4();
	}
}
