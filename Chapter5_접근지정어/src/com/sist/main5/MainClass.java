package com.sist.main5;
/*	main = 조립
 * 	
 * 		1. 데이터형 (변수 묶음) => 사용자 정의
 * 		2. 기능을 가지고 있는 클래스 제작 (메소드)
 * 		3. 사용자에게 보여준다(조립) => 웹 (메인페이지)
 * 
 */

import com.sist.main3.*;
import com.sist.main4.*;

public class MainClass {
	public static void main(String[] args) {
		
		StudentSystem ss=new StudentSystem(); 
		ss.init();
		ss.stdTotal();
		ss.stdAvg();
		ss.stdScore();
		ss.stdRank();
		ss.display();
/*
 * 		new가 빠지면 메모리에 저장이 안된다.
 * 		메모리에 할당이 안된다. 
 * 		
 * 		1. 변수 = (개인마다 가지고 있는 속성 => 함부로 접근하면 안된다)
 * 		private = 은닉화
 * 		2. 요청 = 개인정보공개(접근이 가능하게 만든다)
 * 				 = getter / setter 
 * 				 = name => setName, getName 뒤에 변수명이 붙는다. 읽기/쓰기만 가능하면 된다.
 * 		3. 메소드를 이용해서 다른 메소드에 접근한다 (public)
 * 		4. 다른 클래스에서 메모리를 할당 해줄 수 있다. 생성자 : public
 * 		
 * 
 */
		
		
	}
}
