package MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
/*
  	Map == 인터페이스
  	=> Hashtable / HashMap
  	
  	>HashMap
  		1. HashMap은 동기화를 지원하지 않는다.
  		2. 단일스레드 환경에서 사용하기 좋은 자료구조
  		3. key값이나 value값에 null값이 들어갈 수 있다.
  	>Hashtable
  		1. Hashtable은 동기화를 지원하여 thread-safe하다.
  		2. null값이 들어갈 수 없다. 
  	
  	
??Hashtable 과 HashMap??
  		= 두 개를 동시에 저장(key, value)
  		= key는 중복될 수 없다. value는 얼마든지 중복 가능
  		= id값을 가지고 온다 
  		= 사용처 : 웹에서 제공하는 모든 클래스 (Map형식)
  			HttpServeletRequest
  				requset.setAttribute("key","value")
  			HttpServeletResponse
  			HttpSession
  			Cookie
  		= 스프링 , 마이바티스 => Map형식
  		  	클래스등록 ("a",new A())
  		= 저장 / 읽기
  			저장 : put("key","값")
  			읽기 : get(key)
  			=> 데이터는 구분자를 필요로 한다.
  					ArraryList	=> 인덱스
  					set			=> 중복없이
  					Map			=> key
  					오라클		=> Primary Key
  					  
  
 */
public class 라이브러리_Map_1 {
	public static void main(String[] args) {
		
		Map map=new HashMap();
		// 데이터 저장
		map.put("id", "admin");
		map.put("password", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("age", "25");
		map.put("password", "4567"); // key가 중복이되면 덮혀쓰인다.
		// 데이터 출력
	/*	System.out.println("ID"+map.get("id"));
		System.out.println("PWD"+map.get("password"));
		System.out.println("NAME"+map.get("name"));
		System.out.println("SEX"+map.get("sex"));
		System.out.println("AGE"+map.get("age"));
		System.out.println("PASSWORD"+map.get("password"));
		// password가 중복이 되어서 값이 덮혀쓰였다. 
	*/
		Set set=map.keySet(); // 키 전체를 모아서 관리해준다. 
		System.out.println(set);
		for (Object o: set)
		{
			String key=(String)o;
			System.out.println(key+":"+map.get(key));
		}
		/*
		 clear() : 전체 삭제
		 get() : 실제 데이터값 읽어올 떄
		 put() : 데이터값 추가할 때 
		 isEmpty() : 데이터가 있는지 여부 (true/fasle)
		 size() : 저장된 갯수
		 values() : 실제 저장된 값 전체를 가지고 올때
		 */
	
	System.out.println("======values======");	
		
	for (Object o : map.values())
	// 변수.values() 모아둔 모든 값을 가지고 올 수 있다.
	{
		System.out.println(o);
	}	
		
	}
}





























