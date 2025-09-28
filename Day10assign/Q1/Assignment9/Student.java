package Assignment9;

import java.util.Comparator;
import java.util.Scanner;

public class Student{
	private int rollNo;
	private String name;
	private double marks;
	
	public Student() {
		
	}
	

	public Student(int rollNo, String name, double marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}




	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}
		
	@Override
	public boolean equals(Object other) {
		
		if(other==null) return false;
		if(this==other) {
			return true;
		}
		if(!(other instanceof Student)) {
			return false;
		}
		Student p1=(Student)other;
		if(this.getRollNo()==p1.getRollNo()) {
			return true;
		}
		else {
		return false;
		}
		
	}
	
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

}
