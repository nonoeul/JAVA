package 라이브러리_유틸_util;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 	StringTokenizer : 문자열을 분리할때 사용된다.
 * 	1) split() => 대체
 * 	2) 빅데이터 / 네트워크 / 웹 
 * 	------------------------
 */
public class 라이브러리_StringTokenizer_1 {
	public static void main(String[] args) {
		
/*	StringTokenizer st=new StringTokenizer("구분할 문자열", 구분자)
	StringTokenizer st=new StringTokenizer("구분할 문자열") => 공백 
StringTokenizer 클래스는 문자열을 구분자를 이용해서 분리할 떄 사용이 가능하다.
만일 BufferedReader 클래스의 메서드로 입력을 읽어들인다면 라인 단위로 밖에 읽지 못한다. 

String = 문자열
Tokenizer = 토큰화한다. 토큰단위로 읽어들인다. 
*/
		
		
//??StringTokenizer 생성자는 3가지가 있다.??
//	1. 띄어쓰기 기준으로 문자열을 분리
//	StringTokenizer st = new StringTokenizer(문자열);
		String s1="애니메이션 어드벤쳐 코미디";
		StringTokenizer st=new StringTokenizer(s1); 
		// 공백을 구분할 경우 구분자에 아무것도 넣지 앟으면 공백을 제외해서 구분한다. 
		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
//			1) countTokens() : 분리된 데이터 갯수
//			2) nextToken() : 분리된 데이터 읽기 
		
		System.out.println("================");
		
//	2. 구분자를 기준으로 문자열을 분리
//	StringTokenizer st = new StringTokenizer(문자열, 구분자);
		String s2="애니메이션/어드벤쳐/코미디";
		StringTokenizer st2=new StringTokenizer(s2,"/");
		System.out.println(st2.countTokens());
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		
		
//	hasMoreToken() : 분리되 갯수만큼 루프수행 
	//	StringTokenizer에 사용할 수 있는 토큰이 더 있는지 확인합니다

	//	이 메서드가 ture를 반환하는 경우는 토큰이 존재하고, false를 반환하는 경우 토큰이 없다는 것 입니다	
		
		System.out.println("=========================hasMoreTokens");
		String str = "a b c d e f g";
		
		StringTokenizer sta = new StringTokenizer(str, "ac ");	
		
		while(st.hasMoreTokens())
		{
			System.out.print(" " + sta.nextToken());
		}
		
/* 	//3. 구분자를 기준으로 문자열을 분리할 때 구분자도 토큰으로 넣는다. (true)
 * 	StringTokenizer st = new StringTokenizer(문자열 , 구분자 , true/false);
 * 	구분자를 분리된 문자열 토큰에 포함 시키지 않는다. (false)
 * 	(디폴트 : false)	
 */
		
		
	}
}






































