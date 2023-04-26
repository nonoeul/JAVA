import java.util.Scanner;
public class 문제5 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		System.out.println("점수입력");
		int num1=scan.nextInt();
		
		//
		if(num1>=0)
		{
		System.out.println("양수입니다");
		System.out.println("사용자입력한 수는:"+num1);
		}
		
		if(num1<0)
		{
		System.out.println("음수입니다");
		System.out.println("사용자입력한 수는:"+num1);
		}
		
	}	
}
