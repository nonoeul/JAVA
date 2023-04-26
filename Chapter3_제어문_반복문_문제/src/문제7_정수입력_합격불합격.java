import java.util.Scanner;

public class 문제7_정수입력_합격불합격 {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int a=scan.nextInt();
		
		if(a>=60)
			System.out.println("합격");
		else
			System.out.println("불합격");
			
	}
}
