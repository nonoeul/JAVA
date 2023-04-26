package Main_이론;
// 상속이 있는 경우 => 객체 생성 방법
/*
 * 	A a=new A();
 * 	A b=new B();
 * 	B c=new B();
 * 	B d=new A(); 	==> 오류가 발생한다.
 * 	B e=(B)new A(); ==> 오류가 발생한다 
 * 	** 형변환	
 * 	(int)10.5 
 * 
 * 	상속
 *	1. 형식
 *		class A extends B => 단일상속
 *	2. 클래스 크기 
 * 		상속을 내리는 클래스 > 상속을 받는 클래스 // 상속을 내리는 클래스가 더 크다.  
 * 	3. 형변환
 * 		작은 클래스 = 큰 클래스
 * 	4. 자바의 최상위 클래스 => Object 
 * 	5. 상속의 예외 : static => 공유변수, 초기화블록, 생성자블록, private 상속은 되는 접근은 안됌
 * 		1. static은 모두 공통메모리를 사용하기 떄문에 상속 필요 X
 * 		2. 초기화, 생성자블럭은 상속이 필요없다.
 * 		3. private은 상속은 되는 접근을 불가 // 이를 해결 1. protected 2. getter/setter 을 사용해서 해결하면 됀다. 
 * 
 */
class Human
{
	int a=10;
	int b=10;
	static int c=30;
	public void display()
	{
		System.out.println("Human:display() Call...");
	}
}

class Student extends Human
{
	int d=40;
	int e=50;
	/*
	 * 	int a=10;
	 * 	int b=2-;
	 *	static int c=30;
	 * 	display()
	 * 
	 */
	public void display()
	// 오버라라이딩 한거다 
	// 1. 메소드명이 같아야하고 변수 타입이 같아야 한다. 
	// 오버라이딩 vs 오버로딩 ==> 형태가 같고 변수타입이 같으면 (오버라이딩) 갯수가 다르거나 형태가 다르면 (오버로딩)
	/*
	 * 오버라이딩
	 *	1. 상속 => 재정의가 가능하다 수정/변경 가능
	 *	2. 메소드명이 동일해야한다.
	 *	3. 매개변수가 동일해야한다
	 *	4. 리턴형이 동일해야한다
	 *	5. 접근지정어 확장 가능 private-->public 확장은 가능하지만 , public->private로 접근지정어를 축소는 불가하다.
	 *		=> 확장은 가능, 축소는 오류발생 
	 */
	{
		System.out.println("display 오버라이딩 중 띠띠띠");
	}
}

public class Mainclass2_객체생성하는방법_이론 {
	
	public static void main(String[] args) {
		
/*
 * 		클래스명과 생성자가 다른 경우 
 * 		
 * 		클래스명 변수명 = new 생성자()
 * 		------			  ------
 * 		Human h2=new Student();
 * 
 * 		1) 변수 제어 	==> 클래스 타입을 따라간다. Human 변수  
 * 		2) 메소드 제어 ==> 생성자 타입을 따라간다. Student 생성자를 따라간다. 
 * 
 * 
 */
	
		Human h=new Human();	// a,b,c
		h.display();
		Student s=new Student();// a,b,c,d,e
		s.display();
		Human h2=new Human();
		h2.display();
		//Student s2=new Human() 상속이 안된다. 휴먼이 상속을 내려주는 클래스로써
		//Human의 값이 더 크기 떄문에 더 큰 값으로는 만들 수 없다. 
		//Student s2=(Student)new Human();
		
		 Student s2=(Student)h2; // 정상수행 . 형변환을 시키는 것에 대해서 알아둬야 한다.
		
		
		
		// Student s3=(Student)h;	// ClassCastException => 형변환 오류 
		
		// 사용 범위 ==> 상위 클래스는 하위 클래스의 추가된 내용에 접근이 불가능하다. 
		// 변수 접근 ==> 선언된 클래스에 등록된 변수까지만 접근이 가능하다. 

	}
}

































