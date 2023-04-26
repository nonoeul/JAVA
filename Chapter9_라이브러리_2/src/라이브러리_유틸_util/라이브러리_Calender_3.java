package 라이브러리_유틸_util;

import java.text.SimpleDateFormat;
import java.util.*;

public class 라이브러리_Calender_3 {
	
	public static void log()
	{
		SimpleDateFormat sdf=new SimpleDateFormat("mm분 ss초");
		long start=System.currentTimeMillis();
		Date date2=new Date(start);
		System.out.println(sdf.format(date2));
		
		for (int i = 0; i < 100000000; i++)
		{
			
		}
		long end=System.currentTimeMillis();
		long result=end-start;
		Date date=new Date(end);
		System.out.println(sdf.format(date));
	}
	public static void main(String[] args) {
	
		log();
		
		
	}
}
