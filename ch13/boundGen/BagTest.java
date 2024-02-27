package com.ruby.java.ch13.boundGen;

class Bag<T extends Solid> {
	private T thing;
	private String owner;

	public Bag(T thing) {
		this.thing = thing;
	}
	public T getThing() {
		return thing;
	}
	public void setThing(T thing) {
		this.thing = thing;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
	boolean isSanmeOwner(Bag<?> obj) {
		if(this.owner.equals(obj.getOwner())) return true;
		return false;
	}
}
class Solid{}
class Liquid{}

class Book extends Solid{}
class Notebook extends Solid{}
class Pencilcase extends Solid{}

class Water extends Liquid{}
class Coffee extends Liquid{}

public class BagTest {
	public static void main(String[] args) {
		Bag<Book> bag = new Bag<>(new Book());
		Bag<Pencilcase> bag2 = new Bag<>(new Pencilcase());
				
		bag.setOwner("jimmy");
		bag2.setOwner("hong");
		
		if(bag.isSanmeOwner(bag2)) System.out.println("Owner is equal");
		else System.out.println("Owner is different");
		
	}
}
