import java.util.Scanner;
public class 문제4_윤년 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("연도를 입력해주세요");
	int year=scan.nextInt();
	
	if((year%4==0 && year%100!=0) || (year%400==0)) {
		System.out.println(year+"은 윤년입니다.");
	} else {
		System.out.println(year+"은 윤년이 아닙니다.");
	}
		
	
	
	}	
}
