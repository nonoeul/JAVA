package 유틸_util;

import java.util.HashMap;

/*
  	??HashMap이란??
  	HashMap은 Map인터페이스를 구현하는 대표적인 MaP컬렉션이다.
  	MaP 인터페이스를 상속하고 있기 때문에 Map의 성질을 전부다 가지고 있다.
  	Map==> 상속 ==> HashMap
  	
  	1. Map은 (키값, 값) 이런 구조로 형성되어 있다.
  	  동일한 키값을 넣을 수는 있지만 기존의 있던 값이 덮혀쓰여진다.
  	  동일한 키값은 하나만 존재가능하고 값은 여러개가 존재가능하다.
  	
  	2. HashMap은 맣은 양의 데이터를 검색하는데 있어서 성능이 뛰어나다고 한다. 
  		HashMap은 해시 함수를 통해 키와 값이 저장되는 위치를 결정하므로
  		사용자는 그 위치를 알 수 없고, 삽입되는 순서와 들어있는 위치 또한
  		관계가 없습니다. 
  
 */
public class HashMap_이론 {
	public static void main(String[] args) {
		
		HashMap<String, String> map =new HashMap<String,String>(); // HashMap생성 
		HashMap<String, String> map2=new HashMap<>(); // new타입에서 생성자 파라미터 생략가능 
		
		
	}
}
