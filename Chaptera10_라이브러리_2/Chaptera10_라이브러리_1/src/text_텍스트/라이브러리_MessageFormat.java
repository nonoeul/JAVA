package text_텍스트;
import java.text.*;
import java.util.Date;

public class 라이브러리_MessageFormat {
	public static void main(String[] args) {
		
		String msg="이름:{0}\n성별:{1}\n나이:{2}\n";
		Object[] obj= {"홍길동","남자",26};
		System.out.println(MessageFormat.format(msg, obj));
		
		System.out.println("==예제/가변인자 문자열 삽입==");
		//가변인자
		String name ="무명소졸";
		String sex = "남자";
		String age = "39";

		String text1 = "나의 이름은 "+name+" 입니다. 성별은 "+sex+"이고 나이는 "+age+"입니다.";
		System.out.println(text1);

		String text2 = MessageFormat.format("나의 이름은 {0} 입니다. 성별은 {1}이고 나이는 {2}입니다."
		, name, sex, age);
		System.out.println(text2);
		// 좀더 간편하게 식을 쓸 수 있다.
		
		System.out.println("==예제/객체배열 ==");
		//Object 배열 형태로도 값을 전달 가능하다.
		Object[] objects = new Object[]{"빨강", "초록", "파랑"};
		String colors = MessageFormat.format("빛의 삼원색은 {0}, {1}, {2} 이다.", objects);
		System.out.println(colors);

		System.out.println("==예제/타입지원 ==");
		String printDate = MessageFormat.format("오늘 날짜는  {0, date} 입니다.", new Date());
		String printTime = MessageFormat.format("현재 시간은 {0, time} 입니다.", new Date());
		System.out.println(printDate);
		System.out.println(printTime);
		//오늘 날짜는  2020. 6. 15 입니다.
		//현재 시간은 오후 12:33:26 입니다.
		String str = MessageFormat.format("올해 성과금은 {0,number,currency} 입니다.", new Float(100_000_000));
		System.out.println(str);
		//올해 성과금은 ￦100,000,000 입니다.
		

	}
}
