/*
 * 자바에서 지원하는 제어문 : 반복 / 조건 / 선택 / 반복 제어 / 
 * 	프로그래밍 구조 => 변수 / 연산자 / 제어문
 * 					|	----------------메소드( 연산자 & 제어문 묶음) // 재사용 가능하게 만들어줌 
 *				  여러개	
 *				*** 자바에서 지원하는 모든 제어문은 밑에 있는 명령문만 제어 할 수 있다. 
 *				if(조건)
 *					문장 1 => 제어
 *					문장 2 => if문과 관련없는 문장 
 *					=> 한 개 이상 명령문을 수행시에는 반드시
 *					if(조건)
 *					{
 *					문장1		
 *					문장2	
 *					}
 *
 *	
 *				=> 조건문
 *					= 단일 조건문
 *					  if(조건 => 부정연산자 (!) , 비교연산자 , 논리연산자) => true / false만 나온다.
 *					  {
 *					  	조건이 true일 경우에만 수행하는 문장들을 작성 
 *					  }
 *					= 선택 조건문
 *					= 다중 조건문
 *				=> 선택문
 *				=> 반복문
 *					= while
 *					= do~while
 *					= for
 *						= 일반 for
 *						= 향상도된 for-each (웹에서 핵심)
 *				=> 반복제어문
 *					= break
 *					= continue
 *				================ 조건문부터 연산자를 응용해야 한다 => 54page
 */				
// 조건문 (단일 조건문) => 짝수 / 홀수
import	java.util.Scanner;
	public class 조건문_1 {		// if문은 에러처리할 떄 많이 쓰인다. 
		public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int num=scan.nextInt(); 
		if(num%2==0) // 짝수 조건 //제어문의 세미콜론(;)을 찍으면 무조권 수행한다. if문의 역할 수행 xx!!
			System.out.println(num+"는 짝수입니다"); // 문장1은 if문에 영향을 받고
			System.out.println("num="+num);		 // 문장2은 if문에 영향을 받지 않는다.
		if(num%2!=0) // 홀수 조건
//			System.out.println(num+"는 홀수입니다");	// 문장1은 if문에 영향을 받고
//			System.out.println("프로그램 종료!!");		// 문장2은 if문에 영향을 받지 않는다.
			{
			System.out.println(num+"는 홀수입니다");	// {}괄호로 묶어서 문장1, 문장2가 if문에 영향을 받는다.
			System.out.println("프로그램 종료!!");		
			}
	}
}
