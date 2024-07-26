package com.kab2;

public class Student {

	static String name = "Zake";
	static int phone = 123456789;
	static String address = "Kathmandu";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student objectstudent = new Student();
		System.out.println("The first Format of output:");
		System.out.println("Name:" + objectstudent.name);
		
		System.out.println("Phone number:" + objectstudent.phone);
		System.out.println("Address:" + objectstudent.address);
		System.out.println("The Second Format of output:");
System.out.println(" "+objectstudent.name+ "" +objectstudent.phone+ ""+objectstudent.address);
System.out.println("The Third Format of output:");
System.out.println(" "+objectstudent.name+ " "+"" +objectstudent.phone+ " "+""+objectstudent.address);


	}

}
