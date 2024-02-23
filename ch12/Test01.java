package com.ruby.java.ch12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("input.txt");
		FileOutputStream fo = new FileOutputStream("output.txt");
		try(fi; fo;) {
			int c = 0;
			while((c=fi.read()) != -1) {
				fo.write(c);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			fi.close();
		}
	}
}
