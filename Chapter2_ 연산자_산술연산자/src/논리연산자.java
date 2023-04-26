// && ||
/*
 * (조건) && (조건)
 * ----		----
 *		----
 *		결 과
 *	&& => 범위나 기간에 포함 
 *	---------------------
 *	true 	true  = true
 * 	---------------------
 * 	true 	false = false
 * 	---------------------
 * 	false 	true  = false
 * 	---------------------
 * 	false 	false = false
 * 	---------------------
 * 
 * 	|| => 범위나 기간을 벗어난 경우 : 행사
 * ---------------------
 *	true 	true  = true
 * 	---------------------
 * 	true 	false = false
 * 	---------------------
 * 	false 	true  = false
 * 	---------------------
 * 	false 	false = false
 * 	---------------------
 * 
 * 	=> 효율적 연산
 * 		() && ()
 * 		false
 * 		|| && ||
 * 		true
 * 		// 앞에 연산에서 값이 결정나면 뒤에 연산을 할 필요가 없다
 * 
 *		int a=10
 *		int b=9
 *
 * 		(a<b) && ++b==a
 * 		// 앞에 a<b가 false가 나왔기 때문에 뒤에는 연산조차 하지않는다.
 * 		// 그러므로 b값은 증가하지 않는다. 다음 줄에도 b값은 그대로
 *
 */

public class 논리연산자 {
	public static void main(String[] args) {
		int a=10;
		int b=9;
		boolean bCheck = (a<b) && ++b==a;
		System.out.println(bCheck);
		System.out.println("b="+b);
		
		boolean bbCheck = (a<b) || ++b==a;
		System.out.println(bbCheck);
		System.out.println("b="+b);
		
		int A=100;
		int B=99;
		boolean ACheck = (A>B) && (B==A);
		System.out.println(ACheck);
		System.out.println("B="+B);
		
		
		// ~부터 ~까지 범위에 속해있냐 쓸때 and연산 &&
		char c=(char)((Math.random()*26)+65);
		boolean Check= c>='A' && c<='Z';
		System.out.println(Check);
		
		// 대소문자 구분해야한다.
		char c1=(char)((Math.random()*26)+65);
		boolean Check1= c1>='a' && c1<='z';
		System.out.println(Check1);
		
	System.out.println("------------------");
		
		char sex='M';
		int score=87;
		
		boolean mCheck= (sex=='M' && score<=80);
//							true		false = false
		System.out.println(mCheck);
		
		mCheck= (sex=='M' || score<=80);
//					true		true = true
		System.out.println(mCheck);
		
	System.out.println("------------------");
		
		int o=10;
		boolean oCheck = o%2==0 && o<2;
		System.out.println(oCheck);
		
		oCheck = o%2==0 || o<2;
		System.out.println(oCheck);
	
	System.out.println("------------------");
	
		int year=2023;
		boolean yCheck=((year%4==0 && year%100!=0)||(year%400==0));
//							false		false			false
		System.out.println(yCheck);
		
		//윤년계산법. 
		int year4=2024;
		boolean y4Check=((year4%4==0 && year4%100!=0)||(year4%400==0));
//							true			true			false
		System.out.println(y4Check);
		
	}
}



















