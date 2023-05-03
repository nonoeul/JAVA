package 입출력1;
/*
	= 	변수, 연산자, 제어문
	=	객체지향프로그램
	=	예외처리
	------------------
	=	
	
	IO => InputStream / OutpurtStream
			입력				출력
			=> 입출력시 사용하는 라이브러리
			1) 메모리 입출력	=> 표준입출력 System.in , System.out
			2) 파일 입출력		=> 웹) 업로도, 다운로드
			
			3) 네트워크 입출력 : 웺서버 이미 구현
			----> 저장/ 읽기 / 수정 / 삭제 => CURD
			
			자바 => 입출력을 하기 위한 장치
		
	데이터 이동
	1byte 이동			2byte 이동
	--------			--------
	~InputStream		~Reader
	~OutputStream		~Writer
	=byte				-------
	=read(),write()		문자 스트림
						char => 메소드(read(),write())
	=> CheckException => 예외처리 기본
	------------------------------
	=> io 라이브러리 입출력을 사용시 반드시 닫아줘야 한다 => close
	=> 지원하는 라이브러리
		FileInputStream FileOutputStream
		FileReader		FileWriter
		--------------------------
		ObjectInputStream ObJectOutputStream => 객체 단위 저장
		=> 속도가 느리다 => 속도가 빠르다 => Buffer
	= Buffer => 한번에 데이터 모아서 한번에 전송
		=> 속도가 빠르다
		입출력 : BufferedReader, BufferedWriter
				--------String --------String
	
	
??InputStream/OutputStream??

	
	
 */

import java.util.*;
import java.io.*;

public class 입출력_1_파일복사 {
	public static void main(String[] args) {
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try 
		{
			fis=new FileInputStream("C:\\javaDev\\eclipse\\p2");
			fos=new FileOutputStream("C:\\javaDev\\eclipse\\p2.zip");
			//파일복사 ->업로드
			int i=0;
			byte[] buffer=new byte[1024]; // 파일복사 
			while((i=fis.read(buffer,0,1024))!=-1)
			{
				
			}
			long end=System.currentTimeMillis();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally 
		{
			try
			{
				fis.close();
				fos.close();
			}catch(Exception ex)
			{
				
			}
		}
	
	}
}
































