package com.sist.main3;
/*
 * 	인터페이스 간의 상속
 * 	interface A
 * 	interface B extends A
 * 				-------
 * 
 * 	interface A
 * 	{
 *		void aaa();
 * 	}
 * 	interface B extends A // 인터페이스 상속을 받을 때는 extends를 사용해야 하고 
 * 	{
 * 		void bbb();
 * 		// void aaa()
 * 	}
 * 
 * 	class C implements B // class 자체를 상속받을 때는 implements를 통해서 상속을 받는다.
 * 						 // 
 * 	{
 * 		public void aaa(){}
 * 		public void bbb(){}
 * 	}
 * 
 * 
 */
interface A
{
	
}
interface B extends A // extends 뒤에 붙은 애가 더욱 크다 A가 더 크다.
{
	
}
class C	implements B // B가 더 크다 뒤에 붙은애가 상속을 내려주는 애로 더 크다. 
					 // interface도 클래스와 동일하다 interface도 클래스와 동일하게 기능한다.
					 // 클래스는 단일상속만 되지만 인터페이스는 다중상속이 가능하다.
// 클래스 인터페이스 둘 다 묶어주는 기능이 있지만 둘의 결정적 차이는 단일상속이냐 다중상속이냐에만 구분이 있다.
// 클래스와 인터페이스는 기능상으로는 묶어주는 기능으로 동일, 단일상속, 다중상속 말고는 차이가 없음 
// class는 상속 implements는 구현한다. 이런 느낌이다. 

{
	
}

public class MainClass {
	public static void main(String[] args) {
		A a=new C(); // 
		B b=new C();
		C c=new C(); // 다중상속이 오면 클래스상속을 하는게 좋다 
		
/* 
 * 	instanceof는 객체 타입을 확인하는 연산자이다.
 * 	형변환 가능ㅇ 여부를 확인해서 true/false로 반환이 가능하다.
 * 	객체 instanceof 클래스 
 *	?? instanceof 상속관계 ??
 *	instanceof 상속관계에서는 부모객체인지 자식 객체인지 학인하는데 이용 
 *	
 *	?? instanceof false??
 *	instanceof는 형변환이 가능한지를 물어봐주는 것이다. 이 말은 뭐냐 
 *	만약 자손이 부모에게 상속받는 다면 이것은 상속이 가능하다. 형변환 가능
 *	하지만 부모가 자손에게 상속을 받는다면 이것은 상속이 불가능하다. 형변환 불가능
 *	
 */

		if(c instanceof A) // c객체는 A에 포함 
			System.out.println("OK");
		
		if(c instanceof B) // C < B
			System.out.println("OK2");
		
		if(b instanceof A) // B < A
			System.out.println("OK3");
		
		if(a instanceof C) // A < C 
			System.out.println("OK4");
		
		String s="";
		StringBuffer sb=new StringBuffer();
		Object o=new Object();
		if(s instanceof Object)
			System.out.println("OK");
		//true가 나오면 ok가 출력이 되는데, 즉 뒤에 있는 게 더 크다면
		// 상속이 가능하므로 형변환이 가능해서 true가 나온다
		// Object는 모든 객체의 최상위 객체이기 떄문에 모든 객체가 상속을 받을 수 있다 true
		
		System.out.println("========================");
		
		if(sb instanceof Object)
			System.out.println("OK2");
		
		if(o instanceof String)
			System.out.println("OK3");
	// false가 나온다. String이 Object 객체의 최상위 객체보다 클 순 없다. String이 Object보다
	// 클 순 없으므로 false가 나온다
	// if(s instanceof StringBuffer) => 오류 (상속, 포함관계가 아닌 경우 크기를 젤 수 없다.)	
		
		
	}
}







































