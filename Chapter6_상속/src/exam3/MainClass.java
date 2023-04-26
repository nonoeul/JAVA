package exam3;
/*
 * 공유 => addr,display() => A가 마음대로 제어를 하지 못한다. 
 *  
 */

class A
{
	int a;	
	int b;	
	String name;
	static String addr;
	
	public A()
	{
		a=10;
		b=10;
		name="hong";
		addr="seoul";
	}
	
	public void print()
	{
		a=10;
		b=10;
		name="hong";
		addr="seoul";
	
	}
	
	public static void display()
	{
		A aa=new A(); 
		// static 메소드안에서는 객체를 생성한 후에 클래스를 갖다 쓸 수 있다.
		// 앞에 객체를 생성한 후 값을 할당해줘서 사용해야한다.
		// 클래스에 정의된 static변수는 그냥 사용이 가능하다. 
		aa.a=10;
		aa.b=10;
		aa.name="hong";
		addr="seoul";
		
	}
}

public class MainClass {

}












































