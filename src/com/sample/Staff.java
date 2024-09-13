package com.sample;
//Same Package Different Classes
public class Staff { //child class
	
	private void staffId() {
		
		System.out.println("staff id 999");
	}
	
	private void staffName() {
		
		System.out.println("staff name jagan");
	}

	public static void main(String[] args) {
		
		Staff st = new Staff();
		st.staffId();
		st.staffName();
		
		Student stu = new Student();
		stu.studentId();
		stu.studentName();
	}
}
