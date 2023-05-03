package util_유틸;
/*
  	java.text => 출력 형태를 만들어서 사용 (변경)
  	------------
  		SimpleDateFormat : 날짜변경
  		-------------------------
  		DeciamalFormat : 숫자변환
  		-------------------------
  		MessageFormat : 데이터베이스 = insert,update
  		-------------------------
  		Strigng name = 
  		String sql = "INSERT INTO member VALUES(
  		String sql = "INSERT INTO member VALUES("{1}","{2}","{3}","{4}","{5}")
  		
  		자바웹 결과값 HTML 
 */
import java.util.Date;
import java.text.*;
import java.sql.*;
public class 라이브러리_SimpleDateFormat {
	public static void main(String[] args) {
		// java.util의 Date오 java.sql 둘다 Date를 가지고 있어  패키지가 충돌이 일어난다.
		// 자바에서 util의 Date인지 sql의 Date인지 알지 못하므로 java.util.Date를 사용할거라고 알려줘야 한다.
		// 그래서 java.util.* 가 아닌 java.util.Date라고 확실하게 고정해줘야 한다. 
		Date date=new Date(); 
		System.out.println(date); // Thu Apr 27 11:05:33 KST 2023
/*
  	System.out.println(date); // Thu Apr 27 11:05:33 KST 2023 
  	데이터를 보기가 너무 힘들다. 그래서 SimpleDateFormat을 사용해서 보기 쉽게 결정할 수 있다.
 */
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 mm월 dd일");
		// sdf가 가지고 있는 형식이 yyyy년 mm월 dd일이다.
		System.out.println(sdf.format(date));
		// sdf의 형식으로 date의 형식을 바꿔라 
		
/*
 	자바			오라클
  	yyyy 년도	rrrr
  	MM 월		mm
  	dd 일		dd
  	hh 시간		hh24
  	mm 분		mi
  	ss 초		ss
 */
		
	}
}



















