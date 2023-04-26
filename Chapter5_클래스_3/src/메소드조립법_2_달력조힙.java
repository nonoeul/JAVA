import java.util.Scanner;

public class 메소드조립법_2_달력조힙 {

// 입력
	static int input(String msg) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"입력:");
		int a=scan.nextInt();
		
		return scan.nextInt();
	}
	
// 요일 구하기
	static int getWeek(int year,int month)
	{
		int total =(year-1)*365
				 +(year-1)/4	// 4년마다 윤년이다. 하루가 더 많다
				 -(year-1)/100	// 100년마다 윤년이 한 개가 없다. 하루가 적다. 
				 +(year-1)/400;	// 400년마다 윤년이다. 하루가 더 많다
		int[] lastday = {
				31,28,31,30,31,30,
				31,31,30,31,30,31	
		};
		
		if((year%4==0 && year%100!=0) || (year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		
		// 전달까지의 총날 수
		for (int i = 0; i < month-1; i++) 
		{
			total += lastday[i];
		}
		
		total++; // 매월 1일자
		
		int week = total % 7; 
		return week;
	}
	
	static void print(int month,int week)
	{
		int[] lastday = {
				31,28,31,30,31,30,
				31,31,30,31,30,31
		};

// 요일값 , 첫 줄
String[] strWeek = {"일","월","화","수","목","금","토"};
		
		for (int i = 0; i < strWeek.length; i++) 
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println("\n");
		
		
		// 첫 주
		for (int i = 0; i < week; i++) 
		{	
			System.out.print("\t");
		}
		
		for (int i = 1; i <= lastday[month-1]; i++)
		{
			System.out.printf("%2d\t",i);
			week++; // 요일 계산 
			if (week > 6) // 토, 일 
			{
				week = 0;
				System.out.println();
			}
		}
	}
	
	
// 출력 // 출력은 바로 출력하기만 하기 때문에 또 다시 사용될 일이 없다
// 한 번 출력할때 출력 값은 한 번이므로 바로 출력할 수 있다.
	static void process()
	{
		int year=input("년도");
		int month=input("월");
		System.out.println(year+"년도"+month+"월");
		int week=getWeek(year, month);
		System.out.println("week:"+week);
		print(month,week);
	}
	
	
	
	public static void main(String[] args) {
		
		process();
		/*Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year = scan.nextInt();
		
		System.out.print("월 입력");
		int month = scan.nextInt();
		
		// 전년도까지의 총날수
		int total =(year-1)*365
				 +(year-1)/4	// 4년마다 윤년이다. 하루가 더 많다
				 -(year-1)/100	// 100년마다 윤년이 한 개가 없다. 하루가 적다. 
				 +(year-1)/400;	// 400년마다 윤년이다. 하루가 더 많다
		int[] lastday = {
				31,28,31,30,31,30,
				31,31,30,31,30,31	
		};
		
		if((year%4==0 && year%100!=0) || (year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		
		// 전달까지의 총날 수
		for (int i = 0; i < month-1; i++) 
		{
			total += lastday[i];
		}
		
		total++; // 매월 1일자
		
		// 요일 구하기
		int week = total % 7; 
		
		System.out.printf("%d년도 %d월\n", year, month);
		String[] strWeek = {"일","월","화","수","목","금","토"};
		
		for (int i = 0; i < strWeek.length; i++) 
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println("\n");
		
		
		// 첫 주
		for (int i = 0; i < week; i++) 
		{	
			System.out.print("\t");
		}
		
		for (int i = 1; i <= lastday[month-1]; i++)
		{
			System.out.printf("%2d\t",i);
			week++; // 요일 계산 
			if (week > 6) // 토, 일 
			{
				week = 0;
				System.out.println();
			}
		}
	}*/
	}	
}
















