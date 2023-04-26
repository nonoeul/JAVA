package 라이브러리_String;

import java.util.Scanner;



/*
  String메소드 (문자열을 제어하는 기능)
  
  	String은 문자열 배열
  	--------문자마다 인덱스번호를 가지고 있다. (0부터 시작한다)
  	String s="Hello Java"
  			  0123456789
  	
  	주요기능 (310page)
  	1) 문자열에서 문자 한 개 추출 => char charAt(int index)
  
  
  
*/
public class 라이브러리_String_4_메소드 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("알파벳 입력하세요:");
		String data=scan.nextLine(); // nextLine은 싹 다 읽어온다. 
		// next는 공백에서 짤라준다. nextLine은 공백 무시하고 전부 다 읽어준다. 
		
		int a=0,b=0;
		for (int i = 0; i < data.length(); i++) 
		{
			char c=data.charAt(i);
			if(c>='A' && c<='Z')
				a++;
			else if(c>='a'&& c<='z')
				b++;
		}
			System.out.println("대문자 갯수:"+a);
			System.out.println("소문자 갯수:"+b);
	
	
		
		
	}
}
