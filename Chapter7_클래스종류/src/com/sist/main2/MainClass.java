package com.sist.main2;
import java.lang.reflect.Executable;
import java.util.*;
// 인터페이스 => 여러 개를 묶어서 쉽게 관리할 목적
// 스프링 (클래스 관리자) => 인터페이스 

public class MainClass {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("해당 클래스 번호:");
		
		int no=scan.nextInt();
		Container cc=new Container();
		Exec a=(Exec)cc.getBean(no);;
		a.execute();
		
//		if(no==1)
//		{
//			A a=(A)cc.getBean(no); // getBean은 object로 모든 객체의 최상위클래스이다.
//			// 모든 객체의 최상위클래스이다보니 큰객체에서 작은객체로 값을 대입해주는 것은 에러가 발생한다.
//			// 그렇기 때문에 명시적 형변환을 해줘야 한다.
//			
//		}
//		if(no==2)
//		{
//			B a=(A)cc.getBean(no);
//		}
//		if(no==3)
//		{
//			C a=(A)cc.getBean(no);
//		}
//		if(no==4)
//		{
//			D a=(A)cc.getBean(no);
//		}
//		if(no==5)
//		{
//			E a=(A)cc.getBean(no);
//		}
//	
	}
}
