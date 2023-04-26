package com_sist_exception;
/*
 * 
 * 	Class 타입변수명 = new 생성자():
 * 
 * 	 //구조체 : 다른 타입의 변수들의 묶음 자료형
 *	 //사용자 정의 자료형
 */

	class Student{
    int age;
    int score;
    String name;
	}

public class 나만의_new정리 {
	 public static void main(String[] args) {
	        Student s = new Student(); //우리가 만든 데이터 타입
	        s.age = 20;
	        s.score = 100;
	        s.name = "성연";
	        System.out.println(s.age + " / "+ s.score + " / " + s.name);
	    }
}
/*
1. new 연산자가 s 객체에 저장될 메모리 공간 할당

2. 생성자가 s 객체를 초기화

3. new 연산자가 새로 생성된 객체의 주소(reference) s 변수에 저장

4. s를 통해 Student에 접근 가능
*/
