package com.ruby.java.ch13.study;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.RUNTIME)
@interface Mapping {
	String mode();
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Commet {
	String msg();
}

@Mapping(mode = "class", value = 100)
@Commet(msg = "Annotation2 Class")
public class AnnoTest2 {
	@Mapping(mode = "method", value = 200)
	@Commet(msg = "test() Method")
	public static void test() {
		AnnoTest2 obj = new AnnoTest2();
		try {
			Class<?> c = obj.getClass();
			Annotation annoList[] = c.getAnnotations();
			System.out.println("Anootation lists of Class");
			for(Annotation item : annoList) System.out.println(item);
			
			Method m = c.getMethod("test");
			annoList = m.getAnnotations();
			System.out.println("\nAnnotation List of test() Method");
			for(Annotation item : annoList) System.out.println(item);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		test();
	}
}
