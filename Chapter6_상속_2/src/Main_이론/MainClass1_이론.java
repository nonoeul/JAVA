package Main_이론;
/*
 * 		상속을 받으면 속도가 느려진다. 거의 사용 XX
 * 스프링
 * 	1. 가급적이면 상속없이 독립적인 클래스를 사용해라
 * 	2. new를 사용하지 않는다.
 * 	3. 하나의 에러가 발생해도 독립적으로 유지돼서 문제가 생기지 않게!! 
 * 	4. 단독으로 사용하는게 훨씬 편리하다. 
 * 	-------------------------------------
 * 	
 * 	상속 => 재사용 (is-a)
 * 	단점 : 실행속도가 매우 느리다. (사용빈도가 극히 드물다) => 포함 클래스 (has-a)
 * 		  상속 / 포함 
 * 		  ---   ---
 * 	=> 상속: 기능 수정(메소드)를 수정하거나 변수를 추가해서 사용할 떄 이용  
 * 		=> 상속을 통해 오버라이딩을 할 수 있다.
 * 		=> (익명의 클래스) 기능을 사용해서 상속을 하지 않고 오버라이딩을 할 수 있다. 상속이 꼭 필요X
 * 	1. 상속을 받는 경우
 * 		class A
 * 		{
 * 			int a;
 * 			int b;
 * 			static int c;
 * 		}
 * 
 * 		class B extends A
 * 		{
 * 			// A를 상속받았기 떄문에 int a, int b포함
 * 				=> static변수는 공유변수로써 상속X
 * 				=> new로 객체를 생성해줘야지 사용 가능 
 * 			int d;
 * 			int e;
 * 		}
 *
 * 		B b=new B(); => A객체가 먼저 생성되고 B객체를 생성한다.
 * 			=> A를 상속받았기 떄문에 상속받은 A를 생성 B생성 총 두개의 메모리를 할당
 * 			=> 두 개의 메모리를 동시에 할당받기 떄문에 속도가 느려진다. 
 * 
 * 	=> 포함: 포함은 제공해주는 그대로 사용한다. 주는 대로 사용 
 * 
 * 상속의 장점
 * 	1) 기존의 클래스를 재사용이 가능하다. 수정, 추가 가능 
 * 	2) 소스 코드량을 줄일 수 있다. => 스프링 (AOP) 
 * 	3) 코드를 공통적으로 사용하기 때문에 관리가 편하다. 
 * 
 * 	Class A
 * 	{
 * 		public void disp(){}
 * 	}
 * 	Class B extends A
 * 	{
 * 	}
 * 	Class C extends A
 * 	{
 * 	}
 * 		// A를 바꾸면 B, C 전체를 바꿀 수 있다.
 * 		   한 개만을 바꿔서 나머지를 바꿀 수 있다. 
 * 
 */
class Super
{
	int a,b;
	static int c;
	
	public Super() // 생성ㅂ자 호출이 되면 메모리를 할당한다. 
	{
		
	}
}

class Sub extends Super
{
	int d,e;
	public Sub()
	{
		System.out.println("Sub클래스 메모리 할당");
	}
}


public class MainClass1_이론 {
	public static void main(String[] args) {
		Sub sub =new Sub();
		System.out.println(sub);
	}
}












































