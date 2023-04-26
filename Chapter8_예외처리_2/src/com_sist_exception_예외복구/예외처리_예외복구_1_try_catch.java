package com_sist_exception_예외복구;
/*
 * 	try: 정상실행하는 ㅗ딩
 * 	catch: 예외가 발생시에 복구하는 과정 (여러개 사용 가능)
 * 	-------------------------------------------
 * 	예외처리 + 소스상에서 수정한 에러(가벼운 에러)
 * 	1. 사전에 에러를 방지하는 프로그램
 * 	2. 비정상 종료를 방지하고 정상 종료할 수 있게 가능하게 만드는 목적 
 * 		--계층구조를 알고 있어야 한다. 계층구조를 알고 있어야지 try-catch절을 쓸 수 있다.
 * 		--계층구조는 상속도이다. Object부터 시작한다. : 모든 클래스의 상위클래스이다. Object 상속을 받고 있다. 
 * 		--Object -
 * 			|
 *  	Throwable(에러의 최상위 클래스)
 * 			|
 *     ----------------------
 * 	   Error		Exception
 *     처리불가능		처리가능 
 * 	   =메모리부족		= 0으로 나누는 경우 
 * 	   =윈도우충돌		= 정수변환의 문제 
 * 					= 형변환의 문제
 * 					= 객체가 null인 경우 	
 * 					= Web에서 URL/IP틀린 경우  	
 * 
 * 		Error은 심각한 문제로 사용자가 해결할 수 없다.
 * 		Exception은 사용자가 처리가 가능한 경미한 문제로 
 * 		사용자의 실수인 경우가 많다.
 * 
 * 		Exception = 예외처리에 최상위 클래스이다. // 여러가지 예외처리 종료가 있는데 
 * 		모든 예외를 처리할 수 있는 최상위 클래스이다. 
 * 
 * 		??Exception종류??
 * 		1.CheckeException	; 컴파일시에 예외처리를 했는지 여부 확인
 * 							  반드시 컴파일시에 예외처리를 해야한다. 
 * 		2.UnCheckException	: 컴파일시에 예외처리를 하지 않는다. 필요시에만 예외를 처리한다. 
 * 							  예외 처리를 무조건 하지 않아도 괜찮다. 필요시에 한다.
 * 
 * 		Exception
 * 			|
 * 		----------------------
 * 		1) CheckedException
 * 				 |
 * 				1. IOExcetpion :파일 입출력, 메모리 입출력, 네트워크 입출력		
 * 				   (java.io) = 반드시 예외처리를 해서 써야한다.
 *  		
 * 				2. SQLException: 오라클 연결 (오라클리 인식하는 언어 : SQL)
 * 					JDBC= 자바로 오라클을 연결하는 프로그램 ==> DBCP(AWS가 연결되면 DB와 연결된 공간 pool생성)  ==> ORM(MyBatis,JPA)		
 * 					Web = 핵심(데이터베이스 연동)
 * 					(java.sql)
 * 
 * 				3. ClassNotFoundException : 클래스이름으로 메모리할당 =>클래스명, 패키지명틀린경우 스프링에서 주로 사용된다.
 * 				
 * 		A a= new A(): 클래스 매개변수 = new 생성자 // A의 클래스에 있는 a에 매개변수를 만들어주고 A생성자까지 만들어준다
 * 		생성자: 하는 역할 / 초기값을 만들어준다.
 *  
 * 				4. InterruptedException : 쓰레드 (한 개의 프로세서안에서 여러개의 충돌과 관련)
 * 				=> java.lang / java.util => 
 * 
 * 	??CheckedException 와 UncheckedException의 차이??
 * 			CheckedExcetion은 한번 발생해버리면 해결하기 힘들다 그러기 때문에 
 * 			미리 해결하기 위해 준비하거나 사전에 해결해야 한다.
 * 			UncheckedException은 문제가 발생시 해결해야 할 경우에만 선택으로
 * 			해결하면 된다.필수가 아니다잇! 
 * 
 * 		2) UnCheckedException : 예외처리는 필요한 경우에만 사용이 가능하다.
 * 				=> Exception 
 * 				||
 * 			RuntimeExcetpion : 실행시 (인터프리터) => 사용자입력, 프로그래머 실수 
 * 			=> 예외 처리를 해도 되고 안해도 된다. 
 * 				||
 * 			NumberFormatException : 정수변환에서 에러
 * 				=> Wrapper : 기본형을 사용하가ㅣ 쉽게 클래스형으로 제작
 * 							boolean => Boolean
 * 							int		=> Interger
 * 							double	=> Double
 * 			1. Interger.parseInt("10"); => 윈도우프로그램이나 웹프로그램일 때 (문자열만 사용한다)
 * 				웹에서 전송된 데이터를 받을 때가 있는데, 이럴때가 쓰는데 getParameter()이라고 한다.
 * 				getParameter의 반환형은 무조권 String으로 받아야 한다 .
 * 					=> String getParameter() => 정수 
 * 				Jsoup : 데이터를 수집 (String) 웹은 무조권 String이다. 변경하는 데이터를 지원한다. 
 * 
 * 		wrapper : 사전적의미에서 포장지라는 뜻이다.여기서 래퍼클래스라고 함은 포장하다라는 의미하다. 포장하다 
 * 		필요시 컴파일을 자동 실행시켜준다.
 * 		Interger은 통해 박싱하고 int로 언박싱하는 것이다. // 포장하고 풀고를 반복 
 * 
 * 
 * 			2. ArrayIndexOutofBoundsException : 배열범위 초과
 * 				배열의 범우기ㅏ [3]까지인데 4를 배정하거나 그 이상을 대입할때
 * 				-----------------------------
 * 			3. ArithmeticException 	: 0으로 나눌 경우
 * 				100/0 처럼 0은 나눌 수 없는데 0을 대입하는 경우
 * 			4. NullpointerException	: 객체나 배열에 주소가 없는 경우 
 * 			 	A a; , int[] arr => null
 * 				객체나 배열을 선언만 하고 안에다가 값을 넣지 않고 바로 출력하려고 했을때
 * 				A a;
 * 				System out println(a)를 하면 a안에는 아무값도 지정되있지 않기 때문에
 * 				null값이 반환이 된다. 
 * 
 * 			5. ClassCastException	: 클래스 형변환이 잘못된 경우
 * 				Class A
 * 				Class B extends A
 * 				B b=(B)new A(); // Exception 오류가 발생하는 코드이다. 
 * 				==> ClassCastException이 발생한다.? 부모의 생성자를 만들고 자식의 클래스를 가지고 와서 
 * 					그런가?
 * 				==> A a=new B();
 * 					B b=(B)a;
 * 		
 * 	??예외처리의 기본???
 * 		try-catch
 * 		---------
 * 		형식)
 * 			try
 * 			{
 * 				정상수행이 가능한 코드  
 * 			}catch(예외처리 종류 설정)
 * 			{
 * 
 * 			}
 * 		= 웹에서 예이처리가 매우 중요하다 .
 * 		-------------------------
 * 				try ~ catch => 소스 전체 처리 : 종료한다. // 어디다가 쓰냐에 따라서 프로그램이 달라진다. 
 * 								--------- 부분 처리 : 제외 
 * 
 * 
 */
public class 예외처리_예외복구_1_try_catch {
	public static void main(String[] args) {
		
			for (int i = 1; i<=10; i++) 
		{
			try {
			int j=(int)(Math.random()*3);// 0,1,2 
			// j가 0을 발생하는 순간 이 식은 끝난다.
			int k=i/j;
			System.out.println("i="+i+" k="+k);
			}catch(Exception ex) {
				System.out.println("0으로 나눌 수 없습니다. 0으로 출력할 수 없다고요");
			// 오류가 발생했을 때 try가 아닌 catch을 실행하고 다시 for문으로 돌아가서 for문을 마저 수행하고
			// for문이 끝났을 때 이 식의 진행은 종료된다.. 
			}
		}
	}
}
