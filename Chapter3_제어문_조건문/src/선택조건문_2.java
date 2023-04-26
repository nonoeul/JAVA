

// 한 개의 정수를 받아서 60이상이면 합격 그렇지 않으면 불합격
import java.util.Scanner;
public class 선택조건문_2 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int num=scan.nextInt();
		
		if(num>=60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		
	}
}
