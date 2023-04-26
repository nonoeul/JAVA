package com_sist_exception_예외복구;

import java.util.Scanner;

/*
 * 	문자열로 2개의 정수를 받아서 => 정수로 변환한 후에 : NumberFormatException  
 * 	배열로 저장 : ArrayIndexOutOfBoundsException 
 * 	나누기 한값을 구한다.: ArithmetcException  
 * 	--자주발생하는 에러--
 * 	에러가 한 개가 아닌 여러개가 발생할 수 있는 이럴 때 에러를 잡기 위해서 사용하는 것이
 * 	멀티예외처리이다. 
 * 
 */
public class 예외처리_예외복구_3_멀티예외처리_try_catch절여러개 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력:");
		String num1=scan.next();
	
		System.out.println("두번째 정수 입력:");
		String num2=scan.next();
		
		int[] arr=new int[2];
		// 다중 catch => 예상되는 에러가 많은 경우 주로 처리한다.
		// catch절은 한 개만 수행한다. 
		// 에러가 동시에 3개가 발생하지 않는다. 한 개 씩밖에 발생하지 않는다.
/*	
 * 	??왜 에러가 동시에 여러개가 발생하지 않는가??
 *	에러가 발생하는 즉시 에러가 종료가되서 try문을 빠져나온다. 그래서 다시 첫번째 에러가 종료되고
 *	정상수행으로 갔을때 프로그램이 종료가 된다. 
 *
 * 
 * 
 */
		try
		{
			int n1=Integer.parseInt(num1); // 뭄자열을 정수로 변환한다.
			// n1의 숫자를 받았으면 이것을 문자열로 바권준다 0310 => "0310"
			int n2=Integer.parseInt(num2);
			// 배열에 첨부해보자
			arr[0]=n1;
			arr[2]=n2; // 배열의범위가 arr[0],arr[1] 두 개 인데 에러가 발생했다. 
			System.out.println(arr[0]/arr[1]);
			
			
		}catch(NumberFormatException e) // 정수형에 문제가 발생할때 가장 먼저 문제가 발생한다. 
		{
			System.out.println("정수 변환 에러 발생!!");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열의 범위를 초과한 에러 발생!!");
			e.printStackTrace();
		}catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		}
		System.out.println("프로그램 종료한다");
	}
}

/*	??에러가 한 개 발생 할 수 없는 이유, catch절을 아무리 많이 만들고, 오류가 아무리 많이
 *  발생하더라도 오류가 한 개밖에 수행이 안되는 이유??
 * 	1. 에러가 발생하는 순간 프로그램은 강제로 종료된다.그래서 예외처리로 에러를 예외처리 시키고 나머지를
 *  	수행한다.
 *  2. 즉 try-catch절을 여러 개 설정해서 여러가지 에러에 대해서 대비하는 것이 가능하자만, try-catch절이
 *  	동시에 여러개가 수행되는 것은 불가능하다. 
 * 
 * 
 */

























































