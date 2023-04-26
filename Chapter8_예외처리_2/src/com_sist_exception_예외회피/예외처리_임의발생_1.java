package com_sist_exception_예외회피;
/*
 * Exception은 모든 예외처리의 최상위객체로 Exception으로 모든 예외를 처리할 수 있긴 하다.
 * 
 * 	임의발생 : 테스트목적 
 * 	// 일부로 에러를 발생시켜보았을 때 프로그램이 버티나 못버티나를 확인하는 것이다 .
 * 	ex) 배포 : 상용화하기 전에 프로그램이 버티나릃 확인 
 * 
 * 	형식) 
 * 		throw new 예외처리생성자() // 임의로 발생할 수도 있다. 
 * 
 *	 
 * 
 * 
 */

public class 예외처리_임의발생_1 {
	public static void main(String[] args) {
		
//		try
//		{
//			Thread.sleep(10);
//		}catch(Exception e) {} // catch(Throwable e)로 처리 가능
//		InterruptedException < Exception < Throwable
	
		try
		{
			int a=10;
			if(a%2==0)
			{
				System.out.println("임의로 예외발생!!");
				throw new NumberFormatException("정수 변환이 안됌");
//			==> catch로 이동 => 소스코딩을 할 수 없다.
				
				
//				getMessage변경 => 생성자 매개변수 생성
				
 /*			class NumberFormatException extends Exception
 * 			{
 * 				private String message="default 문자열";
 * 				public NumberFormatException()
 * 				{
 * 				}
 * 				public NumberFormatException(String message)
 * 				{
 * 					this.message=message;
 * 				}
 * 				getter/setter
 * 			}
 * 	
 * 	?? 예외처리의 매개변수 ?? 
 * 	private String message="default 문자열";
 * 				public NumberFormatException()
 * 				{
 * 				}
 * 				public NumberFormatException(String message)
 * 				{
 * 					this.message=message;
 * 				}
 * 				
 * 		1. 매개변수를 가지고 있는 문장이면 매개변수를 이용해서 출력했을 때 아래 
 * 			String message를 가지고 있는 this.message=message에 문장을 출려갛고
 * 		2. 매개변수를 가지고 있지 않을 때는 위에 아무것도 값이 지정되어 있찌 않은 값을 출력하낟. 
 * 
 * 
 * 
 * 
 */
			}
		}
		catch(ClassCastException e)
		{
		System.out.println(e.getMessage());	
		// 에러 부분을 처리해주는 것이 가장 중요하다.
		// 대부분의 catch절에는 어떤 문제가 발생했는지를 확인해주는 것이 매우 중요하다.
		// 에러확인만 해주는게 중요하다.!! 
		}
		catch(NumberFormatException e)
		{
		System.out.println("NumberformatException: "+e.getMessage());
		}	
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
