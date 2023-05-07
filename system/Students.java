package org.system;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("My id number is:" +id);
		
	}
	public void getStudentInfo(int id,String name) {
		System.out.printf("My id and name is:" +id  +name);
	}
	public void getStudentInfo(String Email,double PhoneNumber) {
		System.out.printf("My Email id & Phone number is :"+Email +PhoneNumber);
	}

	public static void main(String[] args) {
		Students info=new Students();
		info.getStudentInfo(36);
		info.getStudentInfo(36,"M Santhosh Kumar");
		info.getStudentInfo("Santhoshmsk06@gmail.com", 9894023583d);
		
	}
	
}
