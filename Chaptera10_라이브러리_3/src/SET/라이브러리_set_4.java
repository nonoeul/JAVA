package SET;

import java.util.*;
public class 라이브러리_set_4 {
	public static void main(String[] args) {
		String[] names= {"홍길동","이순신","강감찬","리승주","이산","을지문덕","박문수","이순신","강감찬","심청이"};
	//ArrayList 변환
		List list=Arrays.asList(names); // 배열을 ArrayList로 변환 
		System.out.println(list); // list는 중복을 허용한다. 
	
		//중복을 제거한다.
		Set set=new HashSet();	// HashSet을 생성한다.
		set.addAll(list);		// set.addAll(list) list에 있는 모든 데이터를 가지고 저장한다.
		System.out.println(set);// set을 출력한다.
		// 제거된 데이터를 다시 받는다 => 장바구니 ... 
		List list2=new ArrayList(); // set으로 갔다가 다시 이동한다. 
		// list2에다가 새로운 배열을 생성한다.
		list.addAll(set);
		// list에다가 모든 set의 내요을 보낸다. 
		System.out.println(list);
		
	}
}
