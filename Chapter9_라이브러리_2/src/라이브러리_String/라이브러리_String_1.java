package 라이브러리_String;
/*
 * 	= String : 문자열로 조작하고 처리하는 기능
 * 			   ----------
 * 				= String클래스 , 일반 데이터형으로 취급 
 * 				= 모든 클래스는 Call By Reference, String은 Call By Value
 * 	A a=new A()
 * 	A b=a; => 같은 주소를 제어
 * 	String s="Hello";
 * 	String s1=s; => s1을 변경하면 s는 변경사항이 없다. 
 *		String은 값이 변하지 않는다. 불변이다.
 *		Stringbuffer은 값을 바꿀 수 있다. append를 통해 추가 가능
 *	=메모리 할당(저장)
 *		= String s="Hello"
 *		= String s=new String("Hello")
 *	** 문자열은 주소(자체가 주소이다) **
 *		=> 같은 문자열이면 같은 주소를 가지고 있다.
 *		=> new 이용해서 생성이 되면 다른 주소에 저장 가능하다.  
 * 
 */
public class 라이브러리_String_1 {
	public static void main(String[] args) {
		
	String s1="Hello"; // 기본형으로 작서된 String은 별도의 저장공간에 저장되지 않는다. 그렇기 때문에 내용이 동일하면 주소값이 동일하다. 
	String s2="Hello";
	String s3=new String("Hello");
	// String은 char[] 배열을 쉽게 사용할 수 있게 만들어준다.
	// char은 한글자밖에 저장하지 못하기 때문에 단점이 명확했는데
	// String은 여러 글자의 문자열을 저장할 수 있어 좋다. 
	
	
	if(s1==s2) 
	// "=="는 주소값을 비교하는 것이다. s1과 s2는 같은 내용을 가지고 있기 때문에 주소값이 동일하다.
	// s3같은 경우는 새로운 메모리에 저장되어있어 다른 메모리 공간에 저장한다. new=>다른 주소에 저장 
	{
		System.out.println("s1과 s2는 같다.");
	}
	else
	{
		System.out.println("s1과 s2는 같지 않다.");
	}
	// 실제 => 저장된 데이터의 데이터값이 동일한지 비교한다 : equals
	// s1에 저장된 값과 s3에 저장된 값이 같은지 확인한다.
	
	System.out.println("====equals 비교=====");
	
	if(s1.equals(s3))
	{
		System.out.println("s1과 s3는 같은 값을 가지고 있다");
	}
	else
	{
		System.out.println("s1과 s3는 다른 값을 가지고 있다");
	}
	
	System.out.println("====문자열겷합====");
	String ss="Hello";
	String ss1="JAVA";
	String ss2=ss+ss1;
	System.out.println(ss2);

/*	string끼리 연산자 +를 통해서 문자열끼리 결합할 수 있다. 결합을 하게 되면 새로운 공간에 새로운 문자가 생긴 것으로 인식된다.
	stringbuffr은 하나의 공간에 저장된 것이다. 그래서 아무리 문자를 추가하고 수정해도 하나의 공간에서만 값을 변경하다.
	string으로 계속해서 문자열을 결합하다보면 너무 많은 객체가 발생해 속도가 매우 느려진다.
	stringbuffer의 경우에는 하나의 공간에만 존재하기 때문에 ㅁ아무리 값을 추가,변경해도 속도가 크게 느려지거나 하지 않는다. 
*/		
		
		}
	}














