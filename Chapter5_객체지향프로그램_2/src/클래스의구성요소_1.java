/*	[기초]
 * 		=	변수 ,데이터형 (정수 int,byte,long) (실수 double boolean char)
 * 		= 	연산자 , 제어문
 * 		= 	단항연산자 (++,--,!,(type)
 * 		=	이항연산자 (산술, 비교, 논리, 대입)
 * 		=	삼항연산자 (
 * 		=	조건문 (딘일 if, 선택 if~else, 다중 if~else)
 * 		=	반복문 (for, while)
 * 				  이차 for, for-each
 * 		=	반복제어문(break)
 * 	= 배열 : 1차 
 * 	= 문자열 저장 => String 
 * 	= 기능 :	String기능 암기필수
 * 		1)equals : 문자열 비교
 * 		  	boolean equals(String s)
 * 		  	DB : WHERE name='홍길동'
 * 		
 * 		2)startWith : 시작문자열
 *			DB : WHERE name Like '홍%'	 		 	 
 * 		
 * 		3)endWith 	: 끝문자열
 * 		  	boolean endsWith(String s)
 * 			DB : WHERE name LIKE'%홍'
 * 		
 * 		4)contains	: 포함여부
 * 			)boolean contains(String s)
 * 			DB : WHERE name Like '%길%'
 * 		
 * 		5)length	: 문자, 문자열의 위치
 * 		
 * 		6)indexOf 	: 문자, 문자열의 위치
 * 		  int indexOf(char)
 * 		  int indexOf(string)
 * 		  *** 문자열은 index번호가 0부터 시작한다. 
 * 		  String s="Hello Java";
 * 					0123456789
 * 		  s.indexOf('a'),s.indexOf("a")=>7
 * 		
 * 		7)lastIndexOf : 문자, 문자열의 위치 
 * 		  int lastIndexOf(char)
 * 		  int lastIndexOf(String)
 * 			
 * 		8)trim : 좌우 공백 제거
 * 		  String trim()
 * 		
 * 		9)valueOf : 모든 데이터형을 문자열로 변환
 * 		  valueOF(1) = "1"
 * 		  String valueOf(모든 데이터형)
 * 		  String.valueOf(1)
 * 		  static String valueOf(모든 데이터형) : String에서 유일하다. 
 * 		
 * 		10)replace() : 변환 (문자열, 문자)
 * 							old	  new
 * 		  String replace(char, char)
 * 		  String replace(string, string)
 * 
 * 		11)replaceAll : 변환 (문자열)
 * 		  String replaceAll(String,String)
 * 		
 * 		12)substring  : 문자열을 자를떄 사용된다.
 * 		  String substring(int s)
 * 		  String s="Hello Java"
 * 					0123456789
 * 		  s.substring(6) 			
 * 		  String substring(int s,int e)
 * 		  String s="Hello Java"
 * 				    0123456789
 * 		  s.substring(0.5) ==> Hello
 * 
 * 
 * 	class : 설계 ==> 속성, 기능 --- 메소드 
 * 					--------변수
 * 			웹 	=> 출력, 내용 (변수)
 * 				=> 메뉴, 버튼 => 기능
 *			----------------------요구사항분석 (설계)
 *	추상화 : 설계 (기능, 데이터) : 사물을 단순화
 *	예)
 *		사원 : 사번 , 이름
 *			  출근하다, 퇴근하다.	
 *	--------------------------
 *	class 설계 ======> 메모리 저장 (인스턴스)
 *				new (클래스 저장할떄 = new)
 *				** Spring은 new을 사용하지말라
 *				** new없이 저장이 가능 => 리플렉션
 *
 *	1. 구성요소
 *		class ClassName
 *		{
 *		----------------------
 *			변수(속성)
 *			 	멤버변수
 *			 	= 인스턴스변수 = new 사용시마다 따로 메모리를 만든다.
 *			 	= 정적변수 (static) = 한 개의 공간만 생성 => 공유변수
 *				=> 컴파일러에 의해서 자동 생성 
 *		----------------------
 *			메소드(동작) 기능
 *		----------------------
 *			생성자 : 	멤버변수 (인스턴스 변수) 초기화
 *					메모리에 저장시 처음으로 호출되는 메소드
 *		----------------------
 * 	2. 구성요소 사용법	
 * 		1) 메모리에 저장
 * 			class A
 * 			{
 * 				변수 / 메소드
 * 			}
 * 			
 * 			A=a; 선언
 * 			a=new A();
 * 
 * 			class A
 * 			{
 * 				int sabun;
 * 				String getName() {}
 * 				int getSabun(){}
 * 				void run(){}
 * 			}
 * 
 * 			A a=new A();
 * 			---
 * 			a.sabun = 100이라는 주소에 있는 sabun의 값을 가지고 옫나.
 * 			== .(점)이 의미하는 것은 메모리 주소 접근 연산자를 의미한다.
 * 			new => 데이터메모리를 모아준다.
 * 				  
 * 
 * 
 * 	3. 접근범위 
 * 	4. 객체지향의 3대 요소
 * 	5. 클래스의 종류
 * 	6. 예외처리 
 * 	----------------
 * 
 * 	Class A
 * 	{
 * 		int aa;
 * 	}
 * 	Class B
 * 	{
 * 
 * 		A a=new A();
 * 	}
 * 	Class C
 * 	{
 * 		B b=new B();
 * 	}
 * 	
 * 	C c=new C();
 * 	c.b.a.aa
 * 	// c클래스 안에 있는 b객체, b클래스 안에 있는 a클래스 안에 있는 aa변수
 * 	// 클래스안에 클래스가 있을 수 있고, 클래스 안에 또다른 클래스가 있을 수 있다.
 * 	// 객체지향 조립식 프로그램이다. 
 * 	
 * 
 * 
 */
class student
{
	int hakbun;
	String name;
}


public class 클래스의구성요소_1 {
	public static void main(String[] args) 
	{
		student hong= new student();
		// hong => hakbun,name
		hong.hakbun=1;
		hong.name="노을";
		student shim=hong; // 주소가 같다.
		shim.hakbun=2;
		shim.name="심청이";
		// 주소가 같으면 같은대를 제어한다. 
		
		System.out.println(hong.name);
		// hong 주소가 바뀌었다.
		// 같은 주소를 제어하기 때문이다. name
		System.out.println(hong.hakbun);
		
		
	}
}




























