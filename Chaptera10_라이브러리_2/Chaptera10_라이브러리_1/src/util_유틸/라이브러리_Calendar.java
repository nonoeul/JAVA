package util_유틸;
/*	라이브러리
 * 		=자바에서 지원
 * 		java.lang,
 * 		java.util
 * 		java.net
 * 		java.text
 * 		=외부업체에서 지원 
 * 			=웹과 관련된 것은 javax.xml
  			MyBatis, Spring, DBCP
  		
  	??java.lang??
  			Object / String / System / Math / StringBuffer
  			import 생략 
  			Object 최상위 클래스, 모든 데이터형을 받을 수 있다.
  			저장 => 일반 기본형, 사용자저의 클래스
  			형변환을 주력해야 한다. 
  			1.clone이 있다. : clone 메모리생성 => 디자인패턴  
  			2.finalize 	: 소멸자(자동호출 =>메모리해제)
  			3.toString 	: 객체를 문자열화
  			3.equals()	: 객체비교(기본은 객체의 주소값)
  			4.System 	: 운영체제와 연결할 수 있는 부분 : gc.out.in [표준입출력]
  			5.Math		: 수학
  				= round 반올림
  				= ceil	올림
  				= random난수(임의의 수 추출)
  			6.StringBuffer : 문자열이 많은 경우(제어)
  				= append() : 문자열 결합을 할 때 쓰는 형태
  				= delete() : 문자제거
  				= insert() : 문자열 추가 
  				**위 세개는 String에서 존재하지 않는다.
  			7.String : 문자열을 쉽게 제어할 수 있게 만들어준다. 
  				= equals	: 문자 내용을 비교하는 것인데 오버라이딩을 해줘야지 문자내용을 비교하고 오버라이딩을 안하면 주소비교
  				= trim		: 공백제거 좌우공백만 제거한다. 가운데는 제거x
  				= substring	: 특정 문자열만 짤라올때 사용
  				= length	: 글자 갯수
  				= valueOf	: 문자열로 변환
  				= contains	: 안에 포함되어 있는지 확인
  				= StartWith	: 시작하나ㅏ?
  				= split		: 설정한 문자엶 단위로 글자를 잘라주는 것
  				= replace	:
  				= replaceAll:
  	??java.util??			
  		
  	??날짜관련??
  			1.Date : 
  				기능이 없다 => 다른 프로그램과 호환
  				날짜 저장용으로 주로 사용된다.
  			2.Calendear : 
  				날짜에 대한 기능이 필요시 사용
  				Date를 보완하는 클래스
  				날짜설정
  				= set () =년도/월/일/시간/분/초
  				= get ()
  				= 요일 읽기 
  				= 각 다의 마지막날 getActualMaximum
  			3.배열 대체 
  				= 3대 클래스 String, Interger, List 이 세개가 매우 중요허다
  				= 컬렉션(데이터 쉽게 관리) => 10 (자동으로 저장공간이 설정)
  					
  	??Collection??
  				1. List / 순서가 있는 데이터의 집으로 데이터의 중복을 허용한다.
  						= 순서 존재, 데이터 중복허용 
  						= 데이터를 중복해서 저장가능한데 중복이 가능하다, 인덱스를 가지고 있다.
  						= 데이터베이스는 대부분 List이다. 왜냐하면 게시판 같은 경우는 중복이 존재한다.
  					ArrayList
  					Stack
  					
  					LinkedList-Queue
  					=>제네릭스 , LinkedList-Queue가 살짝 어럽다. 
  				
  				2. Set / 순서를 유지하지 않는 데이터의 집합으로 데이터의 중복을 허용하지 않는다.
  						= 순서 유지X, 데이터중복X
  						= 데이터를 중복해서 저장 못하고 순서가 없다. 
  					HashSet		= 가장빠른 임의 접근 속도 / 순서를 예측할 수 없다. 
  					SortedSet	
  				
  				3. Map // 인터페이스 
  					=Map은 Collection의 인터페이스를 상속받고 있지 않지만
  					 Collection으로 분류한다. 
  					HashMap
  					Hashtable
  					
 */
// Calendar 응용 
import java.util.Calendar; // Calendar / Scanner
import java.util.Scanner;
public class 라이브러리_Calendar {
	public static void main(String[] args) {
		
	//사용자로부터 년도하고 월을 받는다. => 예악/체크인/체크아웃 => 달력 
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 월 입력(2023 4)");
		int year=scan.nextInt();
		int month=scan.nextInt();
	
	Calendar cal =Calendar.getInstance(); // getInstacne 최초에 할당된 하나의 메모리를 계속해서 쓰는 방식
	// getInstacne는 정적메소드이다. 정적메소드는 static메소드, getInstance=static메소드 정적메소드 
	// 추상클래스는 미완성클래스 메모리할당을 못한다. 미완성클래스 = 구현인 안된 메소드 사용 불가
	// 구현할 클래스를 이용한다. 싱글턴(오직하나의 객체마 생성할 수 있는것)을 이용한다던가 

/*	?? 싱글턴 ??
 	오직 하나의 객체만 생성할 수 있는 것
 	newInstance(), getInstance()  
*/
	
	
/*	static => 클래스명, 메소드명()
  	Math.random()
  	
  	클래스명 객체명=new 생성자() => 추상클래스, 상속, 인터페이스 
  	클래스명 객체명=메소드 => 추상클래스이다.
 */
	cal.set(Calendar.YEAR, year); // cal.set(설정할 곳,설정할 값) 
	cal.set(Calendar.MONTH, month-1); // month는 0번부터시작 한다 0~11 
	cal.set(Calendar.DATE, 1);
		
	// 요일 구하기
	int week=cal.get(Calendar.DAY_OF_WEEK)-1; // week는 1번부터 시작한다
	// 입력달의 마지막날 
	int lastday=cal.getActualMaximum(Calendar.DATE);
	
	// 달력 출력 
	String[] strWeek= {"일","월","화","수","목","금","토"};
	System.out.println(year+"년도 "+month+"월");
	System.out.print("\n");
	
	// 요일 출력
	for (String s : strWeek) 
	{
		System.out.print(s+"\t");
	}
	
	System.out.println();
	
	// 내가 두칸을 뛰게해서 자리를 잘못 인식 
	for (int i = 1; i <= lastday; i++) 
	{
		if(i==1)// 맨처음 = 공백을 설정
		{
			for (int j = 0; j < week; j++) 
			{
				System.out.print("\t"); //처음 공백설정
			}
		}
		

	// 달력 출력
	System.out.printf("%2d\t",i); // 2d=두자리 , 10 ,11 같은 수가 존재하기 때문에 
	// t를 통해서 한 칸 뛴다. 
	week++; //0~6 ㅡ 월,화,수,목,금... 순차적으로 1씩증가하면서 커진다.
	if (week>6) // 일요일 이면 
	{
		week=0;	// 일요일 설정
		System.out.println(); // 다음줄에 출력 
	}
}
	
	
	
	
	
	
	}
}
















