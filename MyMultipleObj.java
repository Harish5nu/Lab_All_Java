package com.kab2;

public class MyMultipleObj {
int x=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyMultipleObj myobject1=new MyMultipleObj();
MyMultipleObj myobject2=new MyMultipleObj();
myobject2.x=111;
System.out.println(myobject1.x);
System.out.println(myobject2.x);
	}

}
