package com.ruby.java.ch13;

class Bag<T> {
	private T thing;
	public Bag () {
	}
	public Bag(T thing) {
		this.thing = thing;
	}
	public T getThing() {
		return thing;
	}
	public void setThing(T thing) {
		this.thing = thing;
	}
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}
class Book{}
class Notebook{}
class Pencilcase {}
class Bollpen{}

public class BagTest {
	public static void main(String[] args) {
		Bag<Book> bag = new Bag<>(new Book());
		Bag<Pencilcase> bag2 = new Bag<>(new Pencilcase());
		Bag<Notebook> bag3 = new Bag<>(new Notebook());
		Bag<Bollpen> bag4 = new Bag<>();
		
		bag4.setThing(new Bollpen());
				
		bag.showType();
		bag2.showType();
		bag3.showType();
		bag4.showType();
		
	}
}
