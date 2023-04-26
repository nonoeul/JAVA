package com_sist_exception_예외회피;

import java.util.*;
// 사용자 정의 => Exception을 상속받는다. 
// Exception은 모든 예외처리의 조상으로 Exception을 상속받았으면
// 모든 예외처리를 해결할 수 있다. 

import com_sist_exception_예외복구.throw_throws차이;

class MyException extends Exception
{
	public MyException(String message)
	{
		super(message); // getMessage()
	}
}


public class 예외처리_임의발생_사용자정의2 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		
		try
		{
			if(num%2==0)
			{
				throw new MyException("짝수입니다!!!"); // 사용자정의에서는 반드시 예외를 발생시켜줘야한다.,
			}
		}catch(MyException e) // catch절은 지정한 것만인식이 가능하다.
//		MyException이라는 예외를 만든 것이다. 즉 사용자정의 예외를 만든 것이다. 라이브러리에 있는 예외가 아니라
//		사용자정의 예외이기 때문에 이것은 반드시 예외르 발생시켜줘야지 사용이 가능하다. 안 그러면 오류 발생 
		{
			System.out.println(e.getMessage());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
