package 유틸_util;
/*
  subList(int start, int end) => index번호가 start부터 end까지 부분적으로 데이터 복사 (end-1)
  
  => 페이지 나누기 
  addAll() => ArrayList가 가지고 있는 모든 데이터 복사
  retainAll() => 두 개의 ArrayList에서 같은 값을 가지고 있는 데이터 복사 
  Collections.sort() => ArrayList 정렬
  // Collection.sort 정렬하는 방법이다. 
 
 */
import java.util.*;
public class 라이브러리_List_3_java {
	public static void main(String[] args) {
		
		ArrayList names1=new ArrayList();
		names1.add("홍길동");
		names1.add("심청이");
		names1.add("이순신");
		names1.add("춘향이");
		names1.add("강감찬");
		for (Object name : names1) 
		{
			System.out.println(name);
		}
		ArrayList names2=new ArrayList();
		names2.add("홍삼삼");
		names2.add("심청이");
		names2.add("이순신드래곤");
		names2.add("춘향이지스");
		names2.add("강감찬");
		
		System.out.println("==========retain==========");
		//retainAll 같은 이름의 데이터만 바꾸는 것이다
		//retainAll은 중복된 값을 제외하고 나머지 값을 전부 다 버리는 것이다
		//버려진 데이터값은 삭제되므로 이 점을 유의하자
		
//	??retainAll로 교집합을 찾고도 기존 데이터를 유지하고 싶다면?
		ArrayList temp=new ArrayList();
		temp.addAll(names1);
		temp.retainAll(names2);
 		
		//교집합 retainAll
		//1. names1과 names2에 있는 같은 데이터를 찾아라
		//2. 찾은 데이터를 name1번에 저장을 해라
		//3. names1번에 저장된 데이터가 바뀐다.
		//4. names2번은 안바뀐다.
		//5. 같은 것만 저장해라 
		for (Object i : temp) 
		{
			System.out.println(i);
		}
		
		
	}
}
