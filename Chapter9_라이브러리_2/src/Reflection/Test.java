package Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

public class Test {
	public static void main(String[] args) throws Exception {
	
		// Class는 클래스 또는 인터페이스를 가르킨다. java.lang.Class는 
		// import를 하지 않고 사용할 수 있다. 
		Class clazz = Child.class;
		System.out.println("Class name: "+clazz.getName());
		//getName은 클래스의 이름을 리턴한다.
		
		Class clazz2 = Class.forName("t"
				+ "est.Child");
		System.out.println("Class name: "+ clazz2.getName());
		
		
	}
}
