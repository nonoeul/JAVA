package com_sist_exception_예외복구;
/*
 * 예외처리
 * 		=> 직접처리 (프로그래머 처리)
 * 		-------------------예외에 대한 복구 ==> 예외복구 (catch절)
 * 		try-catch~finally
 * 		
 * 		=> 간접처리 (JVM에 맡긴다)
 * 		-------------------예외를 복구할 수 없다. ==> 건너뛰게 만든다.
 * 		throws
 * 	
 * 		형식)
 * 			method() throws 예외처리클래스, 예외처리클래스
 * 				=> method()를 호출하는 프로그래머가 예외처리후에 사용한다.
 * 					=> 예외 떠맡기기
 * 						1) 예외 떠맡기기
 * 						2) try-catch로 처리가 가능하다 .
 * 						3) 라이브러리 => 사용자가 떠맡는다. 
 * 			예) 
 * 				void method() throws ArrayIndexOutBoundException,
 * 									 NumberFormatException 			
 * 				void 예외처리() 
 * 				{
 * 					method();
 * 				}
 * 				void 예외처리()
 * 				{
 * 					try
 * 					{	
 * 						method();
 * 					}catch(ArrayIndexOutOfBoundsException e)
 * 					{
 * 					}
 * 				}
 * 				void 예외처리()
 * 				{
 * 					method()
 * 				}
 * 
 * 
 * 		-------------------------------------------------
 * 		=> 사용자 정의 예외처리 : 지원하지 앟기 떄문에 직접 예외ㅓ리제작
 * 			=> 거의없다.
 * 		class MyException extends Exception 
 * 		{
 * 		}
 * 		=> 자동 호출시에 자바는 자바에서 만든 예외처리만 호출한다. 
 * 			=> 임의로 밠생해서 찾는다. (throw) 임의발생은 우리가 필요한 것을 찾기위해 사용자정의를 만든다. 
 * 	
 *	??메세지 출력메세지??
 *	1. getMessage =	예외메세지 출력
 *	2. tosring	  = 객체의 주소값에 해당하는 문자열 출력
 *	3. e.printStackTrace(); = 에외메세지와 이유, 자리 출력 
 * 
 * 
 */
public class 예외복구_정리 {

	
	public static void method() throws ArrayIndexOutOfBoundsException,NumberFormatException
	{
		
	}
	
	public static void excute() throws ArrayIndexOutOfBoundsException,NumberFormatException
	{
		
	}
	
	public static void excute2() throws ArrayIndexOutOfBoundsException,NumberFormatException
	{
		try
		{
			method();
		}catch(ArrayIndexOutOfBoundsException e) {}
		catch(NumberFormatException e) {}
	}
	
	public static void execute3()
	{
		try
		{
			method();
		}catch(RuntimeException e) {}
	}
	
	public static void execute4()
	{
		try
		{
			method();
		}catch(Exception e) {}
	}
	
	public static void execute5()
	{
		try
		{
			method();
		}catch(Throwable e) {}
	}
	
	
/*		계층표를 잘 알고 있자 누가 부모이고 누가 자식인지 잘 알고 있고
 * 		끝으로 갈 수록 더 상위 객체의 부모를 사용하자.
 * 		
 * 		RuntimeException
 * 			||
 * 		Exception
 * 			||
 * 		Throwable
 */
	
	
	
	public static void main(String[] args) {
		
		method(); // 실행시 에러이기 때문에 => 예외처리를 생략할 수 있다. 
		
	} 
}




































