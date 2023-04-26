/*
 *	메소드 사용하는 방법 
 * 	=프로그램
 * 		1. 재사용
 * 		2. 가독성 : 보기 편하다. (유지보수) : 단락 나누기
 * 		3. 반복 제거 : 소스양을 줄인다.
 * 		* 모든 프로그램 => 메소드 제각
 * 		1. 사용자 입력
 * 		2. 사용자 요청 처리 = scanner
 * 		3. 결과값 출력
 * 
 * 
 */
// 1. 3개의 정수를 받아서
// 2. 총점, 평균, 학점 
/*
 * 		메소드명(매개변수값)		
 * 		호출		
 * 	
 *		메소드 호출
 *		--------
 *		리턴형이 있는 경우 ====> 데이터형 변수명=메소드몀()
 *		int add(int a, int b)
 *		{
 *			return a+b;
 *		}
 *
 *		int c=add(10,20)
 *				  a , b ==> int c=30
 *		
 *
 * 		리턴형이 없는 경우 (void) ====> 메소드명()
 *		void gugudan() 	
 * 		{
 * 			==구구단 출력
 * 		}
 * 		gugudan() // 반환값이 없기 때문에 그냥 출력해버린다.
 * 		
 * 		=> 메소드를 호출하면 메소드 전체를 수행하고 => 호출된 위치로 다시 돌아온다.
 * 
 * 		main()
 * 		{
 * 			1
 * 			2
 * 			3
 * 			gugudan() ==> 7 8 9 10 11 // (출력순서) 1 2 3 7 8 9 10 11 4 5 6 (출력종료)
 * 			4 == 여기 수행시작 
 * 			gugudan() ==> 7 8 9 10 11 // (출력순서) 1 2 3 4 7 8 9 10 11 5 6 (출력종료)
 * 			5
 * 			6 
 * 		}
 * 		void gugudan()
 * 		{
 * 		 7
 * 		 8
 * 		 9
 * 		 10
 * 		 11
 * 		}
 * 
 * 		** return은 항상 마지막에 있다.
 * 		   중간에 있는 경우도 있다. (메소드 종료)
 * 		void find(String fd)
 * 		{
 * 			if(fd==null)
 * 				return; // 처음 return까지만 수행하고 빠져 나간다.
 * 			-----		// 아래 값을 출력하지 않고 빠져나간다. (중간 종료)
 * 			-----		// break처럼 쓰인다. 
 * 			-----
 *			return;; 	
 */

import java.util.Scanner;
public class 클래스구성요소_평균_학점_스코어구하기 {
/*
 *	메소드
 *		1) 인스턴스 메소드 => 객체 생성시마다 따로 저장 
 *			class A
 *			{
 *				void display(){}
 *			{
 *			A a = new A() ==> display()
 *			A b = new A() ==> display()
 *			A c = new A() ==> display()
 *		2) 정적 메소드 => 한 개의 공간에만 저장이 된다. (JYM에 의해서 메모리에 자동 저장)
 *			static // 사용하기가 편리하다.
 *		3) 추상 메소드 : 선언만 하는 메소드 (추상클래스, 인터페이스)
 *			abstract
 *		4) 종단 메소드 : 수정이 불가능한 메소드 
 * 			final
 * 		5) 종단 메소드 : 수정이 불가능한 메소드 
 * 			final
 * 
 */
	static int input(String subject)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(subject+"입력:");
		int value=scan.nextInt();
		return value;
		
	}
	
	static int totalGesan(int kor,int math,int eng,int phy,int h1)
	{
		return kor+eng+math+phy+h1;
	}
		//아래 다섯개의 변수를 각자 생성한 것을 하나의 문장으로 합친 것이다.
		//식을 만들어준 뒤 필요할 때마다 호출하는 식으로 사용한다.
	
	static double avgGesan(int total)
	{
		return total/5.0;
	}
	
	
	static char scoreGesan(double avg) {
		char score='A';
		switch((int)(avg/10))
		{
		case 10:
		case 9:
			score='A';
			break;	
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
		break;
		default:
			score='F';
		}
		return score;
	}
	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("국어입력");
//		int kor=scan.nextInt();
//		
//		System.out.println("영어입력");
//		int eng=scan.nextInt();
//		
//		System.out.println("수학입력");
//		int math=scan.nextInt();
//		
//		System.out.println("물리입력");
//		int phy=scan.nextInt();
//		
//		System.out.println("국사입력");
//		int hi=scan.nextInt();
		// 반복 구간이 나왔다. 메소드는 반복을 제거할 떄 사용된다.
		
		int kor=input("국어");
		int eng=input("영어");
		int math=input("수학");
		int h1=input("국사");
		int phy=input("물리");
		
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("물리:"+phy);
		System.out.println("국사:"+h1);
		
		int total=kor+eng+math+h1+phy;
		// System.out.println("총점:"+total);
		System.out.println(totalGesan(kor, math, eng, phy, h1));
		// int[] 
		
		double avg=total/5.0;
		
		System.out.println("총점"+total);
	
		System.out.println("평균은"+avgGesan(total));
		
		System.out.println("학점:"+scoreGesan(avg));
	
//		 totalGesan => avg(avgGesan) => score 이런 식으로
//		 계속해서 이어진다면 return을 통해서 값을 아래로 내린다.
//		 만약 위처럼 계속 이어지는 값이 아니라면 return이 아닌 void를 사용해도 됀다.

	}
}





































