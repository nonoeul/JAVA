package com_sist_exception_예외복구;
/*
 * 	finally 에러가 발생하든지 발생안하든지 무조권 실행된다. 이게중요한 포인트 
 * 
 * 
 * 	try
 * 	{
 * 		정상수행이 가능
 * 		=> 에러 (예상하지 못한 에러가 발생할 수 있다.)
 * 			프로그래머의 실수나, 사용자의 입력값오류로 인해 에러가 발생할 수 있다.
 * 	
 * 	}catch(예상되는 에러클래스)
 * 	{
 * 		에러가 발생시에 처리
 * 		=어러 처리
 * 		=복구할 수 있다. => 에러 메시지 전송도 가ㅡㅇ
 * 	}
 * 	finally // finally는 무조권 실행해야 한다.
 * 	// finally는 생략이 가능하다. 무조권 수행해야한다. try-catch절 밖에 있으면
 * 		try-catch절이 에러가 발생했는지 정상수행했는지에 관계업이 무조권 실행한다.
 * 		우리가 평소에 쓰는 대부분의 문장들이 finally절로 finally은 생략가능하다. 
 * 	{
 * 		무조권 수행하는 코딩
 * 		파일닫기, 오라클연결 해제, 서버연결해제 
 * 
 * 	실행순서
 * 	=======
 * 	문장1
 * 	문장2
 * 	try
 * 	{
 * 		문장 3
 * 		문장 4
 * 		문장 5
 * 	}catch(예외처리 클래스1)
 * 	{
 * 		문장6
 * 	}
 *	}catch(예외처리 클래스2)
 * 	{
 * 		문장7 
 * 	}
 * 	}catch(예외처리 클래스3)
 * 	{
 * 		문장8
 * 	}
 *  finally 
 *  {
 *  	문장9
 *  }
 *  	문장10
 *  	문장11
 * 
 * 		1. try가 정상수행한다면 오류가 없다면 문장1,2,3,4,5 / finally 9번 수행
 * 			// fianlly은 정상수행을 했든지 오류가 발생했는지와 관계없이 뭊권 실행 
 * 		
 * 		2 try 에러(1) 발생했다면 문장 1,2,3 ==> catch(1) 6-9-10-11
 * 		3 try 에러(2) 발생했다면 문장 1,2,3 ==> catch(1) 7-9-10-11
 * 		4 try 에러(3) 발생했다면 문장 1,2,3 ==> catch(1) 8-9-10-11
 	==> try=catch절은 에러를 제외하고 나머지 문장을 실행한다. 에러가 나든지 안나든지 fianllyㅡㄴ 무조권 실행
 */
public class 예외처리_예외복구_5_finally {
	public static void main(String[] args) {
		
		try
		{
			int[] arr=new int[2];
			arr[0]=10;
			arr[1]=0;
			System.out.println(arr[0]/arr[1]);
		}catch(ArithmeticException|ArrayIndexOutOfBoundsException e)
		{
			System.out.println("에러발생");
			e.printStackTrace();
		}
		System.out.println("시스템프로그램 종료");
		
		// 다중예외처리문이 있다. // 멀티 예외처리문 // 두 개의 예외를 or로처리할 수 있다.
		//앞에 있는 예외처리문이 먼저 수행된다. 
		
	}
	
}




































