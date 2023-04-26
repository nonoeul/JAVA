package 라이브러리_유틸_util;
// Date = Calendar로 변경하는 연습을 해봐야 한다. 
// Date를 Calendar로 변경해서 처리한다. 
import java.util.*;

public class 라이브러리_Calender_2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("년도를 입력:");
		int year=scan.nextInt();
		
		System.out.print("월 입력");
		int month=scan.nextInt();
		
		System.out.print("일 입력");
		int day=scan.nextInt();
		
		Calendar cal= Calendar.getInstance();
		// 오늘 날짜를 가지고 온다.	
		// getInstance 최초에 할당된 메모리를 계속 쓰는 방법이다. 	
		cal.set(Calendar.YEAR, year );
		cal.set(Calendar.MONTH, month-1); 
		// 설정시에는 -1 (0~11)
		// Month를 설정할 때는 -1을 해주고 Month를 출력할때는 0부터 시작하기 때문에 +1을 해준다.
		cal.set(Calendar.DATE, day);
		// Calendar.set(설정할 곳, 설정할 값)
		// Calendar.set ==Calendar에서 내가 원하는 시간을 설정하는 함수이다.  
		// Calendar만 사용하면 지금의 날짜를 가지고 오지만 Calendar.set을 하면 자기가 원하는 숫자를 가지고 ㅗㄹ 수 있다.
		
		System.out.println("=========설정된 날짜=========");
		System.out.println("년도"+cal.get(Calendar.YEAR));
		System.out.println("월"+(cal.get(Calendar.MONTH)+1));
		//month만 0부터 시작하기 때문에 +1을 줘야한다. 
		System.out.println("일"+cal.get(Calendar.DATE));
		
	 	String[] week={"","일","월","화","수","목","금","토"};
		System.out.println("무슨요일일까요??"+week[cal.get(Calendar.DAY_OF_WEEK)-1]);
		// week는 0번부터 시작하기 때문에 맨 처음 0번을 빼주었다.
		// 출력할때는 1번부터 시작하기 때문에 -1을 빼줘서 week의 입력값과 출력값이 동일하게 출력할 수 잇게 만들어줘야한다.
		
		
		
	
	}
}
















