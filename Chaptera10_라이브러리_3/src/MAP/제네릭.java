package MAP;
import java.util.*;
/*
  제네릭스는 한 번에 선언된 값의 형태를 바꿔준다.
  
  public class MyClass<T>
  T val;
  	void set(T, a)
  	val = a
  => 모든 T값이 바뀐다.
  => Myclass<String>으로 바꿔주면 모든 T값이 String으로 바뀐다.
  => <>가 제네릭!!
  		1.<> 사이에는 하나의 타입 매개변수를 사용하는데
  		// int같은 것은 입력하면 안된다. Intergret형태로
  	
  
  
  
 */
class Box<T>
{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
public class 제네릭 {
	public static void main(String[] args) {
		
	// 제네릭 큸새스 선언시 extends 를 사용함으로써 특정 클래스의 자손만 받도록 제안 할 수 있다.
	// 만약 클래스가 아니라 인터페이스를 구현해야 한다고 해도 implement가 아니라 extends를 사용해야한다.
		
	
	// Box<T>에서 T는 인스턴스 변수로 간주되서 멤버는 대입된 타입에
	// 관계없이 항상 같은 값을 유지해야 한다. 값이 달라져서는 안된다.
	}
}
