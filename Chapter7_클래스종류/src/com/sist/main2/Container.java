package com.sist.main2;
// Object는 모든 클래스의 상위 클래스 (모든 클래스는 Object상속을 받는다.=최상위 클래스)
/*
 * 	class A
 * 	class B extends A
 * 
 * 	class A (extends Object)
 * 	class B extends A // B는 A도 상속받고 Object도 상속받는 것이다.
 * 	두 개씩 상속받는다. 
 * 
 * 	Object 객체를 생성 가능하다.
 * 		Object o=new A()
 * 		Object o=new B()
 * 
 * 		Object[] a={10,"",10.6....}
 * 		// Object는 모든 데이터형값을 받기 떄문에 모든 데이터형을 배열로 받을 수 있다. 
 */
public class Container {
	public Object getBean(int no)
	{
		Object o=null;
		if(no==1)
			o=new A();
		else if(no==2)
			o=new B();
		else if(no==3)
			o=new C();
		else if(no==4)
			o=new D();
		else if(no==5)
			o=new E();
		return o;
		
	}
}
