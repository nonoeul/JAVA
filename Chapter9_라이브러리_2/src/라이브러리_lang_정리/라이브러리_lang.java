package 라이브러리_lang_정리;
/*
 	java.lang = 기본 (가장 많이 사용되는 클래스의 집합)
 	----------------import를 생략할 수 있다.
 	
 	Object		: 최상위 클래스 => 모든 클래스 Object 상속
 				=> 가장 큰 데이터형으로 사용 (가장 큰 데이터형)
 				=>	Object o=10
 				=>	o=10.3
 				=> 	o='A'			
 				=> 	o=true			
 				=> 	o=new 클래스()
 				---------------- 여러개의 데이터형을 묶어서 관리 
 				Object[] oo={10, 10.4, 'A', "aaa".....}
 				=> 라이브러리에 제공하는 메소드 
 					--------------------
 					리턴형 / 매개변수 => 대부분 Object
 					=> Object가 나왔을 떄 형변환 시켜야하는 것을 잘 알아야 한다.
 					=> 형변환 
 	String		 
 	StringBuffer
 	Wrapper
 	Math
 	System

	??오토방식 언박싱??
		기본타입 		: int, long, float, double, boolean
		Wrapper클래스	: Integer, Longm Float, Double, Boolean 등
		
		
		
	??Objcet??
		기능
		1)clone		: 복제(새로운 메모리를 만든다)
		2)toString	: 객체를 문자열화
		3)finalize	: 소멸자
		4)equlas	: 비교 (기본=>주소값, 실제값을 비교할때는 오버라이딩을 해야한다.)
		
	??StringBuffer??
		append
		
	??String??
		기본형을 클래스화 시킨 클래스의 집합
		1) int		= Interger
		2) long		= Long
		3) double	= Double
		4) boolean	= Boolean
		----------------------- 기본형을 객체형으로 변경할 때 
		정수변경할 때 	 Interger.parseInt()
		실수변경할 때 	 Double.parseDouble()
		논라형 변경할 때 Boolean.parseBoolean()
	
	??Math?? 
		= random() : 난수 발생 (0.0~0.99)
		= ceil()  : 올림메소드  = 총페이지를 구하기  
		= round() : 반올림메소드 = 평균을 구하거나, 평균을 구할 때 
		
	??System??	
		= System.currentTimeMillis() : 실제 시간을 => long
		 	=> 로그파일 // 얼마나 걸렸는지  
		= System.gc() : 가비지 컬렉션을 호출 할때 (메모리 회수할 떄)
		= System.out  : 화면 출력할때 사용된다. (outputStream) 
		= System.in   : 키보드 값 입력받을 때 사용된다. (inputStream)

	??String??
		= 문자열을 저장하는 클래스 
		= length : 문자열을 가져오는 
		= substring : 원하는 문자열을 가지고 오는
		= trim		: 공백을 제거
		= charAt	: 문자열을 변환
		= replace	: 대체
		= equals	: 문자 비교
		= startsWith: 시작하는 문자
		= contains	: 포함되어 있는 문자
		= indexOf	: 특정문자열의 위치를 ㅏ반환하한다.
		= lastIndexOf:마지막 문자
		= valueOf	 : String형으로 형변환 
 */
import java.util.*;
import java.util.ArrayList;

public class 라이브러리_lang {
	public static void main(String[] args) {
		

	}
}




































