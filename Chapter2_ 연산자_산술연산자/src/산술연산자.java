/*
 * 		1. 변수, 2. 연산자, 3.제어문, 4.메소드, 5.클래스
 * 		------------------------------------------
 * 		이항연산자
 * 		피연산자 2개
 * 		------------------------------------------
 * 		***1) 산술연산자	( + , - , *, / , % )
 * 		2) 쉬프트연산자 (비트이동연산자) (<< , >>)
 * 		3) 비트연산자	( & , | , ^ , < , > , <= , >= )
 * 		***4) 비교연산자	( ==  , != )
 * 		***5) 논리연산자	( &&(직렬) , ||(병렬) ) : 효율적인 연산
 * 		&& => true , (조건) && (조건) and
 * 		|| => true , (조건) || (조건) or 
 * 		***6) 대입연산자	( = , += , -= , op= )
 * 		-------------
 * 		+ , - , * => 형변환 *** 자바에서 모든 연산은 같은 데이터형끼리만 연산이 되다.
 * 		int + double
 * 		= double + double => double
 * 		char + int
 * 		= int + int => int
 * 		'A'+10 => 65+10 => 75
 * 		**char는 모든 연산자를 이용해서 연산저리하면 자동 int 변경
 * 		*** int이하(byte , short , char) 데이터형 연산시에 결과값은 int이다.* 
 * 			------------------------
 * 			char + long -> long
 * 			int + byte -> int
 * 			------------------------
 * 			char + char -> int
 * 			byte + byte-> int
 * 			------------------------
 * 		/ : 정수 / 정수 = 정수
 * 			5/2=2
 * 			10/3=3
 * 			=> 평균 : 정수/실수
 * 			0으로 나누면 에러발생 // 에러를 잡는게 매우 중요하
 * 			------------------------
 * 
 *  	% : 결과값 왼쪽부호가 남는다
 *  		5 % 2 = 1
 *  		-5 % 2 = -1
 *  		5 % -2 = 1
 *  		-5 % -2 = -1
 *  		------------------------
 */		
// 사용자가 정수 세개를 입력 => 결과값출력 (1.총점, 2.평균)


import java.util.Scanner; // 외부로부터 클래스를 불러온다 
// 키보드로부터 입력된 값을 얻어오는 클래스 : Scanncer(scanf())
// BufferedReader => 예외처리
public class 산술연산자 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); //클래스 선언
		//				---동적메모리할당
		// system.out 화면출력 system.in 값을 입력받는 것 scanner = 키보드 값 입력
		System.out.println("국어점수 입력:");
		int kor=scan.nextInt();
		System.out.println("kor="+kor);
		
		System.out.println("수학점수 입력:");
		int math=scan.nextInt();
		System.out.println("math="+math);
		
		System.out.println("영어점수 입력:");
		int eng=scan.nextInt();
		System.out.println("eng="+eng);
		
		//총점
		int total=kor+math+eng;
		double avg=total/3.0; // double을 써야한다 why?
		// int로 잡을경우 소수점 이하가 나오지 않는다.
		// 평균은 무조권 double!!
		
		System.out.println("총점:"+total);
		//System.out.println("평균:"+avg);
		System.out.printf("평균:%.2f",avg); 
		//printf 서식있는 문자열을 출력할때
		//f를 이용해서 소수점자리 갯수를 구한다
		
		
		
		
		
		
		
		
	}
	
}
