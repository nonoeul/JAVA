package com_sist_exception_예외회피;
/*
 *	throws	: 예상되는 에러를 선언 
 * 			  1. 메소드를 사용시에는 다르 메소드에서 처리 후에 사용이 가능
 * 			  2. 선안만 할 수 있다. / 처리후에 사용 가능 
 * 			  3. 다른 메소드로 전가 (라이브러리)
 * 			  4. 라이브러리가 보통 선언을 하고 있다. 
 * 					-------------선언(CheckExceptio만 등록)
 * 					IO / NET / Thread / Web / JDBC => 웹과 관련되어 있다. 
 * 				
 * 
 * 	throw	: 고의로 예외를 발생 (테스트용)
 * 
 * 
 */

import java.util.Scanner;
public class 예외처리_임의발생_사용자정의_throw_throws {
	public static void main(String[] args) {
		
//	try
//	{
//
//		Scanner scan=new Scanner(System.in);
//		System.out.println("점수 입력:");
//		int score=scan.nextInt();
//		if(score<0)
//		{
//			throw new IllegalArgumentException();
//		}
//		System.out.println("score="+score);
//	}catch(IllegalArgumentException e)
//	{
//		System.out.println("점수는 음수를 사용할 수가 없다.");
//	}

	// 위 아래가 동일한 문장이다. 위에는 try-catch문을 이용해서 예외처리로 처리했고
	// 아래는 if문을 이용해서 조건문으로 해결 했다. if문으로 해결할 수 있다면 if문을 사용하자. 
		
		Scanner scan=new Scanner(System.in);
		System.out.print("점수 입력");
		int score=scan.nextInt();
		if(score<0)
		{
			System.out.println("점수는 음수를 사용할 수 없다.");
		}
		
	
// 예외처리를 할 때 if문으로 먼저 해결이 가능한지 생각해보자
/*	1. if문 처리가 가능
 * 	2. if문 처리가 불가능하다면 그때 try-catch문을 사용하자 
 * 
 */
		
		
	}
}
