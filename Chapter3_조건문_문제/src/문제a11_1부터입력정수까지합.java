
// 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력
import java.util.Scanner;
public class 문제a11_1부터입력정수까지합 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int a=scan.nextInt();
		int sum=0;
		
		for (int i = 1; i <= a; i++) {
			sum+=i;
		}
		System.out.println("1~"+a+"까지의 합은 :"+sum);
	}
}
