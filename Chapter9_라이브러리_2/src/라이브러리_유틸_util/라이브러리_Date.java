package 라이브러리_유틸_util;
import java.text.SimpleDateFormat;
/*
 	Date : java.util
 		1) 시스템의 현재 시간/날짜를 읽어오는 클래스 
  		2) Date클래스의 단점 => 기능이 빈약하다.
  		 					 날짜만 저장하는 클래스(오라클의 데이터형과 호환이 된다.)
  		=> Date의 단점을 보완해주는 것이 Calender이다.			 
  		3) Date => SimpleDateFormat => java.text
  										원하는 스타일로 날짜 변경 
  		4) 사용처 : 웹(등록일)
  			

 */
import java.util.*;
public class 라이브러리_Date {
	public static void main(String[] args) {
		
		Date date=new Date();
		System.out.println(date); // d오늘 날짜만 출력하는 것이다.
		//날짜만 출력하고 기능이 없다. 딱히 기능이 없고 날짜만 저장하는 클래스이다 .
		//더 세부적인 기능이 없기 때문에 이를 보완해주는게 Calender이다. 
		
System.out.println("=====다음다음=====");	
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // MM:달 , mm:분
		//SimpleDateFormat 날짜 포맷을 변경하는 방법 
		System.out.println(sdf.format(date));
/*
  년도	: yyyy(2023) yyy(023)
  월	  	: MM(01,02,03....14 , M(1,2,3....11,12	 
  일		: d, dd // 0을 붙이냐 안 붙이냐의 차이
  시간	: h, hh // 0을 붙이냐 안 붙이냐의 차이
  분		: m, mm  
  초		: s, ss
  => 	날짜 출력형식을 만드는 방법이다. 
  		내가 원하는 모습의 데이터를 만드는 것이 바로 SimpleDateFormat이다. 
  
  	Date= 호환, 날짜만 저장하는 기능을 가지고 있다. => DATE
 */
		
		
		
	}
}
