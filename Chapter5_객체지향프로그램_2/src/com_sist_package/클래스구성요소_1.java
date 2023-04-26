package com_sist_package;
// 	폴더 => 관련된 java파일 저장 => 찾기 
// 	다른 패키지를 불러올 떄 반드시 import를 사용해야 한다. 
// 	순서 import java.util.*; // import가 package보다 위로 올라갈 순 없다.
// 	무조권 import는 package보다 아래에 있어야 한다. 
// 	package는 무조권 한 번만 사용될 수 있다. 두 개 이상 존재할 수 없다. 

// 	import com.sist.package.클래스구성요소_1;
// 	import com.sist.package.*; // com.sist.pakage에 있는 모든 클래스들을 불러와라 
// 	import java.util.*; // import java.util.Scanner;
// 	주의점 : 패키지명을 작성할 때 키워드는 사용할 수 없습니다. // (대소문자 구분 => 가능한 소문자 권장)
// 	숫자를 알에 사용할 수 없다. 
// 	com.sist.class // com.sist.public // com.sist.int // 전부 다 오류가 발생한다.
// 	다른 패키지에서는 같은 이름의 클래스를 만들 수 있다.  
//	클래스의 분리
/*
 * 	클래스
 * 	 =	데이터형
 * 	 =	액션(동작) => 메소드만 가지고 있다.
 * 	 ------------------------------
 * 	 1) 데이터형
 * 	 2) 데이터 처리
 * 	 3) 조합 => main => 메인보드 
 * 
 * 	메소드
 * 	 1. 메소드 구성요소
 * 		리턴타입(결과값) 메소드명(매개변수 -> 요청데이터) => 선언부
 * 		------------ 일치(데이터형)
 * 		{
 * 			구현부
 * 			return 결과값 // 구현부 마지막에는 무조권 return이 있어야 한다.
 * 			// 결과값을 받기 위해서 	
 * 		}
 * 			리턴타입 : 사용자가 요쳥한 내용을 처리후에 결과값의 데이터형
 * 					 1) 결과값이 있는 경우 
 * 					 2) 결과값이 없는 경우 => 앞에 void를 붙여라 
 * 					 리턴타입 / return 값은 항상 일치하는 것은 아니다 . 리턴타입의 값이 다를 수 있다. 
 * 					 -----	  -----	
 * 					 항상 리턴타입이 결과값보다는 크거나 같다. 
 * 						 ------	 ----
 * 						 int 	 10.5 => 오류
 * 						 double   10  => 정상 수행
 * 					3) 리턴타입이나 결과값은 1개만 나온다.
 * 					   ** 여러개일 경우 : 배열, 클래스를 이용한다. 
 * 									  ----,----- 주소 => 얕은 복사 
 *  				예) int[] display() 
 *  				=> int[] arr=display()
 *  				=> int[] arr=new int[5]
 *  				=> int[] arr2=arr;
 *  
 *  	Class A => 데이터형이다.
 *  
 *  	a display() //  display라는 사용자정의 메소드를 만든 것이다.
 *  	// substring, string 처럼 자바에서 주는 메소드도 있지만
 *  	// display처럼 사용자가 지원하지 안흔 기능을 스스로 만들 수 있다
 *  	{
 *  		A a=new A();
 *  		return a;
 *  	)
 *  
 *  	A aa=display() ==> aa=a
 *  
 *  	String display()
 *  	{
 *  		String s="Hello";
 *  		return s
 *  	}
 *  
 *  	int display()
 *  	{
 *  	A aa=display() => aa=a
 *  
 *  	리턴형 : 기본형, 배열, 클래스 (사용자 정의 데이터형)
 *  	return int => 10
 *  		   double => 10.5 
 *  		   char = 'A'
 *  		   배열	=> 	배열명(주소값)
 *  			int[] arr=new int[5]
 *  			return arr;
 *  		   클래스	=>	객체명(주소)
 *  
 *  	매개변수 : 사용자 요청값
 *  		getView(int page)
 *  		사용자 요청값을 지정해준다.
 *  		return값이 반환할 때 반환 위치 이름이 필요한대 매개변수를 지정할때 만들어준다.
 *  		findData(String s)
 *  		login()
 *  
 */
class Student
{
	int hakbun;
	String name;
	String sex;
	int kor;
	int eng;
	int math;
	
}


class Studentsystem 
{
	int gethakbun()
	{
		return 1;
	}
	
	String getname()
	{
		return "홍길동";
	}
	
	int getmath()
	{
		return 80;
	}
	
	int geteng()
	{
		return 70;
	}
	
	int getkor()
	{
		return 50;
	}
	
	Student getdate()
	{
		Student s=new Student();
		s.hakbun=2;
		s.name="심청이";
		s.kor=90;
		s.eng=80;
		
		return s; // s는 변수 값 s호출한 곳으로 돌아ㅏㄴ다. 
	}
	
	
}
public class 클래스구성요소_1 {
		
		
	
		public static void main(String[] args) {
	
			Student hong=new Student();
			Studentsystem ss=new Studentsystem();
			hong.hakbun=ss.gethakbun();
			hong.name=ss.getname();
			hong.eng=ss.geteng();
			hong.math=ss.getmath();
			hong.kor=ss.getkor();
			
				
					
// 클래스	,	다른 데이터형을 묶어라 
// 배열	,	같은 데이터형을 묶어라
// *** 클래스, 배열 모두 데이터형이다.

			
			
		}			
	}


































