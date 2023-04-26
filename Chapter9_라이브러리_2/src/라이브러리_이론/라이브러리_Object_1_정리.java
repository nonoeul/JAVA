package 라이브러리_이론;
/*
 * 	사용자 정의 클래스 + 라이브러리 
 * 	-------------------------조립
 * 	1)자바의 모든 클래스 (라이브러리 클래스, 사용자정의 클래스)
 * 		=> 상위 클래스(Object)
 * 	
 * 	??2)자바에서 지원하는 라이브러리??
 * 		1.java.lang
 * 			가장 기본이되는 라이브러리로 생략해서 사용된다.
 * 			object, String, StringBuffer, Math, Wrapper, System등이 있다.
 * 	
 * 		2.java.util
 * 			import로 불러와야 사용이 가느하다. 
 * 			Date, Calender, List, set, Map. StringTokenizer등이 있다.
 * 			Scanner은 도스창에서 출력하기 때문에 실제로 거의 쓰지 않는다.
 * 
 * 		==CheckException== 전부 쓸 때마다 예외처리를 해줘야 한다. try-catch 혹은 throws 혹은 if로 예외처리 
 * 		3. java.io = 입출력 (메모리, 파일, 네트워크) => CheckException 체크드 함수이다. 
 * 			File, Reader,
 * 	
 * 		4. java.net
 * 			URL이 대표적이다.
 * 
 * 		5. java.sql
 * 			오라클 연결에 필수적인 라이브러리이다. 
 * 		
 * 	??자동 추가 처리??
 * 		1. import java.lang.*
 * 
 * 		2. 메소드
 * 			void method()
 * 			{
 * 				return => 생략 => 자동추가 
 * 			}
 * 		
 * 		3. 생성자
 * 			void method()
 * 			{
 * 				public A(){} => 자동 추가
 * 			}
 * 		
 * 		4. 상속
 * 			class A extends Object
 * 		--------------------------------
 * 		java.lang에서 지원하는 클래스는 대부분 finalㅡㄹ래스
 * 			=> 상속을 받아서 확정이 불가능
 * 			=> 상속을 받아서 확장이 가능
 * 			=> Object : 모든 데이터형을 받을 수 있다.
 * 			   Object o=10 , Object o=""
 * 				=> 데이터형을 여러 개 사용시에는 라이브러리에서 리턴형 대부분 Object
 * 					=> 형변환을 사용해야 사용이 가능하다. 
 	
 	??클래스의 형변환??
 		클래스 자체에 기본형 변수로 형변환을 해줄 수 없다.
 		(int)new Object()는 불가능하다. 클래스 자체에다가 기본형으로 형변환이 불가능하다.
 		(integer)new Object()는 가능하다.Wapper클래스를 통해서 클래슬르 형변환이 가능하다 .
 		
 		 Interger i=10; 		= 오토박싱
 		 int a=new Interger(10)	= 언박싱
 		 
 	??Object 주요기능??
		1. finalize(): 소멸자 (메모리 할당 => 해제할때 호출)
		2. toString	 : 객체를 문자열로 변환
		3. clone	 : 새로운 메모리를 생성할 때 복제
		4. getClass	 : 클래스 객체 읽기
		5. equals 	 : 객체 비교
 		
		class A
		A a=new A();
		a.getClass();
		class A 

 		class A
 				=super은 상속은 내린 클래스가 뭐냐
 				=super을 통해 상속을 내린게 뭔지 알 수 있다.
 		class B extend A(A+object)
 		
 		B에 super을 하면 A가 나오고
 		A에 super을 하면 Object가 나온다. 
 	
 * 
 * 
 */
class Student{
	private int hakbun;
	private String name;
	
	public Student()
	{
		this.hakbun=1;	// this는 생략가능 => 지역변수가 같은 이름일때 구분한다. 
		name="홍길동";
		System.out.println("생정사 : 멤버변수에 대하 초기화");
	}
	
	public void print()
	{
		System.out.println("학번:"+hakbun+",이름"+name);
	}
	
	// 소멸자이다. 
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 메모리 삭제");
	}

	
}
public class 라이브러리_Object_1_정리 {
	public static void main(String[] args) {

	Student s=new Student();
//  객체 메모리 할당(메모리에 저장)
	s.print();
// 	객체를 할용 (메소드 호출, 변수 변경)
	s=null;
// 	객체 메모리 해제(메모리에서 삭제)= 자옹호출이 된다.
	System.gc(); // finalize 
//	메모리를 해제 => 강제명령
	
/*	??gc??
 * 	gc는 사용하지 않는 값이 할당되어 있지 않은 값들을 
 * 	삭제를 해줘서 낭비를 줄일 수 있게 만들어준다.
 *	값이 null값을 가지고 있으면 가비지컬렉션에서 값이 필요없다고 판단하고 없애버린다. 
 */

		
		
	}
}






































