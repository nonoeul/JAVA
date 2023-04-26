/*
 * 		연산자
 * 		38page => 산술연산자
 * 		41page => 증감연산자
 * 		44page => 비교연산자
 * 		45page => 논리연산자
 * 		48page => 조건연산자 (심항연산자)
 * 		=> 대입연산자 
 * 		--------------------------------
 * 		자바에서 지원하는 연산자
 * 		--------------------------------
 * 		1. 단항연산자
 * 		= 증감연산자 (++,--) => 한개 증가. 한개 감소시에 사용
 * 		= 				  => 주로 사용처는 반복문(for, while, do~while)
 * 		  1) 전치 연산자 = 먼저 증가한후에 다른 연산자를 수행
 * 			예)
 * 				int a=10;
 * 				int b= a++;
 * 						 1. 증가 => a=11
 * 						 2. b에다가 11대입
 * 		  2) 후치 연산자 = 다른 연산자를 수행 나중에 증가한다.
 * 				int a=10;
 * 				int b = a++
 * 				  ---	---
 * 				   1 => b에 증가안된 a값을 대입
 * 				   2 => a를 한 개 증가 
 * 
 * 			= char c='A';
 * 			  System.out.println(c)
 * 			  System.out.println(c++) // 'A'출력
 * 				A를 출력한 후 아래 줄에 +1을 한다
 * 			  System.out.println(++c) // 'B'출력
 * 				+1을 한다음 출력한다. A(65)->B(66)
 * 
 * 			예)
 * 				int a=10;
 * 				int b= a--;
 * 				a=9, b=10
 * 
 * 				int a=10;
 * 				int b = --a;
 * 				a=9. b=9
 *  		
 *  		= 부정 연산자 (!) ==> boolean만 사용 가능 true/false 구분 
 *  			true =>  !true = false 
 *  			false => !false = true
 *  		
 *  		= int a=10;
 *  		  !(a%2==0) ==> true ==> 논리연산자
 *  		  ex) !(a<10) 괄호로 묶고 앞에 !을 넣으면 반대효과 발생
 *  		  
 *  		= 형변환 연산자 (데이터형)
 *  		 = 자동 형변환
 *  			=> 작은 데이터 => 큰데이터형 대입
 *  				int a='A' ==> 65 
 *  				long a=10 ==> 10L
 *  				double d=10 ==> 10.0
 *  				ex) int a=10.5 오류 // double -> int 큰 것 -> 작은 것 오류!
 *  				 // int a=int(10.5) 강제 형변환을 해줘야 한다. 
 *  			=강제 형변환 : 큰 데이터형을 작은 데이터형으로 변경 
 *  			byte < char < int < long < double    		  
 * 		--------------------------------
 * 		2. 이항연산자
 * 			= 산술연산자 (+ , - , * , / , %)
 * 			= 비교연산자 (==, != , < , > , <= , >= )
 * 			= 논리연산자 ( && , || )
 * 			= 대입연산자 (=, += , -=)
 * 
 * 			=====> + 산솔	
 * 					 10+10 => 20
 * 				   + 문자열 결합 
 * 					 "10"+10 => 1010
 * 					 10+"10" => 1010
 * 		--------------------------------
 * 		3. 삼항연산자
 * 			= 조건?값:값
 * 
 */


public class 연산자정리 {
	public static void main(String[] args) {
	
		char c='A';
		System.out.println(c++); 
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
