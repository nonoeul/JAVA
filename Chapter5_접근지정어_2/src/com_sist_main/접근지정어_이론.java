package com_sist_main;

/*
 * 
 * 	접근지정어 : 접근 범위 지정 => 생성자 , 메소드 , 변수 
 *	1. private : 자신의 클래스에서만 사용이 가능 => 멤버변수는 private 
 * 			  = 단점// 다른 클래스와 연결하지 못한다. 현재 클래스에서만 사용 가능 [최고보안]
 * 			  = 단점을 보완하기 위해서 만든 것이 getter/setter , getter/setter을 이용해서 보안을 돼지만 사용은 가능하게
 * 			  ---변수 은닉화 / getter/setter 은닉화 메소드를 통해서 접근 방식 (캡슐화)
 * -단골코스| 은닉화 vs 캡슐화------
 * 	캡슐화 목적 : 테이터를 보호할 목적으로 사용된다. // 객체지향의 첫번째 목적 데이터를 보호해라 
 * 	
 *	2. default : 같은 패키지안에서 접근 // 다른 클래스는 접근 가능. 다른 패키지안에서 접근 불가능 [보통보안] 
 *			   => 한 파일에 class 두 개를 만들지 않는다.
 *
 *	3. protected : 같은 패키지안에서 접근, 상속이 있는 경우에는 다른 패키지 접근이 가능
 *			   => default보다 조금 더 많은 범위 접근 가능 // 다른 클래스, 같은 패키지 접근 가능, 상속일 경우 다른 패키지 접근 가능
 *
 * 	4. public :	모든 클래스. 모든 패키지 자유롭게 접근이 가능하다. 
 * 	------------------------------------------------------------
 * 	형식)
 * 		멤버변수는 private
 * 		메소드, 생성자 => 다른 클래스와 연결 담당 : public 
 * 	------------------------------------------------------------
 * 	매개변수로 객체 전송 => 메모리 주소 (변경 => 자체가 변경)
 * 	==> 얕은 복사 
 * 		
 * 	class A
 * 
 * 	A a=new A(); // new로 매개변수를 만든 후 값을 넘기는 것 
 * 	A b=a; // 값만 넘긴다. a를 쓰든지 b를 쓰든지 상관없다. 동일한 내용 , 동일한 주소 
 * 
 * 		매개변수 전송 방식
 * 		--------------
 * 		깂 복사 	: 값만 전송, 복사본 ==> 기본형, String
 * 		주소 복사 	: 주소 전송, 원본 	==> 배열, 클래스 
 * 
 * 
 */
class Value{
	
	int a=10;
	int b=20;
	
	
}


public class 접근지정어_이론{ 
	
	static void swap(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+",b="+b);
	}
	
	static void swap(Value v) 
	{
		int temp=v.a;
		v.a=v.b;
		v.b=temp;
		System.out.println("v.a="+v.a+" v.b="+v.b);
	}

	public static void main(String[] args) {
		
	int x = 10;
	int y = 20;
	swap(x,y);
	System.out.println("x="+x+",y="+y);
	
	Value a=new Value();
	swap(a);
	

	}
}












