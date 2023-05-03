package 유틸_util;
/*
 * 	Collection => 데이터를 묶어서 관리를 할 수 있게 만들어주는 클래스
 * 				=> 배열의 단점을 보완 
 * 	컬렉션 프레임워크 (프레임워크 =>표준화)
 * 			============> 모든 개발자가 동일한 소스코딩을 한다.
  					  	  소스의 동일화 목적 : Spring, Mybatis, JQuery
  						  일정 틀 = > 쉽게 다른 개발자들의 분석
  		   	라이브러리 같은 경우는 모두가 동일한 방식으로 사용
		 	= 완전 동일화하다. 배우기만 하면 다른 사람의 코딩을 쉽게 볼 수 있다. 
	
	Collection : 데이터그룹 ,다수의 데이터 => 모아서 관리	 
					== 배열, 클래스
		1) 배열 : 단점 => 고정적이다 (배열의 크기를 정해놓고 작업)
						증가 / 감소시에 새로운 배열을 만들어서 처리한다.
						== 배열을 크게 만들게 되면 => 메모리 누수현상
						빈 배열에는 모두 null값이 할당되어 필요없는 데이터가 발생한다.
		Collection은 데이터의 크기에 알맞게 클래스를 제작해준다 (가변형) = 최적화
		프레임워크는 표준화가 되어있다,
		
		2) 컬렉션 : 가변형 
			=> 컬렉션은 가변형으로 저장 메모리 크기를 결정하지 않는다.
			=> 크기가 커지면 자동으로 저장 메모리 크기를 늘려주고 크기가 작아지면 자동으로 줄여준다.
			
		3) Collection 
			1) List 구현클래스
				1. **ArrayList (가장많이 사용)
				2. Vector
				3. LinkedList
				
				List => ArrayList(비동기) => Vector를 보완
				   		   Vector(동기화)
				   		   LickedList => C언어 호환 
				List list=new ArrayList()
				list = new Vector()		=> 네트워크에서 주로 사용
				list = new LinkedList()	=> C언어 호환 
				   		   
				
			2) Set
				1. **HashSet	=> 중복이 없는 데이터를 저장하는 것
				2. TreeSet(구현클래스) => 검색을 할 때 많이 쓰인다. 
			
			3) Map
				1. **HashMap	
				2. HashTable
		
	
	??Collection 컬렉션을 왜 사용하나??
	1. 	일괄된 API, Collection 아래에 있는 모든 클래스 ArrayList, Vector, LinkedList 등
		Collection에서 상속받아서 동일한 메소드 사용
		
	2.	프로그래밍 노력 감소 : 객체지향 프로그램의 추상화 기본 개념이 어느정도 구현 
		 
	??List??
		 1) 순서를 가지고 있다. (인덱스) ==> 0부터 시작
		 2) 저장된 데이터 중복을 허용
		 3) CURD프로그램에 굉장히 유용하게 주로 사용된다. 
		 	---- Create , Update, Read, Delete
		 4) 비동기화 => 데이터베이스 프로그램 연동 시 사용 
		 5) 주요메소드
		 	=데이터 추가	add(Object) // 한번에 추가할때는addAll // add(인덱스위치,추가하고싶은값) 인덱스 위치를 정해서 저장가능
		 	=데이터 삭제	remove()
		 	=데이터 수정	set()
		 	=데이터 읽기 	get()
		 	=저장된 데이터 갯수	  size()
		 	=전체 삭제		  clear()
		 	=데이터 존재여부 확인 isEmpty()
  			=오라클에서 데이터 읽어서 저장 (List) => 브라우저 전송
  		6) 구현하고 있는 클래스
  		  	ArrayList / Vector / LinkedList
  			-----------------------------------------------
  	??Set??
  		1) 순서가 없다 (인덱스 번호가 없다) => foreach
  		2) 데이터 중복을 허용하지 않는다.
  		3) 주로 사용처 => List에 중복된 데이터 제거  
  		-----------------------------------
  		4) 구현 클래스 : HashMap, HashTable
  			=데이터 추가	add(Object) // 한번에 추가할때는addAll // add(인덱스위치,추가하고싶은값) 인덱스 위치를 정해서 저장가능
		 	=데이터 삭제	remove()
		 	=데이터 수정	set()
		 	=데이터 읽기 	get()
		 	=저장된 데이터 갯수	  size()
		 	=전체 삭제		  clear()
		 	=데이터 존재여부 확인 isEmpty()
		 // List와 동일한 구현 클래스를 가지고 있다. set=List 동일한 구현 클래스 
		 -----------------------------------
		 
	??Map??(웹에서 지원하는 모든 클래스는 Map형식을 가지고 있다)
		 	request, response, session, cookie 
		 	new Cookie(key,값) // 키를 가지고 있다.
		 	
		 	=> 사용자 값 3개
		 	requset.setAttribute("id", hong")
		 	requset.setAttribute("pwd", hong")
		 	requset.setAttribute("sex", hong")
		 	// 동일한 데이터를 가지고 있을 때 키를 통해 값을 구분할 수 있게 해준다.
		=> 키와 값을 따로 저장한다. => 맵이 해주는 역활이다.
		=> 키를 통해서 값을 가져온다는 사실을 기억하자. 
		=> 키는 중복될 수 없다. 값은 중복이 가능하다. 
		 	 => 키가 동일할때는 덮어쓴다. 기존에 값이 사라진다. 
		 	 	키가 동일한다고 저장이 안되는 것은 아닌데 덮여쓰여져 그 전에 값이 사라진다. 
		 
		 구현된 클래스 : HashMap
		 = 주요 메소드
		 	=>저장 : put
		 	=>읽기 : get(key)
		 ---------------------
 */
import java.util.*;
/*	ArrayList => 사용빈도가 가장 많다.
 * 	배열과 유사하다 => 인덱스번호를 사용한다 => 자동으로 지정
 * 	크기를 지정하지 않는다. (가변형)
 * 	데이터베이스 연동
 * 
 *  	생성
 *  	---
 *  	List list=new ArrayList	=> 기본생성자 => 메모리가 10개
 *  	ArrayList list=new ArrayList
 *  	ArrayList list=new ArrayList(10)	
 *  	==> 10개가 넘으면 자동 10개를 추가
 *  
 *  	ArrayList list=new ArrayList(10)
 *    
 */

public class 라이브러리_List_1 {
	public static void main(String[] args) {
	// 생성
	ArrayList list=new ArrayList();
	
	list.add("홍길동");// index=0
	list.add("박문수");// index=1
	list.add("심청이");// index=2 => index=3 => index4
	list.add("춘향이");// index=3 => index=4 => index5
	list.add(2, "강감찬"); // =index2으로 취급 
	list.add(3,"을지문덕"); // =index3으로 취급
	// 자동으로 인덱스 번호가 변경이 된다.
	
//출력
	for (int i = 0; i < list.size(); i++)
		// 저장된 갯수 size는 ==> 배열의 length이다.
		// 글자 수가 몇 개인지를 출력하는 것은 length
		// 배열의 수가 몇 개인지를 출력하는 것은 size 잘 구별해서 사ㅛㅇ하자
	{
		System.out.println(i+"."+list.get(i));
		// list로 하면 배열 전체가 출력이된다. list.get(i)으로 통해 인덱스번호를 정해서 출력해준다.
		// 데이터 추가시 => add()를 이용한다.
		// add추가시 오버로딩 
/*	??오버로딩??
	한 클래스내에서 이미 사용하고 있더라도 매개변수의 갯수와 타입이 
	다르면 같은 이름으로 메소드를 정의해서 사용할 수 있다
	1. 같은 이름
	2. 다른 매개변수 갯수, 변수 타입
	3. 같은 이름으로 정해서 다른 기능으로 사용 가능
*/
		// add(Object o)
	}
	
	// list에는 모든 데이터형을 첨부할 수 있다.
	// 가급적이면 같은 데이터형으 첨부하는 것이 관리하기 편리하다.
	// list라는 공간 데이터 추가 
	// 순서가 존재 => for 
	// 이름 관리 
/*		list.add("홍길동");
		list.add(1);
		list.add(10.5);
		list.add('A');
		list.add(10.5F);
		list.add(100F);
*/		
	// 이렇게 전부 데이터형이 달라버리면 for문을 돌리지 못한다
	// 같은 데이터형끼리 묶어줘서 관리해주는 것이 편리하다. 다른 데이터형일 경우는 묶기 힘들어진다.
	
	System.out.println("===========삭제===========");
	list.remove(0);
	for (int i = 0; i < list.size(); i++) {
		System.out.println(i+"."+list.get(i));
	}
	
/*
  	삭제하는 방식이 총 두 가지가 있다. 
  	1. list.remove(index)	| 배열번호를 주기
  	2. list.remove("홍길동")	| 문자열 넣어서 삭제하기
   	문자열을 삭제하더라도 중복되는 모든 데이터를 삭제하는게 아니라 가장 먼저 있는 인덱스값부터
   	삭제된다. // 5번 홍길동, 11번 홍길동이 있는데 홍길동을 지워도 5번,11번 다 지워지는게 아니라 5번만 지워진다.
  	추가와 동일하게 삭제를 할때도 만약 중간에 있는 인덱스값을 지정하게 되면
  	번호가 한 번호씩 당겨져 0~n번까지 연속적으로 배열되게 만들어진다. 
 */
	System.out.println("===========수정===========");
	//수정할때는 set => set(index번호, 수정할번호)
	list.set(0, "홍길수");
	for (int i = 0; i < list.size(); i++) {
		System.out.println(i+"."+list.get(i));
	}
	
	System.out.println("===========전체삭제===========");
	
	for (int i = 0; i < list.size(); i++) 
	{
		System.out.println(i+"."+list.get(i));
	}
	System.out.println("=======저장된 갯수확인========");
	System.out.println("인원수:"+list.size()); // 갯수가 몇 개 있는지 확인하는 것 
	System.out.println("=======전체 삭제========");
	list.clear(); // list.clear는 전부다 삭제하는 것이다.(메모리공간 삭제)
	System.out.println("인원수:"+list.size());
/*
 	**add(Object o)
  	set(int index, Object p)
  	remove(int index)
  	Object get(int index)
  	int size()
  	clear()
 */
	}
}





















