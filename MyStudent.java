package com.kab2;

public class MyStudent {
	private  String name="Puja Bist";
	
	private String address="kanchanpur";
	private int phone=986264;
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStudent obj=new MyStudent();
		String n=obj.name;
		String a=obj.address;
		int p=obj.phone;
		System.out.println("overriding existing value:");
	
		System.out.println("Output of first Questions:");
		System.out.println("Name : "+n);
		System.out.println("Adress : "+a);
		System.out.println("Phone : "+p);
	
		String n1=obj.name="Puspa";
		String a1=obj.address="Bhamka";
		int pi=obj.phone=989898;
		
		System.out.println("After changing the corresponding value of the attribute:");
		System.out.println("Name:  " +n1);
		System.out.println("Address: "+a1);
		System.out.println("Phone:  "+pi);

	}

}
