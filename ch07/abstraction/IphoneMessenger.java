package com.ruby.java.ch07.abstraction;

public class IphoneMessenger extends GraphicIOS implements Messenger{
	public String getMessage() {
		return "iPhone";
	}
	public void setMessage(String msg) {
		System.out.println("Set up Message on iPhone : " + msg);
	}
	public void clearMessage() {
		System.out.println("Swip hands, Delete the String");
	}
}
