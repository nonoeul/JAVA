package 라이브러리_유틸_util;

import java.util.Calendar;

/*
 * 	Calendar : Date클래스를 보완해서 새롭게 만든 클래스 
 * 	1) Calendar 생성
 * 	   Calendar cal=Calendar.getInstance();
 * 	   ------- 추상클래스이다. new를 사용하지 않으면 추상클래스이다 .
 * 	   Calendar는 추상클래스이다. 
 * 
 * 	2)	날짜를 설정할때 = set()
 * 		날짜를 읽어올때 = get()
 * 		각달의 마지막 날 getActualMaxium()
 * 
 * 	3) 요일읽기
 * 		get()
 * 				
 */
public class 라이브러리_Calender_1 {
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();	//getInstance()로 객체 생성
		//Calendar을 갖다대보면 abstract 추상클래스라고 나와있다.
		//Calendar가 필요한 경우 오버라이딩을 통해서 풀어야한다. 
		//new를 사용하지 앟는 경우 => 추상클래스 / 인터페이스 두 가지가 존재한다.
		//	기능을 가지고 있다. 		=> 추상클래스 (구현된 메소드, 구현이 안된 메소드) 
		//	기능을 가지고 있지 않다 	=> 인터페이스 (구현이 안된 메소드)
		
		
    	System.out.println("현재 날짜:"+cal.get(Calendar.YEAR)+"-"
    	+(cal.get(Calendar.MONTH)+1)+"-"
    	+cal.get(Calendar.DAY_OF_MONTH));
    	// cal.get(Calendar.YEAR) 오늘의 년도
    	// cal.get(Calendar.MONTH) 오늘의 달
    	// cal.get(Calendar.DAY_OF_MONTH) 달에 해당하는 날짜.
    	
    	System.out.println("일주일 중 오늘은 "+cal.get(Calendar.DAY_OF_WEEK)+"번째 요일 (1은 일요일)");
    	//cal.get(Calendaar.Day_OF_WEEK) 일주일중에 어떤 요일인지. 숫자로 표현  
    	
    	System.out.println("일년 중 오늘은 "+cal.get(Calendar.DAY_OF_YEAR)+"번째 날");
    	//cal.get(cal.get.DAY_OF_YEAR) 년중에 몇번째의 날인지. 
    	
    	System.out.println("현재 시간 "+cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND)+":"+cal.get(Calendar.MILLISECOND));
    	//cal.get(Calendar.Hour_of_Day) 날 중에서 시간 // 오늘의 시간 
    	//cal.get(Calendar.MINUTE) // 분 // 지금의 분 
    	System.out.println("현재 시간 "+cal.get(Calendar.AM_PM)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
    	System.out.println("이번 주는 일년 중 "+cal.get(Calendar.WEEK_OF_YEAR)+"번째 주");
    	
    	System.out.println("========ONE MORE TIME========");
    	System.out.println("날짜: "+cal.get(Calendar.YEAR));
    	System.out.println("날짜: "+cal.get(1)); 
    	// 1을 써도 동일하게 년도를 추출해줄 수 있는데 단점이 어떤 값을 가져왔는지 알지 못한다.
    	
    	System.out.println("월 "+cal.get(Calendar.MONTH));
    	// Month는 0번부터 시작 (0~11)
    	System.out.println("월 "+(cal.get(Calendar.MONTH)+1));
    	//System.out.println("월 "+cal.get(Calendar.MONTH)+1);
    	//괄호를 넣지 않으면 3월 + 1 3과 1이 문자열로 붙어버린다. 그래서 31이 나온다. 
    	//우선순위르 설정해줘서 올바른 값이 나올 수 있또록 해준다.
    	
    	System.out.println("일 "+cal.get(Calendar.DATE));
    	// DAY는 1부터 시작한다. 그래서 +1을 해주지 않아도 무방하다. 
    	
    	
    	System.out.println("===========시간===========");
    	System.out.println("시간:"+cal.get(Calendar.HOUR));
    	System.out.println("분 :"+cal.get(Calendar.MINUTE));
    	System.out.println("초 :"+cal.get(Calendar.SECOND));
    	System.out.println("날 :"+cal.get(Calendar.DAY_OF_MONTH));
    	System.out.println("이번달 마지막날: "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    	// 이번달 마지막 날을 가지고 온다. 
    	
    	String[] week={"","일","월","화","수","목","금","토"};
    	//week는 1~7로 시작하기 때문에 앞에 0번자리를 빼주고 시작해야 한다.
    	//배열은 0번부터 시작 , week는 1번부터 시작 
    	
    	System.out.println("오늘의 요일은??? "+week[cal.get(Calendar.DAY_OF_WEEK)]);
    	//Day_Of_Week는 요일중에 날짜를 가지고 온다. 
    	
    	
    	
	}
}


















