package Main_이론2;
/*
 * 	오버라이딩 : 재정의	
 * 		= 변수 오버라이딩 	: 변수명이 동일
 * 		= 메소드 오버라이딩 	: 메소드명이 동일
 * 	---------------------------------
 * 	
 *			오버로딩			오버라이딩		=>	다형성
 * 클래스관계	같은클래스			상속관계
 * 메소드명	동일				동일
 * 리턴형		관계없음			동일	
 * 매개변수	갯수,데이터형다름 	동일
 * 접근지정어	관계없음			관계없음
 * 목적		새로운 기능 추가	기존 기능을 수정 => 이게 포인트이다. 새로운 기능을 추가하냐, 기존 기능을 수정하냐 이게 포인트!
 * 
 * ==> 오버라이딩은 메소드를 변경하는 것이다. (204page)
 * 
 * 
 * 
 * 
 */
class Human{
	int a=10;
	// 모든 클래스 Object 최상위 클래스의 객체를  상속받고 있는 것이다.
	// 모든 클래스가 받고 있기 때문에 생략해서 표현 가능 
	
}

class Student extends Human{
	int a=20;
	public Student()
	{
		this.a=100; 
		int a=30;
		System.out.println("a="+a);		 	// 지역변수
		System.out.println("a="+this.a); 	// Student의 변수 this은 자기자신의 변수를 구분해주는 것
		System.out.println("a="+super.a);	// Human의 변수   super은 부모클래스의 변수를 구분해주는 것
	}
}


public class 오버라이딩_이론 {
	public static void main(String[] args) {
		Student s =new Student();
	
	}
}

































