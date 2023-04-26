import java.util.Scanner;

public class 배열응용_a11_ {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("연도 입력해주세요");
		int year=scan.nextInt(); // 값을 입력
		
		System.out.print("월 입력해주세요");
		int month=scan.nextInt(); // 값을 입력
		
		System.out.print(year+"년"+month+"월");
		
		System.out.println("\n");
		
		char[] strWeek= {'일','월','화','수','목','금','토'};
		for (char c:strWeek) // 향상된 for
			
		{
			System.out.print(c+"\t");
		}
		System.out.println();
		// 1. 1년도 1월 1일부터 ~ 전년도 (2022.12.31)
		int total=(year-1*365) // 전년도 날짜를 구한다.
				+(year-1)/4 // 4년마다 366일이 있다. 윤년
				-(year-1)/100 // 100년마다 1번씩 윤년이 제외된다.
				+(year-1)/400; 
		// 2. 전달까지의 날 수 (2023.03.31)
		int[] lastday= {31,28,31,30,31,30,   // 1~6월
						31,31,30,31,30,31}; // 7~12월 
		// 윤년 조건일떄 28이 29만 바뀌는거다.
		// 운년 조건마다 28->29일로 일년이 366이 되는거다.
		
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastday[1]=29;
			else
			lastday[1]=28;
					
		for (int i = 0; i < month-1; i++) 
		{
			total+=lastday[1];
		}
		// 3. +1 ==> 4월 1일자 요일
		total++;
	
		// 요일 구하기
		int week=total%7;
		
		// 달력 출력
		for (int i = 1; i < lastday[month-1];i++) // lastday는 0부터 시작한다. 1일~31까지 출력해야 한다. 
		{
			if(i==1)
			{
				for (int j = 0; j < week; j++) 
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)
			{
				System.out.println();
				week=0;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}
