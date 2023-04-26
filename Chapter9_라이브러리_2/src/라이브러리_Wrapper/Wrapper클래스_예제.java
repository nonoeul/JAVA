package 라이브러리_Wrapper;
/*
 * 	자바의 자료형은 기본타입,참조타입으로 나눠진다.
 * 	
 * 	기본타입 char,int,float,double,boolean등이 있다.
 * 	1. 자바는 모든 기본타입의 값을 갖는 객체를 생성 가능
 * 	2. 래퍼 클래스로 감싸고 있는 기본 타입값은 변경할 수 없다.
 * 
 * 
 */
public class Wrapper클래스_예제 {
	public static void main(String[] args) {
		
	int n1=10;	// 값형
	Integer n2=new Integer(20);
	
	System.out.println(n1+20);
	System.out.println(n2+20);
	
	}
}
