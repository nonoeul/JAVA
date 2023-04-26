// 사용자 입력을 받아서 구구단 =>3
import java.util.Scanner;
public class 반복문_5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("단 입력");
		int dan=scan.nextInt();
		System.out.println("====="+dan+"단=====");
		for (int i = 1; i < 10; i++) 
		{
		System.out.printf("%d*%d=%d\n",dan,i,dan*i);;	
		}
		System.out.println(dan+"단 구구단을 출력했습니다");
		
		
	}
}
