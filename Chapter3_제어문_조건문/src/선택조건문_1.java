/*
 * 
 * true/false => 나눠서 처리
 * 형식)
 * 		if(조건문) => 조건문 (비교연산자,부정연산자,논리연산자)
 * 		{
 * 			조건문이 true일경우에 처리하는 문장
 * 		}
 * 		else
 * 		{
 * 			조건문이 false일경우에 처리하는 문장
 * 		}
 * 		=> 로그인 여부
 * 		=> 아이디 중복체크
 * 		=> 메뉴 => 관리자 로그인 / 사용자 로그인 
 * 		=> 로그인 처리를 했는지 여부
 * 		--------------------------------		 
 */

//=> 알파벳을 받아서 소문자냐 대문자냐라고 구분
public class 선택조건문_1 {
	public static void main(String[] args) {
		int no=(int)(Math.random()*2);
		char ch;
		
		
		if(no==0)
			ch=(char)((Math.random()*26)+65);
		else		
			ch=(char)((Math.random()*26)+97);
		
		if(ch>='A' && ch<='Z')
			System.out.println(ch+"는 대문자입니다!!");
		else	
			System.out.println(ch+"는 소문자입니다!!");
			
			
		
		
		
		
		
		
		}
	}
