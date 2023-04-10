package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("the student name is gayu");
	}
	public void studentDept() {
		System.out.println("the student department is CSE");
	}
public void studentID() {
	System.out.println("the student id is 4567");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj=new Student();
System.out.println("\n Printing College details:");
obj.collegeCode();
obj.collageName();
obj.collageRank();
System.out.println("\n Printing Department details:");
obj.deptName();
System.out.println("\n Printing Student Details:");
obj.studentDept();
obj.studentID();
obj.studentName();

	}

}
