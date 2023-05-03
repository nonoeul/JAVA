package 유틸_util;
/* ??List의 메소드??
  	add, remove, set, size, clear
  	-----------------------------기본 메소드
  	containsAll() => 두 개의 list에서 중복된 데이터를 모아서 관리
  		=> join , 데이터 여러 개를 합쳐주는 데이터 두 개의 중복된 데이터만 모아주는
  	retainAll() => 두 개 list에서 중복된 데이터만 남기기	
  	addAll() => 데이터 전체 복사 // 다른 list에 모든 것을 따올 수 있다.
  	subList => 부분적 데이터를 복사할 경우에 사용 
  	//다른 list의 부분적인 부분만 따올 수 있다. 
  	--------------- 장바구니, 예매 
  
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class 라이브러리_List_2 {
	public static void main(String[] args) {
	
	ArrayList list=new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(7);
	list.add(8);
	
	// 출력
	for (Object i : list) // Object가 들어갔다. list는 Object이다.
	// 리턴값도 Object이므로 Object로 받아야한다.~~~ 이것을 알고 있자고요
	{
		System.out.println(i);
	}
	
	
	System.out.println("========subList========");
	// 일부만 추가 subList(start, end)
	
	ArrayList list2=new ArrayList(list.subList(1, 4));
	// end는 -1이다 마지막은 1을 빼준다
	// 1~4까지인데 마지막에 1을 빼주므로 1,2,3번을 출력한다.
	
	
	for (Object i : list2) 
	{
		System.out.println(i);	
	}
	// sort
	System.out.println("========sort========");
	Collections.sort(list);
	for (Object i : list)
	{
		System.out.println(i);
	}
	
	System.out.println("=========데이터가 같은게 있는지 확인=========");
	// 같은 데이터 추출
	System.out.println(list.containsAll(list2));
	// 같은 데이터가 있는지를 확인해준다 containsAll
	
	 
	//retainAll 정보가 들어가있냐를 물어보는 것이다.
	System.out.println("=========중복된 데이터만 가져오기======");
	System.out.println(list.retainAll(list2));
	list.retainAll(list2);
	System.out.println("list"+list);
	System.out.println("list2"+list2);
	// retain교집합이라고 생각하면 편하다. list와 list2의 공통된 요소만을 남기고 다 버린다. 
	// retain으로 교집합만 가지고 오면 나머지 데이터는 전부 지워버린다.
	// 그래서 retain을 사용할때 주의해야 한다.retain뿐만 아니라 remove로 지울때도 마찬가지로
	// 전부다 지워버린다.
	
	//addAll
	System.out.println("=======addAll=======");
	ArrayList list3=new ArrayList();
	list3.addAll(list);
	for (Object i : list3) 
	{
		System.out.print(i);
	}
	
	
	
	}
}













































