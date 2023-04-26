import java.util.Scanner; // 라이브러리 사용자 정의
// 클래스가 다른 폴더에 저장된 경우
// import가 생략이 가능 라이브러리
// Math,String,Object...
/*
 * 	java.util
 * 	java.text
 * 	java.io
 * 	java.net
 * 	---------
 * 	java.sql ==> 1.0
 * 	javax ==> 1.2 (web)
 * 	기타 ==> 외부에서 만든 라이브러리 ==> org/com
 *  
 */
public class 문제1 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력");
		int a=scan.nextInt();
		
		if(a>=0){
			System.out.println(a+"는 양수입니다.");
		}else {
			System.out.println(a+"는 음수입니다.");
	
		}
	}
}