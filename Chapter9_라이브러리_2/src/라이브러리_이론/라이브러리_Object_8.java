package 라이브러리_이론;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

class A 
{
	public void aaa() {
		System.out.println("aaa() Call...");
	}
	
	public void bbb() {
		System.out.println("bbb() Call...");
	}
	
	public void ccc() {
		System.out.println("ccc() Call...");
	}
	
	public void ddd() {
		System.out.println("ddd() Call...");
	}
	
	public void eee() {
		System.out.println("eee() Call...");
	}
}

public class 라이브러리_Object_8 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("메소드명 입력:");
		String m=scan.next();
		A a=new A();
		
		if(m.equals("aaa"))
			a.aaa();
		else if(m.equals("bbb"))
				a.bbb();
		
		else if(m.equals("ccc"))
			a.ccc();
		
		else if(m.equals("ddd"))
			a.ddd();
		
		else if(m.equals("eee"))
			a.eee();
		
		try
		{
			//리플렉션 => 클래스이름으로 클래스 정보 읽기 => 모든 제어 가능
			//변수, 메모리 할당, 메소드 호출, 생성자 변경
			Class clsName=Class.forName("com.sist.lib.A");
			Object obj=clsName.getDeclaredConstructor().newInstance();
			
			//메소드읽기
			Method[] methods=clsName.getDeclaredMethods();
						
			for (Method mm : methods) {
				if (m.equals(mm.getName())) 
				{
					mm.invoke(obj, null);
				}
			}
			
		}catch(Exception ex) {}
		
	}
}






























