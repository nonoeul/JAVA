package com.sist.main;

import static java.lang.Math.random;
/*
 * 	import 패키지명.클래스명 
 * 	import 패키지명.*	// 패키지안에 있는 모든 클래스 불러올 때 사용된다.
 * 	import static java.lang.Math.random;
 *	java.lang.*	// => java.lang에 있는 패키지들은 자동 로딩이 된다. import를 사용하지 않는다.
 *	-------------- String , Math 
 * 
 * 	void method()
 * 	{
 * 		return; // 자동 설정 (생략이 가능) ==> void에서만 
 * 		==> 중간에 존재할때도 있다. 
 * 	}
 * 	class A
 * 	{
 * 		A(){}
 * 	}
 * 		
 */

// Math클래스는 지원하는 모든 메소드가 static이다. 
public class 클래스_메소드_이론 {
	public static void main(String[] args) {
		
	System.out.println("<html>");
	System.out.println("<body>");
	System.out.println("<center>Hello Java</center>");
	System.out.println("</body>");
	System.out.println("</html>");
	System.out.println("======================");
	
	int a=(int)(random()*100)+1;
	int aa=10;
	System.out.println(a);
;
	if(aa%2==0)
	{
		System.out.println("a="+a);
		return;
	}

	System.out.println("1");
	System.out.println("2");
	System.out.println("3");	
	return;
	
	}
}






























