package com.ruby.java.ch11;

public class NagativeNumberException extends Exception{
	private static final long serialVersionUID = 1L;

	public NagativeNumberException() {
		super("음수는 허용되지 않습니다");
	}
	public NagativeNumberException(String str) {
		super(str);
	}
}
