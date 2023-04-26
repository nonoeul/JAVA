package com_sist_exception_예외회피;
/*
 * 
 * 	자신	==> 객체호출 (this) , 생성자(this())
 * 	상위클래스 ==> 객체호출(super), 생성자(super())
 * 	
 * 	class A
 * 	{
 * 	}
 * 	class B extends A
 * 	{	
 * 	}
 * 
 * 	B b=new B(); ==> new A() , 	new B()
 * 				     --super    --this
 * 	B의 클래스에 b의 변수를 지정해서 B의 생성자를 만들어준다. 
 */
import java.util.*;
class MyRuntimeException extends RuntimeException
{
	public MyRuntimeException(String msg)	// 생성자 생성, 초기값을 지정해줘야한다 .
	{
		super(msg); // RuntimeException에 대한 생성자이다.
		// this는 자기자신 , super은 상속시킨 부모의 객체를 가르키는 것이다.
		// msg의 부모클래스 RuntimeException에 대한 생성자이다. 
	}
/*		MyRuntimeException이라는 예외는 존재하지 앟는다. RuntimeException을 상속받아서 
 * 		사용자 정의 함수를 만들어준 것이다. 
 *		사용자 정의 함수를 만들긴만 한 것일뿐 안에는 아무런 값ㄷ 지정되어 있지 않기 때문에 생성자를 만들어서
 *		안에다가 값을 지정해줘야한다. 그래서 생성자를 만들어줘서 초기화를 시켜 초기값 null을 해준 것이다. 
 */		
}


public class 예외처리_임의발생_사용자정의3 {
	public static void main(String[] args) {
		
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("점수 입력");
			int score=scan.nextInt();
			if(score<0)
			{
				throw new MyRuntimeException("음수는 사용할 수 없습니다.");
				// throw는 위에다가 던지는 것이다. 웯가ㅏ 던져서 
			}
			System.out.println("점수는 "+score+"입니다");
		}catch(MyRuntimeException ex)
		{
			System.out.println(ex.getMessage());
			System.out.println("------에러 발생 위치 확인--------");
			ex.printStackTrace();
		}
		
	}
}
