/*
 * 
 * 	4page : 자바실행
 * 	A.java =======> A.class =======> 화면에 결과값 출력
 * 			 컴파일(javac)		인터프리터(java) ==> 동시에 처리 (ctrl+f11)
 *	5page : 운영체제의 독립적이다 (운영체제마다 같은 번역 한다)
 * 	
 * 	19page 
 * 	1) 파일명과 클래스명이 동일해야 된다.
 * 	2) 가급적이면 한개의 파일에 한클래스를 사용하는 것을 권장 
 *  3) public은 파일명과 동일, public이 없다면 main이 있는 class
 *  4) System.out.println(); // 옆에 출력
 *  5) System.out.print(); // \n (다음줄에 출력)
 *  6) System.out.printf; // 출력 형식을 만들 경우
 *  
 *  22page : 들여쓰기
 * 	{
 * 
 *  }
 *  
 *  23page 주석 : 번역이 안되는 파트 // 
 *  
 * 	25page 변수 : 한개의 데이터만 저장하는 메모리 공간
 * 			   : 데이터값을 변경 할 수 있다.
 *  26page 변수 : 변수 선언규칙
 *  		   	데이터형 변수명=초기값
 *  			예) int a=10
 *  			A+ = +, -, 0 char a='A' char op='+'
 */
public class 정리_03_29 {
 public static void main(String[] args) {
	char a='A';
	char op='+';
	System.out.println(a+""+op);
	System.out.println(a+op);
}
}
