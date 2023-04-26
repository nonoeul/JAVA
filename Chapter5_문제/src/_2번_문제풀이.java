/*
 *	메소드 : 클래스 구성 요소 (동적) 
 * 	------
 * 		1) 특정 기능을 수행하는 명령문의 집합 
 * 							-------- 연산자 / 제어문
 * 		2) 한 가지 기능만 수행 할 수 있게 한다.
 * 		   예)
 * 			 댓글
 * 			 ----------- 댓글 (class)
 * 			 댓글 목록 출력
 * 			 댓글 쓰기
 * 			 댓글 수정
 * 			 댓글 삭제
 * 			 ----------- 
 * 			 게시판(class)
 * 			 ----------- 
 * 			 글쓰기
 * 			 목록출력
 * 			 상세보기
 * 			 수정
 * 			 삭제
 * 			 ----------- 
 * 			 영화
 * 			 -----------
 * 			 목록출력
 * 			 상세보기
 * 			 예약하기
 * 			 추천하기
 * 
 * 		3) 메소드 구성 요소
 * 		   선언부 
 * 		   void display() 
 * 		   구언부 
 * 		   {
 * 			처리
 * 		   }
 * 			선언부
 * 			[접근지정어][옵션] 리턴형 메소드명(매개변수...)
 * 
 * 			[접근지정어] public/protected/default/private
 * 			[옵션] static/final/abstract
 * 			[리턴형] 기본형 / int, long, byte, double, char, boolean
 * 			[리턴형] 배열, 클래스
 * 			[메소드명] 
 * 			1. 알파벳, 한글로 시작		
 * 			2. 숫자사용 가능		
 * 			3. 키워드는 사용 금지		
 * 			4. 특수문자 사용 가능		
 * 			5. 공백 사용할 수 없다.		
 * 			*** 소문자로 시작한다. 		
 * 			
 * 			static int add(int a,int b)
 * 			{
 *				return a+b;
 * 			}
 * 
 * 			호출
 * 			넘겨준 데이터를 받아서 저장 
 * 			int result=add(10,20);
 * 				--30--
 * 			*** 메소드를 호출시에는 메소드는 처음부터 끝까지 수행한 후에 
 * 			호출된 위치로 다시 온다.
 * 		메소드 만드는 방법
 * 		-------------
 * 		리턴형 	 매개변수
 * 		  O        O	=> String substring(int s,int e)
 * 		  O        X 	   String s="Hello Java";
 * 						   String ss=s.substring(0,5) // 
 * 						//substring은 글자를 잘라오는 것이다. 잘라온 후 다른 변수에 저장해야한다.
 * 						//원본 string은 변하지 않는다. substring으로 새로운 것은 만든 것
 * 		  O		   X
 * 		  X        O 
 * 		  X        X 
 * 		 	
 */

public class _2번_문제풀이 {

// 진행 순서
	static void method() 
	{
		System.out.println("method1 진입...");
		System.out.println("method1 기능 처리...");
		System.out.println("method1 종료...");
	}


// 1번 문제
	static void method1()
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
// 2번 문제
	static int method2()
	{
		int sum=0;
		for (int i = 0; i < 10; i++) 
		{
			sum+=1;
		}
		return sum;
	}
	// return을 통해 값을 반환 한 후 값을 출력
	
// 3번 문제 1~n까지의 합을 구하는 메소드 구현
	static void method3(int n)
	{
		int sum=0;
		for (int i = 1; i <=n; i++) 
		{
			sum+=i;
		}
		System.out.println("sum="+sum);
		
	}

// 4번 문제 두 정수를 나눗셈 결과를 구해주는 메소드 구현
	static double method4(int a,int b)
	{
		return a/(double)b;
	}
	
// 5번 문제 문자열을 통해서 소문자 -> 대문자로
/*
 * ~~~ 딱 식을 작성하려고 할때
 * 1. string 문자열로 작성해서 반환할까?
 * 2. void로 바로 출력할까? 이를 고민해야 한다.
 */

	static String method5(String s)
	{
		String result="";
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				result+=s.charAt(i);
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
				result+=(char)(s.charAt(i)-32); // (소문자 ==> 대문자로 변경)
		}
		return result;
	}
	
// 6번 문제 출력
	static void method6(String s)
	{

	}
	
	
	
// 출력	
	public static void main(String[] args) {
		
		//1번 출력
		method1();
		
		//2번 출력
		int sum=method2();
		System.out.println("sum="+sum);
		
		//3반 출력
		method3(100);
		
		//4번 출력
		double d=method4(10, 3);
		System.out.printf("%.2f\n",d);
		
		//5번 출ㄹ력
		String s=method5("Hello Java");
			
	}
}
























