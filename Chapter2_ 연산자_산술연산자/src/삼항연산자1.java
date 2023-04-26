/*
 * 
 * 
 * 
 */


public class 삼항연산자1 {
	public static void main(String[] args) {
		int no=(int)(Math.random()*2);	// 0.1이 나온다 0.0~0.99 => 0.0~1.98 
		char c1=(char)((Math.random()*26)+65); // 소문자
		char c2=(char)((Math.random()*26)+97); // 대문자
		char res=no==0?c1:c2; // 0이면 소문자 1이면 대문자
		System.out.println(res);
		System.out.println(res>='A' && res<='Z'?
				res+"는(은) 대문자입니다":res+"는(은) 소문자입니다");
		
		
		
	}
}
