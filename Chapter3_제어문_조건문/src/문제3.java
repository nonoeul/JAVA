import java.util.Scanner;
public class 문제3 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("학년을 입력하세요");
		int num1=scan.nextInt();
		System.out.println("점수를 입력하세요");
		int num2=scan.nextInt();
		
		//1~4학년일때 
		if(num1>0 && num1<5) {
			System.out.printf("학생은 %d학년입니다%/n",num1);
		
		if(num1==4 && num2 >= 70) 
			System.out.println("합격");
		if(num1==4 && num2 < 70) 
			System.out.println("불합격");
		if(num1<4 && num2 >= 60) 
			System.out.println("합격");
		if(num1<4 && num2 < 60) 
			System.out.println("불합격");
				
		}
		else
			System.out.println("학년을 다시 입력해주세요");
		
		
	
		
		
	}
}
