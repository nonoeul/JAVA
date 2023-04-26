/*
 * 	(조건)?값1:값2
 * 	----------
 * 		true => 값1
 * 		false => 값2
 * 		=======> if~else
 * 		System.out.println(i==j ?"같다":"다르다")
 * 
 */
import java.util.Scanner;
public class 삼항연산자 {
	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
//							  --메모리저장--
			System.out.println("정수 입력:");
			int num=scan.nextInt();
			System.out.println(num%2==0?"짝수입니다":"홀수입니다");
			
			
			/* 위에 scanner과 같은 문이다.
			  if(num%2==0)
			{
				System.out.println("짝수입니다");
			}
			else
			{
			System.out.println("홀수입니다");	
			}
			*/	
			
	}
}
