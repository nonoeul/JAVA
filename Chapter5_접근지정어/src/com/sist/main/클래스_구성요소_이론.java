package com.sist.main;
/*
 * 	1) 클래스 구성요소
 * 	class ClassName
 * 	{
 * 		-----------
 * 		변수(멤버변수)
 * 		1) 멤버변수(인스턴스)
 * 		[접근지정어] 데이터형 변수명; // 어느 클래스까지 사용이 가능한지 설정
 * 		=> new를 사용시마다 메모리를 따로 생성하는 변수
 * 		=> new를 이용해서 반드시 메모리를 만들고사용 
 * 		=> 자동 초기화가 된다. 자동초기화!!!
 * 			기본형
 * 				int		=> 0
 * 				long	=> 0L
 * 				double	=> 0.0
 * 				boolean	=> false
 * 			참조형(배열, 클래스) 배열하고 클래스는 메모리주소를 참조해서 
 * 			저장된 모든 데이터를 관리한다. 
 * 			** 배열은 같은 크기의 데이터만 관리한다. 묶을 수 있는 같은 종류의 데이터를 묶는다.
 * 			** 클래스는 다른 크기의 데이터 관리한다. 
 * 			여러 개를 동시에 제어할 수 있게 만든다. 
 * 			** 초기화는 null(주소가 배정되지 않은 상태)
 * 	
 * 	2) 정적변수(공유변수) => 메모리 공간을 한 개만 생성해준다. => 모든 객체가 공유한다. 
 * 		[접근지정어] static 데이터형 변수명;
 * 						--------
 * 						기본형, 배열, 클래스 (데이터형이다)
 * 						=> new를 사용하지 않아도 컴파일러에 의해 자동 메모리 저장한다. 
 * 		static은 공유변수로 메모리 자체에 저장되기 때문에 따로 new로 객체를 만들어주지 않고
 * 		바로 값을 지정해서 사용할 수 있다. 
 * 
 * 	3) 변수 사용 방법
 * 		인스턴스 변수
 * 		-------------------------
 * 			반드시 메모리에 저장해야한다. 
 * 			lass A
 * 			{
 * 				int aa;;
 * 			}
 * 			A a=new A();
 * 			a.aa=100;
 * 			  - 객체(인스턴스)를 통해서 접근해야 한다. 
 * 		정적 변수
 * 			class A
 * 			{
 * 				static int a;
 * 			{
 * 			메모리 할당을 안해도 된다. 
 * 			=> A.a (클래스명으로 접근이 가능) => 클래스변수, 공유변수 
 * 		*** 보안 중심
 * 			1) 모든 멤버변수는 private 데이터를 은닉화 
 * 		*** 멤버변수는 사용이 가능한 옵션 : static , final(상수)  
 * 		-------------------------
 * 		생성자 
 * 		  = 특징
 * 		  	1) 생성자는 클래스명과 동일하다. 
 * 			=  생성자와 클래스명이 동일하지 않으면 그냥 일반메소드이다.
 * 			2) 생성자는 리턴형을 가지고 있지 않다. 
 * 				void A() 
 * 			3) 오버로딩 (중복메소드 중복) => 생성자는 필요시에는 여러 개를 만들 수 있다. 
 * 			   *** 생성자를 만들지 않는 경우 (컴파일러가 자동으로 기본생성자를 만들어 준다.)
 * 			   오버로딩 => 같은 메소드명으로 여러 개의 기능을 만들어서 사용한다. 
 * 				= 메소드명이 동일	// 메소드명으로 데이터형과 매개변수의 갯수를 지정해서 만들었는데.
 * 				아래에다가 추가적으로 다른 데이터형과 매개변수를 가진 메소드를 만들어 줄 수 있다. => 오버로딩
 * 				= 매개변수의 갯수나 데이터형이 다르다
 * 				= 한 개의 클래스안에서 제작
 * 				= 리턴형은 관계없다. 
 * 				예)
 * 					plusInt(int a,int b)
 * 					plusDouble(double d1,double d2)
 * 					plusString(String s1,String s2)
 * 					.....
 * 					너무 많은 메소드를 만들어야한다. 이런 불필요를
 * 					막기 위해서 오버로딩을 통해서 같은 메소드이름으로 다른 데이터와 매개변수를 만들 수 있다
 * 					plus(int a,int b)
 * 					plus(double d1,double d2)
 * 					plus(String s1,String s2)
 * 					같은 이름으로 다른 데이터타입과 다른 매개변수를 지정할 수 있다. 
 * 				 
 * 					= 객체 생성시에 호출되는 메소드
 * 					  생성자 호출시에는 반드시 new 생성자() 
 * 					= 멤버변수 초기화를 담당해주는게 생성자이다. 
 * 					  -> 외부에서 데이터를 읽어서 초기화를 시켜준다. 구현을 해줄 때 사용됨 
 * 					  *** 초기화를 담당해주는 것이 4가지를 가지고 있는데.
 * 					  1) 명시적 초기화 
 * 					  2) 초기화 블록  
 * 					  3) static 초기화 블록   
 * 					  4) 생성자
 * 				== 초기화를 시켜주는 방법이 4가지나 존재한다.
 *		 1) 명시적 초기화 
 *			class A
 *			{
 *				int a=10;			
 *				static int b=20;			
 *			}
 *
 * 		 2) 초기화 블록 : 멤버변수, static변수 초기화가 가능 
 * 			=> this 사용 가능
 * 			class A
 * 			{	
 * 				int a;
 *  			for(int i=0;i<10;i++)
 *  			{
 *  				a=i;
 *  			}
 *  		}
 *  
 *
 * 		 3) static 초기화 블록 : static 변수만 가능
 *		    => this 사용이 불가능 
 *		class A
 *		{
 *			static int b;
 *			static
 *			{
 *				for(int i=0;i<10;i++)
 *				{
 *					b=i;
 *				}
 *			}
 *		}
 *
 *
 * 		 4) 생성자 : 멤버변수, static변수 초기화 가능 
 * 		=> this 사용이 가능 
 * 		=> 생성자가 초기화를 할 때 가장 많이 사용된다.  
 * 		=> 인스턴스변수는 생성자를 주로 이용한다. 
 * 		=> 생성자없이 쓸려면 static블록을 사용하면 된다.!! 
 * 	=> 생성자는 필요할때마다 호출해야돼는데, 초기화 블록은 자동 호출된다.
 * 	=> static블럭은 컴파일할떄 자동으로 들어온다. 
 * 	=> 초기화블럭을 잘 봐야한다. 
 * 	---------------------------------------------------------------	
 * 	메소드 : 다른 클래스와 연결 담당(메세지)
 * 			멤버변수에 대한 제어 
 * 			반복제거 , 재사용, 수정 ...
 * 					----------
 * 					한가지 기능만 수행이 되게 만든다. 
 * 			메소드는 호출시에 처음부터 끝까지 수행 => 호출한 위치로 다시 돌아간다. 
 * 			웹에서는 동작하는 부분이 메소드다
 * 			------------------------
 * 			메뉴를 클릭, 버튼 클릭, 이미지 클릭... 전부다 메소드 
 * 		멤버메소드
 * 		[접근지정어] static 리턴타입 메소드(매개변수목록) 선언부
 * 		--------- ------
 * 		static [접근지정어] 
 * 		{
 * 			구현부
 * 		}
 * 		공유메소드
 * 		-----------------------------------------------------------	
 * 		static [접근지정어]
 * 		{
 * 			구현부
 * 		}
 * 		메소드 호출
 * 		멤버 메소드
 * 			클래스 객체명=new 생성자();
 * 			객체명.메소드()
 * 		공유 메소드 
 * 			static 공유메소드는 자동으로 저장된다
 * 			클래스명, 메소드()
 * 		메소드 유형
 * 		--------
 * 		리턴타입		매개변수 --- 여러개가 있을 수도 있고 없을 수도 있다.(최소화시켜준다)			
 * 		------	한개만 사용이 가능 (결과값이 많은 경우 ==> 클래스 / 배열)
 * 		한개만 사용 가능(결과값이 많은 경우 => 클래스 , 배열을 묶어서 보내준다)
 * 
 * 		예)
 * 			사용자 로그인 요청 
 * 			boolean ==> String id, String pwd 
 * 			plus : 사용자는 두 개의 정수 => 결과값을 더한 값 
 * 			검색 	 : 사용자는 검색어를 보낸다 => 찾은 모든 내용
 * 			---------------------------------------
 * 			결과값이 여러개가 나올 수도 있다. 
 * 				String[] find(String findData) 묶어서 넘겨주겠다.
 * 			상세 => 한개만 찾는다 (번호)
 * 				Movie detail(int 영화번호) // 한 개의 정보만 있다면 Movie로 쓰고 여러개의 정보를 보내야한다.
 *			// 여러 개의 정보를 배열로써 보내야 한다면 Movie[]배열로 만들어야 한다. 
 *
 * 		-----------------------------------------------------------	
 * 
 * 
 * 
 */
class B{
	int a;
		{ // => 인스턴스 초기화 블록	
  			for(int i=0;i<10;i++)
  			{
  				a=i;
  			}
  		} // => 인스턴스 초기화 블록
}
// class문 자체에서는 반복문/연산자를 사용할 수 없지만 초기화블럭을 생성해서 
// class문 안에서도 반복문과 연산자를 사용할 수 있게 된다. 



public class 클래스_구성요소_이론 {
	public static void main(String[] args) {
	B aaa = new B();
	System.out.println(aaa.a);
		
		
	}	
}

























