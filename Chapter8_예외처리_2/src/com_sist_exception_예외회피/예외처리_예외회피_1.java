package com_sist_exception_예외회피;
// 예외 떠맡기기, 예외회피
// 메소드를 읽는다 => JVM에 의해서 예외가 발생할 수 있다. => 예외선언
// 메소드 호출시에 반드시 => 직접, 선언 
// RuntimeException => 생략이 가능하다 .
/*
 * 	??RuntimeException 생략??
 * 	말 그대로 실행ㅎ 중에 발생하는 시스템 환경적으로나 인풋 값이 잘못된 경우.
 * 	의도적으로 프로그래머가 잡아내기 위한 조건드에 부합할 때 발생 throw
 * 	-Checked Exception 	// try-catch절로 무조권 예외를 잡아줘야 한다. 
 * 	-UnChecked Exception// 예외처리를 무조권 안해줘도 무방하다. 예외처리 강제성이 없다.
 * 	-RuntimeException은 unchecked 에러에 속한다. 무조권 처리를 안해줘도 괜찮다
 * 
 * 	??RuntimeException의 종류??
 * 	1. ArithmeticException = 정수를 0으로 나누었을 경우
 * 	2. ArrayIndexOutBoundsExcetpion = 배열의 유형이 허락하지 않은 객체를 배열로 저장했을대
 * 	3. ClassCastException
 * 	4. NullpointerException
 * 	5. .. 등등 10개가 있다. 
 * 
 * 	??Exception??
 * 			Exception
 * 				|
 * 		--------------------
 * 		|					|	
 * 		check			unCheck
 * 		IOException		RuntimeException
 * 		SQLException		|
 *						NumberFormatException 
 *
 *		throws ArithmeticException => throws 뒤에는 checkException이 주로 붙는다.
 *	// unchecked는 구지 throws을 쓰거나 예외처리를 해주지 않아도 괘찮다.
 *	// 왜냐하면 컴파일러에서 자동으로 처리해주기 때문에 
 *	
 *	이미 전부 만들어진 코드에서 추가를 하고 있을 때 try-catch문을 통해 추가를 하게 되면 
 *	식이 너무 복잡해진다. 그래서 throw로 하나의 문장을 추가해주는게 유리하다. 
 *	
 *	??throw vs throws??
 *	1. throw는 메소드 내에서 상위 블럭으로 예외를 던지는 것	 |throw	 메소드 -> 상위블럭
 *	2. throws는 현재메소드에서 상위 메소드로 던지는 것		 |throws 현재 메소드 -> 상위메소드
 *
 *
 *
 */

import java.io.IOException;
import java.security.PublicKey;
import java.sql.SQLException;

import com_sist_exception_예외복구.throw_throws차이;

public class 예외처리_예외회피_1 {

	public static void methods() throws Exception 
	{
		// 예외처리 대상 예외를 해야한다. 
	}
		
	public static void method1() throws Exception 
	{
		methods();
	}
	
	public static void method2() 
	{
		try
		{
			methods();
		}catch (Exception e)
		{
			// TODO: handle exception
		}
	}
	
	public static void method3() throws IOException,SQLException,
	ClassNotFoundException 
	{
		// 예외처리 대상 예외를 해야한다. 
	}
/*
 * Checked Exception 반드시 예외처리를 해야한다. / 컴파일 단계 
 * roll-back하지 않음 , 
 * 
 * 	??Checked Exception 종류??
 * 		1. IOException
 * 		파일의 입력, 출력에의한 오류이다. reader,writter
 * 
 * 
 * 
 */
	
	public static void method4() throws IOException,SQLException,
	ClassNotFoundException 
	{
		// 예외처리 대상 예외를 해야한다. 
	}
	
	public static void method5() throws Exception
	{
		method3(); 
	}
	
	public static void method6() throws Throwable
	{
		method3(); 
	}
	
	public static void main(String[] args) {
	
		
		
	}
}















