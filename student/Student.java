package org.student;

import org.department.Department;

public class Student extends Department{
public void studentName() {
	System.out.println("M.Santhosh Kumar");
}
public void studentDept() {
	System.out.println("Computer Science Engineering");
}
public void studentId() {
	System.out.println("513315104036");
}
public static void main(String[] args) {
	Student call=new Student();
	call.CollegeName();
	call.CollegeCode();
	call.deptName();
	call.studentName();
	call.studentDept();
	call.studentId();	
}
}
