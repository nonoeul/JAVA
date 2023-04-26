package 라이브러리_유틸_util;

import java.util.StringTokenizer;

//네트워크
/*
 * 	String s="red|green|blue|black|yellow"
 * 	=> split , StringTokenizer
 * 
 * 		StringTokenizer st=new StringTokenizer(s,"|")
 * 		String[]c color.split("\\|")
 * 				=>원형 : split(String regax)
 * 
 * ??StringTokenizer vs split차이??
 * 		1. split는 문자열을 분리할때 ? + * 같은 특수문자를 사용할 떄 \\역슬래시 두 개를 붙어야 하지만
 * 		2. StringTokenizer은 자르고 싶은 특수문자를 그냥 넣으면 됀다.
 * 
 * 		**split(String regax) ??regax = 정규식
 * 		정규식 문자형태를 만들어줘야 한다. 
 * 
 * 	??hasMoreTokens?? 
 * 	red		= nextToken()
 * 	green	= nextToken()
 * 	blue	= nextToken()
 * 	black	= nextToken()
 * 	yellow	= nextToken() 
 * 	afterLast = => false(읽기 종료)
 * 	// 갯수를 정확하게 맟춰야한다. 정확한 갯수를 넣어줘야한다.
 * 	// 갯수를 초과하면 오류가 발생한다. 
 * 
 * 	??정규식??
  		패턴이 같은 문자를 찾아달라는 것이다. 같은 문자를 찾아줘!! 
  	
 		??regax = regular expression) Regex 어떤 패턴의 문자들이 있는지 찾아줘  	
  		
  	
  
  	
 */

public class 라이브러리_StringTokenizer_2 {
	
	//정규식
	public void ex2() {
		  String result;
		  result = "The cat sat on the mat.".replaceAll("[Tt]he", "*");
		  System.out.println(result);
		  //replaceAll(regex, replacement)은 regex와 일치하는 내용을 replacement로 교체합니다
		  result = "The cat sat on the mat.".replaceAll("^[Tt]he", "*");
		  System.out.println(result);
		}

	public static void main(String[] args) {
		
		String s="red|green";
		StringTokenizer st=new StringTokenizer(s,"|");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken()); 
		// 가지고 있는 분리하는 갯수가 두 개인데 출력을 3개를 넣으면 오류가 발생한다
		// 갯수르 정확하게 해야한다.
		
		
		System.out.println("======hasmorTokens======");
/* ??while반복문을 이용한 hasMoreToken은 자기가 알아서 토큰의 갯수를 세서 갯수에 맞게 출력해준다
	일일이 nextToken을 줄 필요가 없다.매우 편리!! 추출할 데이터가 많을 때는 hasMoreToken사용
	
	??hasMoreTokens을 사용하는 이유??
	1. 일반 StringTokenizer을 사용하게 되면 일일이 nextToken을 줘야한다.
	2. 만약 토큰의 갯수와 nextToken출력 하는 갯수가 달라지면 오류가 발생 countToken으로 갯수 확인 후 맞게 갯수설정
	3. While문을 사용한 hasMoreTokens은 알아서 갯수를 세서 갯수까지만 출력해주므로 갯수 신경X
	
*/			
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}
}

















