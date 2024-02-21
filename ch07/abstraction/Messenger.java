package com.ruby.java.ch07.abstraction;

public interface Messenger {
	public static final int MIN_SIZE = 1;
	public static final int MAX_SIZE = 105050600;
	
	public abstract String getMessage();
	
	public abstract void setMessage(String msg);
	
	public default void setLogin(boolean login) {
		log();
		if(login) System.out.println("Processing Log In");
		else System.out.println("Processing Log Out");
	}
	public static void getConnection() {
		System.out.println("Connect network");
	}
	private void log() {
		System.out.println("Start job!");
	}
}
