import java.util.Scanner;
public class 문제2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("값을 입력해주세요");
		int a=scan.nextInt();
		
		if(a%3==0) {
			System.out.println(a+"는 3의 배수입니다.");
		} else {
			System.out.println(a+"는 3의 배수가 아닙니다.");
		}
		
		
		
		
	
	}	
}
