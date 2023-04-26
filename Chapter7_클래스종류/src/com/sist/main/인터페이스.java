package com.sist.main;

import java.awt.print.Printable;

/*
 * 	1. 사용처 => 응용(문법 => 구현)
 * 	--------------------------
 * 	인터페이스 : 추상클래스의 일종 // 추상클래스의 일종이지만 추상클래스의 단점을 보완했다고 볼 수 있다.
 * 		1) 다중 상속 // 단일상속이 아닌 다중상속이 된다.
 * 		2) 인터페이스는 클래스와 동일하다. (상속을 받으면 상위 클래스다)
 * 		3) 설계만 되어 있다. (구현이 안된 메소드만 모아서 선언)
 * 		4) 장점
 * 		   ---
 * 		1. 기능 설계 => 개발시간ㅇ ㅣ단축이 된다. // 기능이 설계가 되어 있기 때문에 기능을 갖다 쓰기만
 * 						하면 돼서 개발 시간이 단축이 된다.
 * 		2. 요구사항 분석 => 데이터베이스 설계 => 데이터 수집 => 
 * 				=> 화면 Ui	-웹 퍼블ㄹ리셔 
 * 				=> 구현 		-웹 프로그래머
 * 				=> 테스트		-테스터
 * 				=> 배포 		-PL
 * 			  // 요구사항대로 만들어졌는지 분석하고 데이터를 설계 수집하고 화면을 만들어 구현, 테스트한다.
 * 			** 요구사항 분삭 => 데이터베이스 설계 부분이 "추상클래스"와 동일하다고 볼 수 있다. 
 * 			
 * 		3. 표준화 가능 : 같은 메소드를 사용한다. 동일한 메소드를 사용할 수 있게 만든다. 
 * 		------------- 스프링 (통합)
 * 		
 *	?인터페이스 장점
 *		= 서로 관계없는 클래스를 연결해서 사용할 수 있다.
 *		= 유지보수가 편리하다 변경사항이 있을때 인터페이스부분만 수정하면 됀다
 *		= 독립적으로 사용이 가능하다. 문제가 발생한 부분만 떼어내거나 수정하면 됀다.
 *	핵심장점 = 클래스 여러 개를 묶어서 한 개의 이름으로 제어가 가능하다. 
 *	
 *	List 가변형
 *	ArrayList	List list=new Arraylist()
 *	LinkedList	list=new Vector()
 * 	Vector		list=new Linkedlist()
 * 	Queue		list=new Queue()
 * 	stack		list=new stack()
 * 
 * 		? 배열
 * 		배열 : 크기가 고정되어 있어 데이터가 삭제되는 경우 빈공간이 생겨 불필요한 메모리를 사용
 * 			  배열의 크기를 컴파일 이전에 반드시 지정해야 한다.
 * 		-list- : 순서가 있는 데이터의 집합
 * 		ArrayList : 동적으로 object에만 저장되고 용량이 가변적, 배열은 length를
 * 					사용하지만 ArrayList는 size()를 사용한다. 
 * 		LinkedList : 노드 간에 연결을 통해 리스트 구현 , 인덱스가 없고 노드
 * 					 위치에 따라서 순차적으로 접근하여 데이터를 찾는다.
 * 
 * 
 * 	웹에서 가장 많이 쓰이는 라이브러리
 * 	1.	String
 * 	2.	List
 * 	3.	Integer(int를 사용하기 편리하게 만든 클래스)
 * 		
 *		=> 형식)	interface의 사용법
 *			[접근지정어] interface InterfaceName
 *			{
 *				int a ==> 오류
 *				(public static final) int a = 10 ==> 올바른 사용법 
 *				public static final이 생략이 되어 있는 상태이다. 
 *				상수만 사용이 가능하다 . 
 *				-----------------------------
 *				추상메서드만 사용이 가능하다.
 *					void display();
 *					(public abstract) void display();
 *					public abstract이 생략이 되어 있다.
 *				-----------------------------	
 *			}
 *			자동추가
 *			1) import java.lang.*; => String,Math
 *			2) 메소드 => void aaa()
 *						{
 *						안에 아무 값도 주지 않으면 return이 자동추가된다.
 *						=> return
 *						}
 *			3) 생성자 => class A 
 *						{
 *						=> A(){}
 *						}
 *			4) 인터페이스 
 *				변수 선언할 때 => (public static) int a=10;
				//인터페이스에서 변수를 선언할 때 모두 public static이 생략되어 있다.
				
		인터페이스를 할 때 추상메서드는 구현할 수 없다. 선언만하는 것이다.
		단, default를 사용해서 변수를 선언할 경우 , 구현이 가능하다.
 *		default = 구현이 가능한 메소드
 *		(public) default void aaa() {}
 *
 *		}
 *	1. 상수형일 떄 값을 생성하고 선언까지 해줘야 한다. 선언만 하면 안됀다.
 * 	2. 인터페이스에서 추상메서드를 받았으면 구현할 떄 추상메서드를 모두 구현해줘여 한다.
 *
 * 		interface는 상수,메소드 => public만 사용 가능하다.
 * 	= 선언만 되어있다. => 상속을 내린다.
 * 	=> 상속받은 클래스를 구현해서 사용 (오버라이딩 기법)
 * 	
 * 	??인터페이스 상속의 장점??
 * 		1. 	다중상속을 내릴 수 있다. (추상메서드는 단일 상속) 한개만 상속을 지원하는데
 * 			인터페이스같은 경우 다중상속을 내릴 수 있다.
 * 		------
 * 		상속과정
 * 		------
 * 		interface A
 * 		class B extends A ==> 오류
 * 				---------- 확장해서 사용한다.
 * 		class B implements A
 * 				---------- 구현 후에 사용가능 
 * 	
 * 	??상속을 내리는 방향이 3가지가 있다.??
 * 		interface => interface
 * 		interface => class
 * 		class => interface 
 * 
 * 	??interface 다중상속??
 * 		interface A
 * 		interface B extends A
 * 		class C implements B ==> 단일상속
 * 		== 인터페이스 한 개만 상속받았으므로 단일 상속이다. 
 * 
 * 		interface A
 * 		interface B
 * 		class C implements A.B => 다중상속
 * 		== A,B를 동시에 상속받았다. 이게 다중상속 두 개의 인터페이스를 
 * 		== 하나의 클래스에 동시에 상속받는 것 
 * 
 * 		interface A
 * 		interface B
 * 		class C
 * 		class D extends C implements A,B
 * 	
 * 	??default interface??
 * 		interface는 구현된 메소드는 지원하지 못한다.
 * 		
 * 		interface A
 * 		{
 * 			void display(){}
 * 		}
 * 			이렇게 작성하면 오류가 발생한다.
 * 
 * 		interface A
 * 		{
 * 		(public) default void display(){} 
 * 		// 앞에 default를 붙여주면 구현된 메소드도 지원가능 
 * 		(public) abstract void doGame();		
 * 		}
 * 
 * 	??왜 오류 발생?? 
 * 		interface A
 * 		{	
 * 			void aaa();
 * 		}
 * 		class B implements A
 * 		{
 * 			void aaa(){} => 오류가 발생한다. 왜냐하면 
 * 		}
 * 
 * 		-----------------------
 * 		
 * 		interface A
 * 		{	
 * 			void aaa(); // 앞에 public이 생략되어 있는 public void aaa이다.
 * 		}
 * 		class B implements A
 * 		{
 * 			void aaa(){} => public에서 더 작은 접근자로 접근했으므로 오류가 발생한ㄷ
 * 			=> public void aaa(){} 수정해서 작성하면 오류가 발생하지 않는다.
 * 		}
 * 	
 * 
 * 	== 인터페이스 249정리 ===	
 * 	1. ??인터페이스 객체생성??
 * 		인터페이스는 구현이 안된 메소드를 가지고 있으면 메모리에 저장할 수 없어
 * 		객체를 생성할 수 없지만, 단 !!! 익명의 클래스를 사용하면 객체 생성이 가능하다 .
 * 	
 * 	2. 인터페이스는 다중상속이 가능하다.
 * 		class A implements 인터페이스, 인터페이스.... 인터페이스가 1개든 100개든 생성 가능하다.
 * 
 */

// ??충돌이 안된 이유??
interface AA
{
	int a=10; 
	void aaa();
}

interface BB	
{
	int a=20; 
	void bbb();
}

class CC implements AA,BB // 이증상속
{
	public void print()
	{
		System.out.println(AA.a);
		System.out.println(BB.a);
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("BB.bbb() 구현");
	}

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("BB.aaa() 구현");
	}
}
//	AA.a / BB.a 두 개가 다른 변수의 저장이 되어있다. 서로 다르다.
// 	상속받은 뒤에 변수를 가지고 올 때 인터페이스명을 입력헤야 한다. 


/*	
 * 	class A
 * 	class B extends A => B쓸려는 목적 , A의 기능을 전부 다 B의 넣어서 쓸려고
 * 
 * 	A a=new B(); => 드물다
 * 	B b=new B(); 
 * 
 * 	=> 추상클래스 , 인터페이스 => 상속받은 클래스를 한번에 제어 
 * 
 * 	여러 개를 동시에 제어하려면 A a=new B로 A가 제일 상위클래스이니깐 상위클래스를 제어하는 편리
 * 	개별 적인 것을 하나 하나 씩 제어하려면 B b=new B();가 편리
 * 
 * 	클릭할때마다 바꿔줄 수 있게
 * 
 */
public class 인터페이스 {
	public static void main(String[] args) {
		
		CC c=new CC();
		c.print();
	
		c.aaa();
		c.bbb();
		
		/////////////////
		AA aa=new CC();	// implements도 extends와 동일하게 적용된다. 
		// bbb() 호출을 못한다. AA안에 BB가 존재하지 않으므로 bbb를 호출하지 못한다
		// 생성자에 따라서 호출하는 것이 달라진다. 구현자가 달라진다. 
		aa.aaa();
		
		BB bb=new CC();
		bb.bbb();
		
	}
}











































