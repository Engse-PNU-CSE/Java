package com.ruby.java.ch07.abstraction;

public class GalaxyMessenger implements Messenger, WorkFile{
	public String getMessage() {
		return "galaxy";
	}
	
	public void setMessage(String msg) {
		System.out.println("Set up Message on Galaxy");
	}
	
	public void changeKeyboard() {
		System.out.println("Tourch Icon to Change Keyorard");
	}

	public void fileDownload() {
		System.out.println("Downloading Files");
	}
	
	public void fileUpload() {
		System.out.println("Uploading Files");
		
	}
}
