/*
 * << , >>
 *  
 =<<
 *  10 << 2
 * 	1010
 * 	1010(0)(0)
 * 	=> 101000  => 40
 *	>> 이진법 0을 뒤에 2개를 채워라
 *	
 *	7<<3
 *	111 + 000
 *	111000	=> 56
 *	<< 즉 숫자를 이진법으로 바꾼뒤 < 갯수만큼 뒤에 0을 추가해라!
 *	
 *	8<<2
 *	100000 => 32
 *
 *	계산법
 *	x<<y ==> x*2^y
 *
 *	9<<3
 *	9*2^3 ==> 72
 *
 =>>
 *	10>>2
 *	1010
 *	>> 숫자를 이진법으로 바꿔준뒤 > 갯수만큼 뒤에 쪽을 지워준다.
 *	1010 => 10 => 2
 *
 *	15>>3
 *	1111 ==> 1 = > 1(0)
 *
 *	계산법
 *	x>>y ==> x/2^y
 */ 




public class 쉬프트연산자 {
	public static void main(String[] args) {
		System.out.println(10<<2);
		System.out.println(7<<3);
		System.out.println(8<<2);
		System.out.println(9<<3);
		
		System.out.println(72>>3);
		
		
		
	}
		
}
