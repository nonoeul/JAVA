/*
 *		문자열 데이터형 : 참조형
 * 		=> 	String : 문자열 저장
 * 		   	문자, 문자열 : 여러 개의 문자를 동시에 저장 => " "
 * 		   	---
 * 			' ' ====> 힌글자 저장(char)   
 * 			String[] => char[]
 * 			--------	-----
 * 			"홍길동"		{'홍','길','동')
 * 
 * 			String : => java.lang.String에 존재 => 라이브러리
 * 			--------
 * 			일반데이터(문자열 저장) , 클래스형 => 지원하는 기능 (메소드)
 * 			=> 가장 많이 사용되는 데이터형 (기본형처럼 사용이 가능)
 * 			=> 웹,윈도우 => 무조권 문자열 통신
 * 			=> <input type="text">
 * 			=> 가장 많이 사용되는 데이터형 : int , String
 * 			=> 사용법 
 * 				String name="홍길동";
 * 				// String name=new String(" ")
 * 			=> String에서 지원하는 메소드 (변경 할 수 없다.) => 표준화
 *				Math.random()
 *				Math.ceil(): 올림 / 총페이지를 만들떄 주로 쓰인다.
 *				Math.round(): 반올림  / 반올림할떄 주로 쓰인다. 
 *				 
 *				-------- 임의로 숫자 추출
 *				중요시 => 메소드 결과값 => 받아서 처리 
 *	  			1) 대문자 변환 toUpperCase() 
 *	  				String s="Hello Java"; 
 *	  				String result=s.toUpperCase(); // s=string
 *					// string자체가 가지고 있는 기능 중 하나이다. toUpperCase는 대문자변환
 *				2) 소문자 변환 toLowerCase()
 *					String s="Hello Java";
 *					String result=s.toUpperCase(); // s=string
 * 					=> result='hello java"
 * 					// string자체가 가지고 있는 기능 중 하나이다. toUpperCase는 대문자변환
 * 				3)	찾기
 * 					----------
 * 					startsWith ==> 시작하는 문자 ==> 결과값 true/false ==> if
 * 					endsWith   ==> 끝나는 문자열 ==> 결과값 true/false ==> if
 * 					---------- 서제스트(자동 완성기) 
 * 					contains   ==> 포함 문자 (검색) => 추천 => 결과값 true/false
 * 				
 */
public class 문자열_1_대소문자 {
	public static void main(String[] args) {
		char[] msg= {'H','e','l','l','o','J','a','v','a'};
		System.out.println("====대문자변 ====");
		for (char c:msg) 
		{
			if (c>='a' && c<='z') // 소문자라면 
			{
				System.out.print((char)(c-32)); //32를 빼는 이유는
				// 대문자 하고 소문자하고 차이가 32이기 떄문에 대소문자를 구분하기 위해 32를 뺀다.
			}
			if (c>='A' && c<='Z') // 소문자라면 
			{
				System.out.print((char)(c));
			}
		}
		
		System.out.println();
		System.out.println("=====소문자변환=====");
		
		for (char c:msg) 
		{
			if (c>='a' && c<='z') // 소문자라면 
			{
				System.out.print((char)(c)); //32를 빼는 이유는
				// 대문자 하고 소문자하고 차이가 32이기 떄문에 대소문자를 구분하기 위해 32를 뺀다.
			}
			if (c>='A' && c<='Z') // 소문자라면 
			{
				System.out.print((char)(c+32));
			}
		}	
		
		System.out.println();
		System.out.println("====문자열====");
		String s="Hello Java";
		System.out.println("====문자열에서 대문자 변환====");
		System.out.println(s.toUpperCase());
		System.out.println("====문자열에서 소문자 변환====");
		System.out.println(s.toLowerCase());
	}
}































