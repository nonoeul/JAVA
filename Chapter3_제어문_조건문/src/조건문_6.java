// 년도를 입력을 받아서 윤년여부 확인
// 4년마다
// 100년마다 제외
// 400년마다 
import java.util.Scanner;
public class 조건문_6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("년도입력:");
		int year=scan.nextInt();
		
		
		if((year%4==0) && (year%100!=0)||(year%400==0))
			System.out.println(year+"년도는 윤년입니다.");
		if(!((year%4==0) && (year%100!=0)||(year%400==0)))
			System.out.println(year+"년도는 윤년이 아닙니다.");
		
	
	
	
	
	}
}
