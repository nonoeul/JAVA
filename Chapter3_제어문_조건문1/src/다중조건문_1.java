/*
 * 프로그래밍
 * 데이터저장 => 데이터처리 => 요청결과출력
 * 
 * (데이터저장)
 * 한 개 저장 : 변수 / 상수
 * 관련된 데이터 여러개 : 배열(같은 데이터형만 저장이 가능)
 * 클래스 (다른 데이터형을 모아서 관리)
 * 
 * 
 * (데이터처리)
 * 사용자값 요청
 * => 결과값을 추출
 * => 연산처리 / 제어
 * =>[연산자 / 제어문]=> 데이터를 묶는 것을 메소드라고 한다. (한번에 실행가능)
 * 
 * (요청결과출력)
 * Application
 * Web Application
 * Mobile Application
 *
 *	이 세 과정을 한 번에 묶는 것이 자바의 기능이다.(Component기능)
 *	클래스안에서 제작 => 재사용 목적
 *	1. 변경 추가 = 객체지향 : 최종목적
 *	2. 목적 => 유지보수 
 *	3. 클래스 제작 => 재사용 목적
 *
 *	다중 조건문 : 조건이 맞는 문장을 수행하고 종료 (한 개의 문장만을 수행)
 *			   => 여러개를 수행 : 단일 조건문을 사용한다.
 *	예) 1~100까지 숫자중 3의 배수. 5의 배수, 7의 배수의 합을 출력한다.
 *			   ------------------------------단일 3개 사용 
 *	** 여러개의 조건을 넣어야 할 떄는 
 *	   1. 단일조건문을 여러 개를 사용하든가	
 *	   2. 다중조건문을 통해서 묶어주든가
 *
 *다중조건문	
 *	if(조건문) 
 *	{
 *		true일떄 수행하는 문장 작성	
 *		false	
 *	}
 *	else if(조건문) // 맞는 조건울 찾을때까지 계속해서 조건울 찾는다.
 *	{
 *	}
 *	else if(조건문)
 *	{
 *	}
 *	else ==> 생략이 가능하다.
 *	{
 *		해당 조건이 없는 경우에 처리되는 문장
 *	}
 *
 *		사칙연산 ( + , - , * , / ) ==> %
 *
 *다중조건문(단일조건문 사용)
 *	if()
 *	{
 *	}
 *	if()
 *	{
 *	}
 *	--------------
 *	if()
 *	{
 *	}
 *	else // 전체를 해당하는 else문장이 아닌 단순히 위에 if만을 위한 else문장이다.
 *	{
 *	}
 *	--------------
*/


// 사칙연산 처리 
import java.util.Scanner;
public class 다중조건문_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.println("두번째 정수 입력:");
		int num2=scan.nextInt();
		System.out.println("연산자 입력(+,-,*,%):");
		char op=scan.next().charAt(0); // 문자열중에 첫번쨰에 있는 캐릭터, 문자언어 추출하는 것
		// +-*/ => chatAt(1) => 자바의 단점 : char느 받을 수 없다.(문자열)
		// 경우 + , - , * , / 다음 문자 입력시 (else)
		
		/*	
		String a = "apple"; 
		System.out.print(a.charAt(0));
		==>결과는 a // 0번쨰 문자열의 글자를 char 문자열을 -> 숫자로 변환
		 */
		
		if(op=='+')
		{
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}
		else if(op=='-')
		{
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}
		else if(op=='*')
		{
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}
		else if(op=='/')
		{
			if(num2==0)
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			else
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}
		else
		{ System.out.println("잘못된 값을 입력하셨습니다.");
	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
