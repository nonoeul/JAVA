/*
 *		생성자
 * 		1. 클래스명과 동일
 * 		2. 리턴형이 없다 // 일반 클래스 같은 경우는 모두 return 반환값이
 * 		   존재한다.void 같은 경우도 반환값이 존재한다. 
 * 		3. 생성자는 여러 개를 만들 수 있다. (오버로딩)
 * 		4. 생성자를 사용하지 않으면 자동 기본 생성자가 첨부
 * 		5. 사용처
 * 		   명시적인 초기화가 않되는 부분에서 주로 사용
 * 		   시작과 동시에 처리가 있는 경우 ( 데이터베이스 연결, 서버 연결..등등)
 * 		   객체 생성시 호출되는 메소드
 * 		6. 호출시에는 new 생성자()
 * 				   ----------
 * 		class A
 * 		{
 * 			int a;
 * 			static int b;
 * 			void aaa(){}
 * 			static void bbb(){}
 * 			A(){}	
 * 		}
 * 			a.aaa
 * 			A aa=new A();
 * 			aa.a . aa.aaa ==> 인스턴ㅅ느 호출시 (객체를 통해서 접근)
 * 			
 * 			b, bbb()
 * 			A.b , A.bbb()
 * 			
 * 			A()
 * 			new A()
 * 
 * 			***** 인스턴스메소드 	: 인스턴스변수, 메소드. static변수, static메소드 
 * 								  전체를 사용이 가능
 * 				  
 * 			***** static메소드	: static변수, static메소드만 사용이 가능 
 * 				=> static메소드에서 인스턴스를 사용하기 위해서는 객체 생성후에 사용이 가능하다. 
 * 				
 * 			1. 오버로딩 : 같은 메소드 이름으로 다른 기능을 수행하게 만드는 기법
 * 			   ==> 중복 메소드 정의
 * 			
 * 			   = 같은 클래스안에서 생성
 * 			   = 메소드명이 동일
 * 			   = 매개변수의 갯수나 데이터형이 다르다
 * 			   = 리턴형은 관계없다.
 * 			   ---------------------------
 * 				void aaa() ===============>	aaa()
 * 				int aaa(int a) ===========>	aaa(int)
 * 				double aaa(double a) ========>	aaa(double) // 오버로딩이 된다.
 * 				// 갯수나 데이터형이 다른다.
 * 				==> 오버로딩은 생성자에도 해당이 된다. 
 * 				char aaa(int a, int b) ===>	aaa(int,int)
 *
 */
class Sawon
{
	int sabun;
	String name;
	String dept;
	String loc;	

	// 기본생성자 
	Sawon(){
	// => 변수 초기화가 동일하다.
		sabun=1;
		name="홀길동";
		dept="개발부";
		loc="서울";
		
	}
	Sawon(int sabun1,String name1)
	{
		this();
		sabun=sabun1;
		name=name1;
	}
	Sawon(int sabum1,String name1,String dept1) // 오버로딩 // 갯수가 다르다.
	{
		sabun=sabum1;
		name=name1;
		dept=dept1;
	}
	Sawon(int sabum1,String name1,String dept1,String loc1)
	{
		sabun=sabum1;
		name=name1;
		dept=dept1;
		loc=loc1;
	}
}


class aaaStudent
{
		int hakbun;
		String name;
		static String school_name;
		// 변수의 우선 순위 => 지역변수가 우선순위 => 멤버
		void display() {
			String name="박문수"; // stack
			System.out.println(this.name);
		// 
		}
		
		
		void aaa()
		{
			hakbun=1;
			name="홍길동";
			school_name="SIST";
			bbb();
		}
		static void bbb()
		{
			school_name="SIST2";
			aaaStudent s=new aaaStudent();
			s.hakbun=2;
			s.name="심청이";
			s.aaa();		
		}		
}

public class 정리_2 {
	public static void main(String[] args) {
		
		Sawon s1=new Sawon();
		System.out.println(s1.sabun);
		System.out.println(s1.name);
		System.out.println(s1.dept);
		System.out.println(s1.loc);
		
		
		System.out.println("==============");
		
		Sawon s2=new Sawon(2, "박문수");
		System.out.println(s2.sabun);
		System.out.println(s2.name);
		System.out.println(s2.dept);
		System.out.println(s2.loc);
		

		System.out.println("==============");
		
		Sawon s3=new Sawon(3, "심청이","자재부","인천");
		System.out.println(s3.sabun);
		System.out.println(s3.name);
		System.out.println(s3.dept);
		System.out.println(s3.loc);
		
		
		}
	}



































