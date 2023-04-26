import java.util.Scanner;
public class 문제a16_11의배수 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력");
		int num=scan.nextInt();
		
		if(num>=10 && num<=99)
		{
			if(num%11==0)
				System.out.println(num+"은 십의 자리와 1의 자리가 같습니다.");
			else
				System.out.println(num+"은 십의 자리와 1의 자리가 다릅니다.");
		}else {
		System.out.println("값을 잘못 입력하셨습니다.");
		}
		
	}
}
