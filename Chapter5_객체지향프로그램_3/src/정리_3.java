/*
 * 	class A
 * 	{
 * 	}
 * 
 * 	A a=new A()
 * 	=> JYM => 메모리를 생성
 * 	   this=a;
 */
public class 정리_3 {
	정리_3()
	{
		System.out.println("this="+this);
		
	}
		public static void main(String[] args) 
		{
			정리_3 a=new 정리_3();
			System.out.println("a="+a);
		}
}
