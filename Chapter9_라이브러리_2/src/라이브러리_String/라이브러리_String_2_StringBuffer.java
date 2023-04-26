package 라이브러리_String;

import java.io.*;
public class 라이브러리_String_2_StringBuffer {
	public static void main(String[] args) {
	
		try
		{
			long start=System.currentTimeMillis(); // 현재시간을 구하고,프로그래미 수행한 시간을 구한
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0; // 문자 읽기 => int로 읽는다. =>문자를 읽어온다. 
//			String data="";
			StringBuffer data=new StringBuffer();
			while((i=fr.read())!=-1) // -1이 끝이다. fr.read 끝까지 읽어와라. 
			// 	값이 없을 때 나오는 숫자가 -1인데 -1까지 읽어오라고 한다면 끝까지 읽어라라는 의미이다.
			{
//			data+=(char)i;
				data.append((char)i);
			}
			long end=System.currentTimeMillis();
			
			fr.close();
			System.out.println(data);
			System.out.println("걸린 시간:"+(end-start));
			
		}catch(IOException ex)
		{
			ex.printStackTrace(); // 에러메세지 확인 
		}
		
		
	}
}
