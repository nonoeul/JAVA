package com_sist_exception_예외복구;
/*
 *	배열에 데이터를 저장 => 배열범위 초과  
 * 	나누기를 처리	=>	0
 * 	기타 예외처리 	=>	통합
 * 	========================= RuntimeException
 * 
 */

public class 예외처리_예외복구_4 {
	public static void main(String[] args) {
		
		try
		{	
//		}catch(RuntimeException e)
//		{
			int[] arr=new int[2];
			arr[0]=10;
			arr[1]=2;
			System.out.println(arr[0]/arr[1]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{	
			System.out.println("배열 범위 초과");
		}catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 순 없다.");
		}catch(RuntimeException e)
		{
			System.out.println("예측 못한 에러");
			}
		
		System.out.println("프로그램 종료");
/*
 * 	??에러처리에는 순서가 있다.??
 * 	1. try-catch절로 순차적으로 아래로 내려가다.
 * 		맨위에 try-catch절 부터 맨 아래로 순차적으로 내려가는데
 * 	2. 만약 맨 위에 RuntimeException 최상위 예외처리가 들어간다면 오류가 발생한다.
 * 	3. 그렇기 때문에 RuntimeException처럼 큰 예외처리 일수록 맨아래로 내려야 한다.
 * 
 * 
 * 
 */
		
		
	}
}
