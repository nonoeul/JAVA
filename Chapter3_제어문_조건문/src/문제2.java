import java.util.Scanner;
public class 문제2 {
	public static void main(String[] args) {
		
	
	Scanner scan =new Scanner(System.in);
	
	System.out.println("정수를 입력하세요");
	int num=scan.nextInt();
	
	if(num%3==0)
		System.out.println("3의배수입니다");
	else
		System.out.println("3의배수가 아닙니다");

	}
}

