package com_sist_exception;
/*
 * 	에러 => 컴파일시(javac) / 실행시(java)
 * 		   -------------   ---------
 * 			Check			UnCheak => 예외처리를 생략할 수 있다.
 * 			  |				**구지 예외처리를 하지 않아도 됀다. 
 * 			자바문법(반드시 예외처리를 해야한다) // 반드시 예외를 처리해야하는 라이브러리가 있다.
 *	에러 
 *	---
 *		=수정이 불가능한 에러(심각한 오류) 	: 메모리부족, 윈도우 덤프
 *		 Error 
 *		
 *		=수정이 가능한 에러 (가벼운 오류)	: 소스상에서 수정이 가능하다 
 *		 => 파일읽기 (파일명이 틀리다), 배열 인덱스를 벗어났다.
 *		 => 웹 연결(url이 틀리다.) 이런 경우는 우리가 언제든지 고칠 수 있다. 
 *		 => Exception(예외처리) 우리가 언제든지 고치는게 가능하다. 쉽게 고칠 수 있다. 
 *	에러가 발생할 수 있는게 두 가지가 있다.
 *	--------
 *		1. 프로그래머의 실수
 *			=> 초기값이 없는 상태에서 비교 
 *			=> 배열 인덱스 오류 
 *			=> 무한루프 
 *			=> 파일명을 잘못 입력했을때
 *				==> 이런 것들이 프로그래머들의 실수이다. 
 *
 *		2. 사용자가 입력을 잘못했을 떄 // 에러를 발생시키는 형식
 *			=> 계산기 나누기할때 = 0을 입력하거나 , 
 *			=> 정수를 입력해야하는데 문자열을 입력하거나 
 *			-----------------------------------웹에서 유효성 검사 
 *		예외처리 : 견고한 프로그램을 만들기 위해서 사용 
 *				 -------------------- 비정상을 방지하고 항상 정상상태를 유지할 수 있게 만들어 준다 
 *				 -------------------- 사전에 에러를 방지해주는 프로그램이다. 
 *  
 *		***예외처리 방식*** 
 *			1. IF문 , 예외처리 잡을 떄 사용된다. // 0값일 경우, 에러를 방지할 떄 if문을 사용하기도 한다. 
 *			2. IF문으로 예외를 처리할 수 있는지 확인 IF문으로 해결할 수 없을때 예외처리 사영 
 *			3. 예외처리(Exception) : 복잡한 에러, IF문으로 해결할 수 없을 때 
 * 				웹: 	404(파일을 찾지 못할때) . 500(소스오류) , 415(한글변환), 400 (값을 잘못 받는 경우)
 * 				   	403(접속오류)
 * 
 * 	2. 예외처리 종류
 * 		= 예외발생시	=> 복구
 * 			try~catch 
 * 		= 예외발생시	=> 회피 
 * 			throws  
 * 		= 예외발생 	=> 테스트 
 * 			throw 
 * 		= 사용자 정의 예외 
 * 			=> 지원하지 않는 예외가 존재하기 떄문이다. 
 * 				//  
 * 			뭐할 거냐 정하면 된다. 복구할지 회피할지?
 * 
 * 	??try-catch절 형식??
 * 		=예외발생시 => 복구
 * 		try~catch
 * 		형식)
 * 			try 
 * 			{
 * 				int a=10;
 * 				int b=0; 
 * 				double d=a / (double)b; => catch로 이동
 * 				// b=0 이다 0으로 나누었다 오류 발생 !! 0으로 나눌 수 없단.
 * 					=> 오류가 발생하게 되면 catch로 이동한다.
 * 					=> 예외발생시 처리하는 영역으로 이동해서 오류를 잡아낸다.
 * 				정상수행하는 문장 
 * 				System.out.prin(d) ==> 수행 X
 * 			}catch(Exception e)
 * 			{
 * 				예외발생시 처리하는 영역 
 * 			}catch(ArrayIndexOutOfBoundsException e) // 예외처리절이 여러개 일 수도 있다.
 * 			{
 * 			}catch(나누기 ...) {}
 * 			catch(Exception e){} 
 * 			---
 * 			---
 * 			---A
 * 	// 정상수행이 된다면 try식을 수행하고 catch식을 수행하지 않고 바로 아래 A영역을 마저 수행한다.
 * 	// 오류가 발생한다면 try식을 건너뛰고 catch식을 수행하고 바로 아래 A영역을 마저 수행한다.
 *  
 *		예외처리의 계층구조 
 *				Object
 *					|
 *				Throwable
 *				  	|
 *				-----------
 *				|		  |
 *		 	 Erorr 		Exception == Exception은 모든 에러의 부모로써, Exception으로 모든 예외처리 잡을 수 있다. 
 *						= CheckExceptiom // 예외처리를 해야한다.
 *							=> IOException(입출력) => 메모리입출력과 관련이 있다, 파일 입출력, 네트워크 입출력과 관계가 있다.
 *								java.io ==> 예외처리를 걸어야지만 사용할 수 있는 것들이다. 클래스가 동일하다. 
 *							=> SQLxception(오라클 연동)
 *								java.sql => 네트워크 통신이기 때문에 
 *								자바응용프로그램 <======> 오라클 
 *								    (C)Client		  (S)Server
 *									=> 웹에 출력하는 모든 데이터 => 오라클 안에 저장할 수 있다. 
 *									=> 자바   오라클 연동  
 *							=> ClassNotFiundException
 *
 *						UnCheckExceptiom // 예외처리를 해도되고 안해ㅑ도 되고 
 *						|
 *	=> RuntimeExceptiom // 아래에 잇는 모든 에러의 조상이다, 아래에 있는 에러를 RuntimeException으로 예외처리가능하다.
 *	|
 *
 *	??NumberFormatException??
 *		숫자를 넣어야하는 자리이 문자열을 입력했을 때			
 *
 *
 *	??NullpointException??
 *		=>	객체가 초기화가 안된 상태 , 클래스를 생성했는데 NEW를 통해 객체를 생성해주지 않아
 *			아무런 값이 할당돼지 않아서 null값 오류가 발생한다.
 *		=> 	참조할 주소가 없을때 발생
 *
 *	??ArrayIndexOfOutBoundsException??
 *		=> 배열의 범위를 초과했을 때 나타난다.
 *		=> Array의 배열을 두 개를 줬는데 세번 쨰 값을 잡거나 했다면 오류가 발생한다.
 *
 *	??ArithmeticException??
 *		=> 0으로 나눌 경우 오류가 발생한다. 	
 *
 *	??ClassCastException??
 *		=> class형변환이 틀렸을 경우
 *	
 *	??IllegalArgumentException??
 *		=> 부적절한 인자가 발생했을 때 
 *				
 *		클로링할때 모든 데이터를 모든 형식에 맞게 딱딱 가지고 올 수 없다. 각 사이트의 세부마다 조금 씩 가격,전화번호,웹사이트 모두 차이가 있기 때문에
 *		없는 것을 빼버리고 있는 것만 가지고 올 수 있게 하기 위해서 예외처리를 한다 try-catch
 *
 *		??263page??
 *		-----------
 *		예외의미:	프로그램에서 돌발적으로(의도하지 않은 상황)에서 문제가 발생시
 *				처리를 어떻게 할거냐?? 의도치 않은 상황에서!! 
 *				-------------어떻게 처리할거냐?
 *				프로그램은 에러시에 비정상적인 종료를한다 => 비정상적인 종료를 방지하고 
 *				=> 프로그램이 정상적으로 종료가 가능하게 만드는 과정 (예외처리)라고 한다. 
 *		
 *			MalformedURLException 
 *			=> URL주소가 틀린 경우 
 *			=> Jsuop // jsoup으로 url을 등록해서 사용할 때 url이 틀릴 수도 있기 때문에 예외처리를 시켜줘야 한다. 
 *
 *
 *
 */
class AAAAA
{
	public void display() {
		System.out.println("A:display() Call");
	}
}

class BBBBB
{
	
}

class CCCCC extends BBBBB
{
	public void disp(int a,int b,int c)
	{
		System.out.println("1");
	}
	
	public void disp(int a,char b,byte c)
	{
		System.out.println("2");
	}
	
	public void disp(char a,char b,int c)
	{
		System.out.println("3");
	}
	// 오버라이딩 한 것이다. 
}

public class 예의처리_1 {
	static String ss="Hello";
	static AAAAA a; // 클래스는 선언만하면 무조권 null값이다.
	// AAAAA클래스에 a를 선언은 가능하지만 클래스는 선언만하면 값이 할당되지 않아서
	// null값이 발생한다 new를 할당해줘서 해야한다. 
	

	public static void main(String[] args) {
//		System.out.println(10/0); 에러가 발생하면 에러가 발생한 지점으로 아래의 문장들이 실행이 안댄다.
//		즉 에러가 발생하면 바로 비정상종료가 되서 그 아래로 모든 줄이 실행이 안됀다. 이를 방지하기 위해 아래를 try-catch문으로 ㅁ
//		묶어줘야 한다. 
		CCCCC ccc=new CCCCC(); // 잘못된 형변환  ClassCastException이 발생한다.
		// ClassCastException == 클래스에 대한 불가능한 타입 변환을 시도하려고 했을 때 발생한다. 
		ccc.disp('A', 10, 'B'); // 가장 근사한 값을 찾아간다. 
		
	//	System.out.println(ss.substring(ss.indexOf("K"),ss.lastIndexOf("o")));
		
		
	//	if(s.equals("Hello"))	// 에러가 발생하는 코드이다. s. s에 아무값도 저장되어 있지 않는다.
		{						// null 값이 발생한다. 
			System.out.println("OK");
		}
		
		
		
/*	NullpointException이 발생한다. s.= null값이다라는 오류가 발생한다
	s.equals를 할 때 s에 아무값도 할당되지 않았는데 s.equal로 사용하려고
	하니 오류가 발생한다. NullpointException 값이 할당되지 않았을때 	
		
*/		
		int a=10;
		int b=0; // 정상수행 = try, 사용자로부터 값을 받았을 때 
		
		if(b!=0)
		{
			int c=a/b;
			System.out.println("c"+c);
		}
		else // 예외처리, 이 부분은 catch라고 한다. 
		{
			System.out.println("0으로는 나눌순 없습니다.");
		}
		// 1. 정상적으로 종료가 되게 만든다.
		// 2. 우선적 => if 조건문으로 처리가 가능한지?
		// 3. if은 주로 사용하는게 => 검색용도, 사용자 입력제한 
		
		// Thread.sleep(1000); // 속도를 느리게 하는 것이다 .Thread.sleep는 무조권 try-catch문 예외처리를 해줘야 한다. 
		
		
	}
}



















































































