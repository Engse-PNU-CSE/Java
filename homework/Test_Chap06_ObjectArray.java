package com.ruby.java.homework;

//하나의 java file에 Student 객체를 정의하고 구현하는 실습
/*
* static 멤버 함수 구현
* toString() 함수 구현과 사용
* 객체 배열 사용
*/
abstract class InterfaceStudents {
	public abstract void showObject();
}

class Student extends InterfaceStudents {
	static int countStudents;// 객체수
	int sid;// 학번
	String sname; // 학생 이름
	String city; // 주소 도시
	public Student(int sid, String sname, String city) {
		this.sid=sid; this.sname=sname; this.city=city;
		Student.countStudents++;
	}
	public Student(String sname, String city) {
		this.sname=sname; this.city=city;
		Student.countStudents++;
	}
	public Student(int sid, String sname) {
		this.sid=sid; this.sname=sname;
		Student.countStudents++;
	}
	public Student(int sid) {
		this.sid=sid;
		Student.countStudents++;
	}
	public Student() {
		Student.countStudents++;
	}
	public String toString() {
		return "[sid = " + sid + ", sname = " + sname + ", city = " + city + "]";
	}

	public void showObject() {
		System.out.println("[" + sid + ", " + sname + ", " + city + "]");
	}

	static void showNumberObjects() {// 생성된 객체수를 출력한다.
		System.out.println("현재 생성객체수 = " + countStudents);
	}
}

class WorkStudent extends Student {
	String eno;
	String company;
	public WorkStudent(int sid, String sname, String city, String eno, String company) {
		super(sid, sname, city);
		this.eno=eno; this.company=company;
	}
	public WorkStudent(String eno, String company) {
		this.eno=eno; this.company=company;
	}
	public WorkStudent(String eno) {
		this.eno=eno;
	}
	public WorkStudent(int num) {
		super(num);
	}

	public WorkStudent() {
	}

	public String toString() {
		return "[eno = " + eno + ", company = " + company + "]";
	}

	public void showObject() {
		super.showObject();
		System.out.println( "[" + eno + ", " + company + "]");
	}
}

class CodingWorkStudent extends WorkStudent {
	String language;
	public CodingWorkStudent(int sid, String sname, String city, String eno, String company, String language) {
		super(sid, sname, city, eno, company);
		this.language=language;
	}
	public CodingWorkStudent(String language) {
		this.language=language;
	}

	public CodingWorkStudent(int num) {
		super(num);
	}

	public String toString() {
		return "language = " + language;
	}

	public void showObject() {
		// WorkStudent 출력 코드 추가
		super.showObject();
		System.out.println(" [" + language + "]");
	}
}

// 생성자 구현한다.
public class Test_Chap06_ObjectArray {

	static void showObjects(InterfaceStudents is) {
		is.showObject();
	}

	public static void main(String[] args) {
		Student arry[] = new Student[5];
		Student.showNumberObjects();
		arry[0] = new Student(202301);
		arry[1] = new Student(202301, "Kim", "Busan");
		arry[2] = new WorkStudent(202301, "Kim", "Busan", "dev", "PNU");
		arry[3] = new CodingWorkStudent(202301, "Kim", "Busan", "dev", "PNU", "C++");
		arry[4] = new WorkStudent("manager");
		Student.showNumberObjects();
		for (Student s : arry) {
			System.out.println(s.toString());
		}
		for (Student sx : arry) {
			showObjects(sx);
		}
	}

}