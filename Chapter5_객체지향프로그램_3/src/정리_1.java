/*
 * 
 * 	class : 한개에 설계
 * 			영화 1개
 * 	----------------
 * 	변수 ===> 배열 ===> 구조체 ===> 클래스
 * 	----한개만 저장
 * 			---- 같은 데이터형 여러개 저장 
 * 					 ----다른 데이터형 여러개 저장 
 * 								---- 다른 데이터형 여러개 저장 + 메소드형 
 * 	명령문 => 변수선언 + 연산처리 + 제어문
 * 			==> 메소드
 * 
 * 	클래스 => 변수 여러개 ==> 사용자 정의 데이터형 (일반 기본형과 동일하게)
 * 								| 
 * 					  배열 이용 가능
 * 							  형변환 
 * 			변수 + 메소드
 * 			----------
 * 		=> 클래스 영역
 * 		   --------- 선언 / 구현 
 * 		   변수 선언 
 * 		   int a; => 선언과 동시에 초기화
 * 		   int a=10; 
 * 		  ----------
 * 		   메소드 선언
 * 		   int a;
 * 		   a=100; ==> 오류가 발생한다.
 * 		   구현만 해놓았는데 추가적인 선언까지는 하지 못한다.
 * 		   생성자를 생성해준 뒤에 추가적인 선언을 해줘야 한다.
 * 		   리턴형 메소드명(매개변수목록)
 * 		   {
 * 		   		구현 
 * 		   }
 * 
 * 		   class A
 * 			{
 * 				A()
 * 				{
 * 					// 구현 => 제어문, 변수값 읽기, 변수값 변경, 파일 읽기
 * 					// 시작과 동시에 변수의 초기화 = 셍성자 
 * 				}
 * 				void display()
 * 				{	
 * 					// 구현 
 * 					// 사용자 요청시에 변경 
 * 				}
 * 			}
 *  	
 */
import javax.swing.*;
public class 정리_1 extends JFrame{
	JButton b;
	정리_1()
	{
		b=new JButton("click");
		add("North",b);
		setSize(350,350);
		setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		new 정리_1();
	}
}


















