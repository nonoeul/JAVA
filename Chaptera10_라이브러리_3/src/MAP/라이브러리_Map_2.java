package MAP;
import java.awt.*;
import java.util.*;


class A
{
	public void execute()
	{
		System.out.println("A:execute() Call...");
	}
}

class B
{
	public void execute()
	{
		System.out.println("B:execute() Call...");
	}
}

class C
{
	public void execute()
	{
		System.out.println("C:execute() Call...");
	}
}

class Container
{
	Map map=new HashMap();
	// 싱클턴 => 메모리 누수현상을 방지 (한개의 객체로 재사용하는 프로그램)
	// Map => 클래스 관리시에 주로 사용된다.  
	public Container()
	{
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
	}

// 한번에 모아서 관리하면 메모리 누수현상을 방지할 수 있다.
	public Object getBean(String key)
	{
		return map.get(key);
	}
}


public class 라이브러리_Map_2 {
	public static void main(String[] args) 
	{
	Container c=new Container();
	A aa=(A)c.getBean("a");
	aa.execute();
	A bb=(A)c.getBean("a");
	bb.execute();
	// 한개의 주소로 리턴해주는게 편리하다 
	// 한개의 객체를 가지고 사용할 수 있게 만들어서 메모리 절약
	// 한개의 객체를 돌려서 쓰기 때문에 메모리 누수를 없앨 수 있따,
	// new를 적게 쓸 수록 속도가 빨라진다.
	// IF) 만약 new를 통해 객체를 여러 개 만들어버리면 다른 객체가 쓰이고
	// 안 쓰이는 객체들은 가비지컬렉션에 버려지므로 메모리 낭비된다.
	

	System.out.println("aa"+aa);
	System.out.println("bb"+bb);
	}
}




















