// char를 한 개 보내서 => 대문자, 소문자 => boolean

import java.util.Scanner;
public class 메소드_3 {
	static String isAlpha(char c)
	{
		String result = "";
		if(c>='A' && c<='Z')
			result="대문자";
		else if(c>='a' && c<='z')
			result="소문자입니다.";
		else
			result="알파벳이 아닙니다";
		
		return result;
	}
	
	
	static void process() 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력:");
		String s=scan.next();
		char c=s.charAt(0); // 문자 한개를 읽어와서 char로 변환		
/*
 * 	String s="Hello"
 * 			  01234
 * 			  => s.charAt(2) ==> l자를 표현
 * 			  => s.charAt(4) ==> o자를 표현
 * 			  => s.charAt(0) ==> H자를 표현
 * 			한 개의 char캐릭터를 짤라온다.
 * 			자바는 캐릭터 자체를 짤라오는 명령어가 아니다.
 * 			stirng으로 문자열을 가져고 온 후 charat로 문자열에서 캐릭터를 짤라온다.
 */
		String result=isAlpha(c);
		System.out.println(c+"는(은)"+result);
		// 가급적이면 결과값이 여러개인 경우 => 문자열로 처리
		
		
	}
	// 경우의 수가 세 개이다. 대문자, 소문자, 알파벳이 아니냐?
	// 경우의 수가 세 개이므로 string형태로 가야한다.
	// 대문자가 맞다아니다, 소문자 맞다아니다, 알파벳 맞다아니다 값을 알려줘야 한다.
	// 세 개의 형태로 진행해야 한다.
	
// *** 재사용을 하려면 main 밖에서 써야 재사용 가능
// main 안에 쓴 static 메소드들은 main(메인) 안에서만 사용 가능
	public static void main(String[] args) {
		process();
	}
}
