package com.sist.main;
/*
 * 	객체지향 프로그램
 * 	1) 클래스의 구성요소 => 클래스 (모델링)
 * 	2) 객체지향의 3대 요소
 * 		= 캡슐화 :데이터를 보호 (데이터 손실, 변경)
 * 		= 접근하는 범위 (접근지정어)
 * 		= 상속/포함 : 재사용
 * 		= 오버라이딩 / 오버로딩 = 다형성 
 * 	3) 클래스의 종류
 * 		= 내부 클래스
 * 		= 종단 클래스
 * 		= 공유 클래스
 * 		-------------------------객체
 * 	4) API : 자바에서 지원하는 클래스 (라이브러리)
 * 		java.lang
 * 		java.util
 * 		java.io
 * 		java.net
 * 	5) 클래스 조립법 : 사용자 정의 / 라이브러리 
 * 		-------------------------
 * 		오라클
 * 		오라클 + 자바연동 
 * 		-------------------------
 * 		웹 : HTML/CSS/Javascript 
 * 			+ 오라클 + 자바 
 * 			+
 * 		------------------------- JSP = 분리(출력 / 데이터관리) = MVC 
 * 		스프링 
 * 		------------------------- 
 * 		AWS포스팅
 * 		------------------------- 
 * 		개인 프로젝트 : React + springBoot + JPA
 * 
 * 		127page
 * 		-------
 * 		1. 접근지정어의 종류
 * 		------------------------------------------ 
 * 		   1. 자신의 클래스내에서만 사용
 * 			private 	자신의 클래스내에서만 접근 가능 
 * 			은닉화		
 * 			(멤버변수)
 * 			class A
 * 			{
 * 				private int age;
 * 			{
 * 		------------------------------------------		
 * 		   2. 			자신의 클래스내에서만 접근 가능 
 * 			default		같은패키지에서만 사용, 패키지가 다르면 사용 불가
 * 			{
 * 				default int age;
 * 			{	
 * 		------------------------------------------			
 * 		   3. 			자신의 클래스내에서만 접근 가능 
 * 						같은패키지에서만 사용, 패키지가 다르면 사용 불가 
 * 			protected	상속을 받은 클래스는 다른 패키지상에서 접근
 * 			{
 * 				protected int age;
 * 			}
 * 		------------------------------------------			
 * 		   4. 	 		자신의 클래스내에서만 접근 가능 
 * 						같은패키지에서만 사용, 패키지가 다르면 사용 불가 
 * 						모든 클래스에서 접근하는 방식
 * 			public		상속을 받은 클래스는 다른 패키지상에서 접근
 * 			{
 * 				public int age;
 * 			} 
 * 		------------------------------------------			
 * 		   
 * 			1) 변수 => private
 * 			2) 메소드 => 다른 클래스와 연결(통신수단) ==> public
 * 			3) 생성자 => public (다른 클래스에서 메모리 할당 후에 사용)
 * 		------------------------------------------			
 * 			4) class => public 
 * 			5) 조립 => 모든 클래스가 연결 (변수)
 * 		----------------은니고하 => 캡슐화
 * 		1. 변수를 다른 클래스나 자신의 클래스를 사용한다. 
 * 		읽기/쓰기 Getter/Setter			
 * 		
 * 	1. 지역변수
 * 		메소드 안에서만 선언되는 변수, 매개변수
 * 	2. 멤버변수
 * 		-------------- 저장 위치가 다르다 (변수명이 동일할 수 있다.)
 * 	class Human
 * 	{
 * 		String name; // 멤버변수 => 다른 클래스에서 사용 가능 
 * 		==> Heap 
 * 		public void setName(String name)
 * 		{					------------ 매개변수 
 * 			int a=10; // 지역변수 ==> Stack
 * 			===> 지역변수 우선순위 
 * 			System.out.println(name)을 쓰면 지역변수가 우선순위가 된다.
 * 			==> 지역변수와 멤버변수가 같은 경우 구분을 해준다.
 * 				==> this(클래스 자신)
 * 				==> this.name => Human이 가지고 있는 name변수 
 * 			==> 변수명이 다른 경우 
 * 				1. 지역변수 => 멤버변수 // 지역변수에 같은 이름이 있는지 찾고 지역변수에 없다면 멤버변수에서 가져온다. 
 * 			시스템의 출력은 public void setName(String name)에 있는 name을 출력한다. 	
 * 		}
 * 
 * 
 * 
 */
class Student{
		private int hakbun;
		private String name;
		private int kor,eng,math;	
		
		public int getHaknun() {
			 return hakbun;
			 // 모든 변수에서 지역변수를 구분해주기 위해서는 this를 사용해야하지만
			 // 멤버변수와 겹치지 않으면 생략가능 
		}
		
		public void setHakbun(int hakbun) {
			this.hakbun = hakbun;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name; // this.name 지역변수이고, name은 멤버변수이다.
			// 지역변수와 멤버변수의 이름이 동일하기 때문에 지역변수와 멤버변수를 구분해주기 위해서 this 사용 
		}
		public int getKor() {
			return kor;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		public int getMath() {
			return math;
		}
		public void setMath(int math) {
			this.math = math;
		}
}

public class 접근지정어_1 {

	
		// 1명의 학생 저장
		Student hong=new Student();
		// hong.hakbun 바로 변수를 가져오지 못한다
		// private으로 감춰져 있기 때문에 메소드를 사용하기 위해서는
		// 메소드를 사용해서 함수를 사용해줘야 한다.
//		hong.setHakbun(1);
//		hong.setName("홍길동");
//		hong.setKor(89);
//		hong.setEng(90);
//		hong.setMath(78);
		
//		System.out.println(hong.getHaknun()+" "
//							+hong.getName()+" "
//							+hong.getKor()+" "
//							+hong.getEng()+" "
//							+hong.getMath());
/*
 * 
 * 	캡슐화를 사용하는 이유 
 * 	외부에서 잘못된 사용이나 변수에 대한 손상을 방지하기 위해 사용 
 * 		=> 캡슐화를 사용허기 위해서 만드는 방법 => 접근지정어(private)
 * 	
 * 
 * 	
 */
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
