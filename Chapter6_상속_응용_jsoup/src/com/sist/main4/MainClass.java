package com.sist.main4;

public class MainClass {
	public static void main(String[] args) {
	
		Human man=new Human();
		man.SetData("심청이");
		System.out.println(man.getData());
		Student s=new Student();
		s.SetData("박문수");
		System.out.println(s.getData());
		System.out.println(man.getData());
		
		//static은 공간이 하나다 . 그래서 상속(크롤링)을 하더라도 
		//static으로 설정해버리면 공간이 하나이므로 두 개를 제어하지 못한다.
	}
}
