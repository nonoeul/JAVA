package com.sist.main4;
// main => 조립 
/*
 * 	1. 데이터형 (변수 묶음) => 사용자 정의 데이터형 
 * 	2. 기능을 가지고 있는 클래스 제작 (메소ㄷ,)
 * 	3. 사용자에게 보여준다(조립) => 웹 (메인페이지)
 * 
 */
import com.sist.main3.Student;
// 패키지명이 다르면, 다른 패키지를 사용하기 위해서는 import를 붙여준다. 
import java.util.Scanner;

public class StudentSystem {
	private Student[] std=new Student[3]; // 배열만 만들고 
/* 
 * 메모리 할당이 안되있다. 배열을 만들면 배열만 만들어준거지 메모리할당이 안되있으므로 사용할 수 없다 
 * Student[] std=new Student[3]; 배열을 만들면 std안에 3개의 null값을 갖는 공간이 생긴다.
 * 그래서 new를 통해서 null값안에다가 주소값 메모리를 할당해줘야 하낟.
 * 
 */
	
	
	// 1. 학생 초기화
	/*
	 *	1. 명시적 초기화 => 객체 생성시 모든 객체의 값이 동일하다.
	 * 	2. 생성자 이용
	 * 	3. 초기화 블록
	 * 	4. 메소드 
	 * -------------------------- 입력값을 받거나 외부에 데이터를 읽거나 // 크롤링 , 파일
	 */
	
	public void init()
	{
		Scanner scan=new Scanner(System.in);
		for (int i = 0; i < std.length; i++) 
		{
			std[i]=new Student(); // 배열은 모든 공간이 null값이다 메모리공간을 채워줘야한다.
//			------- 메모리 연결해주는 부분 ------- 
			System.out.println("학번 입력:");
			std[i].setHakbun(scan.next());
			System.out.println("이름 입력:");
			std[i].setName(scan.next());
			System.out.println("국어 영어 수학 입력");
			std[i].setKor(scan.nextInt());
			std[i].setEng(scan.nextInt());
			std[i].setMath(scan.nextInt());
		}
	}
	
	// 1-1. 출력
	public void display()	// default => com.sist.main4안에서만 접근이 가능 
					 		// com.sist.main5 
/*
 * 메소드는 무조권 public이라고 볼 수 있다. 왜냐하면 메소드는 어디든지 갖다써야하기 때문에
 * public으로 다양한 곳에 쓸 수 있게 protected처럼 다른 클래스에서 사용할 수 없게 막아두면 안된다.
 */
	{
		for(Student s:std)
		{
			System.out.println(s.getHakbun()+" "
					+s.getName()+" "
					+s.getEng()+ " "
					+s.getKor()+ " "
					+s.getTotal()+ " "
					+s.getAvg() + " "
					+s.getScore() + " "
					+s.getRank() + " "
					);
			
		}
		
		
	}
	// 2. 평균 구하기
	public void stdAvg()
	{
		for (int i = 0; i < std.length; i++) 
		{
			std[i].setAvg(std[i].getTotal()/3.0); // 비공개
			// std[i].avg=std[i].getTotal()/3.0	  // 공개
		}
	}
	
	
	// 3. 총점 구하기
	public void stdTotal()
	{
		for (int i = 0; i < std.length; i++) 
		{
			std[i].setTotal(std[i].getKor()+std[i].getEng()+std[i].getMath());
		}
	}
	
	// 4. 학점 구하기
	public void stdScore()
	{
		char c='A';
		for(int i=0;i<std.length;i++)
		{
			switch((int)(std[i].getAvg())/10)
			{
			case 10:
			case 9:
				c='A';
				break;
			case 8:
				c='B';
				break;
			case 7:
				c='C';
				break;
			case 6:
				c='D';
				break;
			default:
				c='F';
			}
			std[i].setScore(c);
			
		}
		
	}
	
	// 5. 등수 구하기
	public void stdRank()
	{
		for (int i = 0; i < std.length; i++) 
		{
			std[i].setRank(1);
			for (int j = 0; j < std.length; j++) 
			{
				if (std[i].getTotal()<std[j].getTotal())
				{
					std[i].setRank(std[i].getRank()+1);
				}
			}
		}
	}
}





























