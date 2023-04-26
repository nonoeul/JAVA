/*
 * 
 * 	사용자로부터 두 개의 정수를 입력 받아서 뺼셈과 곱셈 연산의 결과를 
 * 	출력하는 프로그램 작성
 * 
 * 	1. 변수 : int a, b
 * 	2. 초기화 : Scanner
 * 	3. 연산처리 : a-b, a*b
 * 	4. 결과 출력
 * 
 * 	데이터 저장 ========> 데이터 가공(연산처리) =======>결과값 출력
 * 							|연산자				System.out.println()
 * 	1) 직접 값을 입력 int a=10;
 * 	2) 사용자로부터 입력을 받는다.
 * 	3) 난수
 * 	------------------메모리
 * 	4) 파일에 읽
 * 	5) 오라클에서 값 읽기
 * 
 * 
 * 
 */


import java.util.Scanner;
public class 자바연산자문제_12 {
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력해주세요:");
//		int A=scan.nextInt();
//		System.out.println("첫번째 정수를 값은="+A);
//		
//	
//		System.out.println("두번째 정수를 입력해주세요:");
//		int B=scan.nextInt();
//		System.out.println("두번째 정수를 값은="+B);
//		
//		System.out.println("세번째 정수를 입력해주세요:");
//		int C=scan.nextInt();
//		System.out.println("세번째 정수를 값은="+C);
//		
//		int rhq = A*B+C;
//	
//		System.out.println("세개의 정수 곱과 합의 값은");
//		System.out.println(rhq);
//	}
	
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.print("세개의 정수를 입력하세요(10,20.30):");
	a=scan.nextInt();
	b=scan.nextInt();
	c=scan.nextInt();
	System.out.printf("%d*%d+%d=%d",a,b,c,a*b+c);
	
		
		
		
		
		
		
		
		
		
		
		
	}
}
