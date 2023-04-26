/*
 * 피연산자 / 연산자
 * ---------연산 대상
 * 
 * 피연산자 1개 : 단항연산자
 * 피연산자 2개 : 이항연산자
 * 피연산자 3개 : 삼항연산자
 * 
 * 	1. 단항연산자
 * 	   = 증감연산자 ( ++ , -- ) 한 개 증가/한 개 감소 => 반복문
 * 		int a =10;
 * 		a++;
 * 		=> 11
 * 		int b =10;
 * 		b--;
 * 		=> 9
 * 
 * 	= 부정연산자 (boolean만 사용이 가능) 
 * 		boolean b=true;
 * 		!b;
 * 		false
 * 		=====> 예약가능한 날
 = 형변환연산자 (데이터형)
 * 		(int)10.5 ==> 소수점 제거 10
 * 		(char)65 ==> 'A'
 * 		==========================downcasting
 * 		(double)10.5 ==> 10.0
 * 		(int)'A' ==> 65
 * 		==========================upcasting(자동형변환)
 = 반전연산자 ( 양수 --> 음수 ) ~물결표시
 * 		 10.5+10=20.5 ==> 데이터형이 동일할때 연산이 가능
 * 		 ---
 * 		 10.0 ==> 20.5
 * 
 * 		'A' + 10
 * 		===
 * 	 	65 + 10 ==> 75
 * 		int 이하 데이터 연산시에 결과값이 int이다
 * 		byte/short/char 연산시 결과값이 int이다. 
 * 
 * 		int + double => double
 * 		char + long => long
 * 		int + long  => long
 * 		long + double => double
 * 		
 * 		byte + char ==> int
 * 		
 = 전치연산자 : 먼저 증가/감소
 * 		++a
 * 		= 전치연산자 : 먼저 증가/감소
 * 		a++
 * 
 * 		int a=10;
 * 		int b = ++a;
 * 		1. a값에 먼저 1을 더해주고 a=11
 * 		2. a=b b에다가 a를 대입  b=11
 * 		a=11 / b=11
 * 
 * 		int a=10;
 * 		int b = a++;
 * 		1. a=b b에다가 a를 대입  b=10		
 * 		2. a값에 먼저 1을 더해주고 a=11
 * 		a=11 / b=10
 * 
 = 부정연산자 (!) ==> true / false
 * 			!true => false
 * 			!false => true
 * 			== , != , !(조건)
 * 
 = 형변환자 
 * 		10.5+10.5 ==> 21.0
 * 		(int)10.5+(int)10.5 ==> 20
 * 		(int)(10.5+10.5) ==> 21
 * 		아래 숫자 괄호가 우선순위다. 더하기연산자 먼저처리!!
 * 		
 * 		큰거 ----> 작은거는 자동으로 바꾼다.		
 * 		작은거 ----> 큰거는 억지로 바꿔줘야한다. (형변환 연산자)
 * 		=> int이하 연산자는 int	
 * 		char + double = double
 * 		char + char = int
 * 		char + byte = int
 * 		==> char는 연산이 되면 정수로 바뀐다.
 * 
 = 이항연산자
 *		산술연산자 : + , - , * , / , %
 *		=> +	
 *		   산술연산, 문자열결합	
 *		=> /	
 *		   정수/정수=정수 ==> 10/3 => 3
 *		   정수/실수 ==> 10/3.0
 *		   0으로 나누면 오류발생
 *		=> %
 *			10%2 ==> 0
 *			11%2 ==> 1
 *			-------------
 *			-5%2 ==> -1
 *			 5%-2 ==> 1
 *			-5%-2 ==> -1
 *		    -------------왼쪽편 부호만 따른다. 오른쪽 부호는 신경 xx
 *
 *		=> + : 문자열 결합
 *			"7"+77 ===> "777"
 *			"7"+"7"+"7" 
 *			
 *			"77"+7 ===> "777"
 *			
 *			7+7+"7" ===> "147"
 *			
 *			7+"7"+7+7 ===> "147"
 *			"77"+7
 *			"777"+7
 *			"7777"
 *
 *			7+"7"+(7+7)
 *			"77"+14 ==> "7714"
 *			// A+"7"+B A,B 앞뒤로 문자열을 합친다.!!
 */


public class 연산자의종류 {
	public static void main(String[] args) {
	System.out.println((int)'A');		
	
	byte b=10;
	byte c=10;
	// byte d=b+c; 오류가 나온다 why? int이상으로 받아야한다.
	// int, long, double로 받을 수 있다.
	int d=b+c;
	System.out.println(d);
	System.out.println(~10); // -11이 나온다
	// 반전연산자 양수 -> 음수, +1을 해주고 음수표현해준다.
	
	int aa=10;
	int bb=++aa;
	System.out.println("aa="+aa);
	System.out.println("bb="+bb);
	
	int aaa=10;
	int bbb=aaa++ + aaa++; 
//			10		11
	System.out.println(bbb);
	
	int q=10;
	int w=++q + ++q; // 맨처음 a1이 11로 더해지고 뒤에 a1가 한번 더 더해져 12 
//			11		12
	System.out.println(d);
	
	int m=10;
	int	n=m++ + ++m;
	System.out.println(n);
	
	int A=10;
	int B=A++ + A++ + ++A + A++;
//		  10     11    13    13
			System.out.println(B);
	
	int AA=10;
	int BB=AA++ + AA++ + AA++ + AA++;
//			10		11		12		13
		System.out.println("BB="+BB);
	
	int C=10;
	int D=C-- + C-- + --C;
//		  10	9		7
	System.out.println(D);
	
	
	boolean bCheck=false;
	System.out.println(bCheck);  // true
	System.out.println(!bCheck); // false
	
	int M =(int)(Math.random()*100)+1; //math.random 0.0~0.99까지 랜덤출력
	//1. (Math.random()*100)+1 먼저계산
	//2. int 적용
	System.out.println(M);
	
//	System.out.println(10/0); // 0 밑으로 값들이 출력X 종료시켜버린다.
	System.out.println(10/3);  // 3 정수만
	System.out.println(10/3.0); // 3.33... 정수 소수점까지!
	System.out.println(10/0); 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
