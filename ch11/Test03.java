package com.ruby.java.ch11;

import java.io.FileInputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		try(FileInputStream fi = new FileInputStream("input.txt")) {
			int c=fi.read();
			while(c != -1) {
			System.out.println((char)c + " = " + c);
			c=fi.read();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
