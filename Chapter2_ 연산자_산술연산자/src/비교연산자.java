/*
 * 
 *	
 *	단항연산자 (++ , --)
 *	-> 왼쪽에서 오른쪽 앞에서 뒤로
 *	
 *	산술연산자
 *	-> 왼쪽에서 오른쪽 앞에서 뒤로
 *	
 *	대입연산자,삼항연산자
 *	<- 오른쪽에서 왼쪽 뒤에서 앞으로
 *	
 *	int a=10
 *	int a=b+c	
 *	===============> () : 최우선순위
 *		
 *	비교연산자 => 결과값 (boolean) => true/false
 *	== 같다
 *	!= 같지 않다
 *	< 작다
 *	> 크다
 *	<= 작거나 같다
 *	>= 크거나 같다
 *
 *	7==6 false
 *	7!=6 true
 *	--------- byte, int, short, long, double, float, boolean,char
 *	"a"=="a" => equals() ***
 *	'A'<'B' 65<66 ==> true
 *	10>5 true
 *	10<=10 true 10<10 || 10==10
 *  10>=0 true
 */


public class 비교연산자 {
	public static void main(String[] args) {
		
	int a=(int)(Math.random()*100)+1;
	/*				--------
	 * 				1 (0.0~0.99)
	 * 						------
	 * 						2. 0~99.0
	 * 		-------
	 * 		3.int(0~99.0)
	 * 								----
	 * 								4.1~100
	 */
	
		int b=(int)(Math.random()*100)+1;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//1. ==
		boolean b1=a==b;
		//euqals 대상자체
		//== 주소값비교
		System.out.println("a==b:"+b1);
		//2. !=
		b1=a!=b;
		System.out.println("a!=b:"+b1);
		b1=a<b;
		System.out.println("a<b:"+b1);
		b1=a>b;
		System.out.println("a<b:"+b1);
		
		b1=a<=b;
		System.out.println("a<=b:"+b1);
		b1=a>=b;
		System.out.println("a<=b:"+b1);
		
		
		
	}
}
