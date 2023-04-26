import java.util.Scanner;

//달력
public class 메소드조립법_2_달력 {
	public static void main(String[] args) 
		
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		
		System.out.print("월 입력");
		int month=scan.nextInt();
		// 사용자 입력 기능 => 메소드 
		
		// 전년도까지의 총날수
		int total=(year-1)*365
				 +(year-1)/4	// 4년마다 윤년이다. 하루가 더 많다
				 -(year-1)/100	// 100년마다 윤년이 한 개가 없다. 하루가 적다. 
				 +(year-1)/400;
		// 400년마다 윤년이다. 하루가 더 많다
		int[] lastday= {
				31,28,31,30,31,30,
				31,31,30,31,30,31	
		};
		
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		
		// 전달까지의 총날 수
		for (int i = 0; i < month-1; i++) 
		{
			total+=lastday[i];
		}
			
		total++; // 매월 1일자
		
		// 요일 구하기
		int week = total%7; 
		
		System.out.printf("%d년도 %월\n",year,month);
		String[] strWeek= {"일","월","화","수","목","금","토"};
		
		for (int i = 0; i < strWeek.length; i++) 
		{
			System.out.println(strWeek[i]+"\t");
		}
			System.out.println("\n");
		
		// 첫 주
		for (int i = 0; i < lastday[month-1]; i++)
		{
		if (i==1) // 맨처음 1번  
			{
				for (int j = 0; j < week; j++) 
				{	
				System.out.print("\t"); // \t가 공백을 뛰는 것이다.
				}
			}
				System.out.printf("%2d\t",i);
				week++;
				if(week>6)
				{
					week=0;
					System.out.println();
				}
		}
	}
}



































































