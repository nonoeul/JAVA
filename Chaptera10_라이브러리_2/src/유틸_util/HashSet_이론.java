package 유틸_util;

import java.util.*;
public class HashSet_이론 {
/*
  	HashSet이란 Set 인터페이스에서 지원하는 구현 클래스이다. 
  	순서대로 입력되지 않고, 일정하게 유지되지 않는 게 특징이다. 
  	HashSet은 null요소도 허용한다. 이 클래스는 중복을 허용하지 않는다.
 
 	??중복을 걸러내는 과정?? // HashSet은 중복을 허용하지 않으니깐.
 	1. HashSet은 객체를 저장하기전에 먼저 hashcode()메소드를 호출
 	2. 해시콛르르 얻어낸 다음 저장되어 있는 해시코드들은 비교해서 같은 해시코드가 있는지 확인
 	3. 해시코드가 동일하다면 equals메소드를 사용해서 두 객체를 비교 
 	4. ture 동일한 객체로 판단되면 저장되지 않는다. 
 */
	public static void main(String[] args) {
		
		HashSet<String> colors = new HashSet<String>(); //타입지정
		HashSet<String> colors1 = new HashSet<>(); 		//타입생략가능
		HashSet<String> colors2 = new HashSet<>(10); 	// 초기용량 설정
		HashSet<String> colors3 = new HashSet<String>(colors1); // 다른 colloction값 초기화
		HashSet<String> colors4 = new HashSet<String>(Arrays.asList("Blue", 
				"Black", "White"));// 배열로 값을 넣을 수도 있다.
		
		System.out.println(colors4);
		
		//add로 값 추가해주기
		System.out.println("====값 추가");
		colors.add("Black");
		colors.add("White");
		colors.add("Green");
		colors.add("red");
		System.out.println(colors);
		
		System.out.println("====값 유뮤확인"
				+ "====");
		//값 유무확인
		System.out.println(colors.contains("Black"));
		System.out.println(colors.contains("pink"));		
				
		
	}
}
