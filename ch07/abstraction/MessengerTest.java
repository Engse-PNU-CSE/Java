package com.ruby.java.ch07.abstraction;

public class MessengerTest {
	public static void main(String[] args) {
		IphoneMessenger iphone = new IphoneMessenger();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
		System.out.println("Min size in Messenger : " + Messenger.MIN_SIZE);
		System.out.println("Max size in Messenger : " + Messenger.MAX_SIZE);
		
		iphone.setLogin(true);
		iphone.getMessage();
		iphone.setMessage("hi");
		iphone.clearMessage();
		iphone.draw_TextBox();
		iphone.draw_submitButton();
		
		galaxy.setLogin(true);
		galaxy.getMessage();
		galaxy.setMessage("hello");
		galaxy.changeKeyboard();
		galaxy.fileUpload();
		galaxy.fileDownload();
		
		Messenger test = new Messenger() {
			public void setMessage(String msg) {
				System.out.println("test msg" + msg);
			}
			public String getMessage() {
				return "test";
			}
		};
		
		System.out.println(test.getMessage());
		test.setMessage("have nice day!");
	}
}
