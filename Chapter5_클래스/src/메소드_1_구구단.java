
/*
 * 
 * 	메소드
 * 		1) 구조화된 프로그램 (문장을 기능별로 나눠서 작업)
 * 		2) 반복 제거 // 반복을 제거해서 최적화 시켜준다. => 자동 호출 Spring(AOP)
 * 		3) 메소드는 한 개의 기능만을 수행한다. 
 * 		------------------------------------------------------------
 * 	리턴형 : 처리 후 결과 값 (한 개만 설정이 가능)
 * 	매개변수 : 사용자가 요청하는 값 (여러ㅐ 보낼 수 있다.)
 * 	 		 => 3개 이상이면 []. class
 * 
 *	형식)
 *		리턴형 메소드명(매개변수)
 *					------ 갯수하고는 상관이 없다.(사용자의 요청값)
 *		---- ------ => 한 자바 파일안에 모든 메소드명이 달라야 한다.(X)
 *					   같은 메소드명이 있을 수도 있다.(매개변수가 틀리면 된다.)
 *		요청 결과값 (한 개만) ==> 여러 개 : int[], class, 
 *
 *		** 사용자가 요청한 값(매개변수)를 받아서 처리 후에 결과값을 보내주거나		
 *		   화면에 출력해준다. ------------- 입력, 마우스 클릭, 버튼 클릭...
 *				
 *		static vs instance
 *		static = 공용으로 사용한다.
 * 		instance = 각자 개개인이 사용한다											
 * 
 *			정수 두개를 보내고 더한 값을 받는다.
 *		   	=> return a+b
 *			=> System.out.println("a+b")						
 *			
 *		main메소드에서는 가급적이면 => 연결 (변수 선언X)
 *		
 *	Public static void main() {
		System.out.println();
			
		}
	public static void main(int a) {
		
		}
// 	 메소드명이 같은게 잇을 수도 있다. 같이 만든것 처럼 보이지만
//	 전부 따로 만든 것이다. 한 자바파일에서 자바파일이 달라야 한다. 
	}
 * 
 * 
 */
import java.util.Scanner;
public class 메소드_1_구구단 {
	
	
	static void gugudan(int dan)
	{
		for (int i = 1; i <= 9; i++)
		{
		System.out.printf("%d*%d=%d\n",dan,i,dan*i);	
		}
	}
	
	
	static void process() {
		Scanner scan=new Scanner(System.in);
		System.out.println("단을 입력:");
		int dan=scan.nextInt();
		
		gugudan(dan);
	}
	
	
	public static void main(String[] args) {
		process();
	}
}











