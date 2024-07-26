package com.kab2;

public class MyClassOne {

final  String name="Puja Bist";
	
	final String address="kanchanpur";
	final int phone=986264;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyClassOne ob=new MyClassOne();

		System.out.println("Before changing the value");
		 System.out.println(ob.name);
		 System.out.println(ob.address);
		 System.out.println(ob.phone);
		 
		 
		 String name="john";
		 String address="ktm";
		 int phone=123;
		 System.out.println("After changing the value:");
		 System.out.println(ob.name);
		 System.out.println(ob.address);
		 System.out.println(ob.phone);
				 
		
	}

}
