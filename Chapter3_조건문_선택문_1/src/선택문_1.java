/*
 * 
 * 	switch ~ case
 * 	=> 범위를 지정하는 것이 아니라 특정값으로 설정
 * 	=> 사용이 가능한 특정값은 char(문자),정수,문자열
 * 	=> 문자열 작은따음표(''), 문자열 큰따옴표("")
 * 	=> 많이 사용되는 위치 : 게임(키보드별 처리), 메뉴, 네트워크(기능별 처리)
 * 	   웹 ==> 화면 전환		
 * 	=> 형식)
 * 
 * 	   switch(문자,문자열,정수) // 만약 B가 들어오면 문장2,문장3, 문장4번을 실행하게 된다.
 * 	   {
 * 		case 'A'; => case 1; case 2;, case3;...
 * 			문장1  => case "login" : case="logout" // 사용자가 금방 볼 수 있게 표현하는 것은 문자열이 편하다.
 * 			break; // 항상 문장 한 번만 사용이 될때는 break을 사용한다. 문장을 종료
 * 		case 'B';
 * 			문장2
 * 			break;
 * 		case 'C'
 * 			문장3
 * 			break;
 * 		default;
 * 			문장4 ===> A,B,C가 아닌 경우에 처리 ==> 생략이 가능
 * 	   }
 */

import java.util.Scanner;
public class 선택문_1 {
	public static void main(String[] args) {
		System.out.println("======메뉴======");
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.로그아웃");
		System.out.println("4.맛집추천");
		System.out.println("5.레시피만들기");
		System.out.println("6.프로그램 종료");
		System.out.println("======메뉴======");
		Scanner scan=new Scanner(System.in);
		System.out.println("메뉴 클릭(1~6)");
		int menu=scan.nextInt();
		
		switch(menu)
		{
		case 1:
			System.out.println("로그인을 요청하셨습니다!!");
			break;
		case 2:
			System.out.println("회원가입을 요청하셨습니다!!");
			break;
		case 3:
			System.out.println("로그아웃을 요청하셨습니다!!");
			break;
		case 4:
			System.out.println("맛집추천을 요청하셨습니다!!");
			break;
		case 5:
			System.out.println("레시피만들기 요청하셨습니다!!");
			break;
		case 6:
			System.out.println("프로그램 종료를 요청하셨습니다!!");
			// 0이면 정상 종료, 다른 번호면 비정상 종료 X
			break;
		default: // 없는 메뉴 선택시에
			System.out.println("메뉴에 없는 번호입니다.");
		}
			
	}
}
