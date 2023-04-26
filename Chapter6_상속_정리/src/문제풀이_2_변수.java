class PlayingCard {  

	int kind; 	 
	int num; 	 
	static int width; 	 
	static int height;  
	PlayingCard(int k, int n)
	{  
	kind = k;  
	num = n;  
	}
}
/*
 * 인스턴스변수 :		데이터를 각각 저장시에 사용 
 * 정적변수(공유변수) : 	공통으로 사용되는 변수 => 메모리가 1개만 생성
 * 지역변수 : 	메소드에서 선언되는 변수 (지역변수, 매개변수)
 * 			=> 반드시 메소드안에서만 사용 
 * 			=> 반드시 초기화 이후에 사용해야 한다. 
 * 			=> 메소드 블록이 끝나면 소멸된다. 메소드 블록 안에서만 유효하다.  
 */

class A
{
	int a=10;
	static int b=20;
	
	{
		a=100;
		System.out.println("a="+a);
	}
	
	static 
	{
		b=200;
		System.out.println("b="+b);
	}
	
	A(){
		a=1000;
		b=2000;
		System.out.println("a="+a+"b="+b);
	}
	
	
	
	
	
	
}

public class 문제풀이_2_변수 {
	
}



































































