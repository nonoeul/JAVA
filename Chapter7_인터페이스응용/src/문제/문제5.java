package 문제;

class A
{
	public A() {
		System.out.println("A() Call....");
	}
	public A(int a) {
		System.out.println("A(int a) Call....");
	}
}

class B extends A
{
	public B() {
		System.out.println("A(int a) Call..");
	}
}

public class 문제5 {
	public static void main(String[] args) {
		B b=new B();
		A a=new A();
		
		A aa=new B(); // 형변환할 떄는 생성자가 동일해야 한다. 
		// new B가 생성자이다. 생성자가 동일해야 한다?
		// 메소드 호출이 바뀌기 때문이다.
		// B는 b로 맟춰야하고 A는 a로 맟춰야 한다.
		
		B bb=(B)aa; // 강제형변환 할떄는 
	}
}
