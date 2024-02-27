package com.ruby.java.ch13.study;

@SuppressWarnings("hiding")
class Bag<Object> {
	private Object thing;

	public Bag(Object thing) {
		this.thing = thing;
	}
	public Object getThing() {
		return thing;
	}
	public void setThing(Object thing) {
		this.thing = thing;
	}
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass());
	}
}
class Book{}
class Notebook{}
class Pencilcase {}
class Bollpen{}

public class BagTest2 {
	public static void main(String[] args) {
		Bag bag = new Bag (new Book());
		Bag bag2 = new Bag(new Pencilcase());
		Bag bag3 = new Bag(new Notebook());
		
				
		bag.showType();
		bag2.showType();
		bag3.showType();
		
		bag = bag2;
	}
}

