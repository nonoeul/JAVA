package com.sist.main;
/*
 * 	[1] 제어어
 * 	-------
 * 	1) static : 공통적인
 * 	2) final  : 마지막 => 변수(상수)/class(종단 클래스 => 확장이 불가능, 상속할 수 없다.)
 * 		=> class final className 확장이 불가능하다. 종단클래스
 * 			=> system, String, Math, StringBuffer => 있는 그대로 사용 
 * 			   java.lang 
 * 	3) abstract : 추상적인 => 공통점을 모아준다. => 프로그램에 맞게 구현이 가능하게 만들어준다. 
 * 	------------------------------------------------------------------------
 * 	제어어는 총 3개이다. 공통적으로 사용될지 static 메모리 한 개에 저장 / 수정과 확장이 불가능한 완전 확정적인 제어어 final / 틀을 만들어줘서 갖다 쓸 수 있게 만들어주는 abstract 
 * 
 * 	[2] 클래스의 종류
 * 		1) 추상 클래스
 * 			형식) 
 * 				public abstract class ClassName
 * 				{
 * 					---------------------------
 * 					1. 변수 (멤버변수) static,인스턴스 변수등
 * 					---------------------------
 * 					2. 메소드 : 구현된 메소드
 * 					---------------------------
 * 					3. 메소드 : 구현이 안된 메소드 (선언)
 * 					   => 자신이 메모리 할당이 불가능하다. 
 * 					   예)  
 * 					   		abstract class A
 * 							{
 * 							}  
 * 							A a=new A(); ==> 오류  
 * 							=> 상속을 받는다 => 구현이 안된 메소드를 구현후에 사용   
 * 							=> 오버라이딩    
 * 							class B extends A    
 * 							{    
 * 							}    
 * 							    
 * 							A a=new B(); => 묵시적 형변환 (자동 형변환)
 * 								-------- a가 가지고 있는 메소드는 B로 대체 //     
 * 							B b=new B();   
 * 					---------------------------
 * 					4. 생성자 : 
 * 					---------------------------
 * 				}
 * 	2) 인터페이스
 * 		2. 추상크래스의 일종
 * 		3. 구성요소
 * 		public interface InterfaceName
 * 		{
 * 			-------------------------
 * 			변수설정 
 * 				상수형 변수
 * 				int a; ==> 오류발생
 * 				int a=10;
 * 				=> 컴파일시
 * 				public static final int a=10;
 * 			    ----------------------
 * 				자동 추가가 된다.
 * 			    ----------------------
 * 				메소드 / 구현이 안된 메소드
 * 				void display(); 선언만 하는 메소드를 가지고 간다.
 * 				선언만 한다. 
 * 				=> 컴파일시에 자동으로 
 * 				public abstract void display()
 * 					=> 항상 public abstract가 생략돼서 void display만 출력된다.
 * 					=> public abstract는 항상 자동 추가
 * 				
 * 					문제점)
 * 					interface A		// 인터페이스를 쓰는 이유는 틀을 만들어줘서 쉽게 갖다 쓸 수 있다. 설계만 한느 것 
 * 					{
 * 						void display():
 * 					{
 * 					class B implements A
 * 					{
 * 						오버라이딩 => 오버라이딩을 할 떄 오류 발생 
 * 						(public abstract) void display() => 오류가 발생한다. 
 * 						=> 접근지정어가 축소가 된다. void 앞에 public abstract가 생략되어 있따.
 * 						=> 만약 public보다 작은 접근제어자일 경우 오류가 발생한다. 
 * 						{
 * 						}
 * 						public void display() => 정상 // 정상적으로 접근하려면 앞에다가 public을 붙여줘야한다.
 * 							=> 다른 접근지정어는 사용할 수 없다. void display는 앞에 public abstract가 붙어있는 설계만 해주는
 * 								추상클래스로써 만약 private, default처럼 더 작은 접근제어자로 묶여있으면 접근 범위가 더 작아지는 오류가 발생한다. 
 * 						{
 * 						}
 * 					}
 * 					** 인터페이스의 모든 메소드와 변수는 public 
 * 			    ----------------------
 * 				메소드 / 구현된 메소드 (JDK 1.8이상)
 * 			  메소드
 * 				default void methodName()	// default가 등장한 이유는, 인터페이스에 선언된 메소드 추가시 
 * 				------ public이 자동으로 추가	   => 관련된 모드 클래스가 오류를 발생시킨다. // 인터페이스는 고치면 안됀다., 기능을 추가하다보니깐 선언됀 변수들이 많아졌다. 
 * 				{							   => 추상클래스는 추가를 하더라도 괜찮았는데, 인터페이스 모두 선언을 시켜줘야해 서 불편 
 * 				}
 * 			    ----------------------
 * 				메소드 / 구현된 메소드 (JDK 1.8이상)
 * 			  메소드
 * 				static void methodName()
 * 				------public이 생략이 되어 있다.
 * 				{
 * 				}
 * 				public static void methodName() // 모든 메서드 앞에 접근제어자를 넣지 않으면 public이 자동으로 추가 된다.
 * 				-----------------------
 * 			}
 * 		*** 추상클래스, 인터페이스는 상속을 받는 경우, 반드시 선언만 된 메소드를 구현해서 사용해줘야 한다. 
 * 			반드시 선언만 된 메소드를 구현해서 사용한다.
 * 
 * 		*** 추상클래스 : 입출력, 네트워크, 데이터연결 // 데이터만 연결해서 잘 사용해봐라 
 * 		*** 인터페이스 : 윈도우의 이벤트처리할때 많이 쓰인다. / 버튼 클릭 / 마우스 클릭 / 키보드...
 * 		 
 * 
 * 	3) 내부클래스 (네트워크, 빅데이터)
 * 			멤버클래스		: 쓰레드 => 데이터를 공유할 목적 		
 * 			class A(Server)
 * 			{
 * 				A,B,C,D,E => 변수나 메서드
 * 				class B(통신)
 * 
 * 
 * 
 * 				{
 * 					A, B...
 * 				}
 * 			} 익명의 클래스 : 상속이 없이 오버라이딩이 가능하다. 
 * 
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainClass extends JFrame implements MouseListener{
	
	public static void main(String[] args) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}














