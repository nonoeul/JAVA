//while 주로 사용되는 곳 

import java.io.*;
public class 반복문_4 {
	public static void main(String[] args) {
		
		try
		{
			int i=0;
			FileReader fr=
					new FileReader("C:\\javaDev\\javastudy\\Chapter3_제어문_반복문_3\\src\\반복문_3_문제.java");
			while((i=fr.read())!=-1)
				{
				System.out.print((char)i);
				//네트워크로 파일전송이 가능하다. 
				}
		}	catch (Exception ex) {
			// TODO: handle exception
			System.out.println("파일이 없습니다.");
		}	
		System.out.println("파일 출력했습니다.");
	}
}
