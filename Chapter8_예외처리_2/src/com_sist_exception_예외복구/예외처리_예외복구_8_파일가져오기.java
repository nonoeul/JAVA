package com_sist_exception_예외복구;
/*
 * java.io input/output 입출력하는 패키지로써 
 * io는 무조권 예외처리를 해줘야 한다.
 * 1.File
 * 2.Console // 값을입추려하기 위한 클래스 => 자바스크립트에 서 사ㅛㅇ
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.io.*;
// Checked Exception = 예외를 처리하지 않으면 오류가 발생한다. 
// java.io는 i=Input / o=Ouput 즉 정보를 입출력해주는 라이브러리 
// InputStream, OutputStream
// Writier / Reader 문자단위의 입출력 

public class 예외처리_예외복구_8_파일가져오기 {
	public static void main(String[] args) {
		
		int i=0; 
		FileReader fr=null;// 초기값으로 null을 넣어야 한다. 
//		fr=new FileReader(""); //오류가 발생한다. 예외처리가 안되있기 때문에
		//checked Exception , Reader 즉 java.io는 무조권 예외처리를 하고 들어가야하낟.
		//
		
		try
		{
			fr=new FileReader("C:\\javaDev\\javastudy\\Chapter8_예외처리_2\\src\\com_sist_exception\\예외처리_예외복구_1_try_catch.java");
			while((i=fr.read())!=-1)
				{
				System.out.print((char)i); 
				}
		}catch(IOException e)// IOException 입출력 예외처리를 위한 throws
		{
			e.printStackTrace(); // 오류정보를 일겅온다. 
		}
		finally
		{
			try
			{
				fr.close();
			}catch(IOException e)
			{
			}	
		
		}
	}
}