package com.sist.main;



class C
{
	int a=10;
}

class B2 extends C
{
	int aa=20;
	int aaa=200;
	void display(int aa)
	{
		System.out.println(a);
//		지역변수에서 찾다가 지역변수에 없으면 멤버변수에서 찾느다.
//		멤버변수에도 없다면 빨간색 에러가 발생한다. 에러발생!! 
		System.out.println(this.a);
		System.out.println(super.a);
	}
	void aaa()
	{
		
	}
	// B클래스가 가지고 있는 메소드가 아니다 => 공유목적으로 만든것이다.
	// B클래스를 가져다가 쓰지 못한다. 
	static void bbb()
	{
	//	B a=new B();
	}
}


class D
{
	int a;
	void display(int a)
	{
		System.out.println(a);
		a=a; // a에는 void display(a)에 a일까 위에 int a일까.
		// 동일한 이름의 매개변수를 가지고 있을떄는 가까운 위치에 있는 변수를 가져온다.
		// void display(int a) 지역변수의 a를 가지고 온다. 
		
	}
}

// =================================================================

class A{
		int a=10;			// a는 지역변수이므로 클래스내에서만 
		static int b=20;	// b는 static변수이므로 생성자를 생성하지않고 사용 가능
			{ // => 인스턴스 초기화 블록	
			System.out.println("인스턴스 초기화블록: a="+a);
			a=100;
			System.out.println("인스턴스 초기화블록: a="+a);
			a=1000;
			System.out.println("인스턴스 초기화블록: a="+a);
			}
		static 
		{
			System.out.println("static 초기화 블록(변경전): b="+b);
			b=100;
			System.out.println("static 초기화 블록(변경후): b="+b);
		}
		
		A()
		{
			System.out.println("인스턴스 생성자(변경전): b="+b);
			b=2000;
			System.out.println("인스턴스 생성자(변경후): b="+b);
		}	
}

public class 생성자_예시 {
	public static void main(String[] args) {
		A aa=new A();
	// 결과값은 결국 b=2000이 나온다 앞에 아무리 여러가지의 값을 변경해놓아도
	// 마지막 초기화값이 결과값으로 출력되므로 여러가지 생성자나 다양한 생성자 기법을 사용할 이유가 딱히없다
	// 그렇기 떄문에 static블록은 static생성자 / 일반 변수는 생성자 블록을 사용하는게 가장 유용한 방법
		System.out.println("==========================");
		
		System.out.println(aa.a);
		System.out.println(A.b);	

/*
 *	순서
 *	명시적 초기화 ==> static블록 ==> 인스턴스블록 ==> 생성자
 *	==> 초기화 (1.윈도우, 2.네트워크 연결, 3.파일 읽기, 4.데이터베이스)
 * 	==> 오버로딩을 지원
 * 		------- 생성자를 여러 개 사용이 가능하다.
 * 		class A
 * 		{
 * 			this() => 자신의 생성자를 호출할 떄 사용한다. 
 * 			A(){
 * 				==> 기본생정자 => 생성자가 존재하지 않는 경우 자동 생성된다. 
 * 			}
 * 			this(10) => A(10)
 * 			A(int a){
 * 				=> 다른 생성자 호출이 가능 
 * 				this() => 생성자 블록 첫 줄에 사용이 가능하다. 
 * 				초기값을 주기 위해서 사용자로부터 받는다. 
 * 			}
 * 			A(int a, String n){
 * 				초기값을 주기 위해서 사용자로부터 받는다.
 * 			}
 * 		}
 * 			*** this는 매개변수 데이터형에 따라 찾는게 달라진다.
 * 		this(int) 값을 주면 A(int)를 찾고
 * 		this(int, string) 값을 주면 A(int ,string)값을 준다. 
 * 		매개변수 갯수와 유형을 맟춰야 한다. 
 * 
 * 		void display(int a,int b,int c)
 * 		void display(int a,double b,int c)
 * 		void display(double a,double b,double c)
 * 
 * 		=> display( 10.5 , 10 , 'C')를 호출하게 된다면,
 * 				   double  int  char 
 * 		이 중에서 어떤 것을 찾게 되겠는가? 
 * 		void display(double a,double b,double c) 이것이 호출하게 된다. 
 * 		------------------------------------------------------
 * 
 * 		this() => 생성자호출 (자신의 생성자)
 * 		this() => 자신의 객체
 * 		------
 * 			구분자 => 지역변수와 멤버변수가 같은 경우에 구분 
 * 		class A
 * 		{
 * 			int a;
 * 			void display(int a)
 * 			{
 * 				// a를 사용하면 => 매개변수의 값이 사용 가능 
 * 			}
 * 		}
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
	
		
		
	}
}


































