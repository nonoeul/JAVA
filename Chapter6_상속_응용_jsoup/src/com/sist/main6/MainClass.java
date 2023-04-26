package com.sist.main6;
class Super{
	int a=20;
	int b=30;
}

class Sub extends Super{
	// Super의 a=20 ,b=30을 상속받은 상태이다. 
	public Sub()
	{
		System.out.println("a="+a+",b");
		this.a=100;
		this.b=200;
		System.out.println("a="+a+",b");
		System.out.println("a="+super.a+" b="+super.b);
	}
}

public class MainClass {
	public static void main(String[] args) {
		Sub();
	}
}
