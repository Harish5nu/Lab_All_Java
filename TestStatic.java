package com.kab2;

public class TestStatic {
static void  myStaticmethod()
{
	
	System.out.println("I am static method.");
}
void AllFreeMethod()
{
	System.out.println("I am free method.");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestStatic o=new TestStatic();

o.myStaticmethod();
o.AllFreeMethod();
	}

}
