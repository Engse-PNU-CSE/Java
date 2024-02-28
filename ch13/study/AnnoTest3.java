package com.ruby.java.ch13.study;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
@interface Service {
	
}
@Service
public class AnnoTest3 {
	public static void main(String[] args) {
		AnnoTest3 obj = new AnnoTest3();
		try {
			Class<?> c = obj.getClass();
			if(c.isAnnotationPresent(Service.class)) System.out.println("Service Annotation을 지정함");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
