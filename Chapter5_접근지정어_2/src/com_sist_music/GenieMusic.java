package com_sist_music;

// 데이터형 ( 기본형)

public class GenieMusic // extends Music
{
	private Music music=new Music(); 
/* 
 * extends로 상속을 해도 되지만 구지 상속을 안하고도 할 수 있다.
 * 1. 재사용
 * 	= 상속 => is-a
 * 	  기존의 클래스를 확장해서 사용
 *    			  ------ 
 *    			  extends
 *   => 자바는 단일상속만 가능하다. 
 *   		 ------
 *   	class A
 *   	class B extends A
 *   	class C extends JFrame ==> 라이브러리  
 *   	----------------------------------
 *   	class A
 *   	class B
 *   	class C extends A,B => 오류 (C언어)
 *   	C=A+B+알파 
 *   	
 *   	class A
 *   	class B extends A
 *   	class C extends B // B안에 A가 포함되어 있다.
 *   	// 단일상속이다. 하나씩 하나씩 포함되는 형태이다. 
 *   	----------------------------------
 *   	
 *   	class A(int a,b,c,d) 16byte
 *   	class B(int a,b)	 8byte
 *   	A --> B
 *   	--------	 A와 B는 다른 클래스 => 크기를 가지지 않는다. 
 *   	float > long
 *   
 *   	class A(int a,b)
 *   	class B(int c) extends A
 *   				   --------- int a,b,c
 *   	A > B => 크기는 상속을 내린애가 더 크다. 
 *   	
 *   1. 상속은 포함되어 있다는 느낌을 알자.!! A는 B에 포함되어 있고 B는 C에 포함되어 있으므로
 *   C에서는 A,B가 포함되어 있다.
 *   
 *   2. 모든 클래스는 Object의 상속을 받고 있다. Object는 모든 클래스의 최상위 클래스이다.
 *   ** 상속의 예외조건 
 *   	1. 생성자는 상속이 되지 않는다
 *   	2. static, private는 상속이 되지 않는다. 예외조건!! 
 *   	3. 초기화블럭도 상속이 안된다. 
 *   
 *   
 * 	= 포함 => has-a (********)	
 *    
 */

}
	
/*
 * 통으로 rank, state, title, sing, album, idcrement를 class로 저장하는 것이 좋지
 * 배열로 만들어서 일일이 index값으로 묶어주면 너무 복잡해진다. 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
	

