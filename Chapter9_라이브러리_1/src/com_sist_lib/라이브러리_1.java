package com_sist_lib;
/*
 * 	??1. java.lang??
 * 		||Object|| 모든 클래스의 상위 클래스 (모든 클래스는 상속 Object를 받는다)
 * 			
 * 			기능(메소드)
 * 			1. toString() : 자주 사용이 된다. 객체를 문자열화 시킨다. 
  			2. clone : 객체복제
  						참조 : 같은 메모리를 이용 [얕은 복사]
  						복제 : 다른 메모리를 제작 [깊은 복사]   		
   			3. finalize : 소멸자 함수도 존재한다. (호출이 되면 메모리가 해제가 된다.) 
   							// 호출이 안되면 메모리가 해제된다. 
   			4. equals : 객체를 비교할때 사용 
   			    			
   		||String|| 문자열을 저장하고 관리하는 클래스 
   			1. equals() : 내용비교
   			==> "=="는 주소값 비교
   			2. startsWith : 시작문자열이 같은 경우
   			3. endWith 	: 끝나는 문자열이 같은 겨우 
   			4. contains : 포함된 문자열
   			5. replace : 문자나 문자열을 변경할 때 
   			6. replaceAll :
   			7. trim : 좌우 공백삭제 
   			8. split : 특정 단어별로 나눠서 저장 => String[]
   			9. valueOf : 모든 데이터형을 문자열로 변경해서 사용 
   			10. Wrapper : 기본형 클래스 Byte, Integer, Double, Boolean
   			11. System
   			12. Math
   			13. Thread
   				
  	??2. java.util??
 			1. Date / Calendar
 			2. StringTokenizer
 			3. Collection(자료구조) = 메모리상에 있는 데이터를 쉽게 관리할 수 있게 해준다. 
 				1.	list \ ArrayList, QueueLinkedList, Vector, Stack
 				2.	map  \ HashMap, Hashtable
 				3.	set  \ HashSet, TreeSet
 			
 			
 			
 			
 * 	3. java.text
 * 	4. java.io
 * 	5. java.net
 * 	6. java.sql
 * 	------------------기본 라이브러리 
 * 	7. javax.xml
 * 	8. javax.servlet.http
 * 	9. 외부 라이브러리 (자바에서 지원하는 것이 아니라 업체)
 * 		Open API = Jsoup , simple-json : mvnrepository.com 
 * 
 * 
 */



class A
{
	int a=10;
	int b=20;
	
}

public class 라이브러리_1 {
	public static void main(String[] args) {
		
		A aa=new A();
		System.out.println(aa.toString());
		System.out.println(aa);
		
		
		
		
	}
}
