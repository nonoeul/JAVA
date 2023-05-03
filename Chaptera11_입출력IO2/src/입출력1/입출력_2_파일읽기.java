package 입출력1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/*
  파일 읽기
  FileInputStream(1byte) / FileReader(2byte)
  한글이 포함 ==> 반드시 2byte씩 읽어야 => 한글깨짐 방지가 가능하다. 
  
  
 */
public class 입출력_2_파일읽기 {
	public static void main(String[] args) {
		FileReader reader=null;
		BufferedReader in = new BufferedReader(reader);
		try 
		{
			reader=new FileReader("c:\\javaDev\\movie.txt");
			int i=0; // 한글자씩 읽기 => read()
			// int read() => 한글자씩 읽기 => read()
			// A = read()
			// int read(byte[],int,int) => 읽은 바이트수 
			long start=System.currentTimeMillis();
/*			while((i=reader.read())!=-1)
			{
			-1 읽을 데이터가 없는 경우 => 전체 데이터를 읽은 경우 
			데이터의 갯수를 읽다가 더 이상 읽을 수 있는 데이터가 없는 경우 -1이 출력된다.
			1 . System.out.print((char)i); // 한글자씩 읽어와서 출력한다.
*/	
/*			while()
			{
				
			}
			{
				
			}
*/			long end=System.currentTimeMillis();
			System.out.println("읽을 시간"+(end-start));
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				
			}catch(Exception ex)
			{
				
			}
		}
		
		
		
	}
}



























