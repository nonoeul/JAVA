package com_sist_exception_예외복구;

import java.io.FileReader;
import java.io.IOException;

public class 예외처리_예외복구_8_파일가져오기2 {
	public static void main(String[] args) {
		
		int i=0;
	
		
		try 
		{
				FileReader fr=new FileReader("C:\\javaDev\\javastudy\\Chapter8_예외처리_2\\src\\com_sist_exception\\예외처리_예외복구_1_try_catch.java")
				{
					i=0;
					while((i=fr.read())!=-1)
					{
						System.out.println((char)i);
					}
						
				}catch (IOException e)
				{
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
		
	}
}
