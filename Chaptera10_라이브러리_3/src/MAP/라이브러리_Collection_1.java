package MAP;
/*
  제네릭
  	=> 데이터형을 통일화
  	=> 라이브러리의 데이터형을 변경할 경우에 사용 
  		매개변수 / 리턴형 (Object)
  			=> 프로그램 개발시마다 형변환을 해야한다.
  			=> 프로그램에 필요한 데이터형으로 변경 
  		** 데이터를 저장할때는 한 가지 데이터형만 저장해야 사용하기 수월하다.
  		   프로그램 개발할때 데이터를 통일한다. 
  	List<클래스명>	=> Object => 클래스명으로 변경 
  	List<String>	
  	List<MovieVO>
  	
??제네릭스??
	다양한 타입의 객체를 다루는 메서드나 컬렉션 클래스에 컴파일 시에
	타입을 체크해주는 기능이다. 제네릭 타입은 클래스와 메서드에 선언가능 하다.
	== 객체의 타입 안정성ㅇ이 올라가고 번거로움이 줄어든다.
	
	=> T, E, K, V
	-------------
	T	= Type (클래스형)
	E	= Element
	K	= Key
	V	= Value
  	Map<K,V>
  	Map<String, String>
  	List<E> 
  	List<Integer>
  		---------기본형으 사용이 불가능하다, 클래스형만 사용 가능
  				-------클래스형으로 제작 => Wrapper
??제네릭스 용어정리??
	Box<T> // 제네릭 클래스 T Box라고 읽는다.
	T	   // 타입 변수 또는 타입 매개변수 
	Box	   // 원시 타입(raw type)
	
??제네릭스 제한??
	1.static 멤버는 사용 불가
		제네리의 타입변수는 인스턴스 변수로 간주된다. 인스턴스 변수는
		값이 바뀔 수 있는데 static은 값이 바뀌면 안되고 타입에 관계
		없이 항상 같은 값을 유지해야 한다. 값이 달라져서는 안된다.
	2.제네릭 타입의 배열을 생성해야 한다.
  		
 */
import java.util.*;
public class 라이브러리_Collection_1 {
	public static void main(String[] args) {
	
//		Box<String> box=new Box<String>();
	List<A> list2=new ArrayList<A>();
	List<String> list=new ArrayList<String>();
	list.add("사과");
	list.add("딸기");
	list.add("배");
		
	for (String f : list) {
		// 통일이 안된다. 
		System.out.println(f);
	}
	
//	list.add(1); 
	// 매개변수가 String이 들어가야하는데 int가 들어가서 오류가 발생
	// 데이터느 무조권 한 가지가 들어갈 수 있게 만들어 준다
	// 입력하거나 값을 갖고 있는 것은 모두 하나의 데이터만을 가지게 만든다.
	
	for (Object obj : list) {
		String f=(String)obj;
		// 통일이 안된다. 
		System.out.println(f);
	}
	
		// box. 을 찍어보면 나오는 t와 equal뒤에 값을 보면 Object가 나온다
		// 즉 리턴형을 주지 않으면 Object형으로 리턴값을 가진다.
		// 그래서 Box에다가 내가 원하는 타입값을 줘서 리턴값을 고정할 수 있다.
		// 한번에 통일화 시키는 것을 제네릭스라고 한다. 
	}
}































